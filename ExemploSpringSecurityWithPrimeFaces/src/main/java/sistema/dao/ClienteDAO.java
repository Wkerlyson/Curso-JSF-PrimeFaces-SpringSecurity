package sistema.dao;

import sistema.entidade.Cliente;

public class ClienteDAO extends GenericoDAO<Cliente>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6509506293301835451L;

	@Override
	protected Class<Cliente> getClasseEntidade() {
		return Cliente.class;
	}

}
