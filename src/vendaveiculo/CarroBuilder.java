package vendaveiculo;

import vendaveiculo.TransporBuilder;

public class CarroBuilder implements TransporBuilder{

    private Carro carro;

    @Override
    public void setNumChassi(int numchassi) {
        // TODO Auto-generated method stub
        carro.setNumChassi(numchassi);
        
    }

    @Override
    public void setAno(int ano) {
        // TODO Auto-generated method stub
        carro.setAno(ano);
    }

    @Override
    public void setKm(int quilometragem) {
        // TODO Auto-generated method stub
        carro.setKm(quilometragem);
    }

    @Override
    public void setPeso(int peso) {
        // TODO Auto-generated method stub
        carro.setPeso(peso);
    }
    @Override
    public void setMarca(String marca) {
        // TODO Auto-generated method stub
        carro.setMarca(marca);
    }

    @Override
    public void setTipo(String tipo) {
        // TODO Auto-generated method stub
        carro.setTipo(tipo);
    }

    @Override
    public void setStatus(int status) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setPreco(double preco) {
        // TODO Auto-generated method stub
        
    }

}