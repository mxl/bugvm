/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 8.0.
 */
@Deprecated
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIRemoteNotificationType/*</name>*/ extends Bits</*<name>*/UIRemoteNotificationType/*</name>*/> {
    /*<values>*/
    public static final UIRemoteNotificationType None = new UIRemoteNotificationType(0L);
    public static final UIRemoteNotificationType Badge = new UIRemoteNotificationType(1L);
    public static final UIRemoteNotificationType Sound = new UIRemoteNotificationType(2L);
    public static final UIRemoteNotificationType Alert = new UIRemoteNotificationType(4L);
    public static final UIRemoteNotificationType NewsstandContentAvailability = new UIRemoteNotificationType(8L);
    /*</values>*/

    private static final /*<name>*/UIRemoteNotificationType/*</name>*/[] values = _values(/*<name>*/UIRemoteNotificationType/*</name>*/.class);

    public /*<name>*/UIRemoteNotificationType/*</name>*/(long value) { super(value); }
    private /*<name>*/UIRemoteNotificationType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIRemoteNotificationType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIRemoteNotificationType/*</name>*/(value, mask);
    }
    protected /*<name>*/UIRemoteNotificationType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIRemoteNotificationType/*</name>*/[] values() {
        return values.clone();
    }
}