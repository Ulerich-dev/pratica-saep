create database praticaum;


create table medicamento(
id serial primary key,
lote int not null,
data_validade timestamp not null,
tipo_medicamento varchar(30) not null,
condicao varchar(30) not null
);
create table movimentacao(
id serial primary key,
estrada_medicamento timestamp not null,
saida_medicamento timestamp not null,
tipo_medicamento varchar(30) not null,
registro_detalhado varchar(40)not null,
medicamento_id int not null references medicamento(id)
);
create table historico(
id serial primary key,
responsavel varchar(30) not null,
data timestamp not null,
movimentacao_id int not null references movimentacao(id)
);