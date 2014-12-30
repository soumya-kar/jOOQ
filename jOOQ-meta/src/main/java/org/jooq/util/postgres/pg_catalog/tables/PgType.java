/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


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
public class PgType extends TableImpl<Record> {

	private static final long serialVersionUID = -1830808019;

	/**
	 * The reference instance of <code>pg_catalog.pg_type</code>
	 */
	public static final PgType PG_TYPE = new PgType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_type.typname</code>.
	 */
	public final TableField<Record, String> TYPNAME = createField("typname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typnamespace</code>.
	 */
	public final TableField<Record, Long> TYPNAMESPACE = createField("typnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typowner</code>.
	 */
	public final TableField<Record, Long> TYPOWNER = createField("typowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typlen</code>.
	 */
	public final TableField<Record, Short> TYPLEN = createField("typlen", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typbyval</code>.
	 */
	public final TableField<Record, Boolean> TYPBYVAL = createField("typbyval", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typtype</code>.
	 */
	public final TableField<Record, String> TYPTYPE = createField("typtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typcategory</code>.
	 */
	public final TableField<Record, String> TYPCATEGORY = createField("typcategory", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typispreferred</code>.
	 */
	public final TableField<Record, Boolean> TYPISPREFERRED = createField("typispreferred", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typisdefined</code>.
	 */
	public final TableField<Record, Boolean> TYPISDEFINED = createField("typisdefined", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdelim</code>.
	 */
	public final TableField<Record, String> TYPDELIM = createField("typdelim", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typrelid</code>.
	 */
	public final TableField<Record, Long> TYPRELID = createField("typrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typelem</code>.
	 */
	public final TableField<Record, Long> TYPELEM = createField("typelem", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typarray</code>.
	 */
	public final TableField<Record, Long> TYPARRAY = createField("typarray", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typinput</code>.
	 */
	public final TableField<Record, String> TYPINPUT = createField("typinput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typoutput</code>.
	 */
	public final TableField<Record, String> TYPOUTPUT = createField("typoutput", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typreceive</code>.
	 */
	public final TableField<Record, String> TYPRECEIVE = createField("typreceive", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typsend</code>.
	 */
	public final TableField<Record, String> TYPSEND = createField("typsend", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typmodin</code>.
	 */
	public final TableField<Record, String> TYPMODIN = createField("typmodin", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typmodout</code>.
	 */
	public final TableField<Record, String> TYPMODOUT = createField("typmodout", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typanalyze</code>.
	 */
	public final TableField<Record, String> TYPANALYZE = createField("typanalyze", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typalign</code>.
	 */
	public final TableField<Record, String> TYPALIGN = createField("typalign", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typstorage</code>.
	 */
	public final TableField<Record, String> TYPSTORAGE = createField("typstorage", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typnotnull</code>.
	 */
	public final TableField<Record, Boolean> TYPNOTNULL = createField("typnotnull", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typbasetype</code>.
	 */
	public final TableField<Record, Long> TYPBASETYPE = createField("typbasetype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typtypmod</code>.
	 */
	public final TableField<Record, Integer> TYPTYPMOD = createField("typtypmod", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typndims</code>.
	 */
	public final TableField<Record, Integer> TYPNDIMS = createField("typndims", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typcollation</code>.
	 */
	public final TableField<Record, Long> TYPCOLLATION = createField("typcollation", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdefaultbin</code>.
	 */
	public final TableField<Record, Object> TYPDEFAULTBIN = createField("typdefaultbin", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typdefault</code>.
	 */
	public final TableField<Record, String> TYPDEFAULT = createField("typdefault", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>pg_catalog.pg_type.typacl</code>.
	 */
	public final TableField<Record, String[]> TYPACL = createField("typacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_type</code> table reference
	 */
	public PgType() {
		this("pg_type", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_type</code> table reference
	 */
	public PgType(String alias) {
		this(alias, PG_TYPE);
	}

	private PgType(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgType(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgType as(String alias) {
		return new PgType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgType rename(String name) {
		return new PgType(name, null);
	}
}
