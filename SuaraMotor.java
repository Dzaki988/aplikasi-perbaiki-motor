// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Random;

class SuaraMotor {
    public static void suaraMotoreDzaki() {
        String[] suaraMotor = {
            "brebet",
            "dor dor",
            "duar",
            "brum",
            "brem",
        };
        for (int i=0; i<3; i++) {
        System.out.println(suaraMotor[i]);
        }
        
        System.out.println();
        
        for (int i=0; i<20; i++) {
            System.out.println(suaraMotor[new Random().nextInt(5)]);
        }
        
    }
    
    
    public static void main(String[] args) {
        suaraMotoreDzaki();
    }
}
