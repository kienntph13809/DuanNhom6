CREATE DATABASE QLNOITHAT_NHOM6
GO

--KHÁCH HÀNG
if OBJECT_ID('KHACHHANG')is not null
drop table KHACHHANG

CREATE TABLE KHACHHANG(
MAKH VARCHAR(15),
TENKH NVARCHAR(50),
SDT VARCHAR(50),
DIACHI NVARCHAR(50),
TRANGTHAI BIT
CONSTRAINT PK_KHACHHANG PRIMARY KEY (MAKH))


--DOANH MỤC
if OBJECT_ID('danhmuc')is not null
drop table danhmuc

create table danhmuc(
madm int identity,
tendm nvarchar(100),
trangthai bit
primary key (madm)
)
-- chất Liệu
if OBJECT_ID('chatlieu')is not null
drop table chatlieu

create table chatlieu(
Macl int identity,
TenCl nvarchar(50),
trangThai bit
primary key (macl))


-- CHI TI?T S?N PH?M
if OBJECT_ID('SANPHAM')is not null
drop table SANPHAM

CREATE TABLE SANPHAM(
MASP VARCHAR(15),
TENSP NVARCHAR(100),
SOLUONG INT,
Macl int,
DONGIA MONEY,
MADM int,
ANHSP NVARCHAR(50),
MOTA NVARCHAR(100),
TRANGTHAI BIT,
SoSP int identity
CONSTRAINT PK_SANPHAM PRIMARY KEY (MASP),
foreign key(MADM) references danhmuc,
foreign key(MaCl) references chatlieu
)
--TÀI KHO?N
if OBJECT_ID('TAIKHOAN')is not null
drop table TAIKHOAN

CREATE TABLE TAIKHOAN(
TENTK VARCHAR(15),
MATKHAU NVARCHAR(20),
HOTEN NVARCHAR(50),
VAITRO BIT,
TRANGTHAI BIT,
PRIMARY KEY (TENTK))

--SỰ KIỆN
if OBJECT_ID('SUKIEN')is not null
drop table SUKIEN

CREATE TABLE SUKIEN(
MASK varchar(20) ,
TENSK NVARCHAR(50),
UUDAI FLOAT,
TGBATDAU DATE,
TGKETTHIC DATE,
LoaiSuKien bit default 1,
TRANGTHAI BIT,
PRIMARY KEY (MASK)
)
select * from SUKIEN where TRANGTHAI=1

select * from SUKIEN

insert SUKIEN (MASK,TENSK,UUDAI,TGBATDAU,TGKETTHIC) values(?,?,?,?,?)
IF OBJECT_ID('VIEW_SK') IS NOT NULL
DROP VIEW VIEW_SK
GO

CREATE VIEW VIEW_SK
AS
SELECT SANPHAM.MASP,TENSP,SOLUONG,DONGIA,DONGIA*SOLUONG AS THANHTIEN,
IIF (DONGIA*SOLUONG>3000000, N'Được Giảm 5-20%',N'CHƯA ĐỦ ĐIỀU KIỆN') AS DIEUKIEN 

FROM SANPHAM JOIN SUKIEN ON SANPHAM.MASP=SUKIEN.MASP
GROUP BY SANPHAM.MASP,TENSP,SOLUONG,DONGIA
GO
SELECT * FROM VIEW_SK

DECLARE @GIAMGIA AS FLOAT
SELECT @GIAMGIA = AVG(DONGIA) FROM SANPHAM GROUP BY SANPHAM.MASP
--
--TRUY VẤN
SELECT 	CASE

			WHEN  DONGIA BETWEEN 0 AND 2500000 THEN DONGIA /100* 5
			WHEN DONGIA BETWEEN 25000000 AND 3000000 THEN (DONGIA /100) *10
			WHEN DONGIA BETWEEN 3000001 AND 5000000 THEN (DONGIA /100)* 15
			ELSE (DONGIA /100)*20
		END AS DUOCGIAM,
IIF(125000*100/5>2400000,N'Được Giảm Giá 5% - 20%',N'Không Đủ Điều Kiện') AS DieuKien

FROM SANPHAM
SELECT * FROM SANPHAM




--HÓA ??N
if OBJECT_ID('HOADON')is not null
drop table HOADON

CREATE TABLE HOADON (
MAHD varchar(15) ,
MASP VARCHAR(15),
MAKH VARCHAR(15),
TENTK VARCHAR(15),
MASK varchar(20) ,
NGAYLAP DATE DEFAULT GETDATE(),
UUDAI FLOAT,
TONGTIENTT MONEY,
TRANGTHAI BIT,
ghichu nvarchar(100),
sohd int identity
PRIMARY KEY (MAHD),
foreign key(MASP) references SANPHAM,
foreign key(MAKH) references KHACHHANG,
foreign key(TENTK) references TAIKHOAN,
foreign key(MASK) references SUKIEN)

--CT HÓA ??N 
if OBJECT_ID('CTHOADON')is not null
drop table CTHOADON

CREATE TABLE CTHOADON(
MAHD VARCHAR(15),
MASP VARCHAR(15),
SOLUONG INT,
DONGIA MONEY,
THANHTIEN MONEY,
TRANGTHAI BIT
foreign key(MAHD) references HOADON,
FOREIGN KEY (MASP) REFERENCES SANPHAM)
--doanh m?c

select * from KHACHHANG
select * from SANPHAM
select * from HOADON
select * from CTHOADON
select * from danhmuc
select * from chatlieu
select * from HOADON
select * from TAIKHOAN

insert into KHACHHANG values ('kh15',N'Nguy?n Anh D?ng','0897999565','Hà N?i',1)
insert into KHACHHANG values ('kh16',N'Phạm Anh Tú','0897999555','Hà N?i',1)
insert into KHACHHANG values ('kh17',N'Nguyễn Trung Kiên','0897977775','Hà N?i',0)

insert into danhmuc values (N'Bàn',1)
insert into danhmuc values (N'Ghế',1)
insert into danhmuc values (N'Gương',1)
insert into danhmuc values (N'sofa',2)

insert into  chatlieu values (N'Gỗ',1)
insert into  chatlieu values (N'Nhôm',1)
insert into  chatlieu values (N'Nhựa',1)

insert into SANPHAM values ('SP01',N'Bàn trạm hình rồng',5,1,6500000,1,'Ban Hinh Rong.jpg',N'Bàn đẹp hình Rồng uốn lượn',1)
insert into SANPHAM values ('SP02',N'Ghế trạm hình rồng',3,1,4500000,2,'Ghe Hinh Rong.jpg',N'Ghế đẹp hình Rồng uốn lượn',1)
insert into SANPHAM values ('SP03',N'Gương trạm hình rồng',2,1,2500000,3,'Guong Hinh Rong.jpg',N'Gương đẹp hình Rồng uốn lượn',1)

insert into TAIKHOAN values ('adminkien','123',N'Nguyễn Trung Kiên',0,1)
insert into TAIKHOAN values ('admintu','123',N'Phạm Anh Tú',0,1)
insert into TAIKHOAN values ('adminduc','123',N'Đào Văn Đức',1,1)

insert into SUKIEN values ('1',N'KHUYẾN MÃI',20,GETDATE(),GETDATE()+5,1,1)
insert into SUKIEN values ('2',N'KHUYẾN MÃI 30%',30,GETDATE(),GETDATE()+7,1,1)
insert into SUKIEN values ('3',N'KHUYẾN MÃI 40%',40,GETDATE(),GETDATE()+10,1,1)
insert into SUKIEN values ('4',N'KHUYẾN MÃI 40%',10,GETDATE(),GETDATE()+3,1,0)
insert into SUKIEN values ('5',N'KHUYẾN MÃI 40%',13,GETDATE(),GETDATE()+4,1,1)

select SANPHAM.MASP,tensp,soluong,chatlieu.Macl,tendm,dongia,anhsp,mota
from danhmuc join SANPHAM on danhmuc.madm =  SANPHAM.MADM
join chatlieu on SANPHAM.Macl = chatlieu.Macl
 where tendm = 'Gương'
 insert into HOADON(MAHD,MASP,MAKH,TENTK,MASK,NGAYLAP,UUDAI,TONGTIENTT,TRANGTHAI,ghichu) values ('HD01','sp01','KH15','admintu',NULL,'2021-01-01',NULL,6500000,1,null)
  insert into HOADON(MAHD,MASP,MAKH,TENTK,MASK,NGAYLAP,UUDAI,TONGTIENTT,TRANGTHAI,ghichu) values ('HD02','sp02','KH15','adminduc',NULL,'2021-01-01',NULL,6500000,1,null)
    insert into HOADON(MAHD,MASP,MAKH,TENTK,MASK,UUDAI,TONGTIENTT,TRANGTHAI,ghichu) values (?,?,?,?,?,?,?,?,?,?)
	  insert into HOADON(MAHD,MASP,MAKH,TENTK,MASK,NGAYLAP,UUDAI,TONGTIENTT,TRANGTHAI,ghichu) values ('HD03','sp03','KH15','adminduc',NULL,NULL,6500000,1,null)

  insert into CTHOADON values('HD01','SP01',1,6500000,6500000,1)

  SELECT *
            FROM HOADON JOIN TAIKHOAN ON HOADON.TENTK = TAIKHOAN.TENTK
            			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH 
            WHERE hoadon.TRANGTHAI LIKE 1



SELECT *
            FROM HOADON JOIN TAIKHOAN ON HOADON.TENTK = TAIKHOAN.TENTK
            			JOIN KHACHHANG ON KHACHHANG.MAKH = HOADON.MAKH 
insert into HOADON(MAHD,MAKH,TENTK,TONGTIENTT,TRANGTHAI,ghichu) values ('HD04','KH15','adminduc',6500000,1,null)
insert into HOADON(MAHD,MAKH,TENTK,TONGTIENTT,TRANGTHAI,ghichu) values (?,?,?,?,?,?,?)

select * from TAIKHOAN
where TENTK = ?
UPDATE HOADON SET TONGTIENTT = 1000,MASK = 1,TRANGTHAI = 1,GHICHU = '...'
WHERE MAHD = 'HD04'
UPDATE HOADON SET TONGTIENTT = ?,MASK = ?,TRANGTHAI = ?,GHICHU = ?
WHERE MAHD = ?
insert into CTHOADON values(?,?,?,?,?,?)
delete from CTHOADON where MAHD = ?
select *
from CTHOADON join SANPHAM on CTHOADON.MASP = SANPHAM.MASP
       
         select max(soSP) from SANPHAM   
		 UPDATE HOADON SET TONGTIENTT = 1000000,TRANGTHAI = 0,GHICHU = null
            WHERE MAHD = 'hd02'