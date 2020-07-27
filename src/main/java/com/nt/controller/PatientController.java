package com.nt.controller;

import java.sql.SQLException;

import com.nt.dto.PatientDto;
import com.nt.service.PatientService;
import com.nt.vo.PatientVO;

public class PatientController {
	PatientService svc;
	public PatientController(PatientService svc) {
		this.svc=svc;
	}
	
	public int  addPatient(PatientVO vo) throws SQLException {
		PatientDto d=new PatientDto(vo.getPname(), vo.getPaddr(), new Float(vo.getPduration()), new Integer(new Integer(vo.getPage()).toString()));
		return svc.calcAmountAndAddPatient(d);
	}
	
}
