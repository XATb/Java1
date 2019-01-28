package dr5;

public class Klerk {
    String fio;
    String rank;
    String email;
    String phone;
    double cash;
    int age;

    Klerk (String _fio,String _rank,String _email,String _phone,double _cash,int _age){
        fio = _fio;
        rank = _rank;
        email = _email;
        phone = _phone;
        cash = _cash;
        age = _age;
    }
    public static void bolshe40 (Klerk[]arrKlerks) {
        for (Klerk x : arrKlerks) {
            if (x.age > 40) {
                System.out.println(x.toString());
            }
        }
    }
    public String toString() {
        return "{" +
                "fio='" + fio + '\'' +
                ", rank='" + rank + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cash=" + cash +
                ", age=" + age +
                '}';
    }
}
