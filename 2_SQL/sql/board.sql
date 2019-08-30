drop table board;
drop table users;

create table users(
id varchar2(8) primary key,
password varchar2(8) not null,
name varchar2(20),
role varchar2(5) default 'user');

create table board(
seq number(5) primary key,
title varchar2(20) not null,
content varchar2(20) not null,
regdate date default sysdate,
cnt number(5) default 0,
userid varchar2(8) references users
);

insert into users (id, password, name) values(
'java01', '1234', '홍길동');

insert into users (id, password, name, role) values(
'admin', '1234', 'admin', 'admin');

insert into users (id, password, name) values(
'java02', '1234', '아무개');

commit;

insert into board (seq, title, content, userid)
values ((select nvl(max(seq), 0)+1 from board), '공지사항', '~~~', 'admin');

insert into board (seq, title, content, userid)
values ((select nvl(max(seq), 0)+1 from board), '연습용', '~~~', 'java01');

insert into board (seq, title, content, userid)
values ((select nvl(max(seq), 0)+1 from board), '연습용2', '~~~', 'java02');

insert into board (seq, title, content, userid)
values ((select nvl(max(seq), 0)+1 from board), '연습용3', '~~~', 'java01');

select count(*)
from board;

select userid, count(*)
from board
group by userid;

select to_char(regdate, 'mm') as month, count(*)
from BOARD
group by to_char(regdate, 'mm');

select u.id, b.title
from users u, board b
where u.id = b.userid
order by u.id;

select *
from users
where id = '' and password = '';



