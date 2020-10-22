/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PacienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PacienteVO;

/**
 *
 * @author Felipe
 */
public class PacienteServicos {
    public void cadastrarPaciente(PacienteVO jVO) throws SQLException{
    PacienteDAO jDAO = DAOFactory.getPacienteDAO();
    jDAO.cadastrarPaciente(jVO);
    }
       public void deletarPaciente(long codigo) throws SQLException{
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        pDAO.deletarMedico(codigo);
    }
     public ArrayList<PacienteVO> buscarPacientes() throws SQLException{
        PacienteDAO jDAO = DAOFactory.getPacienteDAO();
        return jDAO.buscarPacientes();
    }
      public ArrayList<PacienteVO> filtrar(String query) throws SQLException {
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        return pDAO.filtrar(query);
    }//fecha método
      
    public void alterarPaciente(PacienteVO jVO) throws SQLException {
        PacienteDAO pDAO = DAOFactory.getPacienteDAO();
        pDAO.alterarPaciente(jVO);
    }//fecha método  
}//fim da classe

