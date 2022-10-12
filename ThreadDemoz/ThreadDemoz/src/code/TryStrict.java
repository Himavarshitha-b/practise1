package code;

public strictfp class TryStrict {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x = 1000.20f;
		float y = 1000.35f;
		
		long before = System.nanoTime();
		
		float z = x * y;
		
		long after = System.nanoTime();
		
		//System.out.printf("%f\n",after - before);
		
		System.out.printf("%f\n",z);
	}
}