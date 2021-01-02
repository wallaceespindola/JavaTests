package com.clincase;

public interface IClincaseTestDao {
	
	String NAME = "TESTE";

	public Patient retrieveById(Long PatientId);

}
