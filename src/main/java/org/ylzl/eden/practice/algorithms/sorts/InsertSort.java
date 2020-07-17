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

package org.ylzl.eden.practice.algorithms.sorts;

/**
 * 插入排序
 *
 * @author gyl
 * @since 2.0.0
 */
public class InsertSort extends AbstractSort {

  public static void main(String[] args) {
    int[] unsorted = {9, 6, 2, 7, 5, 1, 3, 4, 8, 0};
    // 9, 6, 2, 7, 5, 1, 3, 4, 8, 0
		// 6, 9, 2, 7, 5, 1, 3, 4, 8, 0
		// 2, 6, 9, 7, 5, 1, 3, 4, 8, 0
    int len = unsorted.length;
    for (int i = 0; i < len; i++) {
    	int j = i;
			int target = unsorted[j]; // target = 9, target = 6,
    	while (j > 0 && target < unsorted[j - 1]) { // target = 6 < unsorted[0] = 9
				unsorted[j] = unsorted[j - 1]; // unsorted[1] = 9
    		j--;
			}
    	unsorted[j] = target; // unsorted[0] = 6, j 是经过 j-- 的
		}
    print(unsorted);
  }
}
