/* Outline --
 * Default size value = 3
 * 	- Capsule and Nossle are the same
 * 		- Default size = 3. Size * 2 - 1
 * 		- StarValue always stays the same
 * 		- Ending slashValue = size * 2 - 1
 * 	- In between Spacers
 * 		- internal "=*" = SIZE * 2
 * 		- close with "+"
 *  - internal modules -- 
 *  	- Split between topArrows and BottomArrows
 *  		- UpArrows -- Start Values
 *  			- Height proportional to size
 *  			- Edgedots = Size - 1
 *  			- MiDots = Size + 1
 *  			- /\ combination ++ per level
 *  		- DownArrows -- Start Values
 *  			- Height Proportional to size
 *  			- Edgedots  = 0 (++)
 *  			- MiDots = 0 (+=2)
 *  			- /\ combination = SIZE (--)
 * */
public class ExtraCredit {
	/************************************************************************/
	/*CLASS CONSTANT TO ADJUST ROCKET SIZE:                              */
	/*(Size determines the height of the triangular portion of the hourglass*/
	/*(Default Size  = 3) (Integer must be >0)                              */
	public static final int SIZE = 3;
	/************************************************************************/
	
	public static void main(String[] args) {
		spacer();
	}
	public static void triangle () {
		
	}
	public static void spacer () { //prints spacer in between arrow section in the modules
		System.out.print("+");
		for (int i = 1; i <= SIZE * 2; i++) { //# of middle sections is always SIZE * 2
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void upArrows () {
		
	}
	public static void downArrows () {
		
	}

}
