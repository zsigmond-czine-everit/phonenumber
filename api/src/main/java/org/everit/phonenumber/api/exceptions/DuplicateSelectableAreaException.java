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
 * DuplicateSelectableAreaException is throw when try save the already existing active area.
 */
public class DuplicateSelectableAreaException extends RuntimeException {

    /**
     * The generated serial version UID.
     */
    private static final long serialVersionUID = 7896934198922932708L;

    /**
     * The default constructor with "Existing the area code which belong the country code." error message.
     */
    public DuplicateSelectableAreaException() {
        super("Existing the area code which belong the country code.");
    }
}
