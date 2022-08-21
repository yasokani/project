package com.javatpoint.mypackage;

import java.util.Map;  

public class QuestionMap {  
	
private int id;  
private String name,username;  
private Map<String,String> answers;  
  
public QuestionMap() {}  

public QuestionMap(String name, String username, Map<String, String> answers) {  
    super();  
    this.name = name;  
    this.username = username;  
    this.answers = answers;  
}  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getUsername() {  
    return username;  
}  
public void setUsername(String username) {  
    this.username = username;  
}  
public Map<String, String> getAnswers() {  
    return answers;  
}  
public void setAnswers(Map<String, String> answers) {  
    this.answers = answers;  
}  
}  
