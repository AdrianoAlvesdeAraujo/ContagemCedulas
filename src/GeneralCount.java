public class GeneralCount {

    //private Double totalManha;
    //private Double totalTarde;
    private Double totalGeral;
    private ContagemCedulas count;
    private ContagemMoedas countM;



    public double totalCount(){
        double temp = 0;
        temp +=count.getTotalCedulas();
        temp +=countM.getTotalMoedas();
        setTotalGeral(temp);
        return temp;

    }/*

    public void countTarde(){
        Double temp = null;
        temp +=count.getTotalCedulas();
        temp +=countM.getTotalMoedas();
        setTotalTarde(temp);
    }

    public void generalCount(){
        Double temp = null;
        temp +=getTotalManha();
        temp +=getTotalTarde();
        setTotalGeral(temp);
    }
    public Double getTotalTarde() {
        return totalTarde;
    }
*/

    public Double getTotalGeral() {

        return totalGeral;
    }
/*
    public Double getTotalManha() {
        return totalManha;
    }

    public void setTotalManha(Double totalManha) {
        this.totalManha = totalManha;
    }

    public void setTotalTarde(Double totalTarde) {
        this.totalTarde = totalTarde;
    }
*/
    public void setTotalGeral(Double totalGeral) {
        this.totalGeral = totalGeral;
    }

    public void setCount(ContagemCedulas count) {
        this.count = count;
    }

    public void setCountM(ContagemMoedas countM) {
        this.countM = countM;
    }
}
