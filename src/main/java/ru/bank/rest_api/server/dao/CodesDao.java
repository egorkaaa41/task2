package ru.bank.rest_api.server.dao;

import ru.bank.rest_api.server.model.Codes;

public interface CodesDao {

    void save(Codes codes);

    Codes getbycode(String code);

}
