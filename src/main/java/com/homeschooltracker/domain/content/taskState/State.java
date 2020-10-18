package com.homeschooltracker.domain.content.taskState;

public interface State {
    public String getStateDescription();
    public boolean showInParentList();
    public boolean showInStudentList();
    public boolean isPrepared();
    public boolean isCurrent();
    public boolean isCompleted();
    public boolean isGraded();
}
