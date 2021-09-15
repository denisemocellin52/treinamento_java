# isto é um comentário;
# SQL = linguagem de consulta ao BD
# 4 operações no BD:
#CRUD = Create, Read, Update, Delete
#SQL = INSERT, SELECT, UPDATE, DELETE
#atalho para executar a linha:
# CTRL + ENTER
# 1 - criar um novo banco de dados
create database banco_itau;
# torna um banco padrão
use banco_itau;
#criar uma tabela no banco
create table departamento (
	id smallint not null auto_increment,
	nome varchar(50),
    andar smallint,
    constraint pk_depto primary key (id)
);

create table funcionario(
	id smallint not null auto_increment,
	nome varchar(120),
    email varchar(80) unique,
    salario float,
    id_depto smallint not null,
	
    constraint pk_funcionario primary key (id),
    constraint fk_depto foreign key (id_depto)
		references departamento (id)
);

#inserir dados na tabela
insert into departamento values (
	null, 'Financeiro', 3
);

insert into departamento values (
	null, 'Juridico', 3
);

insert into departamento values (
	null, 'TI', 3
);

insert into funcionario values (
	null, 'Denise Mocellin', 'dregert26@gmail.com', 2000, 1
);

insert into funcionario values (
	null, 'Kelly Silva', 'kjds@gmail.com', 3000, 5
);

insert into funcionario values (
	null, 'Daniel Cruz', 'dcass@gmail.com', 1000, 5
);

#busca no banco de dados
select * from departamento;

#apagar dados da tabela
delete from departamento where id = 3;

#busca no banco de dados
select * from funcionario;

# Altera os dados na tabela
update funcionario set salario = 3200 where id = 1;

#selecionando dados no banco

#select [colunas] from [tabelas] where [condição]

select nome, email from funcionario ;
select email from funcionario where id = 1;
select email from funcionario where nome like 'Denise%';
select email from funcionario where nome like '%Mocellin';

#qual o nome do departamento da Denise?
select departamento.nome as departamento
from departamento inner join funcionario
where departamento.id = funcionario.id_depto and
	funcionario.nome like 'Denise%';
    
#qual o salario da Denise?
select salario from funcionario
where nome like 'Denise%';

#listas nomes e salarios ordenados por salario
select nome, salario from funcionario order by salario;

#Quais são os funcionários do departamento 'Juridico'(2)
select funcionario.nome
from departamento inner join funcionario
where departamento.id = funcionario.id_depto and
	departamento.nome = 'Juridico';
