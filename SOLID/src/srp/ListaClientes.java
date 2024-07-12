package srp;

import java.sql.SQLException;
import java.util.List;


public class ListaClientes {

	public void listarClientes() throws SQLException {
		List<Cliente> clientes = ClienteDAO.resgatarClientes();
		
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}
}
