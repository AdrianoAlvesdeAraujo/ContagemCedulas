public class Main {

    public static void main(String[] args) {

        ContagemMoedas contagem = new ContagemMoedas("AC");
        ContagemCedulas cc = new ContagemCedulas("AC");
        GeneralCount gc = new GeneralCount();
        //Pela manhã
        contagem.countFive(100);
        contagem.countTen(100);
        contagem.countTwentyFive(100);
        contagem.countFifty(100);
        contagem.countOne(100);

        cc.countTwoR(100);
        cc.countFiveR(100);
        cc.countTwentyFiveR(100);
        cc.countFiftyR(100);
        cc.countOneHundredR(100);

        System.out.println(cc.GeneralCountCedulas());
        System.out.println(contagem.getTotalMoedas());
        Double total = cc.getTotalCedulas()+contagem.getTotalMoedas();
        System.out.println(total);






    }
}
