package ru.bank.rest_api.server.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.bank.rest_api.server.model.Codes;
import ru.bank.rest_api.server.utils.HibernateSessionFactoryUtil;


@Transactional
@Repository
public class CodesDaoImpl implements CodesDao {
    @Override
    public void save(Codes codes) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(codes);
        tx1.commit();
        session.close();

    }

    @Override
    public Codes getbycode(String code) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Codes.class, code);
    }
}
