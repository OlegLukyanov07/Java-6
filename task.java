/**
 * Урок 6. Хранение и обработка данных ч3: множество коллекций Set
 * Формат сдачи: ссылка на подписанный git-проект.
 * 
 * Задание
 * 
 * Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
 * Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
 * 
 * Создайте метод
 * public boolean equals(Object o)
 * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
 * 
 * Создайте метод
 * public int hashCode()
 * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
 * Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
 
 public class task {
      
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "4", "7");
        Cat cat2 = new Cat("Мурзик", "5", "6");
        Cat cat3 = new Cat("Шурик", "7", "8");
        Cat cat4 = new Cat("Барсик", "4", "7");
       
        Set<Cat> cats = new HashSet<>(List.of(cat1, cat2, cat3, cat4));
      
        Map<String, String> sel = selectCriteria();
        sort(sel, cats);
    
    }

    staticclassCats{

        privateString name;
        privateint age;
        privateintweight;
        
        publicCats(String name,int age,intweight){
        this.name = name;
        this.age= age;
        this.weight=weight;
    
    }

    public boolean equals(Object o) {
        if(this== o){
            returntrue;
            }
            if(o ==null||getClass()!=o.getClass()){
            returnfalse;
            }
            Cats=(Cat) o;
            return age ==cat.age&&
            weight==cat.weight&&
            name.equals(cat.name);

    }

    public int hashCode() {
    
        booleanisHashcodeEquals=Барсик.hashCode()==Мурзик.hashCode();

            if(isHashcodeEquals){
            System.out.println("Should compare with equals method too.");
            
        }else{

            System.out.println("Should not compare with equals method because "+
            "the id is different, thatmeans the objects are not equals for sure.");

        }
    
    }

}