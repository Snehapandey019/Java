class string1 {
    public static void main(String[] args) {
        String str = "Hello";
        //System.out.println(str.charAt(1)); 
        for (int i = str.length()-1 ; i >= 0; i--) {
            System.out.println(str.charAt(i)); 
        }
    }
}