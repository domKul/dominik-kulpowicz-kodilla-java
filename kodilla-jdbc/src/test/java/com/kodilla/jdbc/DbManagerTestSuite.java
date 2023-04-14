package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {

    @Test
    void testConnection()throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
          // assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers()throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while(rs.next()){
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }

        rs.close();
        statement.close();
        //assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndTasks()throws  SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //WHen
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, I.SUMMARY\n" +
                "  FROM USERS U\n" +
                "  JOIN ISSUES I ON U.ID = I.USER_ID_ASSIGNEDTO";
        Statement statement= dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getString("FIRSTNAME")+ ","+
                    rs.getString("LASTNAME")+","+
                    rs.getString("SUMMARY"));
            counter++;
        }
        rs.close();
        statement.close();
      //  assertEquals(15,counter);

    }
    @Test
    void testSelectUsersAndPosts()throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuary ="SELECT U.FIRSTNAME, U.LASTNAME\n"+
                "FROM USERS U\n"+
                "JOIN POSTS P ON U.ID = P.USER_ID\n"+
                "GROUP BY USER_ID\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuary);
        //Then
        int counter = 0;
        while (rs.next()){
            System.out.println(rs.getString("FIRSTNAME")+","+
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        //assertEquals(1,counter);

    }


}
