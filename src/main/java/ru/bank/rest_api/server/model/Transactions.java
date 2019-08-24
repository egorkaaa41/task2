package ru.bank.rest_api.server.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "transactions", schema = "service")
public class Transactions {
    @JoinColumn(name="code")
    private Codes codes;

    private Integer code;

    @Autowired
    private Date time;

    private Status status;

    private Integer contract_number;

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getContract_number() {
        return contract_number;
    }

    public void setContract_number(Integer contract_number) {
        this.contract_number = contract_number;
    }

    @Override
    public String toString() {
        return " Transactions{" +
                "code=" + code +
                ", code='" + code + '\'' +
                '}';
    }
}
