# Домашнее задание

*№1 Принципы ООП: Инкапсуляция, наследование, полиморфизм*
1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура
2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
   
*Решение дз №1*
[Основное меню](src/main/java/Work_1/Main.java)
[Work1](src/main/java/Work_1)


*№2 Принципы ООП Абстракция и интерфейсы. Пример проектирования*
Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдает заказы).

*Решение дз №2*
[Основное меню](src/main/java/Work_2/Work_2.java)
[Work2](src/main/java/Work_2)

*№3 Некоторые стандартные интерфейсы Java и примеры их использования*
1. Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable.
2. Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток.
3. Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator.
4. Модифицировать класс Контроллер, добавив в него созданный сервис.
5. Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков, путем вызова созданного сервиса.

*Решение дз №3*
[Work3](src/main/java/Work_3)

*#4 Обобщения. ч1*
1. Создать класс УчительСервис и реализовать аналогично проделанному на семинаре.
2. Создать класс УчительВью и реализовать аналогично проделанному на семинаре.
3. Создать класс УчительКонтроллер и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.

*Решение дз №4*
[Work4](src/main/java/Work_4)

*#5 От простого к практике*
1. Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.
2.  Создать класс УчебнаяГруппаСервис, в котором реализована функция(входные параметры - (Teacher, List<Student>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его.
3. Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса.

*Решение дз №5*
[Work5](src/main/java/Work_5)

*#7 Семинар: ООП Дизайн и Solid ч.2*

Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление). 
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора. Соблюдать принципы SOLID, паттерны проектирования.

*Решение дз №7*
[Work7](src/main/java/Work_7)