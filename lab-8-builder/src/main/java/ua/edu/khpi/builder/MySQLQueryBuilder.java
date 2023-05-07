package ua.edu.khpi.builder;

public class MySQLQueryBuilder implements Builder {

    private String select;
    private String where;
    private Integer limit;

    @Override
    public Builder select(String select) {
        this.select = select;
        return this;
    }

    @Override
    public Builder where(String where) {
        this.where = where;
        return this;
    }

    @Override
    public Builder limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("MYSQL query: ");
        if (select != null) {
            builder.append(String.format("SELECT %s ", select));
        }
        if (where != null) {
            builder.append(String.format("FROM %s ", where));
        }
        if (limit != null && limit >= 0) {
            builder.append(String.format("LIMIT %d ", limit));
        }
        return builder.toString();
    }
}
