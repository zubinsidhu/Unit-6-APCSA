//This will be on the unit test!!!
public class SwapMethod {
	
    public static void main(String[] args) {
    	int n1 = 1;
    	int n2 = 2;
    	System.out.println("Before Swap method, n1 = " + n1 + ", n2 = " + n2); 
    	swap(n1, n2);
    	System.out.println("After Swap method, n1 = " + n1 + ", n2 = " + n2);
    }
    
    public static void swap(int n1, int n2) {  
    	System.out.println("\tInside Swap method\n\t\tBefore Swapping, n1 = " + n1 + ", n2 = " + n2); 
    	int temp = n1;
    	n1 = n2;
    	n2 = temp;
    	System.out.println("\t\tAfter Swapping, n1 = " + n1 + ", n2 = " + n2);
    }
    
}