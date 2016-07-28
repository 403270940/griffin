/*
	Copyright (c) 2016 eBay Software Foundation.
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.apache.bark.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class SystemLevelMetrics {
	private String name;
	private float dq;

	private List<AssetLevelMetrics> metrics;

	public SystemLevelMetrics()
	{
		metrics = new ArrayList<AssetLevelMetrics>();
	}

	public SystemLevelMetrics(String name)
	{
		this.name = name;
		metrics = new ArrayList<AssetLevelMetrics>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDq() {
		return dq;
	}

	public void setDq(float dq) {
		this.dq = dq;
	}

	public List<AssetLevelMetrics> getMetrics() {
		return metrics;
	}

	public void setMetrics(List<AssetLevelMetrics> metrics) {
		this.metrics = metrics;
	}

	public void addAssetLevelMetrics(AssetLevelMetrics item)
	{
		this.metrics.add(item);
	}

}
