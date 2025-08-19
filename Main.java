import things.*;

public class Main {
    public static void main(String[] args){
        User surya = new User("Surya");

        Quest morningRoutine = new Quest("Morning Routine");

        task brushTeeth = new task("Brush teeth"){
            public int XPGained() {
                return 10;
            }
        };
        task jog = new task("Jog") {
            public int XPGained() {
                return 20;
            }
        };
        morningRoutine.addtask(brushTeeth);
        morningRoutine.addtask(jog);

        int earnedXP = morningRoutine.completeQuest();
        surya.earnXP(earnedXP);
        System.out.println("User: " + surya.getUsername());
        System.out.println("XP Earned: " +  earnedXP);
        System.out.println("Total Xp: "+ surya.getXP());
    }
}

