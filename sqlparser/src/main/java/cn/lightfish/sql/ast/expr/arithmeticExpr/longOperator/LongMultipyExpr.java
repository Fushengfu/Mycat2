package cn.lightfish.sql.ast.expr.arithmeticExpr.longOperator;

import cn.lightfish.sql.ast.RootExecutionContext;
import cn.lightfish.sql.ast.expr.numberExpr.LongExpr;
import cn.lightfish.sql.ast.expr.ValueExpr;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LongMultipyExpr implements LongExpr {

  private final RootExecutionContext context;
  private final ValueExpr left;
  private final ValueExpr right;

  @Override
  public Long getValue() {
    Long leftValue = (Long) left.getValue();
    if (leftValue == null){
      return null;
    }
    Long rightValue = (Long) right.getValue();
    if (rightValue == null){
      return null;
    }
    return leftValue * rightValue;
  }
}