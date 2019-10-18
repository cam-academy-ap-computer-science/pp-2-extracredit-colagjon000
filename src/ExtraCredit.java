/* Outline --
 * Default size value = 3
 * 	- Capsule and Nossle are the same
 * 		- Default size = 3. Height = Size * 2 - 1
 * 		- Spacer value = Height
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
	/*CLASS CONSTANT TO ADJUST ROCKET SIZE:                                 */
	/*(Default Size  = 3) (Integer must be > 0)                             */
	public static final int SIZE = 3;
	/************************************************************************/
	
	public static void main(String[] args) {
		triangle();
		spacer();
		triangle();
	}
	public static void triangle () {
		int height = SIZE * 2 - 1;
		int space = height;
		int slash = 1;
		for (int i = 1; i <= height; i++) { //controls the height
			for (int j = 1; j <= space; j++) { //controls previous spaces before slashes begin printing
				System.out.print(" ");
			}
			for (int j = 1; j <= slash; j++) { //controls first set of slashes
				System.out.print("/");
			}
			System.out.print("**");
			for (int j = 1; j <= slash; j++) { //controls final set of slashes
				System.out.print("\\");
			}
			System.out.println();
			space --; //subtracts one space per line
			slash ++; //adds one slash per line
		}	
	}
	public static void spacer () { //prints spacer in between arrow section in the modules
		System.out.print("+");
		for (int i = 1; i <= SIZE * 2; i++) { //# of middle sections is always SIZE * 2
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void upArrows () {
		int edgeDot = SIZE - 1;
		int miDot = SIZE + 1;
		int slCombo = 1;
		for (int i = 1; i <= SIZE; i++) { //height of section proportional to size value
			System.out.print("|");
			for (int j = 1; j <= edgeDot; j++) {
				System.out.print(".");
			}
			for (int j = 1; j <= slCombo; j++) {
				System.out.print("/\\");
			}
		}
	}
	public static void downArrows () {
		
	}

}
