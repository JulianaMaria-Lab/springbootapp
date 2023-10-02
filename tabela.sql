drop schema if exists spring;
drop user if exists 'user'@'localhost';
create schema spring;
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on spring.* to user@'localhost';

USE spring;

CREATE TABLE ent_entrega (
    ent_id bigint primary key auto_increment,
    ent_descricao varchar(100) not null,
    ent_data_hora_cadastro datetime not null,
    ent_data_hora_limite datetime not null,
    ent_peso int not null,
    ent_observcaoes varchar(200)
);

insert into ent_entrega (ent_descricao, ent_data_hora_cadastro, ent_data_hora_limite,ent_peso)
 values ('Teste 1', current_timestamp(), '2023-10-5 23:59:59',3),
 ('Teste 2', current_timestamp(), '2023-10-12 23:59:59',3);
