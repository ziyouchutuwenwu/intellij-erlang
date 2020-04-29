/*
 * Copyright 2012-2014 Sergey Ignatov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.intellij.erlang.debugger.node;

import com.ericsson.otp.erlang.OtpErlangList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class ErlangTraceElement {
  private final Integer myStackPointer;
  private final String myModule;
  private final String myFunction;
  private final OtpErlangList myFunctionArgs;
  private final Collection<ErlangVariableBinding> myBindings;
  private final int myLine;

  public ErlangTraceElement(@Nullable Integer stackPointer,
                            @NotNull String module,
                            @NotNull String function,
                            @NotNull OtpErlangList functionArgs,
                            @NotNull Collection<ErlangVariableBinding> bindings,
                            @NotNull Integer line) {
    myStackPointer = stackPointer;
    myModule = module;
    myFunction = function;
    myFunctionArgs = functionArgs;
    myBindings = bindings;
    myLine = line;
  }

  @Nullable
  public Integer getStackPointer() { return myStackPointer; }

  @NotNull
  public String getModule() {
    return myModule;
  }

  @NotNull
  public String getFunction() {
    return myFunction;
  }

  @NotNull
  public OtpErlangList getFunctionArgs() {
    return myFunctionArgs;
  }

  @NotNull
  public Collection<ErlangVariableBinding> getBindings() {
    return myBindings;
  }

  public int getLine() {
    return myLine;
  }
}