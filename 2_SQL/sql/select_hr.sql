select * from DEPARTMENTS;

select count(*) as count, e1.employee_id, e1.last_name
from employees e1, employees e2
where e1.employee_id = e2.manager_id
group by e1.employee_id, e1.last_name
having count(*) >= 8
order by count;

select e.employee_id, e.first_name, e.salary 
from employees e, jobs j 
where e.job_id = j.job_id 
and (j.job_title = 'Accountant' or j.job_title = 'President');

select job_title
from jobs;