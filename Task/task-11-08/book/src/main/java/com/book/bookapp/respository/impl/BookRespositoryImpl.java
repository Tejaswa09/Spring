package com.book.bookapp.respository.impl;

import com.book.bookapp.dto.UserDto;
import com.book.bookapp.respository.BookRespository;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component("BookRepo")
public class BookRespositoryImpl implements BookRespository {
    @Override
    public boolean save(UserDto dto) {
        boolean isSaved = false;
        System.out.println("Book Repo constructor");

        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into max_users1(First_Name,User_Name,Email,Password) values(?,?,?,?)");
            preparedStatement.setString(1, dto.getFirstName());
            preparedStatement.setString(2, dto.getUserName());
            preparedStatement.setString(3, dto.getEmail());
            preparedStatement.setString(4, dto.getPassword());

            System.out.println(dto);

            int noOfRowsEffected = preparedStatement.executeUpdate();

            if (noOfRowsEffected >0) isSaved=true;



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isSaved;
    }
}
