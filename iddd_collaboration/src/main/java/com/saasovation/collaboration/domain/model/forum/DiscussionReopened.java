//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.saasovation.collaboration.domain.model.forum;

import com.saasovation.collaboration.domain.model.tenant.Tenant;
import com.saasovation.common.domain.model.DomainEvent;

public class DiscussionReopened extends DomainEvent {

    private DiscussionId discussionId;
    private String exclusiveOwner;
    private ForumId forumId;
    private Tenant tenant;

    public DiscussionReopened(
	    Tenant aTenant,
	    ForumId aForumId,
	    DiscussionId aDiscussionId,
	    String anExclusiveOwner) {

	super();

	this.discussionId = aDiscussionId;
	this.exclusiveOwner = anExclusiveOwner;
	this.forumId = aForumId;
	this.tenant = aTenant;
    }

    public DiscussionId discussionId() {
	return this.discussionId;
    }

    public String exclusiveOwner() {
	return this.exclusiveOwner;
    }

    public ForumId forumId() {
	return this.forumId;
    }

    public Tenant tenant() {
	return this.tenant;
    }
}
