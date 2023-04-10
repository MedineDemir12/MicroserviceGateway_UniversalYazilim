package com.universal_yazilim.bid.ysm.gateway_app.model.servis;


import java.util.List;

public interface EntityService<E, I>
{
    List<E> getAll();

    E save(E entity);

    void deleteByID(I id);
}

