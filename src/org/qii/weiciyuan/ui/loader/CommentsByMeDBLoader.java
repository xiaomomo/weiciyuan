package org.qii.weiciyuan.ui.loader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import org.qii.weiciyuan.bean.android.CommentTimeLineData;
import org.qii.weiciyuan.support.database.CommentByMeTimeLineDBTask;

/**
 * User: qii
 * Date: 13-4-10
 */
public class CommentsByMeDBLoader extends AsyncTaskLoader<CommentTimeLineData> {

    private String accountId;

    public CommentsByMeDBLoader(Context context, String accountId) {
        super(context);
        this.accountId = accountId;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    public CommentTimeLineData loadInBackground() {
        return CommentByMeTimeLineDBTask.getCommentLineMsgList(accountId);
    }

}