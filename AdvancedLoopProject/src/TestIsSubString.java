public class TestIsSubString {
    public static boolean isSubString(String lWord, String bWord){
    	
    	boolean result = false;
    	int litleWordLength;
    	int bigWordLength;
    	int i,j;
    	
    	litleWordLength = lWord.length();
    	bigWordLength = bWord.length();
    	
    	for (i=0 ; i <= bigWordLength-litleWordLength ; i++){
    		if (lWord.charAt(0) == bWord.charAt(i)){
    			j=1;
    			while ((j < litleWordLength) && (lWord.charAt(j) == bWord.charAt(i+j))){
    				j++;
    			}
    			if (j == litleWordLength){
    				result = true;
    				break;
    			}
    		}
    	}
    	return result;
    }
    /*
     * Write a isSubString method that searches for a specific string within
     * another string; the method must return true if the former exists in the
     * latter string. Otherwise, the method return false.
     */
        
    
    public static void main(String[] args) {
        String text = "The cat in the hat.";
        
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") "
                + isSubString("cat", text));
        
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") "
                + isSubString("bat", text));
        
        System.out.println("isSubString(\"The\", \"The cat in the hat.\") "
                + isSubString("The", text));
        
        System.out.println("isSubString(\"hat.\", \"The cat in the hat.\") "
                + isSubString("hat.", text));
        
    }
}
