package com.lti.servlets;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.websocket.Session;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;

/**
 * Servlet implementation class UploadProduct
 */
@WebServlet("/UploadProduct")
@MultipartConfig(fileSizeThreshold=1024*1024*10,maxFileSize=1024*1024*50,maxRequestSize=1024*1024*100) 
public class UploadProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UploadProduct() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String description = request.getParameter("description");
		InputStream inputStream = null;
		Part filePart = request.getPart("image");

        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            inputStream = filePart.getInputStream();
        }
        
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setDescription(description);
        product.setImage(inputStream);
        
        ProductDao pdao = new ProductDao();
        pdao.storeProduct(product);
        
		/*
		 * HttpSession session = request.getSession();
		 * 
		 * session.setAttribute("product", product);
		 * 
		 * response.sendRedirect("display.jsp");
		 */

	}

}
