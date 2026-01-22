import java.util.Scanner;

class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()){
            int grade = scan.nextInt(); 
            
            if (grade >= 40) {                             //Only rounds if 40 or Higher
                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    grade = nextMultiple;
                }
            }
            System.out.println(grade);
        }

        scan.close();
    }
}
