public class GeneralCount {

    private Double totalManha;
    private Double totalTarde;
    private Double totalGeral;
    private ContagemCedulas count;
    private ContagemMoedas countM;



    public Double countManha(){
      this.totalManha = count.getTotalCedulas()+countM.getTotalMoedas();
                return totalManha;
    }

    public Double countTarde(){
        this.totalTarde = count.getTotalCedulas()+countM.getTotalMoedas();
        return totalTarde;
    }

    public Double generalCount(){
        this.totalGeral=getTotalManha()+getTotalTarde();
        return totalGeral;
    }
    public Double getTotalTarde() {
        return totalTarde;
    }


    public Double getTotalGeral() {
        return totalGeral;
    }

    public Double getTotalManha() {
        return totalManha;
    }
}
