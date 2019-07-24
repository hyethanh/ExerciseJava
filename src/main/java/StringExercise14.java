public class StringExercise14 {

    public String testValidityBarcode(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {

                sum += str.charAt(i) - '0';

            } else {

                sum += 3 * (str.charAt(i) - '0');

            }
        }

        if (sum % 10 == 0) {

            return "Barcode hop le";

        } else {

            return "Barcode khong hop le";

        }
    }
}
