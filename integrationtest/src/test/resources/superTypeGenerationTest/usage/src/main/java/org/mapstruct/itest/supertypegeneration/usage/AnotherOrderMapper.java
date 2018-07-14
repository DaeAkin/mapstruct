/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.itest.supertypegeneration.usage;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 
 * @author Gunnar Morling
 *
 */
@Mapper
public abstract class AnotherOrderMapper {
	
	public static final AnotherOrderMapper INSTANCE = Mappers.getMapper( AnotherOrderMapper.class );
	
	public abstract OrderDto orderToDto(Order order);
}
