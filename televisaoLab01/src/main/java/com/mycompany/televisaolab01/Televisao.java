package com.mycompany.televisaolab01;

public class Televisao {

    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0 && canal <= 100) {
            this.canal = canal;
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void alteraVolume(int arg) {
        setVolume(volume + arg);
    }

    public void alteraCanal(int arg) {
        if (arg > 0) {
            canal = canal + 1;
        }
        if (arg == 0) {
            canal = canal;
        } else {
            canal = canal - 1;
        }
    }
}
