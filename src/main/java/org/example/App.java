package org.example;

// 13.10.2022 Подключить к проекту внешнюю зависимость — Lombok из внешнего репозитория
//
// TODO: 13.10.2022 Использовать аннотации Lombok для добавления всех геттеров, сеттеров, метода toString() и конструктора со всеми аргументами





public class App
{
    public static void main( String[] args )
    {

        City city = new City("Washington D.C.",6847);
        Train parovoz = new Train("1", "Паровоз", false, 950000, 8,60,1.5f);
        //System.out.println(parovoz.getName() +" чих-пых = "+ parovoz.getPrice(city));//После анотирования lombok перестало работать
        System.out.println("------------------------------------------------------");
        parovoz.setId("4");
        parovoz.setName("Чих-Чихыч");
        parovoz.setCostOfKm(1);
        
        System.out.println(parovoz.toString());
        System.out.println(parovoz.getName() +" чих-пых = "+ parovoz.getPrice(city));
    }
}
