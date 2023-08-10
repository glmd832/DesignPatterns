import imposto.CalculadoraImpostos;
import imposto.ISS;
import orcamento.Orcamento;

import java.math.BigDecimal;


public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImpostos impostos = new CalculadoraImpostos();
        System.out.println(impostos.calcular(orcamento, new ISS()));
    }
}
