package warmup1;

/*The parameter weekday is true if it is a weekday, and the parameter vacation 
 *is true if we are on vacation. We sleep in if it is not a weekday or we're on 
 *vacation. Return true if we sleep in.*/

public class SleepIn {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  boolean sleep = false;
		  if(weekday == false && vacation == false){
		    sleep = true;
		  } else if(weekday == true && vacation == false){
		    sleep = false;
		  }else if(weekday == false && vacation == true){
		    sleep = true;
		  }else if( weekday == true && vacation == true){
		    sleep = true;
		  }
		  return sleep;
		}
	}


