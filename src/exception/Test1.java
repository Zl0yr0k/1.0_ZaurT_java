package exception;

import java.io.IOException;

public class Test1 {
    static void main() {
        Animal mouse = new Mouse();
        try {
            mouse.run();
        } catch (IOException e){
            System.out.println("Catch esception IO");
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}
class Animal {
    void run () throws IOException {
        System.out.println("Animal runs");
    };
}
class Mouse extends Animal {
    @Override
    void run () throws /*Exception*/ IOException{    // Нельзя кидать более широкое исключение
        //в классе наследнике. Это правило только для checked exception. Для RunTime Exception
        //такой зависимости нет. Можно бросать любые исключения
        System.out.println("Mouse runs");
    }
}