drop schema if exists spring;
drop user if exists 'user'@'localhost';
create schema spring;
create user 'user'@'localhost' identified by 'pass123';
grant select, insert, delete, update on spring.* to user@'localhost';

USE spring;

CREATE TABLE tra_trabalho (
    tra_id bigint PRIMARY KEY AUTO_INCREMENT,
    tra_titulo varchar(100) NOT NULL UNIQUE,
    tra_data_hora_entrega datetime NOT NULL,
    tra_descricao varchar(200),
    tra_grupo varchar(20) NOT NULL,
    tra_nota int,
    tra_justificativa varchar(100)
);

INSERT INTO tra_trabalho (tra_titulo, tra_data_hora_entrega, tra_grupo, tra_nota, tra_justificativa)
VALUES 
    ('Trabalho 1', '2023-10-15 14:00:00', 'Grupo A', 8, 'Bom desempenho'),
    ('Trabalho 2', '2023-10-20 12:30:00', 'Grupo B', 7, 'Bem estruturado'),
    ('Trabalho 3', '2023-10-25 16:45:00', 'Grupo C', 6, 'Algumas melhorias necessárias');

CREATE TABLE aluno (
    aluno_id bigint PRIMARY KEY AUTO_INCREMENT,
    aluno_nome varchar(100) NOT NULL,
    aluno_matricula varchar(20) NOT NULL UNIQUE,
    aluno_email varchar(100),
    aluno_telefone varchar(15)
);

INSERT INTO aluno (aluno_nome, aluno_matricula, aluno_email, aluno_telefone)
VALUES 
    ('João Silva', '2023001', 'joao.silva@example.com', '123456789'),
    ('Maria Oliveira', '2023002', 'maria.oliveira@example.com', '987654321'),
    ('Pedro Santos', '2023003', 'pedro.santos@example.com', '555555555');

CREATE TABLE disciplina (
    disciplina_id bigint PRIMARY KEY AUTO_INCREMENT,
    disciplina_nome varchar(100) NOT NULL,
    disciplina_codigo varchar(20) NOT NULL UNIQUE
);

INSERT INTO disciplina (disciplina_nome, disciplina_codigo)
VALUES 
    ('Matemática', 'MAT101'),
    ('História', 'HIS202'),
    ('Biologia', 'BIO303');
