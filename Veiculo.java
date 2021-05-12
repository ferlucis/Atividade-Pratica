public class Veiculo {
    public String modelo;
    public String marca;
    public int anofab;
    public double valor;
    public String placa;
    public String combus;

    public Veiculo(String modelo, String marca, int anofab, double valor, String placa, String combus) {
        this.modelo = modelo;
        this.marca = marca;
        this.anofab = anofab;
        this.valor = valor;
        this.placa = placa;
        this.combus = combus;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int anofab() {
        return anofab;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombus() {
        return combus;
    }

    public double calcularImposto() {
        double imposto = 0;

        if (anofab < 2001) {
            return imposto;
        } else if (combus.equalsIgnoreCase("Gasolina") || combus.equalsIgnoreCase("Diesel") || combus.equalsIgnoreCase("Flex")) {
            imposto = valor * 0.04;
            return imposto;
        }else
            imposto = valor * 0.03;
            return imposto;
        
    }

    public String imprimir() {
        return modelo + marca + anofab + valor + placa + combus;
    }

    public String toString(){
        return "Modelo: " + modelo + ", " + "Marca: " + marca + ", " + "Ano: " + anofab + ", " + "Valor: " + valor + ", " + "Placa: " + placa + ", " + "Tipo de Combustível: " + combus + ".";
    }

}