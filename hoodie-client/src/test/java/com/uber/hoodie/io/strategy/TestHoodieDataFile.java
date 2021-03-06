/*
 *  Copyright (c) 2016 Uber Technologies, Inc. (hoodie-dev-group@uber.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.uber.hoodie.io.strategy;

import com.uber.hoodie.common.model.HoodieDataFile;
import java.util.UUID;

public class TestHoodieDataFile extends HoodieDataFile {

  private final long size;

  public TestHoodieDataFile(long size) {
    super(null);
    this.size = size;
  }

  public static HoodieDataFile newDataFile(long size) {
    return new TestHoodieDataFile(size);
  }

  @Override
  public String getPath() {
    return "/tmp/test";
  }

  @Override
  public String getFileId() {
    return UUID.randomUUID().toString();
  }

  @Override
  public String getCommitTime() {
    return "100";
  }

  @Override
  public long getFileSize() {
    return size;
  }
}
