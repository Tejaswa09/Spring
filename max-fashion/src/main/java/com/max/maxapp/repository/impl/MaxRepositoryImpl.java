package com.max.maxapp.repository.impl;

import com.max.maxapp.dto.UserDto;
import com.max.maxapp.repository.MaxRepository;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class MaxRepositoryImpl implements MaxRepository {
    @Override
    public boolean save(UserDto dto) {
        boolean isSaved = false;

        try  {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "Tejaswa7899@!#");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into max_users(First_Name,Last_Name,Date_Of_Birth,Email) values(?,?,?,?)");
            preparedStatement.setString(1, dto.getFirstName());
            preparedStatement.setString(2, dto.getLastName());
            preparedStatement.setString(3, dto.getDateOfBirth());
            preparedStatement.setString(4, dto.getEmail());

            System.out.println(dto);

            int noOfRowsEffected = preparedStatement.executeUpdate();

            if (noOfRowsEffected >0) isSaved=true;



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return isSaved;
    }
}
