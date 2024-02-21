// Copyright 2023 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
///////////////////////////////////////////////////////////////////////////
import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import feign.template.UriUtils;

// Generated with https://github.com/ossf/fuzz-introspector/tree/main/tools/auto-fuzz
// Heuristic name: jvm-autofuzz-heuristics-1
// Target method: [feign.template.UriUtils] public static java.lang.String
// encode(java.lang.String,boolean)
public class UriUtilsFuzzer {
  public static void fuzzerTestOneInput(FuzzedDataProvider data) {
    Boolean value = data.consumeBoolean();
    UriUtils.encode(data.consumeRemainingAsString(), value);
  }
}
