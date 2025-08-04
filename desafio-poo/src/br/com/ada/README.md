# Orientações para Atualizar Branch de Feature

Este guia explica como atualizar sua branch de feature com as últimas alterações das branches `main` e `develop` utilizando Git.

## Atualizar branch de feature com a branch main

1. Certifique-se de estar na sua branch de feature:
   ```bash
   git checkout minha-feature
   ```
2. Busque as últimas atualizações do repositório:
   ```bash
   git fetch origin
   ```
3. Faça o merge da branch main na sua branch de feature:
   ```bash
   git merge origin/main
   ```
4. Resolva possíveis conflitos, se houver.
5. Após resolver os conflitos, faça o commit das alterações:
   ```bash
   git add .
   git commit -m "Merge branch 'main' into minha-feature"
   ```
6. Envie as alterações para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```

## Atualizar branch de feature com a branch develop

1. Certifique-se de estar na sua branch de feature:
   ```bash
   git checkout minha-feature
   ```
2. Busque as últimas atualizações do repositório:
   ```bash
   git fetch origin
   ```
3. Faça o merge da branch develop na sua branch de feature:
   ```bash
   git merge origin/develop
   ```
4. Resolva possíveis conflitos, se houver.
5. Após resolver os conflitos, faça o commit das alterações:
   ```bash
   git add .
   git commit -m "Merge branch 'develop' into minha-feature"
   ```
6. Envie as alterações para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```

## Observações
- Sempre revise e teste o código após o merge.
- Se houver conflitos, o Git irá indicar os arquivos afetados. Resolva manualmente, depois siga com `git add` e `git commit`.
- Consulte a documentação oficial do Git ou peça suporte ao time em caso de dúvidas.

