/**
 * 
 */
package common.datatypes;

/**
 * @author David Avery 15823926
 *
 */
public class AngleDistance {
  double theta;
  long distance;

  /**
   * 
   */
  AngleDistance(double t, long d) {
    // TODO Auto-generated constructor stub
    theta = t;
    distance = d;
  }

  double getTheta() {
    return theta;
  }

  long getDistance() {
    return distance;
  }


}
