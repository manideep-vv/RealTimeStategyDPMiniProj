package com.nt.service;

import java.sql.SQLException;

import com.nt.dto.PatientDto;

public interface PatientService {
public int calcAmountAndAddPatient(PatientDto dto) throws SQLException;
}
