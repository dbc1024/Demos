package com.ectrip.ec.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ectrip.base.service.GenericService;
import com.ectrip.ec.model.order.MOrder;
import com.ectrip.ec.order.dao.idao.IYOrderDAO;
import com.ectrip.ec.order.service.iservice.IMOrderService;
@Service
public class MOrderServiceImpl extends GenericService implements IMOrderService{
	@Autowired
	private IYOrderDAO yOrderDAO;
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,isolation=Isolation.READ_COMMITTED,rollbackFor=Exception.class)
	public void updateMOrder(MOrder mOrder) {
		yOrderDAO.update(mOrder);
		
	}

}
