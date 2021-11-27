package vn.techmaster;

public class countString {
    public static void questTwo(){
        String string = "You only live once, but if you do it right, once is enough";
        System.out.println(string);
        String[] words = string.split(" ");
        System.out.println("Số từ trong chuỗi là: " +words.length);

        int count = 0;
        System.out.println("Vị trí của ký tự 'o' trong chuỗi là:");
        for (int i = 0 ; i < string.length(); i++){
            String str = String.valueOf(string.charAt(i)) ;
            if (str.equals("o")){
                count ++;
                System.out.print(i+"\t");
            }
        }
        System.out.println("\nSố ký tự 'o' là: " + count);
    }
}
