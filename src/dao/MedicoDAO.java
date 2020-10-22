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
import modelo.MedicoVO;
import persistencia.ConexaoBanco;


/**
 *
 * @author Felipe
 */

    public class MedicoDAO {
    
    public void cadastrarMedico (MedicoVO jVO) throws SQLException{
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            
             sql = "insert into hospital(codigo,nome,cpf,sexo,area,telefone,salario)"
             +"values(null,'"+jVO.getNome()+"','"+jVO.getCpf()+"','"+jVO.getSexo()+"','"+jVO.getArea()+"',"+jVO.getTelefone()+","+jVO.getSalario()+")";        
        stat.execute(sql);
        }catch (SQLException e) {
            throw new SQLException("Erro ao inserir jogo!"+e.getMessage());
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
            sql = "delete from hospital where codigo="+ codigo +"";

            stat.execute(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar"
                    + " jogo! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletarProduto
    
     public ArrayList<MedicoVO> buscarMedicos() throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;
            sql = "select * from hospital";
            ResultSet rs = stat.executeQuery(sql);

            ArrayList<MedicoVO> prods = new ArrayList<>();
            while (rs.next()) {
                MedicoVO p = new MedicoVO();
                p.setCodigo(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setCpf(rs.getString(3));
                p.setSexo(rs.getString(4));
                p.setArea(rs.getString(5));
                p.setTelefone(rs.getInt(6));
                p.setSalario(rs.getDouble(7));
                prods.add(p);
                
            }//fecha while
            System.out.println("TESTE: " + prods);
            return prods;

        } catch (SQLException se) {
            throw new SQLException("erro ao buscar Medico!" + se.getMessage());

        } finally {
            con.close();
            stat.close();
        }//fecha try catch
     }//fecha busca produto
     public ArrayList<MedicoVO> filtrar(String query) throws SQLException {
        
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from hospital "+query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<MedicoVO> prod = new ArrayList<>();


            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                MedicoVO p = new MedicoVO();
                p.setCodigo(rs.getLong("codigo"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setSexo(rs.getString("sexo"));
                p.setArea(rs.getString("area"));
                p.setTelefone(rs.getInt("telefone"));
                p.setSalario(rs.getDouble("salario"));

               
                prod.add(p);
            }//fecha while

            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar Medico! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha filtrar
     

    public void alterarMedico(MedicoVO jVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "update hospital set "
                 +"nome = '"+jVO.getNome()+"',"
                 +"cpf = '"+jVO.getCpf()+"',"
                 +"sexo = '"+jVO.getSexo()+"'," 
                 +"area = '"+jVO.getArea()+"',"
                 +"telefone = "+jVO.getTelefone()+","
                 +"salario = "+jVO.getSalario()+" "   
                 +"where codigo = "+jVO.getCodigo();

            stat.executeUpdate(sql);

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar Medico! " + se.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha alterarJogo
    
}


