
FROM openjdk:17
RUN mkdir /app

COPY . .
WORKDIR /app
CMD ["java", "/src/testdocker1/TestDocker1.java"]
