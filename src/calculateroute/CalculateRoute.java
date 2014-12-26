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
	 final double HEARTH_RADIOUS = 6371*1000;

	final double METERS_TO_KM = 1000;
	
	public void calculateRoute(Point point1, Point pont2) {
		
		double dist, distKM ,x_A, y_A, z_A, x_B, y_B, z_B;
		
		// Latitude
		double lat1  = point1.getLatitude();
		lat1 = Math.toRadians(lat1);
		double lat2  = pont2.getLatitude();
		lat2 = Math.toRadians(lat2);
		// Longitude
		double long1 = point1.getLongitude();
		long1 = Math.toRadians(long1);
		double long2 = pont2.getLongitude();
		long2 = Math.toRadians(long2);
		
		// --- --- --- ---\\
		
		// Math B
		double lati1 = Math.cos(lat1);
		x_A = HEARTH_RADIOUS * lati1 * Math.cos(long1);
		y_A = HEARTH_RADIOUS * lati1 * Math.sin(long1);
		z_A = HEARTH_RADIOUS * Math.sin(lat1);
		
		// Math B
		double lati2 = Math.cos(lat2);
		x_B = HEARTH_RADIOUS * lati2 * Math.cos(long2);
		y_B = HEARTH_RADIOUS * lati2 * Math.sin(long2);
		z_B = HEARTH_RADIOUS * Math.sin(lat2);
		
		//dist = Math.sqrt(((lat1 - lat2) * (lat1 - lat2)) + (long1 - long2) * ((long1 - long2)));
		
		dist = Math.sqrt( (x_A - x_B)*(x_A - x_B)  +  (y_A - y_B)*(y_A - y_B)  + (z_A - z_B)*(z_A - z_B));
		System.out.println("Distancia: " + dist);
		System.out.println("---------");
				
	}
	
	
	
	

}
