/*****************************************************************************
 ** Copyright (c) 2010 - 2012 Ushahidi Inc
 ** All rights reserved
 ** Contact: team@ushahidi.com
 ** Website: http://www.ushahidi.com
 **
 ** GNU Lesser General Public License Usage
 ** This file may be used under the terms of the GNU Lesser
 ** General Public License version 3 as published by the Free Software
 ** Foundation and appearing in the file LICENSE.LGPL included in the
 ** packaging of this file. Please review the following information to
 ** ensure the GNU Lesser General Public License version 3 requirements
 ** will be met: http://www.gnu.org/licenses/lgpl.html.
 **
 **
 ** If you have questions regarding the use of this file, please contact
 ** Ushahidi developers at team@ushahidi.com.
 **
 *****************************************************************************/
package com.ushahidi.java.sdk.api.tasks;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ushahidi.java.sdk.api.Incident;

/**
 * The report task test
 * 
 * @author eyedol
 * 
 */
public class ReportTaskTest extends BaseTaskTest {

	private ReportsTask task;

	private static final int SINCE_ID = 1;

	private static final int MAX_ID = 1;

	private static final int REPORT_ID = 1;

	private static final int LOCATION_ID = 2;

	private static final int CATEGORY_ID = 1;

	private static final String LOCATION_NAME = "accra";

	private static final String CATEGORY_NAME = "Category 1";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		task = factory.createReportsTask();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
		task = null;
	}

	/**
	 * Test method for {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#all()}
	 * .
	 */
	@Test
	public void testAll() {
		List<Incident> reports = task.all();
		assertNotNullOrEmpty("List report all cannot be null or empty", reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#sinceId(int)}.
	 */
	@Test
	public void testSinceId() {
		List<Incident> reports = task.sinceId(SINCE_ID);
		assertNotNullOrEmpty("Reports by since id cannot be null or empty",
				reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#maxId(int)}.
	 */
	@Test
	public void testMaxId() {
		List<Incident> reports = task.maxId(MAX_ID);
		assertNotNullOrEmpty("Reports by max id cannot be null or empty",
				reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#reportId(int)}.
	 */
	@Test
	public void testReportId() {
		Incident report = task.reportId(REPORT_ID);
		assertNotNull("Report by id cannot be null or empty", report);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#locationName(java.lang.String)}
	 * .
	 */
	@Test
	public void testLocationName() {
		List<Incident> reports = task.locationName(LOCATION_NAME);
		assertNotNullOrEmpty("Report by location name", reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#locationId(int)}.
	 */
	@Test
	public void testLocationId() {
		List<Incident> reports = task.locationId(LOCATION_ID);
		assertNotNullOrEmpty("Reports by location ID", reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#categoryName(java.lang.String)}
	 * .
	 */
	@Test
	public void testCategoryName() {
		List<Incident> reports = task.categoryName(CATEGORY_NAME);
		assertNotNullOrEmpty("Report by category name cannot be null or empty",
				reports);
	}

	/**
	 * Test method for
	 * {@link com.ushahidi.java.sdk.api.tasks.ReportsTask#categoryId(int)}.
	 */
	@Test
	public void testCategoryId() {
		List<Incident> reports = task.categoryId(CATEGORY_ID);
		assertNotNullOrEmpty("Report by category ID", reports);
	}

}
