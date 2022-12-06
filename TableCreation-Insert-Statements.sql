-- table declarations for the project
create table cust (
    license varchar2(9) unique,
    email varchar2(28),
    ID varchar2(9) primary key,
    pnum varchar2(11),
    name varchar2(28)
);
create table vehicle (
    plateno varchar2(10) primary key,
    make varchar2(10),
    model varchar2(10),
    isCar int, -- 1 is car 0 is bike
    cost int,
    isAvailable int
);
create table rented (
    license varchar2(9),
    plateno varchar2(10),
    transactionID int not null,
    primary key(license, plateno)
);
-- foreign key for rented --> cust
alter table rented add constraint fk_rented_license foreign key(license) references cust(license);
-- foreign key for rented --> vehicle
alter table rented add constraint fk_rented_plateno foreign key(plateno) references vehicle(plateno);

--also, the same format for the loginusers table is required from the final lab
-- here is the table definition and inserting the first user
create table loginusers(
    username varchar2(25) primary key,
    name varchar2(25),
    type number(1),
    passwd_hash varchar2(25)
);
insert into loginusers values('joeypress', 'Joey Press', 0, -1268878963);
insert into loginusers values('wissam', 'Wissam AK', 0, 341775903); -- password: wissampwd
insert into loginusers values('sami', 'Sami Test', 1, 1864639123); -- password: samipwd
insert into loginusers values('KB', Kartavaya, 0, 101847686); -- password: kbpwd


