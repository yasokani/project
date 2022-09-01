package com.JPA;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedbackEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "id", updatable = false, nullable = false)
	    private int id;
	   
	    
	    @Column(length=20)
	    private String name;
	    @Column(length=50)
	    private String email;
	    @Column(length=50)
	    private String feedback;
		
		
		public FeedbackEntity(String name, String email, String feedback) {
			super();
			this.name = name;
			this.email = email;
			this.feedback = feedback;
		}
		@Override
		public String toString() {
			return "FeedbackEntity [id=" + id + ", name=" + name + ", email=" + email + ", feedback=" + feedback
					+ "]";
		}
		
		public FeedbackEntity() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFeedback() {
			return feedback;
		}
		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

}
