package dio;

import dio.models.Endereco;
import dio.models.Gerente;
import dio.models.OperadorDeCaixa;
import dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Acalanto de Bartira");
        endereco.setBairro("Vila Nova Alba");
        endereco.setComplemento("191");
        endereco.getRua();

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Diego");
        vendedor.setDocumento("01165527510");
        vendedor.setValorSalario(3500d);
        vendedor.setEndereco(endereco);
        vendedor.calcularBonificacao(2.0);

        System.out.println(vendedor);

        System.out.println("-----------------------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Diego", "01165527510", 3500d, endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("-----------------------");

        Gerente gerente = new Gerente();
        gerente.setNome("Diego");
        gerente.setDocumento("01165527545");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(3.0);

        System.out.println(gerente);


    }
}