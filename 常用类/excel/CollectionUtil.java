package com.u2licai.cms.common;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil<T> {

	public List<List<T>> divideIntoGroups(List<T> list, int groupSize) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}

		List<List<T>> groups = new ArrayList<List<T>>();

		List<T> group = null;
		int totalSize = list.size();

		for (int i = 0; i < totalSize; i++) {
			if (i % groupSize == 0) {
				group = new ArrayList<T>();
				groups.add(group);
			}
			group.add(list.get(i));
		}
		return groups;
	}
}
