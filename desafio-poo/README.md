# Como atualizar sua branch de feature com a branch main

Este guia mostra como atualizar sua branch de feature com as últimas alterações da branch `main` usando Git.

## Passo a passo

1. **Certifique-se de estar na sua branch de feature**
   ```bash
   git checkout minha-feature
   ```
   Substitua `minha-feature` pelo nome da sua branch.

2. **Atualize a branch main local**
   ```bash
   git fetch origin
   git checkout main
   git pull origin main
   ```
   Isso garante que sua branch `main` local está atualizada com o repositório remoto.

3. **Volte para sua branch de feature**
   ```bash
   git checkout minha-feature
   ```

4. **Faça o merge da main na sua branch de feature**
   ```bash
   git merge main
   ```
   Resolva possíveis conflitos, se houver.

5. **Finalize e envie as alterações**
   ```bash
   git add .
   git commit -m "Merge da main na feature"
   git push origin minha-feature
   ```

## Observações
- Sempre revise e teste o código após o merge.
- Se houver conflitos, o Git irá indicar os arquivos afetados. Resolva manualmente, depois siga com `git add` e `git commit`.

---

Se precisar de ajuda, consulte a documentação oficial do Git ou peça suporte ao time.

# Como atualizar sua branch de feature com a branch develop

Este guia mostra como atualizar sua branch de feature com as últimas alterações da branch `develop` usando Git.

## Passo a passo

1. **Certifique-se de estar na sua branch de feature**
   ```bash
   git checkout sua-feature
   ```
   Substitua `sua-feature` pelo nome da sua branch.

2. **Busque as últimas atualizações do repositório**
   ```bash
   git fetch origin
   ```

3. **Faça o merge da branch develop na sua branch de feature**
   ```bash
   git merge origin/develop
   ```
   Resolva possíveis conflitos, se houver.

4. **Finalize e envie as alterações**
   ```bash
   git add .
   git commit -m "Merge branch 'develop' into sua-feature"
   git push origin sua-feature
   ```

## Observações
- Sempre revise e teste o código após o merge.
- Se houver conflitos, o Git irá indicar os arquivos afetados. Resolva manualmente, depois siga com `git add` e `git commit`.

---

Se precisar de ajuda, consulte a documentação oficial do Git ou peça suporte ao time.
