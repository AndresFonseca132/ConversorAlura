public class OperacionesTemperatura {
    //Variables a utilizar para la conversion
    private double valorTemperaura, resultadoTemperatura;
    private int temperaturaInicial, temperaturaFinal;

    //Constructor
    public OperacionesTemperatura(){

    }

    //Getters and Setters
    public double getValorTemperaura() {
        return valorTemperaura;
    }

    public void setValorTemperaura(double valorTemperaura) {
        this.valorTemperaura = valorTemperaura;
    }

    public double getResultadoTemperatura() {
        return resultadoTemperatura;
    }

    public void setResultadoTemperatura(double resultadoTemperatura) {
        this.resultadoTemperatura = resultadoTemperatura;
    }

    public int getTemperaturaInicial() {
        return temperaturaInicial;
    }

    public void setTemperaturaInicial(int temperaturaInicial) {
        this.temperaturaInicial = temperaturaInicial;
    }

    public int getTemperaturaFinal() {
        return temperaturaFinal;
    }

    public void setTemperaturaFinal(int temperaturaFinal) {
        this.temperaturaFinal = temperaturaFinal;
    }
    //Metodo de Conversion
    public double convertirTemperatura(){
        if (temperaturaInicial == 0 && temperaturaFinal == 1) {
            // De C a F
            resultadoTemperatura = (valorTemperaura * 9 / 5) + 32;
        } else if (temperaturaInicial == 0 && temperaturaFinal == 2) {
            // De C a K
            resultadoTemperatura = valorTemperaura + 273.15;
        } else if (temperaturaInicial == 1 && temperaturaFinal == 0) {
            // De F a C
            resultadoTemperatura = (valorTemperaura - 32) * 5 / 9;
        } else if (temperaturaInicial == 1 && temperaturaFinal == 2) {
            // De F a K
            resultadoTemperatura = (valorTemperaura + 459.67) * 5 / 9;
        } else if (temperaturaInicial == 2 && temperaturaFinal == 0) {
            // De K a C
            resultadoTemperatura = valorTemperaura - 273.15;
        } else if (temperaturaInicial == 2 && temperaturaFinal == 1) {
            // De K a F
            resultadoTemperatura = (valorTemperaura * 9 / 5) - 459.67;
        } else {
            // Si las temperaturas son iguales, el resultado es el mismo valor
            resultadoTemperatura = valorTemperaura;
        }
        // Retorno el resultado final
        return resultadoTemperatura;
    }
}
