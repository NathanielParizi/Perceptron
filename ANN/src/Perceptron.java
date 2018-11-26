
public class Perceptron {

	private float[] weights;
	private float[][] input;
	private float[] output;
	private int numOfWeights;

	public Perceptron(float[][] input, float[] output) {

		this.input = input;
		this.output = output;
		this.numOfWeights = input[0].length;	
		this.weights = new float[numOfWeights];		
		System.out.println("INPUTS:" + (this.input.length) + "\nOUTPUT:"+ this.output[0]
				+ "\nNumber Of Weights:" + numOfWeights );

		initializeWeight();

	}

	public void initializeWeight() {
		// initialize weights
		for (int i = 0; i < numOfWeights; i++) {
			weights[i] = 0;
		}

	}

	public void train(float learningRate) {

		float totalError = 1;    //100% Error 
		while (totalError != 0) {

			totalError = 0;

			for (int i = 0; i < output.length; i++) {

				float perceptronOutput = perceptronOutput(input[i]);
				 
				float error = output[i] - perceptronOutput;            //  (t - o) = error

				totalError += error; //Adjust error

				for (int j = 0; j < numOfWeights; j++) {
					weights[j] = weights[j] + learningRate * error * input[i][j];     // n(t - o) = new weights
					System.out.println("Training: Updated weight: " + weights[j]);    

				}

			}
			
			if(totalError == 0) {System.out.println("\n**************\nThe error has reached " + totalError);
			
			
	
			}
			else {System.out.println("****************Keep on training the network, error is still: " + totalError);}
			
		}
	}

	//******* This calculates finds the sum of weights * input value of node and passes data to Activation Function
	public float perceptronOutput(float[] input) {        

		float sum = 0f;
		for (int i = 0; i < input.length; i++) {
			sum = sum + weights[i] * input[i];
		}
 
		return ActivationFunction.stepFunction(sum);
	}
}
