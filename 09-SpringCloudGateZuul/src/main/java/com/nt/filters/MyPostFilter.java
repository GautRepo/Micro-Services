package com.nt.filters;

import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyPostFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("Post filter");
		
		RequestContext context =RequestContext.getCurrentContext();
		HttpServletResponse res =context.getResponse();
		
		if(res.getContentType().equals("application/json")) {
			
		}
		
		return null;
	}

	@Override
	public String filterType() {
		
		return FilterConstants.POST_TYPE;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
