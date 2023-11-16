package dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{

    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {

        this.valorBonificacao = (porcentagemBonificacao/100 * this.valorRemuneracao) + 100d;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "valorBonificacao=" + valorBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                '}';
    }


}
