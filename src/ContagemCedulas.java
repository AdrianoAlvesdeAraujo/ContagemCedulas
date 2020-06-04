import java.util.Date;

public class ContagemCedulas extends CountMoney {


    private Double two = 2.00;
    private Double five = 5.00;
    private Double ten = 10.00;
    private Double twentyFive = 25.00;
    private Double fifty = 50.00;
    private Double oneHundred = 100.00;
    private Double total2;
    private Double total5;
    private Double total10;
    private Double total25;
    private Double total50;
    private Double total100;
    private Double totalCedulas;

    public ContagemCedulas(String event){
        super(event);
    }
    public void generalCountCedulas(){


        double temp = 0;
        temp += getTotal2();
        temp += getTotal5();
        temp += getTotal10();
        temp += getTotal25();
        temp += getTotal50();
        temp += getTotal100();
        setTotalCedulas(temp);
    }

    public void countFiveR(Integer valor){
        Double temp;
        temp = this.five*valor;
        setTotal5(temp);

    }

    public void countTenR(Integer valor){
        Double temp;
        temp = this.ten*valor;
        setTotal10(temp);


    }
    public void countTwentyFiveR(Integer valor){
        Double temp;
        temp = twentyFive*valor;
        setTotal25(temp);

    }
    public void countFiftyR(Integer valor){
        Double temp = null;
        temp = this.fifty*valor;
        setTotal50(temp);

    }

    public void countOneHundredR(Integer valor){
        Double temp;
        temp = this.oneHundred*valor;
        setTotal100(temp);

    }

    public void countTwoR(Integer valor){
        Double temp;
        temp = this.two*valor;
        setTotal2(temp);

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

    public void setTotal2(Double total2) {
        this.total2 = total2;
    }

    public void setTotal5(Double total5) {
        this.total5 = total5;
    }

    public void setTotal10(Double total10) {
        this.total10 = total10;
    }

    public void setTotal25(Double total25) {
        this.total25 = total25;
    }

    public void setTotal50(Double total50) {
        this.total50 = total50;
    }

    public void setTotal100(Double total100) {
        this.total100 = total100;
    }

    public void setTotalCedulas(Double totalCedulas) {
        this.totalCedulas = totalCedulas;
    }
}
