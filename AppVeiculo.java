import java.util.Scanner;

public class AppVeiculo {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        GerenciarVeiculos Gerenciar = new GerenciarVeiculos();
        Boolean sair = false;
        do {
            System.out.println("1 - Adicionar Veiculo:");
            System.out.println("2 - Remover Veiculo:");
            System.out.println("3 - Buscar Veiculo por Placa:");
            System.out.println("4 - Listar Veiculos:");
            System.out.println("5 - Obter o Valor de Imposto do Veiculo:");
            System.out.println("6 - Listar Veiculo por Combústivel:");
            System.out.println("7 - Sair do Aplicativo");
            int opcao = Integer.parseInt(entry.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Insira o modelo do veículo: ");
                    String modelo = entry.nextLine();
                    System.out.println("Insira a marca do veiculo: ");
                    String marca = entry.nextLine();
                    System.out.println("Insira o ano de fabricação do veículo: ");
                    int anofab = Integer.parseInt(entry.nextLine());
                    System.out.println("O valor do veículo: ");
                    double valor = Double.parseDouble(entry.nextLine());
                    System.out.println("Insira a placa do veículo: ");
                    String placa = entry.nextLine();
                    System.out.println("Insira o tipo de Combústivel do veículo([Álcool, Gasolina, flex, GNV ou Diesel): ");
                    String combus = entry.nextLine();
                    Gerenciar.adicionar(new Veiculo(modelo, marca, anofab, valor, placa, combus));
                    break;
                case 2:
                    System.out.println("Insira a Placa do Veiculo a ser removido");
                    placa = entry.nextLine();
                    Gerenciar.remover(placa);
                    System.out.println("Veículo removido");
                    break;
                case 3:
                    System.out.println("Insira a Placa do Veiculo Desejado: ");
                    placa = entry.nextLine();
                    System.out.println(Gerenciar.buscarPorPlaca(placa));
                    break;
                case 4:
                    System.out.println(Gerenciar.listarVeiculos());
                    break;
                case 5:
                    System.out.println("Insira a Placa do Veiculo Para Saber o Valor do Imposto: ");
                    placa = entry.nextLine();
                    System.out.println("Valor do imposto: " + Gerenciar.obterValorImposto(placa));
                    break;
                case 6:
                    System.out.println("Insira o tipo de combústivel: ");
                    combus = entry.nextLine();
                    System.out.println(Gerenciar.listarVeiculoPorCombustivel(combus));
                    break;
                case 7:
                    sair = true;
                    break;
            }
        } while (!sair);
        /*
         * Gerenciar.adicionar(novoCarro = new Veiculo("Fusca", "Wolkswagen", 1995,
         * 3000.00, "AS3J 66", "Gasolina")); Gerenciar.adicionar(novoCarro = new
         * Veiculo("Tucson", "Chevrolet", 2013, 30000.00, "AS3J 11", "Gasolina"));
         * 
         * 
         * System.out.println(Gerenciar.buscarPorPlaca("AS3J 11"));
         * System.out.println(Gerenciar.obterValorImposto("AS3J 11"));
         * System.out.println(Gerenciar.remover("AS3J 66"));
         * System.out.println(Gerenciar.listarVeiculos());
         */
        entry.close();
    }
}