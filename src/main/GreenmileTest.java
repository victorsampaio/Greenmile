package main;

import point.Point;
import calculateroute.CalculateRoute;

/**
 * @author VictorSampaio
 *
 */
public class GreenmileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Point point1 = new Point();
		point1.setLatitude(4);
		point1.setLongitude(5);
		
		
		Point point2 = new Point();
		point2.setLatitude(1);
		point2.setLongitude(1);
		
		
		CalculateRoute distance = new CalculateRoute();
		distance.calculateRoute(point1, point2);

	}

}
