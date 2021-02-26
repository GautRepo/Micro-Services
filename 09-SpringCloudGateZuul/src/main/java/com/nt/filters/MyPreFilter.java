package com.nt.filters;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyPreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Pre filter");
		RequestContext context=RequestContext.getCurrentContext();
		HttpServletRequest req=context.getRequest();
		
		if(req.getHeader("Auth")==null) {
			
		}
		
		return null;
	}

	@Override
	public String filterType() {
		
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
