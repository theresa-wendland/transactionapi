package com.theresafirstapi.bank.controller.model

import com.theresafirstapi.bank.repository.model.TransactionDBModel
import java.util.Date

class OverviewTransactionModel(
        val targetAccount: String,
        val valueone: Double,
        val description: String,
        val date: Date,
        val id: String
)

fun TransactionDBModel.convertToOverviewTransactionModel() = OverviewTransactionModel(
        targetAccount = this.accountIdentifier,
        valueone = this.valueone,
        description = this.description,
        date = this.date,
        id = this.id.toString()
)