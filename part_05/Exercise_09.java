package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Varargs{
    static void strings(String ... vargs){
        StringBuilder sb = new StringBuilder();
        for(String s: vargs){
            sb.append(s);
            sb.append(" ");
        }
        System.out.println(sb.toString());
//        StringBuilder str1 = new StringBuilder();
//        str1.append("Greetings");
//        System.out.println(str1);
//
//        StringBuilder str2 = new StringBuilder();
//        str2.append("Earthlings");
//        System.out.println(str2);
//
//        StringBuilder str3 = new StringBuilder();
//        str3.append("We bring peace.");
//        System.out.println(str3);
    }

    public static void main(String[] args) {
        strings("Greetings", "earthlings", "we", "come", "in", "peace!");
    }

}