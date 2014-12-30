/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<Record> {

	private static final long serialVersionUID = -287968899;

	/**
	 * The reference instance of <code>information_schema.parameters</code>
	 */
	public static final Parameters PARAMETERS = new Parameters();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.parameters.specific_catalog</code>.
	 */
	public final TableField<Record, String> SPECIFIC_CATALOG = createField("specific_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.specific_schema</code>.
	 */
	public final TableField<Record, String> SPECIFIC_SCHEMA = createField("specific_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.specific_name</code>.
	 */
	public final TableField<Record, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.ordinal_position</code>.
	 */
	public final TableField<Record, Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.parameter_mode</code>.
	 */
	public final TableField<Record, String> PARAMETER_MODE = createField("parameter_mode", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.is_result</code>.
	 */
	public final TableField<Record, String> IS_RESULT = createField("is_result", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.parameters.as_locator</code>.
	 */
	public final TableField<Record, String> AS_LOCATOR = createField("as_locator", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.parameters.parameter_name</code>.
	 */
	public final TableField<Record, String> PARAMETER_NAME = createField("parameter_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.data_type</code>.
	 */
	public final TableField<Record, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.character_maximum_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.character_octet_length</code>.
	 */
	public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.character_set_catalog</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.character_set_schema</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.character_set_name</code>.
	 */
	public final TableField<Record, String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.collation_catalog</code>.
	 */
	public final TableField<Record, String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.collation_schema</code>.
	 */
	public final TableField<Record, String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.collation_name</code>.
	 */
	public final TableField<Record, String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.numeric_precision</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.numeric_precision_radix</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.numeric_scale</code>.
	 */
	public final TableField<Record, Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.datetime_precision</code>.
	 */
	public final TableField<Record, Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.interval_type</code>.
	 */
	public final TableField<Record, String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.interval_precision</code>.
	 */
	public final TableField<Record, Integer> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.udt_catalog</code>.
	 */
	public final TableField<Record, String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.udt_schema</code>.
	 */
	public final TableField<Record, String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.udt_name</code>.
	 */
	public final TableField<Record, String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.scope_catalog</code>.
	 */
	public final TableField<Record, String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.scope_schema</code>.
	 */
	public final TableField<Record, String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.scope_name</code>.
	 */
	public final TableField<Record, String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.maximum_cardinality</code>.
	 */
	public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>information_schema.parameters.dtd_identifier</code>.
	 */
	public final TableField<Record, String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.parameters.parameter_default</code>.
	 */
	public final TableField<Record, String> PARAMETER_DEFAULT = createField("parameter_default", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>information_schema.parameters</code> table reference
	 */
	public Parameters() {
		this("parameters", null);
	}

	/**
	 * Create an aliased <code>information_schema.parameters</code> table reference
	 */
	public Parameters(String alias) {
		this(alias, PARAMETERS);
	}

	private Parameters(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Parameters(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Parameters as(String alias) {
		return new Parameters(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Parameters rename(String name) {
		return new Parameters(name, null);
	}
}
