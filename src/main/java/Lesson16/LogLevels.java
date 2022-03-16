package Lesson16;

public enum LogLevels {

    ERROR("Ошибка!"),
    WARN("Предупреждение!"),
    INFO("Информационное сообщение."),
    DEBUG("Отладка."),
    TRACE("Трассировка");

    String message;

    LogLevels(String message) {
        this.message = message;
    }
}
