package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double averageScore = 0;
        int amountSubjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                averageScore += subject.score();
                amountSubjects++;
            }
        }
        averageScore /= amountSubjects;
        return averageScore;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            int amountSubjects = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                amountSubjects++;
            }
            labels.add(new Label(pupil.name(), totalScore / amountSubjects));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), 0);
            }
        }
        for (Pupil pupil: pupils) {
            Integer temp;
            for (Subject subject : pupil.subjects()) {
                temp = map.get(subject.name()) + subject.score();
                map.put(subject.name(), temp);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            labels.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new LinkedList<>();
        for (Pupil pupil : pupils) {
            double totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            labels.add(new Label(pupil.name(), totalScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), 0);
            }
        }
        for (Pupil pupil: pupils) {
            Integer temp;
            for (Subject subject : pupil.subjects()) {
                temp = map.get(subject.name()) + subject.score();
                map.put(subject.name(), temp);
            }
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            labels.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
