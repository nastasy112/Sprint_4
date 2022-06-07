public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
//        В классе Account задай проверки: длина, наличие пробела в начале или конце строки. Используй методы класса

        if((!name.isEmpty()) & (name.length() >= 3) & (name.length() <= 19) & (name.contains(" ")) & (name.length() == (name.replace(" ", "").length() +1)) & (!name.endsWith(" ")) & (!name.startsWith(" "))){
            return true;
        } else
            return false;
    }
}