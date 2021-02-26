package com.nt.filters;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyErrorFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Error filter");
		RequestContext context =RequestContext.getCurrentContext();
		Throwable t =context.getThrowable();
		System.out.println("Error is "+ t);
		
		return null;
	}

	@Override
	public String filterType() {
		
		return FilterConstants.ERROR_TYPE;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
