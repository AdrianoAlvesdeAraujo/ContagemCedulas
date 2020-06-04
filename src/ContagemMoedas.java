import java.util.Date;

public class ContagemMoedas extends CountMoney{

    private Double total005;
    private Double total010;
    private Double total025;
    private Double total050;
    private Double total0100;
    private Double totalMoedas;
    private Double fiveCents = 0.05;
    private Double tenCents = 0.10;
    private Double twentyFiveCents = 0.25;
    private Double fiftyCents = 0.50;
    private Double OneReal = 1.00;


    public ContagemMoedas(String event){
        super(event);

    }

    private Double GeneralTotalMoedas(){
        this.totalMoedas = getTotal005()+getTotal010()+getTotal025()+getTotal0100();
        return totalMoedas;
    }





    public void countFive(Integer valor){
        this.total005 = fiveCents*valor;

    }
    public void countTen(Integer valor){
        this.total010 = tenCents*valor;

    }

    public void countTwentyFive(Integer valor){
        this.total025 = twentyFiveCents*valor;

    }
    public void countFifty(Integer valor){
        this.total050 = fiftyCents*valor;

    }
    public void countOne(Integer valor){
        this.total0100 = OneReal*valor;

    }

    public Double getTotal005() {
        return total005;
    }

    public void setTotal005(Double total005) {
        this.total005 = total005;
    }

    public Double getTotal010() {
        return total010;
    }

    public void setTotal010(Double total010) {
        this.total010 = total010;
    }

    public Double getTotal025() {
        return total025;
    }

    public void setTotal025(Double total025) {
        this.total025 = total025;
    }

    public Double getTotal050() {
        return total050;
    }

    public void setTotal050(Double total050) {
        this.total050 = total050;
    }

    public Double getTotal0100() {
        return total0100;
    }

    public void setTotal0100(Double total0100) {
        this.total0100 = total0100;
    }

    public Double getTotalMoedas() {
        return totalMoedas;
    }
}
