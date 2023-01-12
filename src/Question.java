public class Question {
    public String questionStatement;
    public String subject;
    private String resolution;
    private boolean isSolved;

    public String getResolution() {
        return this.resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
        this.isSolved = true;
    }

    public void removeResolution() {
        this.resolution = "";
        this.isSolved = false;
    }

    public boolean getIsSolved() {
        return this.isSolved;
    }
}
