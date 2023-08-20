package dao;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface UserDao {
   boolean  createUser(String name , String email , String password , long phone ,String gender,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ;
   
   boolean selectUser(String email , String password ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

boolean verifyUser(String email , Long phone ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

boolean resetUserPass(String password , int id ,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;



}
