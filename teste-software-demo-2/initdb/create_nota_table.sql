CREATE TABLE nota(
	id SERIAL PRIMARY KEY,
	data_venda date,
	valor numeric(13,2)
);

insert into nota values (1, date('2020-01-01'), 2000);
insert into nota values (2, date('2020-01-01'), 1000);
insert into nota values (3, date('2020-01-01'), 3000);
