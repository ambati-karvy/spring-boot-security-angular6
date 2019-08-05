import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RcStatusComponent } from './rc-status.component';

describe('RcStatusComponent', () => {
  let component: RcStatusComponent;
  let fixture: ComponentFixture<RcStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RcStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RcStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
