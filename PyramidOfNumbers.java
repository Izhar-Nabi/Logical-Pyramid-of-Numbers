/*	   1
	  121
	 12321
	1234321
       123454321

*/

class PyramidOfNumbers
{
	public static void main(String args[]){
	for(int i=1; i<=5; i++){
	for(int j=i; j<=5; j++){
	System.out.print(" ");}
	for(int k=1; k<=i; k++){
	System.out.print(k);}
	if(i>1){
	for(int s=i-1; s>=1; s--){
	System.out.print(s);	}	}
	
	System.out.println();	} // end loop
	
		}
}