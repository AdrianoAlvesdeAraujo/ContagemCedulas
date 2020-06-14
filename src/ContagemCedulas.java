import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContagemCedulas extends CountMoney {

    private List<Double> cedulas = new ArrayList<>();
    ContagemMoedas coin;

    public ContagemCedulas(String event){
        super(event);
    }





    public void addCount(double cedula, int qte){
        double total =0;
        total = cedula*qte;
        this.cedulas.add(total);
        //System.out.println(getCedulas());

    }


    public double countTotalCedulas() {
        double totalgeral = 0;

        for (double cedula : cedulas) {
            totalgeral+=cedula;
        }
        return totalgeral;

    }

    public void delete(double valor){
        int index = cedulas.indexOf(valor);
        cedulas.remove(index);
        System.out.println(getCedulas());

    }

    public void altera(double valor, int index){
        cedulas.set(index, valor);
        System.out.println(getCedulas());
    }


    public List<Double> getCedulas() {
        return cedulas;
    }



    public void setCedulas(List<Double> cedulas) {
        this.cedulas = cedulas;
    }


}
