package calculateroute;

import java.math.*;
import java.awt.geom.Point2D;
import java.lang.Math;

import point.Point;

/**
 * @author VictorSampaio
 *
 */
public class CalculateRoute {

	public void calculateRoute(Point point1, Point pont2) {
		
		double dist, distLat, distLong;
		double lat1  = point1.getLatitude();
		double lat2  = pont2.getLatitude();
		double long1 = point1.getLongitude();
		double long2 = pont2.getLongitude();
		
		dist = Math.sqrt(((lat1 - lat2) * (lat1 - lat2)) + (long1 - long2) * ((long1 - long2)));
		System.out.println("Distancia: " + dist);
		
		
				
	}
	
	
	
	

}
