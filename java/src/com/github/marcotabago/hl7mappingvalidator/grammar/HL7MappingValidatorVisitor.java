// Generated from HL7MappingValidator.g4 by ANTLR 4.4

    package com.github.marcotabago.hl7mappingvalidator.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HL7MappingValidatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HL7MappingValidatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(@NotNull HL7MappingValidatorParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpression(@NotNull HL7MappingValidatorParser.BitOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(@NotNull HL7MappingValidatorParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(@NotNull HL7MappingValidatorParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceofExpression(@NotNull HL7MappingValidatorParser.InstanceofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralExpression(@NotNull HL7MappingValidatorParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull HL7MappingValidatorParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpression(@NotNull HL7MappingValidatorParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsExpression(@NotNull HL7MappingValidatorParser.ArgumentsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(@NotNull HL7MappingValidatorParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull HL7MappingValidatorParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(@NotNull HL7MappingValidatorParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull HL7MappingValidatorParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(@NotNull HL7MappingValidatorParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalRightHandSideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertConditionalRightHandSideExpression(@NotNull HL7MappingValidatorParser.AssertConditionalRightHandSideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(@NotNull HL7MappingValidatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpressionAssignment(@NotNull HL7MappingValidatorParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#defaultClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultClause(@NotNull HL7MappingValidatorParser.DefaultClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(@NotNull HL7MappingValidatorParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarInStatement(@NotNull HL7MappingValidatorParser.ForVarInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(@NotNull HL7MappingValidatorParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertionStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertionStatements(@NotNull HL7MappingValidatorParser.AssertionStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(@NotNull HL7MappingValidatorParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull HL7MappingValidatorParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(@NotNull HL7MappingValidatorParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull HL7MappingValidatorParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull HL7MappingValidatorParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(@NotNull HL7MappingValidatorParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(@NotNull HL7MappingValidatorParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(@NotNull HL7MappingValidatorParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(@NotNull HL7MappingValidatorParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#variableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(@NotNull HL7MappingValidatorParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyNameAndValueList(@NotNull HL7MappingValidatorParser.PropertyNameAndValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull HL7MappingValidatorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull HL7MappingValidatorParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertTrueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertTrueStatement(@NotNull HL7MappingValidatorParser.AssertTrueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(@NotNull HL7MappingValidatorParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(@NotNull HL7MappingValidatorParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#numericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(@NotNull HL7MappingValidatorParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(@NotNull HL7MappingValidatorParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidExpression(@NotNull HL7MappingValidatorParser.VoidExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(@NotNull HL7MappingValidatorParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNotExpression(@NotNull HL7MappingValidatorParser.BitNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(@NotNull HL7MappingValidatorParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperatorExpression(@NotNull HL7MappingValidatorParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(@NotNull HL7MappingValidatorParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull HL7MappingValidatorParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(@NotNull HL7MappingValidatorParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull HL7MappingValidatorParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXOrExpression(@NotNull HL7MappingValidatorParser.BitXOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(@NotNull HL7MappingValidatorParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull HL7MappingValidatorParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull HL7MappingValidatorParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertionExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertionExpression(@NotNull HL7MappingValidatorParser.AssertionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertConditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertConditionalStatement(@NotNull HL7MappingValidatorParser.AssertConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(@NotNull HL7MappingValidatorParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(@NotNull HL7MappingValidatorParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull HL7MappingValidatorParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(@NotNull HL7MappingValidatorParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(@NotNull HL7MappingValidatorParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull HL7MappingValidatorParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(@NotNull HL7MappingValidatorParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDotExpression(@NotNull HL7MappingValidatorParser.MemberDotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteExpression(@NotNull HL7MappingValidatorParser.DeleteExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(@NotNull HL7MappingValidatorParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertionStatement(@NotNull HL7MappingValidatorParser.AssertionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(@NotNull HL7MappingValidatorParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#labelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelledStatement(@NotNull HL7MappingValidatorParser.LabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(@NotNull HL7MappingValidatorParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitShiftExpression(@NotNull HL7MappingValidatorParser.BitShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(@NotNull HL7MappingValidatorParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assertionOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertionOperator(@NotNull HL7MappingValidatorParser.AssertionOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#debuggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDebuggerStatement(@NotNull HL7MappingValidatorParser.DebuggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(@NotNull HL7MappingValidatorParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(@NotNull HL7MappingValidatorParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(@NotNull HL7MappingValidatorParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull HL7MappingValidatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetter(@NotNull HL7MappingValidatorParser.PropertyGetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull HL7MappingValidatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#elision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElision(@NotNull HL7MappingValidatorParser.ElisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(@NotNull HL7MappingValidatorParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link HL7MappingValidatorParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarStatement(@NotNull HL7MappingValidatorParser.ForVarStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull HL7MappingValidatorParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(@NotNull HL7MappingValidatorParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(@NotNull HL7MappingValidatorParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetParameterList(@NotNull HL7MappingValidatorParser.PropertySetParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link HL7MappingValidatorParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetter(@NotNull HL7MappingValidatorParser.PropertySetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(@NotNull HL7MappingValidatorParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull HL7MappingValidatorParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(@NotNull HL7MappingValidatorParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#identifierName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierName(@NotNull HL7MappingValidatorParser.IdentifierNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpression(@NotNull HL7MappingValidatorParser.BitAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#finallyProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyProduction(@NotNull HL7MappingValidatorParser.FinallyProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#futureReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFutureReservedWord(@NotNull HL7MappingValidatorParser.FutureReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull HL7MappingValidatorParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExpression(@NotNull HL7MappingValidatorParser.UnaryPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(@NotNull HL7MappingValidatorParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(@NotNull HL7MappingValidatorParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull HL7MappingValidatorParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull HL7MappingValidatorParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#initialiser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialiser(@NotNull HL7MappingValidatorParser.InitialiserContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(@NotNull HL7MappingValidatorParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#catchProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchProduction(@NotNull HL7MappingValidatorParser.CatchProductionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link HL7MappingValidatorParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberIndexExpression(@NotNull HL7MappingValidatorParser.MemberIndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HL7MappingValidatorParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull HL7MappingValidatorParser.LiteralContext ctx);
}