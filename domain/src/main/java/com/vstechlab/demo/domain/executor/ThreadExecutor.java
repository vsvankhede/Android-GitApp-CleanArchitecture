package com.vstechlab.demo.domain.executor;

import java.util.concurrent.Executor;

/**
 * Executor implementation can be based on different frameworks or techniques of asynchronous
 * execution, but every implementation will execute the
 * {@link com.vstechlab.demo.domain.interactor.UseCase} out of UI thread.
 */
public interface ThreadExecutor extends Executor{
}
