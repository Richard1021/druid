package com.alibaba.druid.sql.ast.statement;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.sql.ast.SQLName;
import com.alibaba.druid.sql.ast.SQLObjectImpl;
import com.alibaba.druid.sql.visitor.SQLASTVisitor;

public class SQLAlterTableAddFulltextIndex extends SQLObjectImpl implements SQLAlterTableItem {

    private boolean                          unique;

    private SQLName                          name;

    private final List<SQLSelectOrderByItem> items = new ArrayList<SQLSelectOrderByItem>();

    private String                           type;

    private String                           using;
    
    private boolean                          key = false;

    @Override
    protected void accept0(SQLASTVisitor visitor) {
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public List<SQLSelectOrderByItem> getItems() {
        return items;
    }
    
    public void addItem(SQLSelectOrderByItem item) {
        if (item != null) {
            item.setParent(this);
        }
        this.items.add(item);
    }

    public SQLName getName() {
        return name;
    }

    public void setName(SQLName name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsing() {
        return using;
    }

    public void setUsing(String using) {
        this.using = using;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}
