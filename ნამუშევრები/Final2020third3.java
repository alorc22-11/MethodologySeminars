import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Final2020third3 extends ConsoleProgram{
	HashMap<String, HashMap<String, Double>> foodIngAmount = new HashMap<>();
	HashMap<String, Double> ingPrice = new HashMap<>();
	HashMap<String, Double> ingActual = new HashMap<>();
	HashMap<String, ArrayList<String>> allMonatesave = new HashMap<>();
	HashMap<String, ArrayList<String>> neededIng = new HashMap<>();
public void run(){
	neededIng = getIng();
	allMonatesave = findAll();
	String topMeal = findMeal();
}
private String findMeal() {
	String coolest = "";
	int maxMonatesave = 0;
	for(String meal : foodIngAmount.keySet()){
		HashMap<String, Double> neededAmount = foodIngAmount.get(meal);
		for(String ingredient : neededAmount.keySet()){
			if(!ingActual.containsKey(ingredient)){
				break;
			}else{
				if(enough(neededAmount)){
					if(allMonatesave.get(meal).size() > maxMonatesave){
						coolest = meal;
						maxMonatesave = allMonatesave.get(coolest).size();
					}
					
				}
			}
		}
	}
	return coolest;
}
private boolean enough(HashMap<String, Double> neededAmount) {
	for(String ingredient1 : neededAmount.keySet()){
		for(String ingredient2 : ingActual.keySet()){
			if(ingActual.get(ingredient2) < neededAmount.get(ingredient1)){
				return false;
			}
		}
	}
	return true;
}
private HashMap<String, ArrayList<String>> getIng() {
	HashMap<String, ArrayList<String>> temp = new HashMap<>();
	for(String meal : foodIngAmount.keySet()){
		ArrayList<String> ingredients = new ArrayList<>();
		HashMap<String, Double> ingAmount = foodIngAmount.get(meal);
		for(String ingredo : ingAmount.keySet()){
			ingredients.add(ingredo);
		}
		temp.put(meal, ingredients);
 	}
	return temp;
}
private HashMap<String, ArrayList<String>> findAll() {
	HashMap<String, ArrayList<String>> temp = new HashMap<>();
	for(String meal1 : neededIng.keySet()){
		ArrayList<String> ingredients1 = neededIng.get(meal1);
		ArrayList<String> amisMonatesave = new ArrayList<>();
		for(String meal2 : neededIng.keySet()){
			if(!meal1.equals(meal2)){
				ArrayList<String> ingredients2 = neededIng.get(meal2);
				int count = 0;
				for(int i = 0; i < ingredients2.size(); i ++){
					if(ingredients1.contains(ingredients2.get(i))){
						count++;
					}
				}
				if(count >= 5){
					amisMonatesave.add(meal2);
				}
			}
		}
		temp.put(meal1, amisMonatesave);
	}
	return temp;
}
}
