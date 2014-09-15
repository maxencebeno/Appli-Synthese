CREATE TABLE vip (
	num_vip number(10) not null,
	nom_vip varchar2(255), not null,
	prenom_usuel_vip varchar2(255) not null,
	prenoms_vip varchar2(255) not null,
	civilite_vip varchar2(255) not null,
	date_naissance_vip date not null,
	lieu_naissance_vip varchar2(255) not null,
	sexe_vip varchar2(255) not null,
	statut_vip varchar2(255)
	constraint pk_vip primary key (num_vip),
	constraint ck_vip_statut_vip check (statut_vip IN ('Acteur', 'Réalisateur', 'Rien'))
);