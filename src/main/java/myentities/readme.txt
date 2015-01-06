Aim is the following
--------------------

Taart    >-------<  Soort
                   (owner)
         BIDIRECTIONAL
         
Taart kan tot meerdere soorten behoren (vb marsepein, chocolade.. ) 
Een soort kan ook natuurlijk behoren tot meerdere Taarten

==> implemented

Bestelling   >-----< Taart 
ordernummer     
(owner)                     
             UNIDIRECTIONAL
             van bestelling nr taart (ik moet niet van taart nr bestelling kunnen gaan)
                               
Een bestelling kan 1 of meerdere taarten bevatten
een taart kan tot meerdere bestellingen horen



klant ----<  bestelling
              (owner)
       BIDIRECTIONAL
       
een klant kan meerdere bestellingen doen
een bestelling kan maar tot 1 klant behoren

Klant is abstract, er zijn 2 soorten
 - FamilieKlant: de familie
 - VriendelijkeKlant: ne vriendelijke mens die is een taartje wil
 ==> still to be implemented correctly (MappedSuperClass)
 
 This generates following:
 2015/01/06 17:24:13,603 INFO  [org.hibernate.cfg.Environment] (MSC service thread 1-3) HHH000021: Bytecode provider name : javassist
2015/01/06 17:24:14,036 INFO  [org.hibernate.ejb.Ejb3Configuration] (MSC service thread 1-3) HHH000204: Processing PersistenceUnitInfo [
	name: primary
	...]
2015/01/06 17:24:16,698 INFO  [org.hibernate.service.jdbc.connections.internal.ConnectionProviderInitiator] (MSC service thread 1-3) HHH000130: Instantiating explicit connection provider: org.hibernate.ejb.connection.InjectedDataSourceConnectionProvider
2015/01/06 17:24:19,791 INFO  [org.hibernate.dialect.Dialect] (MSC service thread 1-3) HHH000400: Using dialect: org.hibernate.dialect.MySQLDialect
2015/01/06 17:24:19,908 INFO  [org.hibernate.engine.transaction.internal.TransactionFactoryInitiator] (MSC service thread 1-3) HHH000268: Transaction strategy: org.hibernate.engine.transaction.internal.jta.CMTTransactionFactory
2015/01/06 17:24:19,989 INFO  [org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory] (MSC service thread 1-3) HHH000397: Using ASTQueryTranslatorFactory
2015/01/06 17:24:20,313 INFO  [org.hibernate.validator.util.Version] (MSC service thread 1-3) Hibernate Validator 4.2.0.Final
2015/01/06 17:24:23,718 INFO  [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000227: Running hbm2ddl schema export
2015/01/06 17:24:23,805 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:23,813 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling 
2015/01/06 17:24:23,813 INFO  [stdout] (MSC service thread 1-3)         drop 
2015/01/06 17:24:23,814 INFO  [stdout] (MSC service thread 1-3)         foreign key FKCEE70821A661E019
2015/01/06 17:24:23,905 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table Bestelling drop foreign key FKCEE70821A661E019
2015/01/06 17:24:23,905 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.Bestelling' doesn't exist
2015/01/06 17:24:23,906 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:23,907 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling_TAART 
2015/01/06 17:24:23,907 INFO  [stdout] (MSC service thread 1-3)         drop 
2015/01/06 17:24:23,907 INFO  [stdout] (MSC service thread 1-3)         foreign key FK70094F18E2380166
2015/01/06 17:24:23,915 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table Bestelling_TAART drop foreign key FK70094F18E2380166
2015/01/06 17:24:23,916 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.Bestelling_TAART' doesn't exist
2015/01/06 17:24:23,916 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:23,917 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling_TAART 
2015/01/06 17:24:23,991 INFO  [stdout] (MSC service thread 1-3)         drop 
2015/01/06 17:24:23,993 INFO  [stdout] (MSC service thread 1-3)         foreign key FK70094F18B74200D1
2015/01/06 17:24:23,994 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table Bestelling_TAART drop foreign key FK70094F18B74200D1
2015/01/06 17:24:23,999 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.Bestelling_TAART' doesn't exist
2015/01/06 17:24:24,000 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,001 INFO  [stdout] (MSC service thread 1-3)     alter table SOORT_TAART 
2015/01/06 17:24:24,001 INFO  [stdout] (MSC service thread 1-3)         drop 
2015/01/06 17:24:24,001 INFO  [stdout] (MSC service thread 1-3)         foreign key FKB27492EC9CAC7DB9
2015/01/06 17:24:24,002 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table SOORT_TAART drop foreign key FKB27492EC9CAC7DB9
2015/01/06 17:24:24,003 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.SOORT_TAART' doesn't exist
2015/01/06 17:24:24,005 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,005 INFO  [stdout] (MSC service thread 1-3)     alter table SOORT_TAART 
2015/01/06 17:24:24,005 INFO  [stdout] (MSC service thread 1-3)         drop 
2015/01/06 17:24:24,005 INFO  [stdout] (MSC service thread 1-3)         foreign key FKB27492ECD4952E50
2015/01/06 17:24:24,009 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table SOORT_TAART drop foreign key FKB27492ECD4952E50
2015/01/06 17:24:24,009 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.SOORT_TAART' doesn't exist
2015/01/06 17:24:24,010 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,010 INFO  [stdout] (MSC service thread 1-3)     drop table if exists Bestelling
2015/01/06 17:24:24,017 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,018 INFO  [stdout] (MSC service thread 1-3)     drop table if exists Bestelling_TAART
2015/01/06 17:24:24,136 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,142 INFO  [stdout] (MSC service thread 1-3)     drop table if exists Klant
2015/01/06 17:24:24,149 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,153 INFO  [stdout] (MSC service thread 1-3)     drop table if exists SOORT
2015/01/06 17:24:24,196 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: drop table if exists SOORT
2015/01/06 17:24:24,196 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Cannot delete or update a parent row: a foreign key constraint fails
2015/01/06 17:24:24,196 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,196 INFO  [stdout] (MSC service thread 1-3)     drop table if exists SOORT_TAART
2015/01/06 17:24:24,198 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,198 INFO  [stdout] (MSC service thread 1-3)     drop table if exists TAART
2015/01/06 17:24:24,289 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: drop table if exists TAART
2015/01/06 17:24:24,289 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Cannot delete or update a parent row: a foreign key constraint fails
2015/01/06 17:24:24,289 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,289 INFO  [stdout] (MSC service thread 1-3)     drop table if exists hibernate_sequence
2015/01/06 17:24:24,292 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,292 INFO  [stdout] (MSC service thread 1-3)     create table Bestelling (
2015/01/06 17:24:24,292 INFO  [stdout] (MSC service thread 1-3)         orderNr integer not null,
2015/01/06 17:24:24,293 INFO  [stdout] (MSC service thread 1-3)         klant_id integer,
2015/01/06 17:24:24,293 INFO  [stdout] (MSC service thread 1-3)         primary key (orderNr)
2015/01/06 17:24:24,293 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)     create table Bestelling_TAART (
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)         ORDERNO ORDERNO not null,
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)         TAARTID TAARTID not null,
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)         NO_ORDERED integer not null,
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)         primary key (ORDERNO, NO_ORDERED)
2015/01/06 17:24:24,393 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,395 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: create table Bestelling_TAART (ORDERNO ORDERNO not null, TAARTID TAARTID not null, NO_ORDERED integer not null, primary key (ORDERNO, NO_ORDERED))
2015/01/06 17:24:24,395 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'ORDERNO not null,
        TAARTID TAARTID not null,
        NO_ORDERED integer n' at line 2
2015/01/06 17:24:24,395 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,395 INFO  [stdout] (MSC service thread 1-3)     create table Klant (
2015/01/06 17:24:24,395 INFO  [stdout] (MSC service thread 1-3)         DTYPE varchar(31) not null,
2015/01/06 17:24:24,395 INFO  [stdout] (MSC service thread 1-3)         id integer not null,
2015/01/06 17:24:24,396 INFO  [stdout] (MSC service thread 1-3)         email varchar(255),
2015/01/06 17:24:24,396 INFO  [stdout] (MSC service thread 1-3)         naam varchar(255),
2015/01/06 17:24:24,396 INFO  [stdout] (MSC service thread 1-3)         image longblob,
2015/01/06 17:24:24,396 INFO  [stdout] (MSC service thread 1-3)         primary key (id)
2015/01/06 17:24:24,396 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,416 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,416 INFO  [stdout] (MSC service thread 1-3)     create table SOORT (
2015/01/06 17:24:24,416 INFO  [stdout] (MSC service thread 1-3)         id integer not null,
2015/01/06 17:24:24,417 INFO  [stdout] (MSC service thread 1-3)         soort varchar(255),
2015/01/06 17:24:24,417 INFO  [stdout] (MSC service thread 1-3)         primary key (id)
2015/01/06 17:24:24,417 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,489 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: create table SOORT (id integer not null, soort varchar(255), primary key (id))
2015/01/06 17:24:24,489 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'SOORT' already exists
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3)     create table SOORT_TAART (
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3)         soort_id SOORTID not null,
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3)         taarten_id TAARTID not null,
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3)         primary key (soort_id, taarten_id)
2015/01/06 17:24:24,489 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,491 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: create table SOORT_TAART (soort_id SOORTID not null, taarten_id TAARTID not null, primary key (soort_id, taarten_id))
2015/01/06 17:24:24,491 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'SOORTID not null,
        taarten_id TAARTID not null,
        primary key (soor' at line 2
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3)     create table TAART (
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3)         id integer not null,
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3)         image longblob,
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3)         naam varchar(255),
2015/01/06 17:24:24,491 INFO  [stdout] (MSC service thread 1-3)         primary key (id)
2015/01/06 17:24:24,492 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,494 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: create table TAART (id integer not null, image longblob, naam varchar(255), primary key (id))
2015/01/06 17:24:24,495 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'TAART' already exists
2015/01/06 17:24:24,495 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,496 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling 
2015/01/06 17:24:24,496 INFO  [stdout] (MSC service thread 1-3)         add index FKCEE70821A661E019 (klant_id), 
2015/01/06 17:24:24,496 INFO  [stdout] (MSC service thread 1-3)         add constraint FKCEE70821A661E019 
2015/01/06 17:24:24,496 INFO  [stdout] (MSC service thread 1-3)         foreign key (klant_id) 
2015/01/06 17:24:24,496 INFO  [stdout] (MSC service thread 1-3)         references Klant (id)
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling_TAART 
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3)         add index FK70094F18E2380166 (TAARTID), 
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3)         add constraint FK70094F18E2380166 
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3)         foreign key (TAARTID) 
2015/01/06 17:24:24,608 INFO  [stdout] (MSC service thread 1-3)         references TAART (id)
2015/01/06 17:24:24,610 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table Bestelling_TAART add index FK70094F18E2380166 (TAARTID), add constraint FK70094F18E2380166 foreign key (TAARTID) references TAART (id)
2015/01/06 17:24:24,610 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.Bestelling_TAART' doesn't exist
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3)     alter table Bestelling_TAART 
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3)         add index FK70094F18B74200D1 (ORDERNO), 
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3)         add constraint FK70094F18B74200D1 
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3)         foreign key (ORDERNO) 
2015/01/06 17:24:24,611 INFO  [stdout] (MSC service thread 1-3)         references Bestelling (orderNr)
2015/01/06 17:24:24,613 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table Bestelling_TAART add index FK70094F18B74200D1 (ORDERNO), add constraint FK70094F18B74200D1 foreign key (ORDERNO) references Bestelling (orderNr)
2015/01/06 17:24:24,614 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.Bestelling_TAART' doesn't exist
2015/01/06 17:24:24,614 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,616 INFO  [stdout] (MSC service thread 1-3)     alter table SOORT_TAART 
2015/01/06 17:24:24,616 INFO  [stdout] (MSC service thread 1-3)         add index FKB27492EC9CAC7DB9 (soort_id), 
2015/01/06 17:24:24,616 INFO  [stdout] (MSC service thread 1-3)         add constraint FKB27492EC9CAC7DB9 
2015/01/06 17:24:24,617 INFO  [stdout] (MSC service thread 1-3)         foreign key (soort_id) 
2015/01/06 17:24:24,617 INFO  [stdout] (MSC service thread 1-3)         references SOORT (id)
2015/01/06 17:24:24,619 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table SOORT_TAART add index FKB27492EC9CAC7DB9 (soort_id), add constraint FKB27492EC9CAC7DB9 foreign key (soort_id) references SOORT (id)
2015/01/06 17:24:24,619 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.SOORT_TAART' doesn't exist
2015/01/06 17:24:24,620 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,621 INFO  [stdout] (MSC service thread 1-3)     alter table SOORT_TAART 
2015/01/06 17:24:24,621 INFO  [stdout] (MSC service thread 1-3)         add index FKB27492ECD4952E50 (taarten_id), 
2015/01/06 17:24:24,621 INFO  [stdout] (MSC service thread 1-3)         add constraint FKB27492ECD4952E50 
2015/01/06 17:24:24,621 INFO  [stdout] (MSC service thread 1-3)         foreign key (taarten_id) 
2015/01/06 17:24:24,622 INFO  [stdout] (MSC service thread 1-3)         references TAART (id)
2015/01/06 17:24:24,695 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) HHH000389: Unsuccessful: alter table SOORT_TAART add index FKB27492ECD4952E50 (taarten_id), add constraint FKB27492ECD4952E50 foreign key (taarten_id) references TAART (id)
2015/01/06 17:24:24,701 ERROR [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-3) Table 'bakkerij.SOORT_TAART' doesn't exist
2015/01/06 17:24:24,704 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,704 INFO  [stdout] (MSC service thread 1-3)     create table hibernate_sequence (
2015/01/06 17:24:24,704 INFO  [stdout] (MSC service thread 1-3)          next_val bigint 
2015/01/06 17:24:24,705 INFO  [stdout] (MSC service thread 1-3)     )
2015/01/06 17:24:24,719 INFO  [stdout] (MSC service thread 1-3) Hibernate: 
2015/01/06 17:24:24,719 INFO  [stdout] (MSC service thread 1-3)     insert into hibernate_sequence values ( 1 )