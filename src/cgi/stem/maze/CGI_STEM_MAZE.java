package cgi.stem.maze;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/*
 *  Reference -: https://www.birdbraintechnologies.com/finch/curriculum/java/
 *  Challenge is to solve the maze
 *  We will keep two version of same maze. 
 *  1st maze without any complexity and 2nd same maze with some level of complexity.
 * 
 */

public class CGI_STEM_MAZE {

	public static void main(String[] args) {
		
		  // Instantiating the Finch object
	      Finch myFinch = new Finch();
	      
	      myFinch.saySomething("Welcome to CGI Stem Camp");
	      myFinch.sleep(3000);
	      
	      myFinch.buzz(250, 500);
	      myFinch.sleep(3000);
	      
	      myFinch.setWheelVelocities(225,225, 5000);
	      
	      myFinch.sleep(3000);
	      
	      myFinch.setWheelVelocities(-225,-225, 5000);
	      
	      myFinch.sleep(3000);
	      
	      myFinch.setWheelVelocities(100,-100, 1000);
	      
	      myFinch.sleep(3000);

	      myFinch.quit();
	      System.exit(0);
	}

}
