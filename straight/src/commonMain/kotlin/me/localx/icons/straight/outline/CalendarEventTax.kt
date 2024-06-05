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

public val Icons.Outline.CalendarEventTax: ImageVector
    get() {
        if (_calendarEventTax != null) {
            return _calendarEventTax!!
        }
        _calendarEventTax = Builder(name = "CalendarEventTax", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(14.558f, 16.0f)
                curveToRelative(-1.231f, 0.0f, -1.757f, 1.002f, -1.883f, 1.581f)
                lineToRelative(-1.475f, 6.418f)
                horizontalLineToRelative(1.607f)
                lineToRelative(0.33f, -1.4f)
                horizontalLineToRelative(2.829f)
                lineToRelative(0.325f, 1.4f)
                horizontalLineToRelative(1.609f)
                lineToRelative(-1.447f, -6.373f)
                curveToRelative(-0.146f, -0.668f, -0.663f, -1.627f, -1.894f, -1.627f)
                close()
                moveTo(13.513f, 21.0f)
                lineToRelative(0.726f, -3.079f)
                curveToRelative(0.028f, -0.128f, 0.128f, -0.321f, 0.319f, -0.321f)
                reflectiveCurveToRelative(0.288f, 0.169f, 0.334f, 0.381f)
                lineToRelative(0.701f, 3.019f)
                horizontalLineToRelative(-2.081f)
                close()
                moveTo(9.3f, 17.6f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 16.0f)
                lineToRelative(-1.994f, 4.0f)
                lineToRelative(1.994f, 4.0f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(-1.088f, -2.182f)
                lineToRelative(-1.088f, 2.182f)
                horizontalLineToRelative(-1.812f)
                lineToRelative(1.994f, -4.0f)
                lineToRelative(-1.994f, -4.0f)
                horizontalLineToRelative(1.812f)
                lineToRelative(1.088f, 2.182f)
                lineToRelative(1.088f, -2.182f)
                horizontalLineToRelative(1.812f)
                close()
            }
        }
        .build()
        return _calendarEventTax!!
    }

private var _calendarEventTax: ImageVector? = null
