﻿CREATE DATABASE QLNOITHAT_NHOM6
GO

--KHÁCH HÀNG
CREATE TABLE KHACHHANG(
MAKH VARCHAR(15),
TENKH NVARCHAR(50),
SDT VARCHAR(50),
DIACHI NVARCHAR(50),
TRANGTHAI BIT
CONSTRAINT PK_KHACHHANG PRIMARY KEY (MAKH))
--DOANH MỤC
create table doanhmuc(
madm int identity,
tendm nvarchar(100),
tangthai bit
primary key (madm)
)
-- CHI TI?T S?N PH?M
CREATE TABLE SANPHAM(
MASP int identity,
TENSP NVARCHAR(100),
SOLUONG INT,
CHATLIEU NVARCHAR(20),
DONGIA MONEY,
MADM INT,
ANHSP NVARCHAR(50),
MOTA NVARCHAR(100),
TRANGTHAI BIT
CONSTRAINT PK_CTSANPHAM PRIMARY KEY (MASP),
foreign key(MADM) references DOANHMUC,

)
--TÀI KHO?N
CREATE TABLE TAIKHOAN(
TENTK VARCHAR(15),
MATKHAU NVARCHAR(20),
HOTEN NVARCHAR(50),
VAITRO BIT,
TRANGTHAI BIT,
PRIMARY KEY (TENTK))
--S? KI?N
CREATE TABLE SUKIEN(
MASK int identity,
TENSK NVARCHAR(50),
UUDAI FLOAT,
TGBATDAU DATE,
TGKETTHIC DATE,
TRANGTHAI BIT
PRIMARY KEY (MASK)
)
--HÓA ??N
CREATE TABLE HOADON (
MAHD VARCHAR(15),
MASP int,
MAKH VARCHAR(15),
TENTK VARCHAR(15),
MASK int,
UUDAI FLOAT,
TONGTIENTT MONEY,
TRANGTHAI BIT
PRIMARY KEY (MAHD),
foreign key(MASP) references SANPHAM,
foreign key(MAKH) references KHACHHANG,
foreign key(TENTK) references TAIKHOAN,
foreign key(MASK) references SUKIEN)
--CT HÓA ??N 
CREATE TABLE CTHOADON(
MAHD VARCHAR(15),
MACTSP int,
TENSP NVARCHAR(50),
SOLUONG INT,
DONGIA MONEY,
THANHTIEN MONEY,
TRANGTHAI BIT
foreign key(MAHD) references HOADON,
FOREIGN KEY (MACTSP) REFERENCES SANPHAM)
--doanh m?c

select * from KHACHHANG
select * from SANPHAM
select * from HOADON
select * from CTHOADON
select * from doanhmuc
insert into KHACHHANG values ('kh15',N'Nguy?n Anh D?ng','0897999565','Hà N?i',1)
insert into KHACHHANG values ('kh16',N'Phạm Anh Tú','0897999555','Hà N?i',1)
insert into KHACHHANG values ('kh17',N'Nguyễn Trung Kiên','0897977775','Hà N?i',0)
insert into doanhmuc values (N'Bàn',1)
insert into doanhmuc values (N'Ghế',1)
insert into doanhmuc values (N'Gương',1)
insert into SANPHAM values (N'Bàn trạm hình rồng',5,N'Gỗ',6500000,1,'Ban Hinh Rong.jpg',N'Bàn đẹp hình Rồng uốn lượn',1)
insert into SANPHAM values (N'Ghế trạm hình rồng',3,N'Gỗ',4500000,2,'Ghe Hinh Rong.jpg',N'Ghế đẹp hình Rồng uốn lượn',1)
insert into SANPHAM values (N'Gương trạm hình rồng',2,N'Gỗ',2500000,3,'Guong Hinh Rong.jpg',N'Gương đẹp hình Rồng uốn lượn',1)
insert into TAIKHOAN values ('adminkien','123',N'Nguyễn Trung Kiên',0,1)
insert into TAIKHOAN values ('admintu','123',N'Phạm Anh Tú',0,0)
insert into TAIKHOAN values ('adminduc','123',N'Đào Văn Đức',1,1)
insert into SUKIEN values (N'KHUYẾN MÃI',20,GETDATE(),NULL,1)
insert into SUKIEN values (N'KHUYẾN MÃI 30%',30,GETDATE(),NULL,1)
insert into SUKIEN values (N'KHUYẾN MÃI 40%',40,GETDATE(),NULL,1)






