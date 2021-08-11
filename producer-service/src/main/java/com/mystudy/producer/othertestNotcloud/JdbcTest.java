/*
package com.mystudy.producer.othertestNotcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.sql.*;

*/
/**
 * @author ：songdalin
 * @date ：2021-02-09 下午 03:35
 * @description：
 * @modified By：
 * @version: 1.0
 *//*

@RestController
@RequestMapping
public class JdbcTest {

    private static String driverClass;

    private static String username;

    private static String password;

    private static String url;

    @Value("${spring.datasource.driver-class-name}")
    public void setDriverClass(String driverClass) {
        JdbcTest.driverClass = driverClass;
    }

    @Value("${spring.datasource.username}")
    public void setUsername(String username) {
        JdbcTest.username = username;
    }

    @Value("${spring.datasource.password}")
    public void setPassword(String password) {
        JdbcTest.password = password;
    }

    @Value("${spring.datasource.url}")
    public void setUrl(String url) {
        JdbcTest.url = url;
    }

    public Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName(driverClass);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    @GetMapping("/get")
    public String get() throws SQLException, ClassNotFoundException {
        Connection connection = getConn();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            if (connection == null) {
                throw new RuntimeException("not conction ");
            }
            String sql  = " select id, name, no from student ";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }


        return "ok";
    }

    @GetMapping("/insert")
    public String insert() throws SQLException, ClassNotFoundException {
        Connection connection = getConn();
        //默认自动提交事务
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = null;
        try {
            if (connection == null) {
                throw new RuntimeException("not conction ");
            }
            String sql = " insert into student (name) values (\"猫腻\")";
            preparedStatement = connection.prepareStatement(sql);
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                //throw new RuntimeException("dd");
                connection.commit();
                return "ok";

            }
        }catch (Exception e){
            connection.rollback();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }


        return "false";
    }
}
*/
