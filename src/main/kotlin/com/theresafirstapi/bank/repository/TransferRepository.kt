package com.theresafirstapi.bank.repository

import com.theresafirstapi.bank.repository.model.TransactionDBModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TransferRepository: CrudRepository<TransactionDBModel, UUID>