/*
 * Copyright 2018-present yangguo@outlook.com
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
package info.yangguo.waf;

import io.netty.util.AsciiString;

public class WafHttpHeaderNames {
    public static final AsciiString X_REAL_IP = AsciiString.cached("x-real-ip");
    public static final AsciiString X_WAF_ROUTE = AsciiString.cached("x-waf-route");
    public static final AsciiString X_FORWARDED_FOR = AsciiString.cached("X-Forwarded-For");
}
