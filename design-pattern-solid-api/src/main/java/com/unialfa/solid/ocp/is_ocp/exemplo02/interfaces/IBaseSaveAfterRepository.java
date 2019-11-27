package com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces;

public interface IBaseSaveAfterRepository<T> {

    void onSaveAfter(T t);
}
