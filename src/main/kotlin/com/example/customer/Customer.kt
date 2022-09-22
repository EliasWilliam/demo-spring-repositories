package com.example.customer

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.w3c.dom.DocumentType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Customer (
    @Id @GeneratedValue
    var id: Long?= null,
    var FirstName: String? = null,
    var surName: String? = null,
    var email: String? = null,
    var documentNumber: String? = null,
    var documentType: DocumentType? = null
)

enum class DocumentType {
    CPF,RG,CH
}

@RepositoryRestResource
interface CustomerRepository: PagingAndSortingRepository<Customer, Long>