package dr5;

public class Main {
    public static void main(String[] args) {
        Klerk pers = new Klerk("demidov", "student", "demidov@mail.ru", "88002000700", 15000.00, 20);


        Klerk[] arrKlerks = new Klerk[5];
        arrKlerks[0] = new Klerk("ivanov", "technik", "ivanov@mail.ru", "88002000100", 22000.00, 22);
        arrKlerks[1] = new Klerk("petrov", "mns", "petrov@mail.ru", "88002000200", 25000.00, 25);
        arrKlerks[2] = new Klerk("sidorov", "sns", "sidorov@mail.ru", "88002000300", 30000.00, 27);
        arrKlerks[3] = new Klerk("matveev", "vns", "matveev@mail.ru", "88002000400", 35000.00, 35);
        arrKlerks[4] = new Klerk("antonov", "engineer", "antonov@mail.ru", "88002000500", 35000.00, 42);


        }
    }
