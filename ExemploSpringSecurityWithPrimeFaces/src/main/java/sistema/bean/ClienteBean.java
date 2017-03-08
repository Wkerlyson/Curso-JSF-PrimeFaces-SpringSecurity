package sistema.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import sistema.entidade.Cliente;
import sistema.service.ClienteService;

@ViewScoped
@Named
public class ClienteBean {

	private Cliente cliente;
	
	@Inject
	private ClienteService service;
	
	public String salvar() {
		if (!cliente.isPersisted()) {
			service.salvar(cliente);
		}
		resetCliente();

		return "";
	}
	
	public Cliente getCliente() {
		if(cliente == null)
			resetCliente();
		
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	private void resetCliente(){
		cliente = new Cliente();
	}
	
	
	
}
