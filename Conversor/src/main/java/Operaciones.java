public class Operaciones {
    private double valor, resultado;
    private int Inicial, Final;

    // Valores de Conversion de Divisas
    private double dolaraEuro = 0.90;
    private double dolaraPesosColombianos = 3967.15;
    private double eruroaDolar = 1.11;
    private double euroaPesosColombianos = 4385.13;
    private double pesosColombianosaDolar = 0.00025;
    private double pesosColombianosaEuro = 0.00023;

    // Getters and Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getInicial() {
        return Inicial;
    }

    public void setInicial(int inicial) {
        this.Inicial = inicial;
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int aFinal) {
        this.Final = aFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    //Constructor
    public Operaciones(){

    }

    //Metodo de conversion con uso de if y else
    public double convertir(){

        if(Inicial == 0 && Final == 1){
            resultado = valor * dolaraEuro;//De Dolar a Euro
        } else if (Inicial == 0 && Final == 2) {
            resultado = valor * dolaraPesosColombianos; // De Dolar a Peso Colombiano
        } else if (Inicial == 1 && Final == 0) {
            resultado = valor * eruroaDolar; //De Euro a dolar
        }else if (Inicial == 1 && Final == 2){
            resultado = valor * euroaPesosColombianos; //Euro a pesos Colombianos
        } else if (Inicial == 2 && Final == 0) {
            resultado = valor * pesosColombianosaDolar; // Pesos colombianos a Dolar
        }else if (Inicial == 2 && Final == 1){
            resultado = valor * pesosColombianosaEuro; // Pesos Colombianos a Euros
        }else{
            resultado = valor;
        }
        // Retorno el resultado final
        return resultado;
    }
    
    
    
}
