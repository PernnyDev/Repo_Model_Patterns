package srp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

	public static List<Cliente> resgatarClientes() throws SQLException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Connection conn = FabricaDB.getConn();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from cliente");
		while (rs.next()) {
			extracted(clientes, rs);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		return clientes;
	}

	private static void extracted(List<Cliente> clientes, ResultSet rs) throws SQLException {
		Cliente c = new Cliente();
		c.setId(rs.getInt("id"));
		c.setNome(rs.getString("nome"));
		clientes.add(c);
	}

}
