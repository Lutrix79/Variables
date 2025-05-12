//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Вес собаки " + dog + " кг!");
        System.out.println("Вес кота " + cat + " кг!");
        System.out.println("Вес бумаги " + paper + " г!");

        //Задача №2 - для разнообразия ввел новую переменную diff
        var diff = 4;
        dog = dog + diff;
        cat = cat + diff;
        paper = paper + diff;
        System.out.println("Новый вес собаки " + dog + " кг!");
        System.out.println("Новый вес кота " + cat + " кг!");
        System.out.println("Новый вес бумаги " + paper + " г!");

        //Задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Новый вес собаки " + dog + " кг!");
        System.out.println("Новый вес кота " + cat + " кг!");
        System.out.println("Новый вес бумаги " + paper + " г!");

        //Задача №4
        var friend = 19;
        System.out.println("Возраст первого друга " + friend + " лет!");
        friend = friend + 2;
        System.out.println("Возраст второго друга " + friend + " год!");
        friend = friend / 7;
        System.out.println("У второго друга есть сын, ему " + friend + " года!");

        //Задача №5 Тут уже фантазии не хватает, может количество бородавок у лягушки)
        var frog = 3.5;
        System.out.println("Лягушка1 " + frog);
        frog = frog * 10;
        System.out.println("Лягушка2 " + frog);
        frog = frog / 3.5;
        System.out.println("Лягушка3 " + frog);
        frog = frog + 4;
        System.out.println("Лягушка4 " + frog);

        //Задача №6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeightBoxers = firstBoxerWeight + secondBoxerWeight;
        var differenceWeight = secondBoxerWeight- firstBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeightBoxers + " кг!");
        System.out.println("Разница в весе двух боксеров " + differenceWeight + " кг!");

        //Задача №7
        var remainderBoxers = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления (или разница в весе) " + remainderBoxers + " кг!");

        //Задача №8
        var totalHoursOffice = 640;
        var oneWorkerHours = 8;
        var quantityWorkers1 = totalHoursOffice / oneWorkerHours;
        System.out.println("Всего работников в компании — " + quantityWorkers1 + " человек");
        var quantityWorkers2 = 94;
        var totalQuantityWorkers = quantityWorkers1 + quantityWorkers2;
        oneWorkerHours = totalHoursOffice / totalQuantityWorkers;
        var oneWorkerMinutes = ((totalHoursOffice % totalQuantityWorkers)*60)/totalQuantityWorkers;
        System.out.println("Если в компании работает " + totalQuantityWorkers + " человека, то всего " + oneWorkerHours + " часов и " + oneWorkerMinutes + " минут работы может быть поделено между сотрудниками");
    }
}