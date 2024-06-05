package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CalendarSalary: ImageVector
    get() {
        if (_calendarSalary != null) {
            return _calendarSalary!!
        }
        _calendarSalary = Builder(name = "CalendarSalary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 9.0f)
                curveToRelative(-4.142f, 0.0f, -7.5f, 3.358f, -7.5f, 7.5f)
                reflectiveCurveToRelative(3.358f, 7.5f, 7.5f, 7.5f)
                reflectiveCurveToRelative(7.5f, -3.358f, 7.5f, -7.5f)
                reflectiveCurveToRelative(-3.358f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(10.521f, 15.24f)
                lineToRelative(3.286f, 0.548f)
                curveToRelative(1.271f, 0.211f, 2.193f, 1.3f, 2.193f, 2.588f)
                curveToRelative(0.0f, 1.447f, -1.177f, 2.624f, -2.624f, 2.624f)
                horizontalLineToRelative(-0.376f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.376f)
                curveToRelative(0.344f, 0.0f, 0.624f, -0.28f, 0.624f, -0.624f)
                curveToRelative(0.0f, -0.307f, -0.22f, -0.565f, -0.521f, -0.616f)
                lineToRelative(-3.286f, -0.548f)
                curveToRelative(-1.27f, -0.211f, -2.192f, -1.3f, -2.192f, -2.588f)
                curveToRelative(0.0f, -1.447f, 1.177f, -2.624f, 2.624f, -2.624f)
                horizontalLineToRelative(0.376f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.376f)
                curveToRelative(-0.344f, 0.0f, -0.624f, 0.28f, -0.624f, 0.624f)
                curveToRelative(0.0f, 0.307f, 0.219f, 0.565f, 0.521f, 0.616f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.213f)
                curveToRelative(1.046f, -0.81f, 1.914f, -1.828f, 2.548f, -3.0f)
                horizontalLineToRelative(0.665f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-2.109f)
                curveToRelative(-1.73f, -1.838f, -4.167f, -3.0f, -6.891f, -3.0f)
                reflectiveCurveToRelative(-5.167f, 1.161f, -6.896f, 3.0f)
                horizontalLineToRelative(-2.104f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(0.669f)
                curveToRelative(0.634f, 1.171f, 1.5f, 2.19f, 2.545f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _calendarSalary!!
    }

private var _calendarSalary: ImageVector? = null
