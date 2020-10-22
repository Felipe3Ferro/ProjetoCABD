/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.PacienteVO;
import persistencia.ConexaoBanco;


/**
 *
 * @author Felipe
 */

    public class PacienteDAO {
    
    public void cadastrarPaciente (PacienteVO jVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            
             sql = "insert into clinica(codigo,nome,cep,sexo,convenio,telefone,Idade)"
             +"values(null,'"+jVO.getNome()+"','"+jVO.getCep()+"','"+jVO.getSexo()+"','"+jVO.getConvenio()+"',"+jVO.getTelefone()+","+jVO.getIdade()+")";        
        stat.execute(sql);
        }catch (SQLException e) {
            throw new SQLException("Erro ao inserir Paciente!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
        
    }//fecha cadastrar jogo
    
    public void deletarMedico(long codigo) throws SQLException {
        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql;
            /* Montando uma String que delete um registro através de um
             código(idProduto) enviado pelo usuário. */
            sql = "delete from clinica where codigo="+ codigo +"";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar"
                    + " Paciente! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletarProduto
    
     public ArrayList<PacienteVO> buscarPacientes() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from clinica";
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<PacienteVO> prods = new ArrayList<>();
            while (rs.next()) {
                PacienteVO p = new PacienteVO();
                p.setCodigo(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setCep(rs.getString(3));
                p.setSexo(rs.getString(4));
                p.setConvenio(rs.getString(5));
                p.setTelefone(rs.getInt(6));
                p.setIdade(rs.getInt(7));
                prods.add(p);
                
            }//fecha while
            System.out.println("TESTE: " + prods);
            return prods;

        } catch (SQLException se) {
            throw new SQLException("erro ao buscar Paciente!" + se.getMessage());

        } finally {
            con.close();
            stat.close();
        }//fecha try catch
     }//fecha busca produto
     public ArrayList<PacienteVO> filtrar(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from clinica "+query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<PacienteVO> prod = new ArrayList<>();


            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                PacienteVO p = new PacienteVO();
                p.setCodigo(rs.getLong("codigo"));
                p.setNome(rs.getString("nome"));
                p.setCep(rs.getString("cep"));
                p.setSexo(rs.getString("sexo"));
                p.setConvenio(rs.getString("convenio"));
                p.setTelefone(rs.getInt("telefone"));
                p.setIdade(rs.getInt("idade"));

               
                prod.add(p);
            }//fecha while

            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Paciente! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha filtrar
     

    public void alterarPaciente(PacienteVO jVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update clinica set "
                 +"nome = '"+jVO.getNome()+"',"
                 +"cep = '"+jVO.getCep()+"',"
                 +"sexo = '"+jVO.getSexo()+"'," 
                 +"convenio = '"+jVO.getConvenio()+"',"
                 +"telefone = "+jVO.getTelefone()+","
                 +"idade = "+jVO.getIdade()+" "   
                 +"where codigo = "+jVO.getCodigo();

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar Paciente! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha alterarJogo
    
}


