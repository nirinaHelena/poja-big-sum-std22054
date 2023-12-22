package com.poja.bigsum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.bigsum.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
