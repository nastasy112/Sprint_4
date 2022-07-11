import lombok.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private final String name;
    Pattern pattern = Pattern.compile("^(?=.{3,19}$)[А-ЯЁ][а-яё]*\\s[А-ЯЁ][а-яё]*$");

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
//        В классе Account задай проверки: длина, наличие пробела в начале или конце строки. Используй методы класса

        if(name == null){
            return false;
        } else {
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }
    }
}