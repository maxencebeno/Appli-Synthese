CREATE TABLE photographie (
	id_photo number(10) not null,
	num_vip number(10) not null,
	url_photo varchar2(255) not null,
	date_ajout_photo date not null,
	constraint pk_photo primary key (id_photo)
);

ALTER TABLE photographie 
add constraint fk_photographie_vip foreign key (num_vip) references vip (num_vip); 
