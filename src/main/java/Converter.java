public class Converter {

    public Converter(String[] value) {
        int[] num = new int[value.length];
        String operator = "";
        for (int i = 0, j = 0, k = 0; i < value.length; i++) {
            try {
                num[j] = Integer.parseInt(value[i]);
                j++;
            } catch (NumberFormatException e) {
                operator += value[i];

            }
        }
        Calculator calculator = new Calculator(num, operator);
    }


}
