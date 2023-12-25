package org.example;

public class EncryptString { // aaaaaaaaaaaaa -> a11 --> ab-> ba
    public void encryptingString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)== s.charAt(i+1)){
                count ++;
            }else{
                String hexCount = convertToHex(count);
                sb.append(s.charAt(i)).append(hexCount);
                count=1;
            }

        }
        String hexCount = convertToHex(count);
        System.out.println(count);
        sb.append(s.charAt(s.length()-1)).append(hexCount);


//        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());

    }

    // Function to convert Decimal to Hex
    static String convertToHex(int num)
    {

        StringBuilder temp = new StringBuilder();
        while (num != 0) {
            int rem = num % 16;
            char c;
            if (rem < 10) {
                c = (char) (rem + 48);
            }
            else {
                c = (char) (rem + 87);
            }
            temp.append(c);
            num = num / 16;
        }

        return temp.toString();
    }
}
