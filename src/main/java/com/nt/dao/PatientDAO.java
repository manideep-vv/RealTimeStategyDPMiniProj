package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.PatientBO;

public interface PatientDAO {
	int joinPatient(PatientBO bo) throws SQLException;
}
