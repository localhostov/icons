package me.localx.icons.straight.filled

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

public val Icons.Filled.CalendarSalary: ImageVector
    get() {
        if (_calendarSalary != null) {
            return _calendarSalary!!
        }
        _calendarSalary = Builder(name = "CalendarSalary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
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
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(19.5f, 16.5f)
                curveToRelative(0.0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.358f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.358f, -7.5f, 7.5f, -7.5f)
                reflectiveCurveToRelative(7.5f, 3.358f, 7.5f, 7.5f)
                close()
                moveTo(10.0f, 14.624f)
                curveToRelative(0.0f, -0.344f, 0.28f, -0.624f, 0.624f, -0.624f)
                horizontalLineToRelative(2.376f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.376f)
                curveToRelative(-1.447f, 0.0f, -2.624f, 1.177f, -2.624f, 2.624f)
                curveToRelative(0.0f, 1.288f, 0.922f, 2.377f, 2.192f, 2.588f)
                lineToRelative(3.286f, 0.548f)
                curveToRelative(0.302f, 0.05f, 0.521f, 0.309f, 0.521f, 0.616f)
                curveToRelative(0.0f, 0.344f, -0.28f, 0.624f, -0.624f, 0.624f)
                horizontalLineToRelative(-2.376f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.376f)
                curveToRelative(1.447f, 0.0f, 2.624f, -1.177f, 2.624f, -2.624f)
                curveToRelative(0.0f, -1.288f, -0.923f, -2.377f, -2.193f, -2.588f)
                lineToRelative(-3.286f, -0.548f)
                curveToRelative(-0.302f, -0.05f, -0.521f, -0.309f, -0.521f, -0.616f)
                close()
                moveTo(2.5f, 16.5f)
                curveToRelative(0.0f, -2.518f, 0.986f, -4.8f, 2.585f, -6.5f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(6.184f)
                curveToRelative(-2.238f, -1.738f, -3.684f, -4.447f, -3.684f, -7.5f)
                close()
                moveTo(18.915f, 10.0f)
                curveToRelative(1.599f, 1.7f, 2.585f, 3.982f, 2.585f, 6.5f)
                curveToRelative(0.0f, 3.053f, -1.446f, 5.762f, -3.684f, 7.5f)
                horizontalLineToRelative(6.184f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-5.085f)
                close()
            }
        }
        .build()
        return _calendarSalary!!
    }

private var _calendarSalary: ImageVector? = null
