package com.poja.bigsum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.bigsum.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
