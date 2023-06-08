import java.util.Scanner;
import java.util.Random;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
     Random wireNum = new Random();
     Random whichWire = new Random();
     Scanner cutWire = new Scanner(System.in);

     int numWires = wireNum.nextInt(2,5);
     if (numWires == 2) {
        out.println("There are 2 wires to cut.");
        int chooseWire = whichWire.nextInt(1,2);
        if (chooseWire == 1) {
            String cut2Wires = cutWire.next();
            if (cut2Wires == "1") {
                out.println("Bomb defused succesfully.");
            } else {
                out.println("Bomb explodes becuase you cut the wrong wire.");
            }
        } if (chooseWire == 2) {
            String cut2Wires = cutWire.next();
            if (cut2Wires == "2") {
                out.println("Bomb defused successfully");
            } else {
                out.println("Bomb explodes.");
            }
        }

     }
     if (numWires == 3) {
        out.println("There are 3 wires to cut.");
        int choose3Wire = whichWire.nextInt(1,3);
        if (choose3Wire == 1) {
            String cut3Wires = cutWire.next();
            if (cut3Wires == "1") {
                out.println("Bomb defused successfully.");
            } else {
                out.println("Bomb explodes.");
            }
        }
        if (choose3Wire == 2) {
            String cut3Wires = cutWire.next();
            if (cut3Wires == "2") {
                out.println("Bomb defused successfully.");
            } else {
                out.println("Bomb explodes");
            }
        }
        if (choose3Wire == 3) {
            String cut3Wires = cutWire.next();
            if (cut3Wires == "3") {
                out.println("Bomb defused successfully");
            } else {
                out.println("Bomb explodes.");
            }
        }
     }
     if (numWires == 4) {
        out.println("THere are 4 wires to cut.");
        int choose4Wires = whichWire.nextInt(1,4);
        if (choose4Wires == 1) {
            String cut4Wires = cutWire.next();
            if (cut4Wires == "1") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes");
            }

        }
        if (choose4Wires == 2) {
            String cut4Wires = cutWire.next();
            if (cut4Wires == "2") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        }
        if (choose4Wires == 3) {
            String cut4Wires = cutWire.next();
            if (cut4Wires == "3") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        }
        if (choose4Wires == 4) {
            String cut4Wires = cutWire.next();
            if (cut4Wires == "4") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        }
     }
     if (numWires == 5) {
        out.println("There are 5 wires to cut.");
        int choose5Wires0 = wireNum.nextInt(1,5);
        if (choose5Wires0 == 1) {
            String cut5Wires = cutWire.next();
            if (cut5Wires == "1") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        }
     
    
        out.println("There are 5 wires to cut.");
        int choose5Wires1 = wireNum.nextInt(1,5);
        if (choose5Wires1 == 2) {
            String cut5Wires = cutWire.next();
            if (cut5Wires == "2") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        }
    
    
        out.println("There are 5 wires to cut.");
        int choose5wires2 = wireNum.nextInt(1,5);
        if (choose5wires2 == 3) {
            String cut5Wires = cutWire.next();
            if (cut5Wires == "3") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes");
            }
        }
    
    
        out.println("There are 5 wires to cut.");
        int choose5wires3 = wireNum.nextInt(1,5);
        if (choose5wires3 == 4) {
            String cut5wires = cutWire.next();
            if (cut5wires == "4") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes.");
            }
        } 
    
    
        out.println("There are 5 wires to cut.");
        int choose5wires5 = wireNum.nextInt(1,5);
        if (choose5wires5 == 5) {
            String cut5wires = cutWire.next();
            if (cut5wires == "5") {
                out.println("Bomb defused.");
            } else {
                out.println("Bomb explodes");
            }
        }
    
    cutWire.close();
    }
}
}
