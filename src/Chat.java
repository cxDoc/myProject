import static java.lang.System.*;

/**
 * Created by cxDoctor on 22.05.2016.
 */
public class Chat {
    public static void main (String[] args){
        out.println("Введите Своё Имя:");
        String a = Met.userSays();
        out.println("Привет, "+a+".");
        int r = Met.nameLen(a);
        out.println(a+", в Вашем имени "+r+" букв");
//        String b = Met.userSays();
//        out.println("Пользователь "+a+" говорит: "+b);
    }
}
