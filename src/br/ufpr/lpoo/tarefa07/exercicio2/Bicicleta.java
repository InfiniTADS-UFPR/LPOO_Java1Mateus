package br.ufpr.lpoo.tarefa07.exercicio2;

class Bicicleta {
    int cadencia = 0;
    int velocidade = 0;
    int marcha = 1;

    public Bicicleta() {
    }

    public Bicicleta(int cadencia, int velocidade, int marcha) {
        this.cadencia = cadencia;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    void mudarCadencia (int novoValor) throws BikeException {
        if (novoValor < 0){
            throw new BikeException("O RPM não pode ser menor que 0", new IllegalArgumentException());
        }
        cadencia = novoValor;
    }

    void mudarMarcha (int novoValor) throws BikeException {
        if (novoValor < 0 || novoValor > 24){
            throw new BikeException("O valor da marchar deve estar entre 0 e 24", new IllegalArgumentException());
        }
        marcha = novoValor;
    }

    void aumentarVelocidade (int incremento) throws BikeException {
        if(velocidade+incremento > 100){
            throw new BikeException("A velocidade não pode exceder 100 km/h", new IllegalArgumentException());
        }
        velocidade = velocidade + incremento;

    }

    void aplicarFreios (int decremento) throws BikeException {
        if (velocidade-decremento < 0){
            throw new BikeException("A velocidade não pode ser negativa", new IllegalArgumentException());
        }
        velocidade = velocidade - decremento;
    }

    void printStates () {
        System.out.println("Cadencia="+cadencia+", Velocidade="+velocidade+", Marcha=" +marcha);
    }
}
