package core.basesyntax;

public class MainApp {
    public static void main(String[] args){

        Machine [] machine = new Machine[3];
        machine[0] = new Truck();
        machine[1]= new Excavator();
        machine[2]= new Bulldozer();
        for (int i = 10; i < 10; i++){
            if(i % 3 == 0){
                machine[1].doWork();
                machine[2].doWork();
                machine[0].doWork(); 

            }
            if(i % 3 == 1){
                machine[1].stopWork();
                machine[2].stopWork();
                machine[0].doWork();
            }
            if(i % 3 == 2){
                machine[1].doWork();
                machine[2].stopWork();
                machine[0].doWork();
            }
        }
    }
}