package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nt.bo.PatientBO;

public class OraclePatientDAOImpl implements PatientDAO {

	private String sql="insert into patient values(pno,?,?,?,?,?)";
	DataSource ords;
	public OraclePatientDAOImpl(DataSource ords) {
		this.ords=ords;
	}
	
	@Override
	public int joinPatient(PatientBO bo) throws SQLException {
	Connection con = ords.getConnection();
	
	PreparedStatement ps = con.prepareStatement(sql);
	
	ps.setString(1, bo.getPname());
	ps.setString(2, bo.getAddrs());
	ps.setFloat(3, bo.getDays());
	ps.setInt(4, bo.getAge());
	ps.setFloat(5, bo.getAmnt());
	int op=ps.executeUpdate();
	System.out.println("recieved bo as "+bo);
	con.close();
	ps.close();
	
	return op;
	}

}
