<h1>Spring Cloud Stream Kafka</h1>

1. Версия Zookeeper: `apache-zookeeper-3.7.0`
2. Версия Kafka: `kafka_2.12-2.6.0`
3. Остановка zookeeper-server: 

   `kafka_2.12-2.6.0\bin\windows\zookeeper-server-stop.bat`
4. Запуск zookeeper-server: 

   `start kafka_2.12-2.6.0\bin\windows\zookeeper-server-start.bat kafka_2.12-2.6.0\config\zookeeper.properties`
   
5. Если сервер zookeeper стартовал успешно, то запустить kafka:

   `start kafka_2.12-2.6.0\bin\windows\kafka-server-start.bat kafka_2.12-2.6.0\config\server.properties`
   
6. Название топика указано в application.yaml и в URL GET-запроса. В данном случае: `greetings-2`. Топик предварительно создавать не обязательно, т.к. создаётся автоматически при 
запуске приложения.

7. Отправка сообщения: http://localhost:8080/greetings-2?message=hello

Проверка работоспособности через консоль: https://kafka.apache.org/quickstart

Сделано на основе гайда: https://www.javacodegeeks.com/2018/03/spring-cloud-stream-kafka.html

Установка, настройка и запуск Zookeeper и Kafka: https://habr.com/ru/post/496182/
