import java.util.ArrayList;

public class GerenciarVeiculos {
    public ArrayList<Veiculo> carros = new ArrayList<>();

    public void adicionar(Veiculo a) {
        carros.add(a);
    }

    public boolean remover(String placa) {
        for (Veiculo veiculo : carros) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                carros.remove(veiculo);
                return true;
            }
        }
        return false;
    }

    public Veiculo buscarPorPlaca(String placa) {
        for (Veiculo veiculo : carros) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                carros.contains(veiculo);
                return veiculo;
            }
        }
        return null;
    }

    public String listarVeiculos() {
        return "Veiculo(s): " + carros;
    }

    public double obterValorImposto(String placa) {
        for (Veiculo veiculo : carros) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return veiculo.calcularImposto();
            }
        }
        return -1;
    }

    public String listarVeiculoPorCombustivel(String combustivel) {
        for (Veiculo veiculo : carros) {
            if (veiculo.getCombus().equalsIgnoreCase(combustivel)) {
                return "Veiculo(s) " + veiculo;
            }
        }
        return null;
    }

}
