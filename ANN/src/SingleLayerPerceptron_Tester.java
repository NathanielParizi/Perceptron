//*********************************************************************
//	Nathaniel-Joel Parizi
//	Machine Learning CSCI3900
//  Single-Layer Perceptron Neural Network Implementation in Java Project
//*******************************************************************


public class SingleLayerPerceptron_Tester {

	 public static void main(String[] args) {
		 
		 // LOGIC ************************************************************************
		 float[][] input = { {0,0}, {0,1}, {1,0}, {1,1} };   //Possible combinations
		 float[] output = {0,0,0,1}; 	//AND LOGIC
		 //float[] output = {0,1,1,1};  //OR LOGIC
		 //float[] output = {0,0,0,1};  //XOR LOGIC     (Will never converge to error of 0!)
		 //*******************************************************************************
		 
		 
		 Perceptron perceptron = new Perceptron(input, output);
		 
		 perceptron.train(0.1f);
		 
		 System.out.println("The error is 0 so our neural nnetwork is ready! Predictions: ");
		 
		 System.out.println(perceptron.calculateOutput(new float[]{0,0}));
		 System.out.println(perceptron.calculateOutput(new float[]{0,1}));
		 System.out.println(perceptron.calculateOutput(new float[]{1,0}));
		 System.out.println(perceptron.calculateOutput(new float[]{1,1}));
		 
	 }
	
}
