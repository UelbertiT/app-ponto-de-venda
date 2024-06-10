package dao;

import conexaoBD.ConexaoPostgres;
import modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        Connection conn = ConexaoPostgres.getConection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM cliente");
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ConexaoPostgres.closeTransaction(conn, ps, rs);
        }
        return clientes;
    }

    // Outros métodos para salvar, atualizar, deletar clientes, etc.
}
