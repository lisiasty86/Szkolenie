package OOP_Basic.zad4;

public class Main {

    public static void main(String[] args) {

        Question base = new Question();

        //Question question1 = new Question(new User("Jacek", "Placek", "jacekplacek@gmail.com"), 20190703);
        //Question question2 = new Question(new User("Jacek", "Placek", "jacekplacek@gmail.com"), 20190803);

        Question question1 = base.createQuestion(new User("Jacek", "Placek", "jacekplacek@gmail.com"), 20190703);
        Question question2 = base.createQuestion(new User("Jacek", "Placek", "jacekplacek@gmail.com"), 20190803);


        System.out.println(isExpired(question1.getDate()));
        System.out.println(isExpired(question2.getDate()));
        System.out.println(getUserEmail(question1));
    }

    private static boolean isExpired(int date) {
        int today = 20190803;

        if (today - date > 14) {
            return true;
        }

        return false;
    }

    public static String getUserEmail(Question question) {
        return question.getUser().getEmail();
    }

}
