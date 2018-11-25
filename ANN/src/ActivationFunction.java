//***************************************************
// This class represents the Threshhold Function also
// referred to the Step function. It will activate if
// the input values are above 1, it will activate.
//***************************************************


public class ActivationFunction {
	
	public static int stepFunction(float activation) {
		
		//
		if( activation >= 1) {
			return 1;   // Activate
		}
		
		return 0;  // Don't activate
		
	}

}
