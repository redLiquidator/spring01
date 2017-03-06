select table_name from user_tables;
select * 
from emp e left outer join dept d
  on e.deptno = d.deptno;
  
  
	select c1.code as country_code,
	   c1.name as country_name,
       c1.continent as country_continent,
       c1.region as country_region,
       c1.surface_area as country_surface_area,
       c1.indep_year as country_indep_year,
       c1.population as country_population,
		c1.life_expectancy as country_life_expectancy,
		c1.gnp as country_gnp,
		c1.gnp_old as country_gnp_old,
		c1.local_name as country_code,
		c1.government_form as country_code,
		c1.head_of_state as country_code,
		c1.capital as country_code,
		c1.code2 as country_code,
  		c2.id as city_id,
	   c2.country_code as city_country_code,
	   c2.district as city_district,
	   c2.population as city_population
from country c1 left outer join city c2
on c1.code=c2.country_code
where c1.code='KOR';



_________________________________________________

//City Paging Query

select count(*) from city;

select *
from city
order by id
offset 40 rows 
fetch next 10 rows only;


