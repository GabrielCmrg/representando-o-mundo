public class App {
    public static void main(String[] args) {
        Question question1 = new Question();
        question1.questionStatement = "Qual o significado da vida, do universo e tudo mais?";
        question1.subject = "Cultura pop";
        question1.setResolution("42");

        Question question2 = new Question();
        question2.questionStatement = "Quanto custa um jantar no restaurante no fim do universo?";
        question2.subject = "Cultura pop";

        Question question3 = new Question();
        question3.questionStatement = "Qual a velocidade da luz no vácuo?";
        question3.subject = "Física";
        question3.setResolution("299.792.458 metros por segundo");

        Test nerdExam = new Test(2, "Cultura pop");
        nerdExam.teacher = "Douglas Adams";
        nerdExam.addQuestion(question3);
        nerdExam.addQuestion(question1);
        nerdExam.addQuestion(question2);

        Question[] nerdQuestions = nerdExam.getQuestions();
        for (int i = 0; i < nerdQuestions.length; i++) {
            System.out.println("Questão " + (i + 1));
            System.out.println(nerdQuestions[i].questionStatement);
            System.out.println(nerdQuestions[i].getResolution());
        }

        nerdExam.removeQuestion(1);
        System.out.println("Questão 2 removida");
        System.out.println(nerdQuestions[1].questionStatement);
    }
}
