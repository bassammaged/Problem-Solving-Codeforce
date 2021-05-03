import java.util.Scanner;

public class cfTeam{

    public static void main(String[] args) {
        int petya,vasya,tonya;
        int sovledProblems  = 0;

        // ----- Craete instance of Scanner.
        Scanner sc  = new Scanner(System.in);

        // ----- No of problems
        int problems    = sc.nextInt();

        // ----- Take Status for each problem.
        for (int problem = 0; problem < problems; problem++) {
            petya   = sc.nextInt();
            vasya   = sc.nextInt();
            tonya   = sc.nextInt();

            // ----- Check if the problem will be sovled by the team.
            if (petya + vasya + tonya >= 2) {
                sovledProblems++;
            }
        }

        // ----- Print how many problems will be solved by the team
        System.out.println(sovledProblems);

    }
}