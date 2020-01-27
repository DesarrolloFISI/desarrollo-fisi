package com.udemy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFoto is a Querydsl query type for Foto
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFoto extends EntityPathBase<Foto> {

    private static final long serialVersionUID = 858366230L;

    public static final QFoto foto = new QFoto("foto");

    public final StringPath codigoDoc = createString("codigoDoc");

    public final StringPath file = createString("file");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath nombre = createString("nombre");

    public QFoto(String variable) {
        super(Foto.class, forVariable(variable));
    }

    public QFoto(Path<? extends Foto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFoto(PathMetadata metadata) {
        super(Foto.class, metadata);
    }

}

