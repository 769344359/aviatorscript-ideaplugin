/*
 * Copyright 2020-2020 yanchangyou
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This is a generated file. Not intended for manual editing.

package my.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static lang.psi.MyLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import my.lang.psi.*;

public class MyLanguageLetStatementImpl extends ASTWrapperPsiElement implements MyLanguageLetStatement {

  public MyLanguageLetStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull MyLanguageVisitor<R> visitor) {
    return visitor.visitLetStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MyLanguageVisitor) accept((MyLanguageVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MyLanguageAllExpress getAllExpress() {
    return findChildByClass(MyLanguageAllExpress.class);
  }

  @Override
  @NotNull
  public MyLanguageRefExpress getRefExpress() {
    return findNotNullChildByClass(MyLanguageRefExpress.class);
  }

  @Override
  @Nullable
  public MyLanguageStatement getStatement() {
    return findChildByClass(MyLanguageStatement.class);
  }

}
