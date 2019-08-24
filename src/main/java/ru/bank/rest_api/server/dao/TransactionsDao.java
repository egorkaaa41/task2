package ru.bank.rest_api.server.dao;

import ru.bank.rest_api.server.model.Transactions;

public interface TransactionsDao {

    Transactions getByTransactions(String code);

    void save(Transactions tran);

    void update(Transactions tran);
}
