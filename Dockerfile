FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=~/work/graphql/graphql/target/bank-on-me.jar

WORKDIR /opt/app

COPY ${JAR_FILE} bank-on-me.jar

CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "bank-on-me.jar"]