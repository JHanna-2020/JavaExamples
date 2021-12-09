
/**
 * Write a description of class FRQ2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FRQ2
{
    // 1. check if str length is > 6 (the number of letters in the smallest option)
    //      return false if above condition is true 
    // 2. if str.indexOf senior is > str.indexOf(freshmen) 
    //      return true if above condition is true 
    // else return false
    
    
    public boolean seniorsBetterFreshman(String str){
        if(str.length()<6){
            return false;
        }
        else if(str.lastIndexOf("senior")>str.lastIndexOf("freshmen")){
            return false;
        }
        else{
            return true;
        }
        
}

}
