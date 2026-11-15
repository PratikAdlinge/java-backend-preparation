package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int answer_Id;
	private String answer;
	@OneToOne (mappedBy = "answer")
	private Question question;
	
	public Answer(int answer_Id, String answer, Question question) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
		this.question = question;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
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
	public Answer(int answer_Id, String answer) {
		super();
		this.answer_Id = answer_Id;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [answer_Id=" + answer_Id + ", answer=" + answer + ", question=" + question + "]";
	}
	
	
	
	
}
