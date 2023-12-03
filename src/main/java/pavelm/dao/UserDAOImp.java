package pavelm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pavelm.entity.User;

import java.util.List;
@Repository
public class UserDAOImp implements UserDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteUser(int id) {
        Session session = sessionFactory.openSession();
        Query<User> query = session.createQuery("delete from User where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.openSession();
        return session.get(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.openSession();
        session.saveOrUpdate(user);
    }

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.openSession();
        return session.createQuery("from User", User.class).getResultList();
    }
}
