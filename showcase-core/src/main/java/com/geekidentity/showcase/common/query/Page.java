package com.geekidentity.showcase.common.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页对象. 包含数据及分页信息.
 * @author geekidentity
 * @date 2017年2月25日
 * @version 1.0
 *
 * @param <T>
 */
public class Page<T> implements java.io.Serializable {
	private static final long serialVersionUID = 2442779466291470277L;
	public static final int DEFAULT_PAGE_SIZE = 20;
	public static final int MIN_PAGE_SIZE = 1;
	public static final int MAX_PAGE_SIZE = 100;

	/**
	 * 当前页第一条数据的位置,从0开始
	 */
	private int start;

	/**
	 * 当前页码
	 */
	private int currentPageNo;

	/**
	 * 每页的记录数
	 */
	private int pageSize = 15;

	/**
	 * 当前页中存放的记录
	 */
	private List<T> data;

	/**
	 * 总记录数
	 */
	private int totalCount;

	/**
	 * 构造方法，只构造空页
	 */
	public Page() {
		this(0, 0, 15, new ArrayList<T>());
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * 默认构造方法
	 * 
	 * @param start
	 *            本页数据在数据库中的起始位置
	 * @param totalSize
	 *            数据库中总记录条数
	 * @param pageSize
	 *            本页容量
	 * @param data
	 *            本页包含的数据
	 */
	public Page(int start, int totalSize, int pageSize, List<T> data) {
		this.pageSize = pageSize;
		this.start = start;
		this.totalCount = totalSize;
		this.data = data;
	}

	/**
	 * 默认构造方法
	 * 
	 * @param start
	 *            本页数据在数据库中的起始位置
	 * @param totalSize
	 *            数据库中总记录条数
	 * @param pageSize
	 *            本页容量
	 * @param data
	 *            本页包含的数据
	 */
	public Page(List<T> list) {
		if (list != null) {
			this.pageSize = 0;
			this.start = 0;
			this.totalCount = list.size();
			this.data = list;
		}
	}

	/**
	 * 取数据库中包含的总记录数
	 */
	public long getTotalCount() {
		return this.totalCount;
	}

	/**
	 * 设置数据库中包含的总记录数
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * 取总页数。
	 */
	public int getTotalPageCount() {
		if (totalCount == 0) {
			return 0;
		} else {
			return ((totalCount - 1) / pageSize) + 1;
		}
	}

	/**
	 * 取每页数据容量
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 当前页中的记录
	 */
	public List<T> getResult() {
		return data;
	}

	/**
	 * 取当前页码,页码从1开始
	 */
	public int getCurrentPageNo() {
		if (start == 0) {
			currentPageNo = 1;
		} else {
			int curPage = (start / pageSize) + 1;
			if (curPage > this.getTotalPageCount()) {
				curPage = this.getTotalPageCount();
			}
			currentPageNo = curPage;
		}
		return currentPageNo;
	}

	/**
	 * 是否有下一页
	 */
	public boolean hasNextPage() {
		return (this.getCurrentPageNo() < this.getTotalPageCount());
	}

	/**
	 * 是否有上一页
	 */
	public boolean hasPreviousPage() {
		return (this.getCurrentPageNo() > 1);
	}

	public List<T> getData() {
		return data;
	}

}
