/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

/**
 * @deprecated Use {@link ASTExpression} inside {@link ASTStatementExpressionList},
 *     or {@link ASTExpressionStatement} inside {@link ASTBlock}
 */
@Deprecated
public final class ASTStatementExpression extends AbstractJavaTypeNode {

    ASTStatementExpression(int id) {
        super(id);
    }


    @Override
    protected <P, R> R acceptVisitor(JavaVisitor<? super P, ? extends R> visitor, P data) {
        return visitor.visit(this, data);
    }
}
