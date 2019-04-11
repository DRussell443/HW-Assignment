 /**Essay class that extends the GradedActivity class presented 
 in this chapter. The Essay class should determine the grade a 
 student receives for an essay. The student’s essay score can be 
 up to 100 and is determined in the following manner:
                                                                                                                                                                                                                                                          
 //Grammer: 30 points 
 //Spelling: 20 points 
 //Correct length: 20 points
 //Content: 30 points                                                                                  

*/                                         

public class Essay extends GradedActivity{

int Grammer;
int Spelling;
int CorrectLength; 
int Content;

public Essay(int grammer, int spelling, int CorrectLength, int Content){

Grammer =30; 
 Spelling = 20;
 CorrectLength = 20;
 Content = 30;   

}

}