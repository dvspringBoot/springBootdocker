FROM java:8
COPY JavaAutoBuild.java JavaAutoBuild.java
RUN javac JavaAutoBuild.java

CMD ["java", "JavaAutoBuild"]
