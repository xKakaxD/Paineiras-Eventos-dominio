package trabalho.dominio;

import java.util.List;

public interface PersistenceService {//CRUD
	//create e update CREATE UPDATE
	public <T> T grava(String key, Object o);
	//select READ
	public <T> T recupera(String key);
	//select em varios READ
	public <T> List<T> listarElementos(Class<T> clazz);
	//drop DELETE
	public void apagar(String key, Object o);
}
