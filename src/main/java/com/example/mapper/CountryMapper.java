package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.Country;
import com.example.util.Pagination;

@Mapper
public interface CountryMapper {
@Select("select count(*) from country")
	int selectTotalCount();
@Select("select* from country")	
	List<Country> selectAll();
	List<Country> selectAllWithCity();
@Select({
	"select * 						      ",
	" from country						  ",
	" offset #{firstItem}-1 rows		  ",
	" fetch next #{itemsPerPage} rows only"
})	
	List<Country> selectPage(Pagination paging);
	List<Country> selectPageWithCity(Pagination paging);
@Select("select * from country where code= #{code}")	
	Country selectByCode(String code);
	Country selectByCodeWithCity(String code);
}
