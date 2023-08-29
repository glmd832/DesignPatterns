import desconto.CalculadoraDeDescontos;
import imposto.CalculadoraImpostos;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;


public class TesteImposto {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 1);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraImpostos impostos = new CalculadoraImpostos();
        System.out.println(impostos.calcular(primeiro, new ISS()));

        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        System.out.println(descontos.calcular(segundo));
    }
}
