import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



        Milk milk1=new Milk("Молоко",60);
        milk1.dateDesign();
        Milk milk2=new Milk("Молоко",60);
        milk2.dateDesign();
        Milk milk3=new Milk("Молоко",60);
        milk3.dateDesign();
        Milk milk4=new Milk("Молоко",60);
        milk4.dateDesign();
        Milk milk5=new Milk("Молоко",60);
        milk5.dateDesign();
        Salt salt1=new Salt("Соль");
        salt1.dateDesign();
        Salt salt2=new Salt("Соль");
        salt2.dateDesign();
        Salt salt3=new Salt("Соль");
        salt3.dateDesign();
        Salt salt4=new Salt("Соль");
        salt4.dateDesign();
        Salt salt5=new Salt("Соль");
        salt5.dateDesign();
        Fish fish1=new Fish("Рыба",20);
        fish1.dateDesign();
        Fish fish2=new Fish("Рыба",20);
        fish2.dateDesign();
        Fish fish3=new Fish("Рыба",20);
        fish3.dateDesign();
        Fish fish4=new Fish("Рыба",20);
        fish4.dateDesign();
        Fish fish5=new Fish("Рыба",20);
        fish5.dateDesign();
        Corn corn1=new Corn("Кукуруза",150);
        corn1.dateDesign();
        Corn corn2=new Corn("Кукуруза",150);
        corn2.dateDesign();
        Corn corn3=new Corn("Кукуруза",150);
        corn3.dateDesign();
        Corn corn4=new Corn("Кукуруза",150);
        corn4.dateDesign();
        Corn corn5=new Corn("Кукуруза",150);
        corn5.dateDesign();
        Stew stew1=new Stew("Тушенка",180);
        stew1.dateDesign();
        Stew stew2=new Stew("Тушенка",180);
        stew2.dateDesign();
        Stew stew3=new Stew("Тушенка",180);
        stew3.dateDesign();
        Stew stew4=new Stew("Тушенка",180);
        stew4.dateDesign();
        Stew stew5=new Stew("Тушенка",180);
        stew5.dateDesign();


        Product[] products={milk1,milk2,milk3,milk4,milk5,salt1,salt2,salt3,salt4,salt5,fish1,fish2,fish3,fish4,fish5,corn1,corn2,corn3,corn4,corn5,stew1,stew2,stew3,stew4,stew5};

        Store store=new Store(products);
        System.out.println("  Product   |  Produced on  |  Storage Plase  |  S.life days  |  Fresh  ");
        System.out.println("------------+---------------+-----------------+---------------+---------");
        for (int i = 0; i < products.length; i++) {
            Random random=new Random();
            int aa= random.nextInt();


            if(products[i].getClass()==Salt.class){
                System.out.printf("      %s      |      %s       |     %s     |     %s   |    %s \n",products[i].getName(),products[i].dateDesign(),products[i].placeProduct(products[i]),products[i].getCrokgodnosty(),products[i].isFresh());

            }else{
                System.out.printf("      %s      |      %s       |     %s     |     %d    |    %s \n",products[i].getName(),products[i].dateDesign(),products[i].placeProduct(products[i]),products[i].getSrockgodnosti(),products[i].isFresh());

            }

        }


    }

}