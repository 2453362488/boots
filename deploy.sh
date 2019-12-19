#!/usr/bin/env bash
#����+����orderվ��

#��Ҫ�������²���
# ��Ŀ·��, ��Execute Shell��������Ŀ·��, pwd �Ϳ��Ի�ø���Ŀ·��
# export PROJ_PATH=���jenkins�����ڲ�������ϵ�·��

# ������Ļ�����tomcat��ȫ·��
# export TOMCAT_APP_PATH=tomcat�ڲ�������ϵ�·��

### base ����
killTomcat()
{
    pid=`ps -ef|grep tomcat|grep java|awk '{print $2}'`
    echo "tomcat Id list :$pid"
    if [ "$pid" = "" ]
    then
      echo "no tomcat pid alive"
    else
      kill -9 $pid
    fi
}
cd $PROJ_PATH/order
mvn clean install

# ͣtomcat
killTomcat

# ��������
java -jar target/boots-0.0.1-SNAPSHOT.jar