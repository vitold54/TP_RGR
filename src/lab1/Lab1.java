package lab1;


import entity.profile;
import entity.seller;
import entity.auction;
import entity.lot;
import entity.buyer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.NewHibernateUtil;


public class Lab1 {
    
    private static SessionFactory sessionFactory;
    private static Session session;
    private static Transaction transaction;
    
    public static void init() {
        sessionFactory = NewHibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }
    
    
    //1. Вывести список всех продавцов и их емайлы
        public static void firsttask() {     

        List<profile> profiles = session.createQuery("FROM profile WHERE Status = 0").list();
        
        
        for (profile Profile : profiles) {
            System.out.println(Profile);
            Profile.getseller().forEach(System.out::println);

        }
        
    }
        
    //2. Установить начальную стоимость 2 аукциона на 1000
        public static void secondtask() {     

      String hql = "update auction "
               + "SET first_price = :firstpriceint "
               +  " where id = 2";
      
    Query query = session.createQuery(hql);

    query.setParameter("firstpriceint"  , 1000);
 
    int result = query.executeUpdate();
    System.out.println("Выполнено обновлений: " + result);
        
    }
        
        
    //3. Поиск среди сообщений по ключевым словам/фразам
    public static void thirdTask(String phrase) {
        List<profile> profiles = session.createQuery("FROM profile WHERE Address LIKE :phrase").setParameter("phrase", "%" + phrase + "%").list();
        System.out.println("Пользователи, которые проживают в \"" + phrase + "\":");
        profiles.forEach(System.out::println);
    }
    
    
    //4. Выбрать из БД 3 сотрудников, начиная с 3-ой записи :
    public static void fourthTask(){
        String hql = "FROM profile";
        Query query = session.createQuery(hql);
        query.setFirstResult(3);
        query.setMaxResults (3);
        List result = query.list();
        result.forEach(System.out::println);
    
        }

    
    public static void close() {
        session.flush();
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
