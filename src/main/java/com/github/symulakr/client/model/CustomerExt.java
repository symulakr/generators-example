package com.github.symulakr.client.model;


import com.github.symulakr.gwt.generators.client.celltable.CellTableModel;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Column;
import com.github.symulakr.gwt.generators.client.celltable.annotation.Table;
import com.github.symulakr.gwt.generators.client.celltable.annotation.TableResources;

@Table(CustomCellTable.class)
@TableResources(CellTableRes.class)
public class CustomerExt extends Customer implements CellTableModel
{


   @Override
   @Column(header = "First Name", footer = "Footer")
//   @ColumnActions(position = 1)
   public String getFirstName()
   {
      return super.getFirstName();
   }

}
