CREATE DATABASE QLCoffee 
GO 
USER
--mã xác nhận
IF OBJECT_ID('MAXACNHAN') IS NOT NULL
DROP TABLE MAXACNHAN
CREATE TABLE MAXACNHAN
(
	TGTAO DATETIME,
	TGXOA DATETIME,
	MAXN INT,
	
	CONSTRAINT MAXN PRIMARY KEY(MAXN),
)
--TÀI KHO?N
IF OBJECT_ID('TAIKHOAN') IS NOT NULL
DROP TABLE TAIKHOAN
CREATE TABLE TAIKHOAN
(
	TENTAIKHOAN NVARCHAR(50) NOT NULL,
	MATKHAU NVARCHAR(50) NOT NULL,
	HOTEN NVARCHAR(100) NOT NULL,
	EMAIL NVARCHAR(100) NOT NULL,
	VAITRO BIT NOT NULL,
	TRANGTHAI NVARCHAR(50),
	An bit,

	CONSTRAINT PK_TAIKHOAN PRIMARY KEY(TENTAIKHOAN),
)
--Danh m?c
if OBJECT_ID('DanhMuc') is not null
drop table DanhMuc
Create table DanhMuc
(	
	MaDanhMuc int identity,
	TenDanhMuc nvarchar(100) not null,
	TrangThaiHD bit not null,
	primary key(MaDanhMuc),
)
--Mon ?n
if OBJECT_ID('MonAn') is not null
drop table MonAn 
create table MonAn
(
	MaMon int identity,
	TenMon nvarchar(100) not null,
	MaDanhMuc int,
	DonGia money not null,
	HinhAnh nvarchar(1000) not null,
	TrangThai int not null,

	primary key(MaMon),
	foreign key(MaDanhMuc) references DanhMuc,
)
--khu v?c bàn
if object_id('KhuVuc') is not null
drop table KhuVuc
create table KhuVuc
(
	MaKhuVuc int identity,
	TenKhuVuc nvarchar(100) not null,
	TrangThaiHD bit not null,
	primary key(MaKhuVuc),
)
--bàn
if OBJECT_ID('Ban') is not null
drop table Ban
create table Ban
(
	MaBan int identity,
	TenBan nvarchar(100) not null,
	MaKhuVuc int not null,
	trangThaiNgoi bit not null,
	trangThaiHD bit not null,

	primary key(MaBan),
	foreign key(MaKhuVuc) references KhuVuc,
)
--s? ki?n
if object_id('SuKien') is not null
drop table SuKien
create table SuKien
(
	MaSuKien nvarchar(50) not null,
	TenSuKien nvarchar(100) not null,
	UuDai float not null,
	tgBatDau datetime,
	tgKetThuc dateTime,
	LoaiSuKien int not null,
	TrangThai bit default 1,
	AnSK bit not null default 1,
	primary key(MaSuKien),
)
if OBJECT_ID('HoaDon') is not null
drop table HoaDon
create table HoaDon
(
	MaHD nvarchar(50) not null,
	MaBan int not null,
	NgayBan datetime,
	TenBan nvarchar(100),
	TenTaiKhoan nvarchar(50) not null,
	TongTien money not null,
	MaSuKien nvarchar(50),
	UuDai float,
	TongTienThanhToan money,
	GhiChu nvarchar(1000),
	SoHD int identity,

	primary key(MaHD),
	foreign key(MaBan) references Ban,
	foreign key(TenTaiKhoan) references TaiKhoan,
	foreign key(MaSuKien) references SuKien,
)
--ct hóa ??n
if OBJECT_ID('CTHoaDon') is not null
drop table CTHoaDon
create table CTHoaDon
(
	MaHD nvarchar(50) not null,
	MaMon int,
	TenMon nvarchar(100), 
	SoLuong int,
	DonGia money,
	ThanhTien money,

	primary key(MaHD, MaMon),
	foreign key(MaHD) references HoaDon,
	foreign key(MaMon) references MonAn,
)


delete from KhuVuc
select * from KhuVuc
insert into KhuVuc values(N'T?ng 1',1)
insert into KhuVuc values(N'T?ng 2',1)
insert into KhuVuc values(N'Sân th??ng',1)
insert into KhuVuc values(N'Mang v?',1)

delete from Ban
select * from Ban
insert into Ban values(N'Ban 1',9,0,1)
insert into Ban values(N'Ban 2',9,0,1)
insert into Ban values(N'Ban 3',9,1,1)
insert into Ban values(N'Ban 4',9,1,1)
insert into Ban values(N'Ban 5',9,0,1)
insert into Ban values(N'Ban 6',9,0,1)
insert into Ban values(N'Ban 7',9,0,1)
insert into Ban values(N'Ban 8',9,0,1)
insert into Ban values(N'Ban 9',9,0,1)
insert into Ban values(N'Ban 10',9,0,1)
insert into Ban values(N'Ban 11',9,0,1)
insert into Ban values(N'Ban 12',9,0,1)
insert into Ban values(N'Ban 13',9,0,1)
insert into Ban values(N'Ban 14',9,0,1)
insert into Ban values(N'Ban 15',9,0,1)
insert into Ban values(N'Ban 16',9,0,1)
insert into Ban values(N'Ban 17',9,0,1)
insert into Ban values(N'Ban 18',10,0,1)
insert into Ban values(N'Ban 19',10,0,1)
insert into Ban values(N'Ban 20',10,0,1)
insert into Ban values(N'Ban 21',11,0,1)
insert into Ban values(N'Ban 22',11,0,1)
insert into Ban values(N'Ban 23',11,0,1)
insert into Ban values(N'Ban 24',12,0,1)
insert into Ban values(N'Ban 25',12,0,1)
insert into Ban values(N'Ban 26',12,0,1)


SELECT * FROM TAIKHOAN
delete from TAIKHOAN
INSERT INTO TAIKHOAN VALUES('ADMIN','123','ADMIN','ADMIN@GMAIL.COM','1',1,null)
INSERT INTO TAIKHOAN VALUES('Chien','123',N'Hoàng V?n Chi?n','Chien@GMAIL.COM','0',1,null)

delete from DanhMuc
select * from DanhMuc
insert into DanhMuc values(N'Trà s?a',1)
insert into DanhMuc values(N'Coffe',1)
insert into DanhMuc values(N'?? u?ng',1)
insert into DanhMuc values(N'Coffe s?a',1)

select * from MonAn
insert into MonAn values(N'Coffe s?a',4,20000,'t.jpg',1)
insert into MonAn values(N'Coffe ?en',2,20000,'t2.jpg',1)
insert into MonAn values(N'Coffe ???ng ?en',2,20000,'t2.jpg',1)
insert into MonAn values(N'Coffe tr?ng',4,25000,'t.jpg',1)
insert into MonAn values(N'Coffe caramen',4,25000,'t.jpg',1)
insert into MonAn values(N'Trà s?a',1,30000,'t3.jpg',1)
insert into MonAn values(N'Trà s?a chân châu tr?ng',1,30000,'t3.jpg',1)
insert into MonAn values(N'Trà s?a matcha',1,30000,'t4.jpg',1)
insert into MonAn values(N'Chanh leo',3,20000,'t4.jpg',1)
insert into MonAn values(N'Trà chanh',3,10000,'t4.jpg',1)


select * from SuKien
insert into SuKien VALUES('SK00',N'KHUYẾN MÃI',20,GETDATE(),NULL,0,1,1)
insert into SuKien VALUES('SK01',N'KHUYẾN MÃI 2',20,GETDATE(),NULL,0,1,1)
insert into SuKien VALUES('SK02',N'KHUYẾN MÃI 40%',40,GETDATE(),NULL,0,1,1)
insert into SuKien VALUES('SK03',N'KHUYẾN MÃI 50%',50,GETDATE(),NULL,0,1,1)
insert into SuKien VALUES('SK04',N'KHUYẾN MÃI 60%',60,GETDATE(),NULL,0,1,1)
insert into SuKien VALUES('SK05',N'KHUYẾN MÃI 35%',35,GETDATE(),NULL,0,1,1)

insert into SuKien VALUES('SK06',N'Tặng 40%',40,GETDATE(),'02/01/2021',1,1,1)
insert into SuKien VALUES('SK07',N'Tặng 50%',50,GETDATE(),'12/10/2020',1,1,1)
insert into SuKien VALUES('SK08',N'Tặng 60%',60,GETDATE(),'12/31/2020',1,1,1)
insert into SuKien VALUES('SK09',N'Tặng 35%',35,GETDATE(),'12/31/2020',1,1,1)