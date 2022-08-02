import com.Dao.AgenciesDao;
import com.Dao.HibernateInteractions;
import com.entities.AgenciesEntity;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    public static void main(final String[] args) throws Exception {
       /* AgenciesEntity agenciesEntity=new AgenciesEntity("Night eye agency");
        AgenciesDao agenciesEntityHibernateInteractions=new AgenciesDao();
        agenciesEntityHibernateInteractions.deleteAll(AgenciesEntity.class);
        agenciesEntityHibernateInteractions.create(agenciesEntity);
        agenciesEntity.setAgencyName("All might agency");
        AgenciesEntity agenciesEntity2=new AgenciesEntity("Night eye agency");

        agenciesEntityHibernateInteractions.create(agenciesEntity2);*/

        AgenciesDao agenciesDao=new AgenciesDao();
        AgenciesEntity agenciesEntity=agenciesDao.getByName("Night eye agency");
        System.out.println(agenciesEntity);
    }
}