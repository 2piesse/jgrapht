/*
 * (C) Copyright 2015-2016, by Fabian Späh and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht.alg.isomorphism;

import java.util.*;

import org.jgrapht.*;


/**
 * This is a general interface for graph and subgraph isomorphism.
 *
 * @param <V> the type of the vertices
 * @param <E> the type of the edges
 */
public interface IsomorphismInspector<V, E>
{
    Iterator<GraphMapping<V, E>> getMappings();

    boolean isomorphismExists();
}

// End IsomorphismInspector.java
