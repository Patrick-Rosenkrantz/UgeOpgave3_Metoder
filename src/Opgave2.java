public class Opgave2 {
    static int assignmentsPoints;
    static int examPoints;
    static int projectPoints;
    static int totalPoints;

    public static void addAssignmentPoints(int points){
        assignmentsPoints += points;
    }

    public static void addExamPoints(int amount){
        examPoints += amount;
    }

    public static void addProjectPoints(int amount){
        projectPoints += amount;
    }

    public void printTotal(){
        System.out.println(assignmentsPoints);
        System.out.println(examPoints);
        System.out.println(projectPoints);
        getTotal();
    }

    public static void addPoints(int points, String type) {
        switch (type){
            case "Exam":
                addExamPoints(points);
                break;
            case " assignment":
                addAssignmentPoints(points);
                break;
            case "Project":
                addProjectPoints(points);
                break;
        }
    }

    public static void getTotal(){
        totalPoints = assignmentsPoints + examPoints + projectPoints;
        System.out.println(totalPoints);
    }
    int grade;
    public static int getGrade(int points){
     if (points>0 && points <= 50){
         return 4;
     } else if (points<=70){
         return 7;
        } else if (points<85){
         return 10;
     } else return 12;
    }


    void main(){
    addAssignmentPoints(25);
    addExamPoints(40);
    addProjectPoints(30);
    printTotal();

    System.out.println(getGrade(54));
    }
}
