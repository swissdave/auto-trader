#!/bin/bash
THIS=`readlink -f $0`
DIR=`dirname $THIS`
LOGS=/tmp/apache/logs
mkdir -p $LOGS

docker run --rm --detach  \
  --name apache \
  --user 1000:1000 \
  -p 8090:8090 \
  -v $DIR/httpd.conf:/usr/local/apache2/conf/httpd.conf \
  -v $LOGS:/usr/local/apache2/logs \
httpd:2.4
