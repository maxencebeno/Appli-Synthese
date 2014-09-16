/* 1) création des tables */

CREATE TABLE vip (
	num_vip number(10),
	nom_vip varchar2(255),
	prenom_usuel_vip varchar2(255),
	prenoms_vip varchar2(255),
	civilite_vip varchar2(255),
	date_naissance_vip date,
	lieu_naissance_vip varchar2(255),
	sexe_vip varchar2(255),
	statut_vip varchar2(255),
	constraint pk_vip primary key (num_vip),
	constraint ck_vip_statut_vip check (statut_vip IN ('Acteur', 'Réalisateur', 'Rien'))
);

CREATE TABLE photos (
	id_photo number(10) not null,
	num_vip number(10),
	url_photo varchar2(255),
	date_ajout_photo date,
	constraint pk_photo primary key (id_photo)
);


CREATE TABLE films (
	id_film number(10) not null,
	titre_film varchar2(255),
	date_sortie date,
	genre varchar2(255),
	num_visa varchar2(255),
	constraint pk_films primary key (id_film)
);

CREATE TABLE acteur (
	num_vip number(10) not null,
	id_film number(10) not null,
	constraint pk_acteur primary key (num_vip, id_film)
);

CREATE TABLE realisateur (
	num_vip number(10) not null,
	id_film number(10) not null,
	constraint pk_realisateur primary key (num_vip, id_film)
);

CREATE TABLE mariage (
	num_vip1 number(10) not null,
	num_vip2 number(10) not null,
	date_mariage date,
	constraint pk_mariage primary key (num_vip1, num_vip2)
);

CREATE TABLE divorce (
	num_vip1 number(10) not null,
	num_vip2 number(10) not null,
	date_divorce date,
	constraint pk_divorce primary key (num_vip1, num_vip2)
);

ALTER TABLE photographie add constraint fk_photose_vip foreign key (num_vip) references vip (num_vip); 
alter table acteur add constraint fk_acteur_id_film foreign key (id_film) references films(id_film);
alter table acteur add constraint fk_acteur_num_vip foreign key (num_vip) references vip(num_vip);
alter table realisateur add constraint fk_realisateur_id_film foreign key (id_film) references films(id_film);
alter table realisateur add constraint fk_realisateur_num_vip foreign key (num_vip) references vip(num_vip);
alter table mariage add constraint fk_mariage_num_vip1 foreign key (num_vip1) references vip (num_vip);
alter table mariage add constraint fk_mariage_num_vip2 foreign key (num_vip2) references vip (num_vip);
alter table divorce add constraint fk_mariage_num_vip1 foreign key (num_vip1) references vip (num_vip);
alter table divorce add constraint fk_mariage_num_vip2 foreign key (num_vip2) references vip (num_vip);


