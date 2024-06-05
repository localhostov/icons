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

public val Icons.Filled.CalendarLinesPen: ImageVector
    get() {
        if (_calendarLinesPen != null) {
            return _calendarLinesPen!!
        }
        _calendarLinesPen = Builder(name = "CalendarLinesPen", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.999f, 8.0f)
                lineTo(-0.001f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveTo(-0.001f, 3.346f, 1.344f, 2.0f, 2.999f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.999f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.999f, 2.0f)
                lineTo(15.999f, 2.0f)
                lineTo(15.999f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.999f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(23.256f, 12.742f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0.0f)
                lineToRelative(-7.668f, 7.667f)
                verticalLineToRelative(3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.667f, -7.667f)
                curveToRelative(0.479f, -0.48f, 0.744f, -1.117f, 0.744f, -1.795f)
                reflectiveCurveToRelative(-0.264f, -1.316f, -0.744f, -1.795f)
                close()
                moveTo(11.581f, 18.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.582f, 14.0f)
                lineToRelative(2.672f, -2.671f)
                curveToRelative(0.855f, -0.856f, 1.995f, -1.329f, 3.209f, -1.329f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(10.0f, 24.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.581f)
                close()
            }
        }
        .build()
        return _calendarLinesPen!!
    }

private var _calendarLinesPen: ImageVector? = null