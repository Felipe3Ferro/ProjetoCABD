/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class PacienteVO {
    private long codigo;
    private String nome;
    private String cep;
    private String sexo;
    private String convenio;
    private int telefone;
    private int idade;

    public PacienteVO() {
    }

    public PacienteVO(long codigo, String nome, String cep, String sexo, String convenio, int telefone, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cep = cep;
        this.sexo = sexo;
        this.convenio = convenio;
        this.telefone = telefone;
        this.idade = idade;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PacienteVO{" + "codigo=" + codigo + ", nome=" + nome + ", cep=" + cep + ", sexo=" + sexo + ", convenio=" + convenio + ", telefone=" + telefone + ", idade=" + idade + '}';
    }

}
    