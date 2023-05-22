/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qkmall.common;

public class Neighbor<F, S> {
    private final F current;
    private final S next;

    public S getNext() {
        return next;
    }

    public F getCurrent() {
        return current;
    }

    public Neighbor(F current, S next) {
        this.current = current;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Neighbor)) {
            return false;
        }
        Neighbor<?, ?> p = (Neighbor<?, ?>) o;
        return p.current.equals(this.current) && p.next.equals(this.next);
    }

    @Override
    public int hashCode() {
        return (this.current == null ? 0 : this.current.hashCode()) ^ (this.next == null ? 0 : this.next.hashCode());
    }

    public static <A, B> Neighbor<A, B> create(A a, B b) {
        return new Neighbor<A, B>(a, b);
    }

    public static Neighbor<String, String> split(String pair, String splitChar) {
        String[] p = pair.split(splitChar);
        if (p.length > 1) {
            return new Neighbor<String, String>(p[0], p[1]);
        }
        return new Neighbor<String, String>(p[0], "");
    }
}