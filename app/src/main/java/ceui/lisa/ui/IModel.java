package ceui.lisa.ui;

import io.reactivex.Observable;

public interface IModel<T> {

    void fetchFirst(IPresent<T> present);

    void fetchNext(IPresent<T> present);

    Observable<T> firstApi(IPresent<T> present);

    Observable<T> nextApi(IPresent<T> present);
}
