package com.nt.filters;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyRoughtFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Route filter");
		
		RequestContext context =RequestContext.getCurrentContext();
		HttpServletRequest req=context.getRequest();
		HttpServletResponse res=context.getResponse();
		
		if(req.getContentLength()>0 && req.getContentType().equals(res.getContentType())) {
			
		}
		
		return null;
	}

	@Override
	public String filterType() {
		
		return FilterConstants.ROUTE_TYPE;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
