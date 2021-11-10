CREATE DATABASE QLNOITHAT_NHOM6
GO

--KH�CH H�NG
CREATE TABLE KHACHHANG(
MAKH VARCHAR(15),
TENKH NVARCHAR(50),
SDT VARCHAR(50),
DIACHI NVARCHAR(50),
TRANGTHAI BIT
CONSTRAINT PK_KHACHHANG PRIMARY KEY (MAKH))
-- CHI TI?T S?N PH?M
CREATE TABLE SANPHAM(
MASP int identity,
TENSP NVARCHAR(100),
SOLUONG INT,
CHATLIEU NVARCHAR(20),
DONGIA MONEY,
ANHSP NVARCHAR(50),
MOTA NVARCHAR(100),
TRANGTHAI BIT
CONSTRAINT PK_CTSANPHAM PRIMARY KEY (MASP),
)
--T�I KHO?N
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
--H�A ??N
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
--CT H�A ??N 
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
create table doanhmuc(
madm int identity,
tendm nvarchar(100),
tangthai bit
primary key (madm)
)
select * from KHACHHANG
select * from SANPHAM
select * from HOADON
select * from CTHOADON
select * from doanhmuc
insert into KHACHHANG values ('kh15',N'Nguy?n Anh D?ng','0897999565','H� N?i',1)





