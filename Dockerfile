FROM openjdk:latest
WORKDIR /app
COPY . /app
RUN javac Sample.java
CMD ["java","Sample"]