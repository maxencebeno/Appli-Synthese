/* 1) création des tables */

CREATE TABLE vip (
	num_vip number(10),
	nom_vip varchar2(255),
	prenom_usuel_vip varchar2(255),
	prenoms_vip varchar2(255),
	nationalite_vip varchar2(255),
	civilite_vip varchar2(255),
	date_naissance_vip date,
	lieu_naissance_vip varchar2(255),
	statut_vip varchar2(255),
	age_vip number(10),
	nb_enfants number(10),
	sexe_vip varchar(255),
	chemin_phto varchar(255),
	constraint pk_vip primary key (num_vip),
	constraint ck_vip_statut_vip check (statut_vip IN ('Acteur', 'Realisateur', 'null'))
);

CREATE TABLE photos (
	id_photo number(10) not null,
	num_vip number(10),
	url_photo varchar2(255),
	date_ajout_photo date,
	constraint pk_photos primary key (id_photo)
);


CREATE TABLE films (
	id_film number(10) not null,
	titre_film varchar2(255),
	date_sortie date,
	genre varchar2(255),
	num_visa varchar2(255),
	constraint pk_films primary key (id_film)
);

CREATE TABLE mariage (
	id_mariage number(10),
	num_vip1 number(10),
	num_vip2 number(10),
	lieu_mariage varchar2(255),
	date_mariage date,
	divorce boolean,
	date_divorce date,
	constraint pk_mariage primary key (id_mariage)
);

create table maries (
	id_mariage number(10),
	num_vip number(10),
	constraint pk_maries primary key (id_mariage, num_vip)
);


ALTER TABLE photos add constraint fk_photos_vip foreign key (num_vip) references vip (num_vip); 


alter table mariage add constraint fk_maruage_num_vip1 foreign key (num_vip1) references vip (num_vip);
alter table mariage add constraint fk_maruage_num_vip2 foreign key (num_vip2) references vip (num_vip); 

