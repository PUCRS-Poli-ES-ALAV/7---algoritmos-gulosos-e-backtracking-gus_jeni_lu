import java.util.ArrayList;
import java.util.List;

public class App{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(100);
        l.add(50);
        //l.add(25);
        l.add(15);
        l.add(6);
        l.add(3);

        int troco = Integer.MAX_VALUE;

        System.out.println();
        moedas(l, troco);
    }
    
    public static List<Integer> moedas(List<Integer> moedas, int troco){
        List<Integer> l = new ArrayList<Integer>();
        int it = 0;
        for(int i=0; i< moedas.size(); i++){
            if(troco/moedas.get(i) >= 1){
                troco = troco - moedas.get(i);
                l.add(moedas.get(i));
                i--;
                it++;
            }
        }

        System.out.println(it);
        return l;
    }
}