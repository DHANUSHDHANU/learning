import com.hibernet.db.DestinationEntity;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;


import java.util.List;
import java.util.Map;

/**
 * Created by User on 5/1/2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            Transaction transaction= session.beginTransaction();

            List<DestinationEntity> entity=session.createQuery( "From DestinationEntity ").list();
           for(DestinationEntity DL:entity)
           {
               System.out.println("ptint"+DL);
           }
            transaction.commit();
            session.close();
        } finally
        {
            session.close();
        }}}

