package edu.nccu.misdu.stu103306037.hw8;

import java.util.ArrayList;
import java.util.List;

public class KeywordList {
	private List<Keyword> keywords = new ArrayList<>();

	public KeywordList() {
		this.keywords = new ArrayList<>();
	}

	public void add(Keyword k) {
		this.keywords.add(k);
		System.out.println("Done");
	}

	public void output() {
		StringBuilder sb = new StringBuilder();

		for (Keyword k : keywords) {
			sb.append(k.toString() + " ");
		}

		System.out.println(sb.toString().trim());
	}

	public void sort() {
		this.keywords = doQuickSort(this.keywords);
		System.out.println("Done");
	}

	private List<Keyword> doQuickSort(List<Keyword> keywords) {
		if (keywords.size() <= 1) {
			return keywords;
		}
		// less than
		List<Keyword> lt = new ArrayList<>();
		// equal to
		List<Keyword> eq = new ArrayList<>();
		// greater than
		List<Keyword> gt = new ArrayList<>();

		List<Keyword> retVal = new ArrayList<>();

		int indexOfPivot = keywords.size() / 2;
		Keyword pivot = keywords.get(indexOfPivot);

		for (Keyword keyword : keywords) {
			if (keyword.count < pivot.count) {
				lt.add(keyword);
			} else if (keyword.count > pivot.count) {
				gt.add(keyword);
			} else {
				eq.add(keyword);
			}
		}

		retVal.addAll(doQuickSort(lt));
		retVal.addAll(eq);
		retVal.addAll(doQuickSort(gt));
		return retVal;

	}
}
