package com.clincase;

public class PatientService {

	final static String message1 = "Field is mandatory.";
	final static String message2 = "Site status is invalid.";

	// Beans injected by dependency injection
	private PatientDao patientDao;
	private VisitDao visitDao;
	private IClincaseTestDao dao;

	public Patient retrievePatientByIdAndPtrCode(Long patientId) {
		return dao.retrieveById(patientId);
	}

	public Visit retrieveVisitbyId(Long visitId) {
		return visitDao.retrieveById(visitId);
	}

	public Patient insertOrUpdate(Patient patient, boolean ok) {
		// validates compulsory field
		if (patient.getName() == null) {
			throw new RuntimeException(message1);
		}
		// validates the site where patient belongs to
		if (patient.getSite().getStatus().equals("DEACTIVE")) {
			throw new RuntimeException(message2);
		}
		if (ok) {
			return patientDao.insert(patient);
		} else {
			return patientDao.update(patient);
		}
	}
	/*
	 * setters omitted.
	 */
}