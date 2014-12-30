/**
 * 
 */
package dec29;

/**
 * @author nerisa
 *
 */
public class MultipleFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int startingPoint=100,sum=0,count=0;
		int divisor=7;
		do{
			startingPoint++;
			if(startingPoint%divisor==0){
				sum=sum+startingPoint;
				count++;
			}
		}while (startingPoint<200);
		System.out.printf("Sum= %d\n",sum);
		System.out.printf("Number of multiples= %d",count);
	}

}
