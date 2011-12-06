package org.cloudcoder.submitsvc.oop.builder;

import java.util.List;

import org.cloudcoder.app.shared.model.Problem;
import org.cloudcoder.app.shared.model.TestCase;
import org.cloudcoder.app.shared.model.TestResult;

public class CTester implements ITester
{

    @Override
    public List<TestResult> testSubmission(Problem problem,
            List<TestCase> testCaseList, String programText)
    {
        throw new IllegalStateException("C not yet implemented");
    }

}
