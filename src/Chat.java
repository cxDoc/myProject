import static java.lang.System.*;

/**
 * Created by cxDoctor on 22.05.2016.
 */
public class Chat {
    public static void main (String[] args){
        out.println("Введите Своё Имя:");
        String a = Met.userSays();
        out.println("Привет, "+a+". Введите ваше приветствие");
        String b = Met.userSays();
        out.println("Пользователь "+a+" говорит: "+b);
    }

}
