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


}
}
