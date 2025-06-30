import java.util.Scanner;
public class QuestionsService {

    Questions[] questions = new Questions[5];
    String[] selections = new String[5];
    Scanner sc = new Scanner(System.in);

    public QuestionsService(){
        questions[0] = new Questions(0, "What is size of byte", "1", "2", "3", "4", "1");
        questions[1] = new Questions(1, "What is size of short", "1", "2", "3", "4", "2");
        questions[2] = new Questions(2, "What is size of int", "1", "2", "3", "4", "4");
        questions[3] = new Questions(3, "What is size of long", "1", "8", "3", "4", "2");
        questions[4] = new Questions(4, "What is size of char", "1", "2", "3", "4", "1");
        
    }

    public void displayQuestions(){

        int i=0;
        for (Questions question : questions) {
            System.out.println(question);
            selections[i++] = sc.nextLine();
        }

        for (String select : selections) {
            System.out.println(select);
        }
    
    }

    public void printScore(){
        int score = 0;
        for(int i=0;i<questions.length;i++){
            String userAns = selections[i];
            String actualAns = questions[i].getAns();
            if (userAns.equals(actualAns)) {
                score++;
            }
        }

        System.out.println("Your score is : "+score);
    }
}
