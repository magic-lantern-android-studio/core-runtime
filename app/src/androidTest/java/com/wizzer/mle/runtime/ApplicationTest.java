package com.wizzer.mle.runtime;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Log;

import com.wizzer.mle.runtime.unittest.EventDispatcherTest;
import com.wizzer.mle.runtime.unittest.HeapsortTest;
import com.wizzer.mle.runtime.unittest.InputStreamTest;
import com.wizzer.mle.runtime.unittest.PQTest;
import com.wizzer.mle.runtime.unittest.ResourceManagerTest;
import com.wizzer.mle.runtime.unittest.SchedulerTest;

import junit.framework.TestCase;
import junit.framework.TestResult;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    /** Debug string for logging output. */
    static final public String DEBUG_TAG = "ML-RTE Test";

    @SmallTest
    public void testHeapsort() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Heapsort Test ***");
        TestCase heapsortTest = new HeapsortTest("Heapsort Test")
        {
            public void runTest()
            {
                testHeapsort();
            }
        };
        TestResult result = heapsortTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Heapsort Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, "Heapsort Test UNSUCCESSFUL");
    }

    @SmallTest
    public void testScheduler() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Scheduler Test ***");
        TestCase schedulerTest = new SchedulerTest("Scheduler Test")
        {
            public void runTest()
            {
                testScheduler();
            }
        };
        TestResult result = schedulerTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Scheduler Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, "Scheduler Test UNSUCCESSFUL");
    }

    @SmallTest
    public void testDispatchManager() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Event Dispatcher Test ***");
        TestCase dispatcherTest = new EventDispatcherTest("Event Dispatcher Test")
        {
            public void runTest()
            {
                testImmediateMode();
                testDelayedMode();
                testDisableEventCB();
                testDisableEvent();
                testFlush();
                testPrioritizedCB();
            }
        };
        TestResult result = dispatcherTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Event Dispatcher Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, "Event Dispatcher Test UNSUCCESSFUL");
    }

    @SmallTest
    public void testPriorityQueue() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Priority Queue Test ***");
        TestCase pqTest = new PQTest("Priority Queue Test")
        {
            public void runTest()
            {
                testInsertionRemoval();
                testQueueGrowth();
                testClear();
                testDestroyItem();
                testRemove();
                testJoin();
                testChangeItem();
                testDestroy();
            }
        };
        TestResult result = pqTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Priority Queue Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, " Priority Queue Test UNSUCCESSFUL");
    }

    @SmallTest
    public void testResourceManager() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Resource Manager Test ***");
        TestCase resourceMgrTest = new ResourceManagerTest("Resource Manager Test")
        {
            public void runTest()
            {
                testGetResourceId();
            }
        };
        TestResult result = resourceMgrTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Resource Manager Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, "Resource Manager Test UNSUCCESSFUL");
    }

    @SmallTest
    public void testInputStream() throws Exception {
        Log.i(ApplicationTest.DEBUG_TAG, "*** Input Stream Test ***");
        TestCase InputStreamTest = new InputStreamTest("Input Stream Test")
        {
            public void runTest()
            {
                testInputStream();
            }
        };
        TestResult result = InputStreamTest.run();
        if (result.wasSuccessful())
            Log.i(ApplicationTest.DEBUG_TAG, "Input Stream Test SUCCESSFUL");
        else
            Log.i(ApplicationTest.DEBUG_TAG, "Input Stream Test UNSUCCESSFUL");

    }
}
