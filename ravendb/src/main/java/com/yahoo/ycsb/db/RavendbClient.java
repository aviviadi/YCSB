/**
 * Copyright (c) 2013 - 2016 YCSB contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */

package com.yahoo.ycsb.db;

import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.Status;

import java.util.HashMap;
import java.util.Set;
import java.util.Vector;


/**
 * A class that wraps the CouchbaseClient to allow it to be interfaced with YCSB.
 * This class extends {@link DB} and implements the database interface used by YCSB client.
 */
public class RavendbClient extends DB {


  @Override
  public Status read(String s, String s1, Set<String> set, HashMap<String, ByteIterator> hashMap) {
    System.out.println("Yehhii");
    return Status.OK;
  }

  @Override
  public Status scan(String s, String s1, int i, Set<String> set, Vector<HashMap<String, ByteIterator>> vector) {
    System.out.println("Yehhii1");
    return null;
  }

  @Override
  public Status update(String s, String s1, HashMap<String, ByteIterator> hashMap) {
    System.out.println("Yehhii2");
    return null;
  }

  @Override
  public Status insert(String s, String s1, HashMap<String, ByteIterator> hashMap) {
    System.out.println("Yehhii3");
    return null;
  }

  @Override
  public Status delete(String s, String s1) {
    System.out.println("Yehhii4");
    return null;
  }
}
