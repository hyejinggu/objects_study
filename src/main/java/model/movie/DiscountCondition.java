package model.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
