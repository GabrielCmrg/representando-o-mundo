public class Test {
    private int questionNumber;
    private Question[] questions;
    public String teacher;
    private String subject;

    public Test(int questionNumber, String subject) {
        this.questionNumber = questionNumber;
        this.questions = new Question[questionNumber];
        for (int i = 0; i < questionNumber; i++) {
            this.questions[i] = new Question();
        }
        this.subject = subject;
    }

    public int getQuestionNumber() {
        return this.questionNumber;
    }

    public Question[] getQuestions() {
        return this.questions;
    }

    public void addQuestion(Question question) {
        if (!question.subject.equals(this.subject)) {
            System.out.println("Não é possível colocar questões de outra disciplina na prova.");
        } else {
            for (Question current : this.questions) {
                if (current.questionStatement == null) {
                    current.questionStatement = question.questionStatement;
                    current.subject = question.subject;
                    return;
                }
            }
            System.out.println("Essa prova já está totalmente preenchida de questões.");
        }
    }

    public void removeQuestion(int index) {
        this.questions[index] = new Question();
    }
}
