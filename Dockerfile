FROM csbase.registry.cmbchina.cn/paas/cmb-tomcat-9.0.14:latest
USER root
COPY  target/FA83.3710045_zzdwc_backend.war /opt/apache-tomcat-9.0.14/webapps
USER 1001
EXPOSE 8080
CMD ["sh","/opt/apache-tomcat-9.0.14/bin/catalina.sh","run"]