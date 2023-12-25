package org.example;

public class OpenningClosingBracket {
    public void getopencloseBracketIndex(){
            String s = "(())))(";
            int start = 0;
            int end = s.length()-1;
            int count = 0;

            while(start <= end){
                if(s.charAt(start) != '(' ){
                    start++;
                }
                if(s.charAt(end) != ')' ){
                    end--;
                }
                if((s.charAt(start) == '(') && (s.charAt(end) == ')' )){
                    count++;
                    start++;
                    end--;
                }



            }
        System.out.println(count);
    }
}
