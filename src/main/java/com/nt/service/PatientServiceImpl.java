package com.nt.service;

import java.sql.SQLException;

import com.nt.bo.PatientBO;
import com.nt.dao.PatientDAO;
import com.nt.dto.PatientDto;

public class PatientServiceImpl implements PatientService {

	PatientDAO dao;
	public PatientServiceImpl(PatientDAO dao) {
	this.dao=dao;
	}
	@Override
	public int calcAmountAndAddPatient(PatientDto dto) throws SQLException {

		Float amnt=null;
		if(dto.getAge()>60) {
			amnt=3000f;
		}else if(dto.getAge()>30) {
			amnt=2000f;
		}
		
		PatientBO bo=new PatientBO(dto.getPname(), dto.getAddrs(), dto.getDays(), dto.getAge(), amnt*dto.getDays());
		return 	dao.joinPatient(bo);
	}

}
