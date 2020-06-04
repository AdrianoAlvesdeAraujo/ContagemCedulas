public class Main {

    public static void main(String[] args) {

        ContagemMoedas contagem = new ContagemMoedas("AC");
        ContagemCedulas cc = new ContagemCedulas("AC");
        GeneralCount gc = new GeneralCount();
        //Pela manhã
        contagem.countFive(35);
        contagem.countTen(25);
        contagem.countTwentyFive(30);
        contagem.countFifty(95);
        contagem.countOne(90);

        cc.countTwoR(144);
        cc.countFiveR(110);
        cc.countTenR(97);
        cc.countTwentyFiveR(100);
        cc.countFiftyR(60);
        cc.countOneHundredR(20);
        cc.generalCountCedulas();
        contagem.generalTotalMoedas();

        Double totalM = contagem.getTotalMoedas();
        Double totalC = cc.getTotalCedulas();

        System.out.println("Total de Cédulas R$"+totalC);
        System.out.println("Total de Moedas: R$"+totalM);
        Double totalG =totalM + totalC;

        System.err.println("Total Geral: R$"+totalG);



        //System.out.println(gc.getTotalGeral());






    }
}
