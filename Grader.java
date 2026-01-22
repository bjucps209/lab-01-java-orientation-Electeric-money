import java.util.Scanner;

class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int grade = scan.nextInt();
            
            if (grade >= 40) {
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
