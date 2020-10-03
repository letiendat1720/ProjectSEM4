import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BuildpcComponent } from './buildpc.component';

describe('BuildpcComponent', () => {
  let component: BuildpcComponent;
  let fixture: ComponentFixture<BuildpcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BuildpcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BuildpcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
