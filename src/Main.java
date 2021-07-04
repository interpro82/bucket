public class Main {

    /*
    Да се въведат два стринга А със стойност "alabalabala" и B със стойност "alabala".
     Да се отпечата колко пъти стринг B се съдържа в стринг А
*/

    public static void main(String[] args) {
        String a = "alabalabalaalabalabala";
        String b = "alabala";

        int resultRec = calcContainsRecursive(a, b, 0);
        System.out.println(resultRec);
        int result = calcContains(a, b);
        System.out.println(result);

    }

    private static int calcContainsRecursive(String a, String b, int counter) {
        int index = a.indexOf(b);
        if (index > -1) {
            counter++;
            if (index < a.length()) {
                String remains = a.substring(index + 1);
                return calcContainsRecursive(remains, b, counter);
            } else {
                return counter;
            }
        }
        return counter;
    }

    private  static int calcContains(String a, String b) {
        int counter = 0;
        for (int i=0; i< a.length() -1; i++) {
            String remains = a.substring(i);
            int index = remains.indexOf(b);
            if (index > -1) {
                counter++;
                i = index + i;
            } else {
                return counter;
            }
        }

        return counter;
    }



}
