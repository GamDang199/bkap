create database if not exists RestaurantManagement;
use RestaurantManagement;

drop table if exists `User`;
create table `User` (
	userId int unsigned auto_increment primary key,
    fullName nvarchar(50) not null,
    email nvarchar(50),
    `password` nvarchar(50) not null,
    phoneNumber nvarchar(15) unique not null,
    address nvarchar(100),
    `role` enum('admin', 'employee', 'customer') default 'customer',
    createdBy int unsigned not null,
    updatedBy int unsigned,
    createdAt timestamp default current_timestamp not null,
    updatedAt datetime default current_timestamp on update current_timestamp
);
alter table User convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `Category`;
create table `Category`(
	cateId int unsigned auto_increment primary key,
    cateName nvarchar(20) not null unique,
    `description` nvarchar(100),
    createdBy int unsigned,
    updatedBy int unsigned,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);

drop table if exists `Food`;
create table `Food` (
	foodId int unsigned auto_increment primary key,
    foodName nvarchar(50) unique not null,
    typeFood int unsigned not null,
    price float,
    `description` nvarchar(100),
    createdBy  nvarchar(50) not null,
    updatedBy nvarchar(50) not null,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
) collate utf8mb4_unicode_ci;


drop table if exists `Desk`;
create table `Desk`(
	deskId int unsigned auto_increment primary key,
    deskName nvarchar(20) not null,
    maxCustomer int unsigned not null,
	`description` nvarchar(100),
    createdBy int unsigned not null,
    updatedBy int unsigned not null,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);

alter table `Desk` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `Voucher`;
create table `Voucher`(
	voucherId int unsigned auto_increment primary key,
    nameVoucher nvarchar(20),
    `description` nvarchar(100),
    `percent` float,
    `amount` float,
    `type` enum ('percent', 'amount') default 'amount',
    createdBy int unsigned not null,
    updatedBy int unsigned not null,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);

alter table `Voucher` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `FoodCombo`;
create table `FoodCombo`(
	id int unsigned auto_increment primary key,
    foodId int unsigned not null,
    comboId int unsigned not null
);
alter table `FoodCombo` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `Combo`;
create table `Combo`(
	comboId int unsigned auto_increment primary key,
    comboName nvarchar(50) not null,
    price float,
    `description` nvarchar(100),
    createdBy int unsigned not null,
    updatedBy int unsigned not null,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);
alter table `Combo` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `OrderFood`;
create table `OrderFood`(
	id int unsigned auto_increment primary key,
    foodId int unsigned,
    listFoodId int unsigned,
    currentPrice float
);
alter table `OrderFood` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `ListFoodOrder`;
create table `ListFoodOrder`(
	id int unsigned auto_increment primary key,
    totalPrice float,
    createdBy nvarchar(50),
    updatedBy nvarchar(50),
    createAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);
alter table `ListFoodOrder` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists  `Booking`;
create table `Booking`(
	bookingId int unsigned auto_increment primary key,
    tableId int unsigned,
    cusId int unsigned,
    checkin datetime,
    checkout datetime,
    `description` nvarchar(100),
    isCheckedIn boolean,
    listOrderFoodId int unsigned,
    createdBy int unsigned,
    updatedBy int unsigned,
    createdAt timestamp default current_timestamp,
    updatedAt datetime default current_timestamp on update current_timestamp
);
alter table `Booking` convert to character set utf8mb4 collate utf8mb4_unicode_ci;

drop table if exists `Bill`;
create table `Bill`(
	billId int unsigned auto_increment primary key,
    cusId int unsigned not null,
    payDate datetime default current_timestamp,
	payType enum('cash', 'transfer', 'card', 'different'),
    voucherId int unsigned,
    `description` nvarchar(100),
    bookingId int unsigned,
    createdBy int unsigned,
    createAt timestamp default current_timestamp
);
alter table `Bill` convert to character set utf8mb4 collate utf8mb4_unicode_ci;








