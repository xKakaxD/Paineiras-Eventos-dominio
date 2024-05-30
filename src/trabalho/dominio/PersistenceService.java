package trabalho.dominio;

import java.util.List;

public interface PersistenceService {
	public <T> T recupera(String key);

	public <T> List<T> listarElementos(Class<T> clazz);

}
