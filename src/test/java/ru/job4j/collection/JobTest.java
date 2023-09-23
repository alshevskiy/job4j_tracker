package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorAskByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("refactor", 2),
                new Job("fix bug", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("refactor", 2),
                new Job("fix bug", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("fix bug x", 2),
                new Job("fix bug t", 4)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("issue 1", 2),
                new Job("issue 2", 3)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorAskByNameAndEqual() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("fix bug", 2),
                new Job("fix bug", 3)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorDescByPriorityAndEqual() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("issue 1", 1),
                new Job("issue 2", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorDescByNameAndDescByPriority() {
        Comparator<Job> cmpDescNameAndDescPriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDescNameAndDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriority() {
        Comparator<Job> cmpAscNameAndAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscNameAndAscPriority.compare(
                new Job("issue", 1),
                new Job("issue", 3)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscByPriorityAndEqual() {
        Comparator<Job> cmpAscNameAndAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscNameAndAscPriority.compare(
                new Job("issue", 1),
                new Job("issue", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }
}