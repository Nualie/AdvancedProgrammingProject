/**** Target : MySQL ****/

DROP TABLE IF EXISTS INTERNS;

DROP TABLE IF EXISTS TUTORS;

CREATE TABLE TUTORS
(
    ID         INT         NOT NULL AUTO_INCREMENT,
    FIRSTNAME  VARCHAR(25) NOT NULL,
    LASTNAME   VARCHAR(25) NOT NULL,
    EMAIL      VARCHAR(25) NOT NULL,
    LOGIN      VARCHAR(25) NOT NULL,
    HASHEDPASS INT         NOT NULL,
    PRIMARY KEY (ID)
);

INSERT INTO TUTORS(FIRSTNAME, LASTNAME, EMAIL, LOGIN, HASHEDPASS)
VALUES ('Paul', 'Newman', 'pnewman@gmail.com', 'IamNewman25', -846535199);
INSERT INTO TUTORS(FIRSTNAME, LASTNAME, EMAIL, LOGIN, HASHEDPASS)
VALUES ('Julie', 'Ponthou', 'jponthou@gmail.com', 'Julie', -846535199);

CREATE TABLE INTERNS
(
    ID              INT NOT NULL AUTO_INCREMENT,
    LASTNAME        VARCHAR(25),
    FIRSTNAME       VARCHAR(25),
    CDC             BOOL,
    FICHEVISITE     BOOL,
    FICHEEVALENTREE BOOL,
    SONDAGEWEB      BOOL,
    RAPPORTRENDU    BOOL,
    SOUT            BOOL,
    VISITEPLANIF    BOOL,
    VISITEFAITE     BOOL,
    EMAIL           VARCHAR(25),
    TUTORID         INT,
    PRIMARY KEY (ID),
    FOREIGN KEY (TUTORID) REFERENCES TUTORS (ID)
);

INSERT INTO INTERNS(LASTNAME, FIRSTNAME, EMAIL, CDC, FICHEVISITE, FICHEEVALENTREE, SONDAGEWEB, RAPPORTRENDU, SOUT,
                    VISITEPLANIF, VISITEFAITE, TUTORID)
VALUES ('Bond', 'James', 'jbond@gmail.com', true, false, false,
        true, true, false, true, false, 1);
INSERT INTO INTERNS(LASTNAME, FIRSTNAME, EMAIL, CDC, FICHEVISITE, FICHEEVALENTREE, SONDAGEWEB, RAPPORTRENDU, SOUT,
                    VISITEPLANIF, VISITEFAITE, TUTORID)
VALUES ('Bond', 'John', 'jbond@gmail.com', true, false, false,
        true, true, false, true, false, 1);
INSERT INTO INTERNS(LASTNAME, FIRSTNAME, EMAIL, CDC, FICHEVISITE, FICHEEVALENTREE, SONDAGEWEB, RAPPORTRENDU, SOUT,
                    VISITEPLANIF, VISITEFAITE, TUTORID)
VALUES ('Bond', 'Julien', 'jbond@gmail.com', true, false, false,
        true, true, false, true, false, 2);
