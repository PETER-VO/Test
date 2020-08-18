package com.laptrinhjavaweb.paging;

import com.laptrinhjavweb.sort.Sorter;

public interface Pageable {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
