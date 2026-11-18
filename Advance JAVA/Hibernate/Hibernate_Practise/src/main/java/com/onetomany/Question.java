package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
	private int question_Id;
	private String question;
	@OneToMany (mappedBy = "question",fetch = FetchType.LAZY)
	//@OneToMany (mappedBy = "question",fetch = FetchType.EAGER)

	private List<Answer>answer=new ArrayList<Answer>();
	public int getQuestion_Id() {
		return question_Id;
	}
	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int question_Id, String question, List<Answer> answer) {
		super();
		this.question_Id = question_Id;
		this.question = question;
		this.answer = answer;
	}
	
	

}
