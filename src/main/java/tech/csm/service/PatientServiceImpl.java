package tech.csm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.csm.dao.PatientDao;
import tech.csm.domain.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDao;
	
	@Override
	public Patient getPatientDetails(String phoneNo) {
		
		return patientDao.getPatientDetails(phoneNo);
	}

}
