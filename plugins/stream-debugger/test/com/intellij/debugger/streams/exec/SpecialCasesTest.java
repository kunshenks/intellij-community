// Copyright 2000-2025 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.debugger.streams.exec;

import com.intellij.debugger.streams.test.TraceExecutionTestCase;

/**
 * @author Vitaliy.Bibaev
 */
public class SpecialCasesTest extends TraceExecutionTestCase {
  public void testSortedSignedDoubleZeros() {
    doTest(false);
  }

  public void testExceptionAsStreamResult() {
    doTest(false);
  }

  public void testShortCircuitingAfterSorted() {
    doTest(false);
  }

  public void testParallelStream() {
    doTest(false);
  }

  public void testNulls() {
    doTest(false);
  }

  public void testMapToNull() {
    doTest(false);
  }

  public void testMapNullToValue() {
    doTest(false);
  }

  // https://youtrack.jetbrains.com/issue/IDEA-178008
  public void testToCollection() {
    doTest(false);
  }
}
