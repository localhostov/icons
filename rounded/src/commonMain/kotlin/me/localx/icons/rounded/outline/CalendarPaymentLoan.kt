package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CalendarPaymentLoan: ImageVector
    get() {
        if (_calendarPaymentLoan != null) {
            return _calendarPaymentLoan!!
        }
        _calendarPaymentLoan = Builder(name = "CalendarPaymentLoan", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.642f, 14.308f)
                curveToRelative(0.274f, -0.297f, 0.536f, -0.625f, 0.741f, -0.974f)
                curveToRelative(0.346f, -0.59f, -0.115f, -1.333f, -0.799f, -1.333f)
                horizontalLineToRelative(-3.167f)
                curveToRelative(-0.684f, 0.0f, -1.144f, 0.743f, -0.799f, 1.333f)
                curveToRelative(0.204f, 0.349f, 0.466f, 0.677f, 0.741f, 0.974f)
                curveToRelative(-2.376f, 0.879f, -4.358f, 3.52f, -4.358f, 6.204f)
                curveToRelative(0.0f, 1.923f, 1.57f, 3.488f, 3.5f, 3.488f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.565f, 3.5f, -3.488f)
                curveToRelative(0.0f, -2.684f, -1.982f, -5.325f, -4.358f, -6.204f)
                close()
                moveTo(20.5f, 22.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.667f, -1.5f, -1.488f)
                curveToRelative(0.0f, -2.192f, 2.056f, -4.512f, 4.0f, -4.512f)
                reflectiveCurveToRelative(4.0f, 2.319f, 4.0f, 4.512f)
                curveToRelative(0.0f, 0.821f, -0.673f, 1.488f, -1.5f, 1.488f)
                close()
                moveTo(19.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 8.0f)
                close()
            }
        }
        .build()
        return _calendarPaymentLoan!!
    }

private var _calendarPaymentLoan: ImageVector? = null
