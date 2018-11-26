import java.util.*;

//*********************************************************************
//	Nathaniel-Joel Parizi
//	Machine Learning CSCI3900
//  Single-Layer Perceptron Neural Network Implementation in Java Project
//*******************************************************************


public class SingleLayerPerceptron_Tester {

	 public static void main(String[] args) {
		 
		 // LOGIC DATA FOR TRAINING *****************************************************
		 float[][] input = { {0,0}, {0,1}, {1,0}, {1,1} };   //Possible combinations
		 float[] output = {0,0,0,1}; 	// Target   (AND LOGIC)
		 
		 //float[] output = {0,0,0,1}; 	//AND LOGIC
		 //float[] output = {0,1,1,1};  //OR LOGIC
		 //float[] output = {0,0,0,1};  //XOR LOGIC     (Will never converge to error of 0)
		 //*******************************************************************************
		 
		 
		 Perceptron perceptron = new Perceptron(input, output);	 //Instantiate Perceptron Object
		 float n = 0.1f;//  n  learningRate  used in n(t-o)x 
		 perceptron.train(n);   
		 
		 System.out.println("The error is 0 so the neural network is ready! Predictions: ");
		
		
		
		 System.out.println(perceptron.perceptronOutput(new float[]{0,0}));
		 System.out.println(perceptron.perceptronOutput(new float[]{0,1}));
		 System.out.println(perceptron.perceptronOutput(new float[]{1,0}));
		 System.out.println(perceptron.perceptronOutput(new float[]{1,1}));
		 
		 
		
	 }
	
}
