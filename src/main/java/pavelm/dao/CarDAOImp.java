package pavelm.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pavelm.entity.Car;

import java.util.List;
@Repository
public class CarDAOImp implements CarDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void deleteCar(int id) {
        Session session = sessionFactory.openSession();
        Query<Car> query = session.createQuery("delete from Car where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Car getCar(int id) {
        Session session = sessionFactory.openSession();
        return session.get(Car.class, id);
    }

    @Override
    public void saveCar(Car car) {
        Session session = sessionFactory.openSession();
        session.persist(car);
    }

    @Override
    public List<Car> getAllCars() {
        Session session = sessionFactory.openSession();
        return session.createQuery("from Car", Car.class).getResultList();
    }
}
