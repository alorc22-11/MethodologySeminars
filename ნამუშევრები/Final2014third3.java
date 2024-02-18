import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class Final2014third3 extends ConsoleProgram{
HashMap<String, HashMap<String, Integer>> studSubGrade = new HashMap<>();
HashMap<String, ArrayList<String>> subAllStuds = new HashMap<>();
HashMap<String, ArrayList<String>> studAllSub = new HashMap<>();
    public void addRecord(String studentName, String courseName, int score){
    	if(studSubGrade.containsKey(studentName)){
    		if(studSubGrade.get(studentName).containsKey(courseName)){
    			studSubGrade.get(studentName).replace(courseName, score);
    		}else{
    			studSubGrade.get(studentName).put(courseName, score);
    			studAllSub.get(studentName).add(courseName);
    		}
    	}else{
    		HashMap<String, Integer> courseGrade = new HashMap<>();
    		courseGrade.put(courseName, score);
    		studSubGrade.put(studentName, courseGrade);
    		ArrayList<String> onesCourses = new ArrayList<>();
    		onesCourses.add(courseName);
    		studAllSub.put(studentName, onesCourses);
    	}
    	if(subAllStuds.containsKey(courseName)){
    		if(!subAllStuds.get(courseName).contains(studentName)){
    			subAllStuds.get(courseName).add(studentName);
    		}
    		}else{
    			ArrayList<String> onesStuds = new ArrayList<>();
    			onesStuds.add(studentName);
    			subAllStuds.put(courseName, onesStuds);
    	}
    } 

    public Iterator<String> getStudents(String courseName){
    	if(subAllStuds.containsKey(courseName)){
    		return subAllStuds.get(courseName).iterator();
    	}
		return null; 
    } 

    public ArrayList<String> getCouses(String studentName){
    	if(studAllSub.containsKey(studentName)){
    		return studAllSub.get(studentName);
    	}
		return null; 
    } 

    public double getStudentAverageScore(String studentName){
    	double n = 0.0;
    	double sum = 0.0;
    	if(studSubGrade.containsKey(studentName)){
    		HashMap<String, Integer> courseScores = studSubGrade.get(studentName);
    		n = courseScores.size();
    		for(String course : courseScores.keySet()){
    			sum += courseScores.get(course);
    		}
    	}
		return sum/n; 
    } 

    public double getTotalAverage(){
    	double n = 0.0;
    	double sum = 0.0;
    	for (String student : studSubGrade.keySet()){
    		HashMap<String, Integer> grades = studSubGrade.get(student);
    		for(String course : grades.keySet()){
    			sum += grades.get(course);
    			n++;
    		}
    	}
    	
		return sum/n; 
    } 

}
