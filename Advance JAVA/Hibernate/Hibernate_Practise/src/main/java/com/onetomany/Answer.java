package com.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Answer {
	@Id
	private int answer_Id;
	private String answer;
	@ManyToOne ()
	private Question question;
	public int getAnswer_Id() {
		return answer_Id;
	}
	public void setAnswer_Id(int answer_Id) {
		this.answer_Id = answer_Id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}

public Answer() {
    super();
}

public Answer(int answer_Id, String answer) {
    super();
    this.answer_Id = answer_Id;
    this.answer = answer;
}

public Answer(int answer_Id, String answer, Question question) {
    super();
    this.answer_Id = answer_Id;
    this.answer = answer;
    this.question = question;
}

	
	
	

}
