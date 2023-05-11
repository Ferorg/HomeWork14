public class ThrowException {
    public static void throwException() throws MyException {
        throw new MyException("Не возможно разгрузить, поезд в пути", "0");
    }

    public static void throwException1() throws MyException {
        throw new MyException("Не возможно разгрузить, поезд пуст", "1");
    }

    public static void throwException2() throws MyException {
        throw new MyException("Не возможно загрузить, поезд полон", "2");
    }

    public static void throwException3() throws MyException {
        throw new MyException("Не возможно отправиться, недостаточно топлива", "3");
    }

    public static void throwException4() throws MyException {
        throw new MyException("Не возможно загрузить, поезд в пути", "0");
    }
}
