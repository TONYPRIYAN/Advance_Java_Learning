package com.example.rest.webservices.rest_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController 
{
	@GetMapping("/filtering")
	public MappingJacksonValue filtering()
	{
		SomeBean sb = new SomeBean("v1","v2","v3");
		MappingJacksonValue mp = new MappingJacksonValue(sb);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1");
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("SomeBeanFilter", filter );
		mp.setFilters(filters );
		return mp;
	}
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue filteringList()
	{
		 
				
		List<SomeBean> list = Arrays.asList(new SomeBean("v1","v2","v3"),
				new SomeBean("v4","v5","v6"));
		
		MappingJacksonValue mp = new MappingJacksonValue(list);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		FilterProvider filters = new SimpleFilterProvider()
				.addFilter("SomeBeanFilter", filter );
		mp.setFilters(filters);
		
		return mp;
		

				
	}
	
	

}
