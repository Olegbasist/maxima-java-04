package org.example;

// 10.09.2022 Создать новый репозиторий maxima-java-04, пакет org.example
// 10.09.2022 Собрать архив jar из модуля 2, инсталлировать его в локальный репозиторий и подключить его как зависимость к текущему проекту.
// 10.09.2022 Описать класс Train, потомок класса Transport из модуля 2.
// 10.09.2022 Описать свойства String id, int carriageCount, boolean isExpress.





public class App
{
    public static void main( String[] args )
    {

        City city = new City("Washington D.C.",6847);
        Train parovoz = new Train("1", "Паровоз", false, 950000, 8,60,1.5f);
        System.out.println(parovoz.getName() +" чих-пых = "+ parovoz.getPrice(city));

    }
}
