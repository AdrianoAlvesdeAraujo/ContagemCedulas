import java.util.Date;

public class ContagemCedulas extends CountMoney {


    private Double two = 2.00;
    private Double five = 5.00;
    private Double ten = 10.00;
    private Double twentyFive = 25.00;
    private Double fifty = 50.00;
    private Double oneHundred = 100.00;
    private Double total2 = 2.00;
    private Double total5;
    private Double total10;
    private Double total25;
    private Double total50;
    private Double total100;
    private Double totalCedulas;

    public ContagemCedulas(String event){
        super(event);
    }
    public Double GeneralCountCedulas(){
        this.totalCedulas = getTotal2()+getTotal5()+getTotal10()+getTotal25()+getTotal50()+getTotal100();
        return totalCedulas;
    }

    public void countFiveR(Integer valor){
        this.total5 = this.five*valor;

    }

    public void countTenR(Integer valor){
        this.total10 = this.ten*valor;

    }
    public void countTwentyFiveR(Integer valor){
        this.total25 = twentyFive*valor;

    }
    public void countFiftyR(Integer valor){
        this.total50 = this.fifty*valor;

    }

    public void countOneHundredR(Integer valor){
        this.total100 = this.oneHundred*valor;

    }

    public void countTwoR(Integer valor){
        this.total2 = this.two*valor;

    }

    public Double getTotal2() {
        return total2;
    }

    public Double getTotal5() {
        return total5;
    }

    public Double getTotal10() {
        return total10;
    }

    public Double getTotal25() {
        return total25;
    }

    public Double getTotal50() {
        return total50;
    }

    public Double getTotal100() {
        return total100;
    }

    public Double getTotalCedulas() {
        return totalCedulas;
    }
}
