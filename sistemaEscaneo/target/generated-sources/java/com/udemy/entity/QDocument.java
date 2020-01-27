package com.udemy.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDocument is a Querydsl query type for Document
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDocument extends EntityPathBase<Document> {

    private static final long serialVersionUID = 1751780397L;

    public static final QDocument document = new QDocument("document");

    public final NumberPath<Integer> anaquel = createNumber("anaquel", Integer.class);

    public final StringPath codigoDoc = createString("codigoDoc");

    public final NumberPath<Integer> columna = createNumber("columna", Integer.class);

    public final StringPath fecha = createString("fecha");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Float> monto = createNumber("monto", Float.class);

    public final StringPath proveedor = createString("proveedor");

    public final StringPath solicitante = createString("solicitante");

    public final StringPath tema = createString("tema");

    public final StringPath tipo = createString("tipo");

    public QDocument(String variable) {
        super(Document.class, forVariable(variable));
    }

    public QDocument(Path<? extends Document> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDocument(PathMetadata metadata) {
        super(Document.class, metadata);
    }

}

