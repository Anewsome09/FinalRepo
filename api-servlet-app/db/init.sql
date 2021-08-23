-- "ERS".login definition

-- Drop table

-- DROP TABLE "ERS".login;

CREATE TABLE "ERS".login (
	id serial NOT NULL,
	username varchar NOT NULL,
	"password" varchar NOT NULL,
	manager varchar NOT NULL DEFAULT 'N'::character varying
);