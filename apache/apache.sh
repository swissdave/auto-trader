#!/bin/bash
docker run --rm -detach  \
  --name apache \
  --user 1000:1000 \
  -p 8090:8090 \
  -v /home/david/apache/httpd.conf:/usr/local/apache2/conf/httpd.conf \
  -v /home/david/apache/logs:/usr/local/apache2/logs \
httpd:2.4
