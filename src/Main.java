public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightInMeters = 1.87F;
        float weightInKilograms = 98.0F;
        int bmi = service.calculate(heightInMeters, weightInKilograms);
        // расшифровка результата
        String interpretation = "";
        if (bmi < 16) {
            interpretation = "Выраженный дефицит массы тела";
        } else if (bmi >= 16 && bmi < 18.5) {
            interpretation = "Недостаточная масса тела";
        } else if (bmi >= 18.5 && bmi < 25) {
            interpretation = "Нормальная масса тела";
        } else if (bmi >= 25 && bmi < 30) {
            interpretation = "Избыточная масса тела (предожирение)";
        } else if (bmi >= 30) {
            interpretation = "Ожирение";
        }

        System.out.println("Ваш индекс массы тела " + bmi);
        System.out.println(interpretation);


        System.out.println();
        System.out.println("1.58м, 55кг");
        System.out.println("Ваш индекс массы тела " + service.calculate(1.58F,55F));



    }
}