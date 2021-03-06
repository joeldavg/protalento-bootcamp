package ar.com.educacionit.dao;

import ar.com.educacionit.domain.Socios;

public interface ICrud {

	// DAO -> Data Access Object

	// create
	public Socios create(Socios socioACrear);

	// read by id
	public Socios findById(Long id);
	// despues completo los demas

	// SELECT * FROM
	public Socios[] findAll();

}
