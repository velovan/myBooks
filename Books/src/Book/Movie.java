package Book;

import java.lang.*;

public class Movie{

	private String movieName;
	private String movieDirector;
	private String rate;
 
	public Movie(String movieName, String movieDirector, String rate){
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.rate = rate;
	}

	public String getMovieName(){
		return movieName;
	}

	public String getMovieDirector(){
		return movieDirector;
	}

	public String getMovieRate(){
		return rate;
	}

	public String printOneMovie(){
		StringBuffer space = new StringBuffer();
		String space1 = "";
		String space2 = "";
		for (int i = 0; i < 26 - getMovieName().length(); i++){
		    space.append(" ");
		}
		space1 = space.toString();
		space.delete(0, space.length());
		for (int i = 0; i < 20 - getMovieDirector().length(); i++){
		    space.append(" ");
		}
		space2 = space.toString();
		return movieName + space1 + movieDirector + space2 + rate;
	}

}
