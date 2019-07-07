package com.lti.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.entity.Product;



public class ProductDao {
	
	String user = "dummy";
	String pass = "dummy";
	
	public void storeProduct (Product product) {
		Connection conn= null;
		PreparedStatement stmt = null;			
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);                                              
			String sql = "insert into TBL_PRODUCT values (?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, product.getName());
			stmt.setInt (2, product.getId());
			stmt.setString(3, product.getDescription());
			stmt.setBlob(4,product.getImage());
			stmt.executeQuery();   
			
		}
		catch(Exception e) {
			e.printStackTrace();;
		}	
	}
}
