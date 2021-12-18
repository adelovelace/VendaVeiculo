package vendaveiculo;

import vendaveiculo.Motocicleta;
import vendaveiculo.TransporBuilder;

public class MotocicletaBuilder implements TransporBuilder{

    private Motocicleta motocicleta;

    @Override
    public void setNumChassi(int numchassi) {
        // TODO Auto-generated method stub
        motocicleta.setNumChassi(numchassi);
    }

    @Override
    public void setAno(int ano) {
        // TODO Auto-generated method stub
        motocicleta.setAno(ano);
    }

    @Override
    public void setKm(int quilometragem) {
        // TODO Auto-generated method stub
        motocicleta.setKm(quilometragem);
    }

    @Override
    public void setPeso(int peso) {
        // TODO Auto-generated method stub
        motocicleta.setPeso(peso);
    }

    @Override
    public void setMarca(String marca) {
        // TODO Auto-generated method stub
        motocicleta.setMarca(marca);
    }

    @Override
    public void setTipo(String tipo) {
        // TODO Auto-generated method stub
        motocicleta.setTipo(tipo);
    }

    @Override
    public void setStatus(int status) {
        // TODO Auto-generated method stub
        motocicleta.setStatus(status);
    }

    @Override
    public void setPreco(double preco) {
        // TODO Auto-generated method stub
        motocicleta.setPreco(preco);
    }

}