package com.ectrip.ticket.afcset.dao;

import java.util.List;

import com.ectrip.base.dao.idao.IGenericDao;
import com.ectrip.base.util.PaginationSupport;
import com.ectrip.sys.model.syspar.Esbequiptypetab;
import com.ectrip.sys.model.syspar.Syslog;

public interface IEsbequiptypetabDAO extends IGenericDao {
	/**
	 *
	 * Describe:列表显示设备类型信息
	 * @auth:lijingrui
	 * @param scenics
	 * @param pageSize
	 * @param startIndex
	 * @param url
	 * @return
	 * return:PaginationSupport
	 * Date:2011-11-01
	 */
	public PaginationSupport showListprdcontrol(String scenics,int pageSize, int startIndex, String url);

	/**
	 *
	 * Describe:添加设备类型信息
	 * @auth:lijingrui
	 * @param esbequip
	 * @param syslog
	 * return:void
	 * Date:2011-11-01
	 */
	public void insertesbequiptype(Esbequiptypetab esbequip,Syslog syslog);

	/**
	 *
	 * Describe:修改设备类型信息
	 * @auth:lijingrui
	 * @param esbequip
	 * @param syslog
	 * return:void
	 * Date:2011-11-01
	 */
	public void updateesbequiptype(Esbequiptypetab esbequip,Syslog syslog);

	/**
	 *
	 * Describe:删除设备类型信息
	 * @auth:lijingrui
	 * @param esbequip
	 * @param syslog
	 * return:void
	 * Date:2011-11-01
	 */
	public void deleteesbequiptype(Esbequiptypetab esbequip,Syslog syslog);

	/**
	 *
	 * Describe:根据ID查看设备类型信息
	 * @auth:lijingrui
	 * @param iequiptypeid
	 * @return
	 * return:Esbequiptypetab
	 * Date:2011-11-01
	 */
	public Esbequiptypetab getviewequiptype(Long iequiptypeid) throws Exception;

	/**
	 *
	 * Describe:显示登录人所在企业管理的服务商
	 * @auth:lijingrui
	 * @param scenics
	 * @return
	 * return:List
	 * Date:2011-11-01
	 */
	public List getListscenicar(String scenics);
}
