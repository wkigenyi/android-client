package com.sparklead.feature.checker_inbox_task.checker_inbox_and_task.data

import com.mifos.core.network.datamanager.DataManagerCheckerInbox
import com.mifos.core.objects.checkerinboxandtasks.CheckerTask
import com.mifos.core.objects.checkerinboxandtasks.RescheduleLoansTask
import com.sparklead.feature.checker_inbox_task.checker_inbox_and_task.domain.repository.CheckerInboxTasksRepository
import rx.Observable
import javax.inject.Inject


/**
 * Created by Aditya Gupta on 21/03/24.
 */

class CheckerInboxTasksRepositoryImp @Inject constructor(private val dataManagerCheckerInbox: DataManagerCheckerInbox) :
    CheckerInboxTasksRepository {

    override fun getRescheduleLoansTaskList(): Observable<List<RescheduleLoansTask>> {
        return dataManagerCheckerInbox.getRechdeduleLoansTaskList()
    }

    override fun getCheckerTaskList(
        actionName: String?,
        entityName: String?,
        resourceId: Int?
    ): Observable<List<CheckerTask>> {
        return dataManagerCheckerInbox.getCheckerTaskList()
    }
}