package com.fmh.mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import com.fmh.pojo.User;
import com.fmh.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
	private String          jdbcUrl;
	private String          user;
	private String          password;
	private String driverClass;
	private DruidDataSource dataSource;

	@Autowired
	private UserService userService;

	@Test
	public void test1(){
		User user = userService.find(1);
		System.out.println(user.getName());
	}

	@Test
	public void test2() throws SQLException {
		jdbcUrl ="jdbc:mysql://192.168.38.135:3306/ssm";
		user = "root";
		password = "123456";
		driverClass = "com.mysql.jdbc.Driver";
		dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(jdbcUrl);
		dataSource.setUsername(user);
		dataSource.setPoolPreparedStatements(true);
		dataSource.setPassword(password);
		Connection con = dataSource.getConnection();
		if (!con.isClosed()){
			System.out.println(1);
		}
	}

	@Test
	public void test3(){
		User user = new User();
		user.setAge(10);
		user.setName("wf");
		userService.add(user);
	}
}
