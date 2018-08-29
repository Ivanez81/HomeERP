package ru.geekbrains.erp.back.patterns.orm.datamapper.user;

public class DataMapperException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DataMapperException(final String message) {
        super(message);
    }
}
