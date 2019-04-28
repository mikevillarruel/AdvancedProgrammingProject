/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     27/04/2019 23:12:34                          */
/*==============================================================*/


drop table if exists SELLER;

drop table if exists TICKET;

/*==============================================================*/
/* Table: SELLER                                                */
/*==============================================================*/
create table SELLER
(
   IDSELLER             int not null,
   USERNAME             char(32) not null,
   PASSWORD             char(32) not null,
   NAME                 varchar(32),
   LASTNAME             varchar(32),
   ADDRESS              varchar(32),
   TELEPHONE            char(10),
   EMAIL                varchar(64),
   PENDINGVALUES        double,
   primary key (IDSELLER)
);

/*==============================================================*/
/* Table: TICKET                                                */
/*==============================================================*/
create table TICKET
(
   IDTICKET             int not null,
   IDSELLER             int not null,
   PRICE                double,
   DEPARTURE            varchar(32),
   ARRIVAL              varchar(32),
   CLASS                varchar(32),
   DATE                 date,
   HOUR                 time,
   AIRLINE              varchar(32),
   GATE                 varchar(32),
   FLIGHTNUMBER         varchar(32),
   SEAT                 varchar(32),
   STOCK                int,
   DISCOUNT             int,
   primary key (IDTICKET)
);

alter table TICKET add constraint FK_USERTICKET foreign key (IDSELLER)
      references SELLER (IDSELLER) on delete restrict on update restrict;

