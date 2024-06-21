package tech.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.csm.dao.PrescriptionDao;
import tech.csm.domain.Prescription;
@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionDao prescriptionDao;
	
	
	
	
	@Override
	public List<Prescription> getPrescriptionDetailsByPatientId(Integer patientId) {
		
		return prescriptionDao.getPrescriptionDetailsByPatientId( patientId);
	}




	@Override
	public String savePrecriptionDetails(Integer patientId, Integer dieseaseNameId, String presDtls) {
		
		return prescriptionDao.savePrecriptionDetails(patientId,dieseaseNameId,presDtls);
	}

}
