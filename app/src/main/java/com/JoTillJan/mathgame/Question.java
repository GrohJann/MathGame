package com.JoTillJan.mathgame;

public class Question {

    private class Step {

        private String therm;

        private Step(){

        }
    }
    private int id;
    private String question;
    private String[] answer;
    private boolean solved;

    public Question(int level, String question, String answer){
        this.id = level;
        this.question = question;
        this.answer[0] = answer;
    }

    public Question(int level, String question, String[] answer){
        this.id = level;
        this.question = question;
        this.answer = answer;
    }

    public int getID() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswer() {
        return answer;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
