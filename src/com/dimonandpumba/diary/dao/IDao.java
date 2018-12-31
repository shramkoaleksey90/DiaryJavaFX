package com.dimonandpumba.diary.dao;


import javax.annotation.Nonnull;

public interface IDao<T> {
    void add(@Nonnull T record);

    void update(@Nonnull T record);

    void delete(@Nonnull T record);
}
