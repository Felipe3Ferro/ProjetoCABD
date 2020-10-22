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
public class MedicoVO {
    private long codigo;
    private String nome;
    private String cpf;
    private String sexo;
    private String Area;
    private int telefone;
    private double salario;

    public MedicoVO() {
    }

    public MedicoVO(long codigo, String nome, String cpf, String sexo, String Area, int telefone, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.Area = Area;
        this.telefone = telefone;
        this.salario = salario;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "MedicoVO{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", Area=" + Area + ", telefone=" + telefone + ", salario=" + salario + '}';
    }


}

    