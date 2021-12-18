package vendaveiculo;

import vendaveiculo.TransporBuilder;

public abstract class Veiculo {

    protected int numchassi, ano, quilometragem, peso, status;//1 vendido, 0 a venda.
    protected String marca, modelo, tipocombustivel;
    protected double preco;
    private TransporBuilder transporBuilder;

    public Veiculo() {

        this.numchassi = 0;
        this.ano = 0;
        this.quilometragem = 0;
        this.peso = 0;
        this.marca = null;
        this.modelo = null;
        this.tipocombustivel = null;
        this.status = 0;
        this.preco = 0;
    }

    // public Veiculo(TransporBuilder transporBuilder){
        
    // }

    public void veiculoVendido() {
        if (status == 1) {
            System.out.println("O veículo já foi vendido \n");
        } else {
            status = 1;
        }
    }
    
    public boolean verificaStatus(){
        if(status == 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void setNumChassi(int numchassi){
        this.numchassi = numchassi;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setKm(int quilometragem){
        this.quilometragem = quilometragem;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setTipo(String tipo){
        this.tipocombustivel = tipo;
    }
    
    public void setStatus(int status){
        this.status = status;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getAno(){
        return ano;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public int getKm(){
        return quilometragem;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getTipo(){
        return tipocombustivel;
    }
    
    public int getStatus(){
        return status;
    }
    
    public int getChassi(){
        return numchassi;
    }
    
    public abstract void getTudo();
}
