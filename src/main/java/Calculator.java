public class Calculator {
    int sum = 0;
    int index = 0;

    public Calculator(int[] numbers, String operator) {
        for (int i = 0; i < operator.length(); i++) {
            String op = String.valueOf(operator.charAt(i));
            if (op.equals("+")) {
                sum = numbers[index] + numbers[index + 1];
                numbers[index + 1] = sum;
                index++;
            } else if (op.equals("-")) {
                sum = numbers[index] - numbers[index + 1];
                numbers[index + 1] = sum;
                index++;
            } else if (op.equals("*")) {
                sum = numbers[index] * numbers[index + 1];
                numbers[index + 1] = sum;
                index++;
            } else if (op.equals("/")) {
                sum = numbers[index] / numbers[index + 1];
                numbers[index + 1] = sum;
                index++;
            } else
                break;

        }
        System.out.println(sum);
    }


}
