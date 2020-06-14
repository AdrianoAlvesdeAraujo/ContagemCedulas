import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContagemMoedas extends CountMoney{

    private List<Double> moedas = new ArrayList<>();

    public ContagemMoedas(String event){
        super(event);

    }
    public List<Double> getMoeda() {
        return moedas;
    }

    public void setMoeda(List<Double> moeda) {

        this.moedas = moeda;
    }




    public void addCount(double moeda, int qte){
        double total =0;
        total = moeda*qte;
        this.moedas.add(total);

    }


    public double countTotalMoedas() {
        double totalgeral = 0;

        for (double moeda : moedas) {
            totalgeral+=moeda;
        }

        return totalgeral;


    }

    public void delete(double valor){
        int index = moedas.indexOf(valor);
            moedas.remove(index);
        System.out.println(getMoeda());

        }

    public void altera(double valor, int index){
        moedas.set(index, valor);
        System.out.println(getMoeda());
    }



}
