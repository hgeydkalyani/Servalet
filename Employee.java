package com.employee;
import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submit")

public class Employee  extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("employeeId");
		 String firstName=request.getParameter("firstName");
		 String lastName =request.getParameter("lastName");
		 String email=request.getParameter("email");
		 
		 String dob=request.getParameter("dob");
		 String gender=request.getParameter("gender");
		 String Department=request.getParameter("department");
		 String Designation =request.getParameter("designation");
		 String dateOfJoining=request.getParameter("dateOfJoining");
		 
		 String address=request.getParameter("address");
		 String city=request.getParameter("city");
		 String state=request.getParameter("state");
		System.out.println(name);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(Department);
		System.out.println(Designation);
		System.out.println(dateOfJoining);
		System.out.println(address);
		System.out.println(city);
		System.out.println(state);
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c =DriverManager .getConnection("jdbc:mysql://localhost:3306/demo1","root","Kalyani@123");
			 PreparedStatement ps=c.prepareStatement("insert into employee1(name,id,age,email,phoneNo,gender,state,country,address,department,role, exp,sal)values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 ps.setString(1,name);
			 ps.setInt(2,id);
			 ps.setInt(3,age);
			 ps.setString(4,email);
			 ps.setLong(5,phoneNo);
			 ps.setString(6,gender);
			 ps.setString(7,state);
			 ps.setString(8,country);
			 ps.setString(9,address);
			 ps.setString(10,department);
			 ps.setString(11,role);
			 ps.setInt(12,exp);
			 ps.setLong(13,sal);
			 
			 int check = ps.executeUpdate();

				if (check > 0) {
					out.println("<h1 style='color:green'>" + "Data is inserted..." + "</h1>");
				} else {
					out.print("<h1 style='backgroundcolor:red'>" + "Data is Not inserted..." + "</h1>");
				}
				c.close();

			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.println(e.getMessage());
		}
        
        

}
}

