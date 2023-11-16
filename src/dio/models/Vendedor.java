package dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {

        this.valorBonificacao = (porcentagemBonificacao/100d * this.valorSalario);

    }


    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(Double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "valorBonificacao=" + valorBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
