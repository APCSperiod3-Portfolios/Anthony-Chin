/**
 * Write a description of class PalindromeRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


    public class Palindrome_recursion
    {
    boolean yesPalindrome = true;
    
    char[] readyInput;

    public static void main_Palindrome_recursionStatic() {
        Palindrome_recursion temp = new Palindrome_recursion();
        
        temp.main_betterRecursion();
    }
    
    public void main_betterRecursion()
    {
    System.out.print('\u000C');
        Keyinput.printPrompt("Please input your phrase.");
    
    String wordInput = Keyinput.inString();
    readyInput = wordInput.replace(" " , "").replaceAll("\\W", "").toLowerCase().toCharArray();
   
    
    
    if(Check(0)){
    Keyinput.printPrompt("Congratulations, your phrase is a palindrome.");
    } else{
    Keyinput.printPrompt("Unfortunately, this is not a palindrome.");    
    }
    
    }
    
    public boolean Check(int i){
    if(yesPalindrome && i < readyInput.length/2 && readyInput[i] == readyInput[readyInput.length - 1 - i]){
        return Check(i+1);
    } else if(readyInput[i] != readyInput[readyInput.length - 1 - i]){
        return false;
    }
    
    return true;

    }
    
    }