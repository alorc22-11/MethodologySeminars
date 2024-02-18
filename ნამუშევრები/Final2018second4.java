import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class Final2018second4 extends ConsoleProgram{
	private HashMap<String, ArrayList<String>> movieCast = new HashMap<>();
	private HashMap<String, ArrayList<String>> starredMovies = new HashMap<>();
	private ArrayList<String> validMovies = new ArrayList<String>();
	
	
	public Final2018second4(){
		
	}
	public void addMovie(String title){
		if(!validMovies.contains(title)){
			validMovies.add(title);
		}
	}
	public void addActor(String movieTitle, String actor){
		if(validMovies.contains(movieTitle)){
			if(movieCast.containsKey(movieTitle)){
				movieCast.get(movieTitle).add(actor);
				
			}else{
				ArrayList<String> actors = new ArrayList<>();
				actors.add(actor);
				movieCast.put(movieTitle, actors);
			}
			if(starredMovies.containsKey(actor)){
				starredMovies.get(actor).add(movieTitle);
				
			}else{
				ArrayList<String> movies = new ArrayList<>();
				movies.add(movieTitle);
				starredMovies.put(actor, movies);
			}
		}
	}
	public Iterator<String> getMovies(String actor){
		if(starredMovies.containsKey(actor)){
			return starredMovies.get(actor).iterator();
		}
		return null;
		
	}
	public Iterator<String> getCommonMovies(String actor1, String actor2){
		if(starredMovies.containsKey(actor2) && starredMovies.containsKey(actor1)){
			ArrayList<String> common = findCommon(actor1, actor2);
			return common.iterator();
		}
		return null;
		
	}
	private ArrayList<String> findCommon(String actor1, String actor2) {
		ArrayList<String> temp = new ArrayList<>();
		for(int i = 0; i < starredMovies.get(actor2).size(); i ++){
			if(starredMovies.get(actor1).contains(starredMovies.get(actor2).get(i))){
				temp.add(starredMovies.get(actor2).get(i));
			}
		}
		return temp;
	
	}
	public Iterator<String> getCast(String movie, int n){
		if(validMovies.contains(movie)){
			ArrayList<String> topActors = new ArrayList<>();
		ArrayList<String> allStarring = movieCast.get(movie);
		
		for(int i = 0; i < n; i ++){
			int max = 0;
			String maxActor = "";
			for(int k = 0; k < allStarring.size(); k++){
				String currActor = allStarring.get(k);
				if(starredMovies.get(currActor).size()>max){
					maxActor = currActor;
					max = starredMovies.get(currActor).size();
				}
			}
			allStarring.remove(maxActor);
			topActors.add(maxActor);
			
		}
		return topActors.iterator();
		}
		
		return null;
		
	}
}

