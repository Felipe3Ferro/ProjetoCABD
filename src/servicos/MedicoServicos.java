/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.MedicoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MedicoVO;

/**
 *
 * @author FElipe
 */
public class MedicoServicos {
    public void cadastrarMedico(MedicoVO jVO) throws SQLException{
    MedicoDAO jDAO = DAOFactory.getMedicoDAO();
    jDAO.cadastrarMedico(jVO);
    }
       public void deletarMedico(long codigo) throws SQLException{
        MedicoDAO pDAO = DAOFactory.getMedicoDAO();
        pDAO.deletarMedico(codigo);
    }
     public ArrayList<MedicoVO> buscarMedicos() throws SQLException{
        MedicoDAO jDAO = DAOFactory.getMedicoDAO();
        return jDAO.buscarMedicos();
    }
      public ArrayList<MedicoVO> filtrar(String query) throws SQLException {
        MedicoDAO pDAO = DAOFactory.getMedicoDAO();
        return pDAO.filtrar(query);
    }//fecha método
      
    public void alterarMedico(MedicoVO jVO) throws SQLException {
        MedicoDAO pDAO = DAOFactory.getMedicoDAO();
        pDAO.alterarMedico(jVO);
    }//fecha método  
}//fim da classe

