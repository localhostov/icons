package me.localx.icons.rounded.filled

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

public val Icons.Filled.CalendarPen: ImageVector
    get() {
        if (_calendarPen != null) {
            return _calendarPen!!
        }
        _calendarPen = Builder(name = "CalendarPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.27f, 19.48f)
                curveToRelative(-0.813f, 0.813f, -1.27f, 1.915f, -1.27f, 3.065f)
                verticalLineToRelative(1.455f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.15f, 0.0f, 2.252f, -0.457f, 3.065f, -1.27f)
                lineToRelative(6.807f, -6.807f)
                curveToRelative(0.897f, -0.897f, 0.897f, -2.353f, 0.0f, -3.25f)
                curveToRelative(-0.897f, -0.897f, -2.353f, -0.897f, -3.25f, 0.0f)
                lineToRelative(-6.807f, 6.807f)
                close()
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(0.0f, 10.0f)
                lineTo(21.357f, 10.0f)
                curveToRelative(-0.839f, 0.101f, -1.667f, 0.482f, -2.392f, 1.207f)
                lineToRelative(-7.207f, 7.207f)
                curveToRelative(-1.134f, 1.133f, -1.758f, 2.64f, -1.758f, 4.243f)
                verticalLineToRelative(1.343f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                lineTo(0.0f, 10.0f)
                close()
            }
        }
        .build()
        return _calendarPen!!
    }

private var _calendarPen: ImageVector? = null
