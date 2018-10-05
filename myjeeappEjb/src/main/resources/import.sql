//import.sql est un script SQL automatiquement déclenché par hibernate 
//au démarrage de appli (ou test) en mode hibernate.hbm2ddl.auto=create  

INSERT INTO Client(numClient,prenom,nom,email,telephone) VALUES (1,'alex','Therieur','at@gmail.com','0102030405');
INSERT INTO Client(numClient,prenom,nom,email,telephone) VALUES (2,'olie','Condor','oc@gmail.com','0101010405');

INSERT INTO AdresseDeClient(idClient,rue,cp,ville) VALUES (1,'rue elle','75000','Parici');
INSERT INTO AdresseDeClient(idClient,rue,cp,ville) VALUES (2,'rue xyz','80000','Amiens');