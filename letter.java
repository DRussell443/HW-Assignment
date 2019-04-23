/** 
Algorithm Workbench #4
Write the statement that calls a superclass constructor and passes
the arguments x, y, and z.



Algorithm Workbench #5
 A superclass has the following method:
public void setValue(int v) {
value = v; }
Write a statement that may appear in a subclass that calls this
method, passing 10 as an argument. */

 
public class letter extends alphabet{

/** Constructor:
@param x the letter
@param y the other letter
@param z the other other letter
*/

//Algorith Workbench #4
public letter(char x, char y, char z){

   super(x, y, z);
   
// Here is the Algorithm workbench #5
   super.setValue(10);
   
   }


}