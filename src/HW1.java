public class HW1 {
    /*Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
    Then your program should print name of the students that has A and B grade
     */
    public static void main(String[] args) {
        String [][]nameAndGrades={
                {"Zayn","Ian","Miley","Tyler"},
                {"A","B","C","D"}
        };
        System.out.print(nameAndGrades[0][0]+" ");
        System.out.println(nameAndGrades[1][0]);
        System.out.print(nameAndGrades[0][1]+" ");
        System.out.println(nameAndGrades[1][1]);


    }
}
