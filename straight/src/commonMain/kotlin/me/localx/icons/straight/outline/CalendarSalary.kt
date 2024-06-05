package me.localx.icons.straight.outline

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

public val Icons.Outline.CalendarSalary: ImageVector
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
                horizontalLineToRelative(-6.184f)
                curveToRelative(0.734f, -0.57f, 1.381f, -1.243f, 1.92f, -2.0f)
                horizontalLineToRelative(2.263f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-3.085f)
                curveToRelative(-0.768f, -0.817f, -1.677f, -1.495f, -2.691f, -2.0f)
                horizontalLineToRelative(5.776f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.776f)
                curveToRelative(-1.014f, 0.505f, -1.923f, 1.183f, -2.691f, 2.0f)
                horizontalLineToRelative(-3.085f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.263f)
                curveToRelative(0.539f, 0.757f, 1.187f, 1.43f, 1.92f, 2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
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
