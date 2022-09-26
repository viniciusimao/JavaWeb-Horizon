# JavaWeb-Horizon

Integração do back-end no site usando:

JAVA como linguagem

MySQL como Banco de Dados


o código do banco de dados:

create table Cliente(
    idCli int primary key,
    nomeCli varchar(10) not null,
    emailCli varchar(50) not null unique,
    telCli varchar(11) not null unique,
    senhaCli varchar(11) not null unique
);
create table Voos(
    idVoos int primary key,
    localVoos varchar(2),
    fk_Cliente_idCli int
);
alter table Voos Add constraint FK_Voos_2
    foreign key (fk_Cliente_idCli )
    references Cliente (idCli)
    on delete cascade

