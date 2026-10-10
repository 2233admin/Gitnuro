package com.jetpackduba.gitnuro.domain.interfaces

import com.jetpackduba.gitnuro.domain.errors.Either
import com.jetpackduba.gitnuro.domain.errors.GitError
import com.jetpackduba.gitnuro.domain.models.StatusEntry

interface IDiscardEntriesGitAction {
    suspend operator fun invoke(repositoryPath: String, statusEntries: List<StatusEntry>, staged: Boolean): Either<Unit, GitError>
}