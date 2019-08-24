begin;

drop schema if exists service cascade;
create schema service;

drop table if exists service.codes;
create table service.codes (
  id    serial      not null,
  code  INTEGER      not null,

  primary key (id)
);

drop table if exists service.transactions;
create table service.transactions (
  code    INTEGER      not null,
  status varchar(8)      not null references chat.user on delete cascade,
  time   timestamp    not null,
  contract_number  INTEGER not null,

  FOREIGN KEY (code) REFERENCES service.codes(code)
);

commit;
