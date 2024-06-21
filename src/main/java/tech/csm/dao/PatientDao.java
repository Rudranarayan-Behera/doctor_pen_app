package tech.csm.dao;

import tech.csm.domain.Patient;

public interface PatientDao {

	Patient getPatientDetails(String phoneNo);

}
