import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LlistaComponent } from './llista.component';

describe('LlistaComponent', () => {
  let component: LlistaComponent;
  let fixture: ComponentFixture<LlistaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LlistaComponent]
    });
    fixture = TestBed.createComponent(LlistaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
