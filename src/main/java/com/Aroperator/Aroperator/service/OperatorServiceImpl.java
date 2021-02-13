package com.Aroperator.Aroperator.service;

import org.springframework.stereotype.Service;

@Service
public class OperatorServiceImpl implements OperatorService {

	public OperatorServiceImpl() {
	}

	@Override
	public Long sum(Long v1, Long v2) {
		Long sum = v1 - v2;
		return sum;
	}
	@Override
	public Long multi(Long s1, Long s2) {
		Long multi = s1 * s2;
		return multi;
	}
	@Override
	public Long div(Long d1, Long d2) {
		Long div = d1 / d2;
		return div;
	}
	
	}

