/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ylzl.eden.practice.collections.list;

import org.ylzl.eden.practice.collections.iterator.AbstractCollection;
import org.ylzl.eden.practice.collections.iterator.Collection;
import org.ylzl.eden.practice.collections.iterator.Iterator;

/**
 * 抽象 List
 *
 * @author gyl
 * @since 2.0.0
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {

	abstract public E get(int index);

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public void add(int index, E element) {

	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}
}
