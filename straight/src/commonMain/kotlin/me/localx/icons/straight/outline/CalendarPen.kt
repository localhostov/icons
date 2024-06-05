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

public val Icons.Outline.CalendarPen: ImageVector
    get() {
        if (_calendarPen != null) {
            return _calendarPen!!
        }
        _calendarPen = Builder(name = "CalendarPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.821f, 12.879f)
                lineToRelative(-6.879f, 6.878f)
                verticalLineToRelative(4.243f)
                horizontalLineToRelative(4.242f)
                lineToRelative(6.879f, -6.878f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                close()
                moveTo(21.649f, 15.707f)
                lineToRelative(-6.293f, 6.293f)
                horizontalLineToRelative(-1.414f)
                verticalLineToRelative(-1.415f)
                lineToRelative(6.293f, -6.292f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.293f, 0.707f)
                close()
                moveTo(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                lineTo(0.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.0f)
                lineTo(24.0f, 10.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _calendarPen!!
    }

private var _calendarPen: ImageVector? = null
