package ru.bank.rest_api.server.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.bank.rest_api.server.model.Transactions;
import ru.bank.rest_api.server.utils.HibernateSessionFactoryUtil;

@Transactional
@Repository
public class TransactionsDaoImpl implements  TransactionsDao {
    @Override
    public Transactions getByTransactions(String code) {

        return null;
    }

    @Override
    public void save(Transactions transactions) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(transactions);
        tx1.commit();
        session.close();

    }

    @Override
    public void update(Transactions transactions) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(transactions);
        tx1.commit();
        session.close();

    }
}
