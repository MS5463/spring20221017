package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex27")
public class Controller27 {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql1 = "UPDATE Bank "
				+ "SET balance = balance - 100 "
				+ "WHERE customerId = 2";

		String sql2 = "UPDATE Bank "
				+ "SET balance = balance + 100 "
				+ "WHERE customerId = 1";

		try (Connection con = dataSource.getConnection()) {
			try {
				// autocommit : diable
				con.setAutoCommit(false);

				Statement stmt1 = con.createStatement();
				stmt1.executeUpdate(sql1);

//			int a = 0;
//			int b = 3 / a; // ArithmeticException

				Statement stmt2 = con.createStatement();
				stmt2.executeUpdate(sql2);

				con.commit();

			} catch (Exception e) {
				con.rollback();
			}
		}
	}

	@GetMapping("sub02")
	public void method2() {

	}

	@PostMapping("sub02")
	public void method3(
			String fname, String lname, int salary) throws Exception {
		String sql1 = "INSERT INTO Employees (fristName, lastName) VALUES (?, ?) ";
		String sql2 = "INSERT INTO Salary (employeeId, salary) VALUES (?, ?) ";

		try (Connection con = dataSource.getConnection();) {
			con.setAutoCommit(false);

			try (PreparedStatement stmt1 = con.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
					PreparedStatement stmt2 = con.prepareStatement(sql2);) {

				stmt1.setString(1, fname);
				stmt1.setString(2, lname);

				stmt1.executeQuery();

				try (ResultSet rs = stmt1.getGeneratedKeys();) {
					if (rs.next()) {
						int key = rs.getInt(1);
						stmt2.setInt(1, key); // ??????????????? key ??????
						stmt2.setInt(2, salary);
						stmt2.executeUpdate();
					}
				}

				con.commit();
			} catch (Exception e) {
				e.printStackTrace();
				con.rollback();
			}
		}
	}
}
