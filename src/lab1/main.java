 package lab1;

public class main {
    public static void main(String[] args) {
        
        
        Lab1.init();
        
        
        // 1. Вывести список всех продавцов и их емайлы
        Lab1.firsttask();
        
        
        //2. Установить начальную стоимость 2 аукциона на 1000
        Lab1.secondtask();

        //3. Вывести информацию о пользователях, которые проживают в Витебске
        Lab1.thirdTask("Vitebsk");
        
        //4. Выбрать из БД 3 сотрудников, начиная с 3-ой записи :
        Lab1.fourthTask();
        
        Lab1.close();
       
    }
}