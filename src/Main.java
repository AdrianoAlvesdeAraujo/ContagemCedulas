import java.util.*;

public class Main {

    public static void main(String[] args) {

        ContagemMoedas moedas = new ContagemMoedas("AC");
        ContagemCedulas cedulas = new ContagemCedulas("AC");



        moedas.addCount(0.05,100);
        moedas.addCount(0.10, 100);
        moedas.addCount(0.25,100);
        moedas.addCount(0.50,100);
        moedas.addCount(1.00,100);



        cedulas.addCount(2.0, 150);
        cedulas.addCount(5.0, 100);
        cedulas.addCount(10.0, 100);
        cedulas.addCount(20.0, 100);
        cedulas.addCount(50.0, 50);
        cedulas.addCount(100.0, 30);

        System.out.println("A Lista total de moedas ::"+moedas.getMoeda());
        System.out.println("A Lista total de cédulas ::"+cedulas.getCedulas());
        System.out.println("Valor total em cédulas ::"+cedulas.countTotalCedulas());
        System.out.println("Valor total em moedas ::"+moedas.countTotalMoedas());
        double valor=cedulas.countTotalCedulas();
        double valores=moedas.countTotalMoedas();
        double total = valor+valores;
        System.out.println("Valor total ::"+total);












    }
}
