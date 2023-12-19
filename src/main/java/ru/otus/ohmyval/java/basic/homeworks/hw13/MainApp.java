package ru.otus.ohmyval.java.basic.homeworks.hw13;

public class MainApp {
    public static void main(String[] args) {
//        Закоментированный код - я проверяла все ли работает по отдельности (каждый метод с каждым условием)
//        Human human1 = new Human("Boris", 300);
//        Human human2 = new Human("Max", 200);
//
//        Transport transport1 = new Bicycle();
//        Transport transport2 = new Car(50);
//        Transport transport3 = new Horse(350);
//        Transport transport4 = new TerrainVehicle(30);
//
//        transport4.move(CountryVariety.DEEP_FOREST, 20);
//        System.out.println(human1.getCurrentTransport());
//        human1.getInTransport(transport2);
//        System.out.println(human1.getCurrentTransport());
//        System.out.println(transport2.getDriver().getName()); // печатает имя водителя, но если водителя нет,
//                                                              //то вылетает ошибка NullPointerException.
//                               // А если .getName() убрать, то выводит полный путь с хэшкодом вместо имени.
//                               //Как это исправить? (я еще не смотрела про исключения)
//        human2.getInTransport(transport1);
//        System.out.println(human2.getCurrentTransport());
//        transport2.move(CountryVariety.PLAIN, 15);
//        System.out.println(human1.getEnergy());
//        System.out.println(human2.getEnergy());
//        System.out.println(transport2.getFuel());
//        transport1.move(CountryVariety.DEEP_FOREST, 5);
//        human2.leaveTransport(transport1);
//        System.out.println(human1.getCurrentTransport());
//        System.out.println(human2.getCurrentTransport());
//        human2.walk(1);
//        System.out.println(human2.getEnergy());

        Human[] human = {
                new Human("Boris", 300),
                new Human("Max", 200),
                new Human("Egor", 400)
        };

        Transport[] transport = {
                new Bicycle(),
                new Car(50),
                new Horse(350),
                new TerrainVehicle(30)
        };
        for(Human h: human){
            for(Transport t: transport){
//                h.getInTransport(t);
                System.out.println(h.getCurrentTransport());
                if ( (!(h.getInTransport(t))) || (!(t.move(CountryVariety.DEEP_FOREST,5))) ){
                    h.leaveTransport(t);
                    h.walk(2);
                }
//               h.leaveTransport(t); // если это тут убрать, то (например): при переборе Борис остается в вездеходе к концу цикла.
                // Макс, когда доходит до вездехода, говорит, что не может в него сесть, т.к. там кто-то сидит.
                // Но при этом вездеход в этом же цикле едет с Борисом за рулем. Чтобы этого избежать, я добавила проверку
                // в строчку 51 - удалось ли сесть в транспорт (вместо просто вызова метода  - строка 49).
                // Можно ли эту проверку запихнуть в тело метода move?
                System.out.println(h.getCurrentTransport());
            }
        }
    }
}
