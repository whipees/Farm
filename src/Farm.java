import java.util.ArrayList;
import java.util.Scanner;

public class Farm {

        private boolean exit = false;


    private ArrayList<Flower> kyticky;


    public Farm() {
        this.kyticky = new ArrayList<>();
    }

    public String vypis(){
        return kyticky + "vas list";
    }

    public void program(){
        while (!exit){
            zasadit();
            System.out.println(vypis());
        }
    }

    public void zasadit(){
        Scanner sc = new Scanner(System.in);
        if (kyticky.size() < 4){
            System.out.println("Co chcete zasadit? : 1) Ruze 2) tulipan 3) lilie 4) kopretina 5) hortenzie  6) exit");
            int vyber = sc.nextInt();
            switch (vyber){
                case 1: kyticky.add(new Ruze());
                break;
                case 2: kyticky.add(new Tulipan());
                break;
                case 3: kyticky.add(new Lilie());
                break;
                case 4: kyticky.add(new Kopretina());
                break;
                case 5: kyticky.add(new Hortenzie());
                break;
                case 6: exit = true;
                default:
                    System.out.println("nejde nic");
                    break;
            }
        }
    }
}
