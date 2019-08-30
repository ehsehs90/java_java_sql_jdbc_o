select * from v3 where id in (select fid from friend where id='111');

select * from v3;

select * from userlist where id='test15';

select * from userlist where id='01066100584';

select * from friend where id='111';

select * from userlist where id=333 and pw=1q2w3e4r;

select * from v3 where id in (select fid from friend where id='333');

delete from friend where id='333' and fid='01066100584';

select * from mailbox;

insert into mailbox(num, id, fid, why, msg) values((select nvl(max(num),0)+1 from mailbox), '333', '01066100584', 'f', null);

delete from mailbox;

(select nvl(max(num),0)+1 from mailbox)

delete from userlist where id='01066100584';

select * from checkbox where id='333';

select * from checkbox;

delete from checkbox where id='01066100584';

select * from mailbox order by wtime desc;



insert into checkbox(id, why, stime, etime, ppnum, nownum, color, msg) values('01066100584', '#'||(select name from userlist where id='0106610084')||'안양#치킨', to_date('1992-12-25 12:30:00', 'yyyy-mm-dd hh:mi:ss'), to_date('1992-12-25 12:30:00', 'yyyy-mm-dd hh:mi:ss'), 2, 0, '1', 'abcabc');

update checkbox set why='bb', stime=to_date('1992-12-25 12:30:00', 'yyyy-mm-dd hh:mi:ss'), etime=to_date('1992-12-25 12:30:00', 'yyyy-mm-dd hh:mi:ss'), ppnum=2, nownum=0, color='0', msg='aa' where id='01066100584';

delete from mailbox where req='n';

delete from checkbox where color='0';

select num, img, name, m.id as id, fid, req, msg, wtime from userlist u, mailbox m where u.id=m.id;

create view mv3 as select num, img, name, m.id as id, fid, req, msg, wtime from userlist u, mailbox m where u.id=m.fid;

select * from mv3;

drop view mv3;

select * from mv3 where id='01066100584' order by wtime desc
