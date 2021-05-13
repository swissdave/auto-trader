#!/bin/bash
THIS=`readlink -f $0`
DIR=`dirname $THIS`
LOGS=/tmp/apache/logs
mkdir -p $LOGS

docker run --rm --detach  \
  --name apache \
  -p 8090:8090 \
  -v $DIR/httpd.conf:/usr/local/apache2/conf/httpd.conf \
httpd:2.4

#  -e 'APACHE_RUN_USER=#1000' \
#   -e 'APACHE_RUN_GROUP=#1000' \
#   -v $LOGS:/usr/local/apache2/logs \

#  --user 1000:1000 \

