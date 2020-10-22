/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Felipe
 */
public class DAOFactory {
    private static MedicoDAO MedicoDAO = new MedicoDAO();
    
    public static MedicoDAO getMedicoDAO(){
        return MedicoDAO;
      }//fecha método
    private static PacienteDAO PacienteDAO = new PacienteDAO();
    
    public static PacienteDAO getPacienteDAO(){
        return PacienteDAO;
      }//fecha métod

}
