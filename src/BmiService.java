public class BmiService {
    public int calculate(float heightInMeters, float weightInKilograms) {//задаем имя функции в которую передаются значения переменной роста и веса, дробные значения из main
        /*ИМТ = вес (в килограммах) : (рост в метрах)². 1*/
        int imt = (int) (weightInKilograms / Math.pow(heightInMeters, 2));

        return imt; /* возвращаем в main  значение локальной пременной index*/
    }
}
