package org.everit.phonenumber.api.exceptions;

/*
 * Copyright (c) 2011, Everit Kft.
 *
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

/**
 * DuplicateCountryException is throw when try save the already existing country.
 */
public class DuplicateCountryException extends RuntimeException {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -3772256083480850587L;

    /**
     * The default constructor with "Already exist country in the database." error message.
     */
    public DuplicateCountryException() {
        super("Already exist country in the database.");
    }
}
