drop table if exists city;

create table city (id int auto_increment, name varchar, state varchar, country varchar, primary key (id));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');