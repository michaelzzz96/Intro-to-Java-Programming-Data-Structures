public class Problem_7_22 {

    public static void main(String[] args) {
        int count = 0;


        for(int i = 0; i < args.length;i++) {
            for(int j = 0; j < args[i].length(); j++)
                if(Character.isUpperCase(args[i].charAt(j)))
                    count++;
        }
        System.out.print("The number of upper cases are: " + count);
    }

}
