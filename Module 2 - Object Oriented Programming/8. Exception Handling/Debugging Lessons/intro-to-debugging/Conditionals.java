public class Conditionals {
    public static void main(String[] args) {
        String option = "";

        int random = (int) (Math.random() * 3 + 1);
        
        switch (random) {
            case 1: option = "hit"; break;
            case 2: option = "stay"; break;
            case 3: option = "fold"; break;
            default: option = "This should never get called";
        }


        if (option != "hit" && option != "stay") {
            System.out.println("fold");
        } else {
            System.out.println(option);
       }
    }
}
