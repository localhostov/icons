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

public val Icons.Filled.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
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
                lineTo(0.0f, 8.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 10.0f)
                lineTo(24.0f, 10.0f)
                close()
                moveTo(17.832f, 13.152f)
                curveToRelative(-0.384f, -0.397f, -1.016f, -0.409f, -1.414f, -0.026f)
                lineToRelative(-4.754f, 4.582f)
                curveToRelative(-0.376f, 0.376f, -1.007f, 0.404f, -1.439f, -0.026f)
                lineToRelative(-2.278f, -2.117f)
                curveToRelative(-0.403f, -0.375f, -1.035f, -0.354f, -1.413f, 0.052f)
                curveToRelative(-0.376f, 0.404f, -0.353f, 1.037f, 0.052f, 1.413f)
                lineToRelative(2.252f, 2.092f)
                curveToRelative(0.566f, 0.567f, 1.32f, 0.879f, 2.121f, 0.879f)
                reflectiveCurveToRelative(1.556f, -0.312f, 2.108f, -0.866f)
                lineToRelative(4.74f, -4.568f)
                curveToRelative(0.397f, -0.383f, 0.409f, -1.017f, 0.025f, -1.414f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
