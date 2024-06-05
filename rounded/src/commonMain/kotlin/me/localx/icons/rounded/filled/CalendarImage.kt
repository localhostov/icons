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

public val Icons.Filled.CalendarImage: ImageVector
    get() {
        if (_calendarImage != null) {
            return _calendarImage!!
        }
        _calendarImage = Builder(name = "CalendarImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(0.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(23.586f)
                lineToRelative(-7.611f, 7.61f)
                curveToRelative(-0.521f, 0.521f, -1.429f, 0.521f, -1.951f, 0.0f)
                lineToRelative(-0.634f, -0.635f)
                curveToRelative(-1.277f, -1.277f, -3.503f, -1.277f, -4.78f, 0.0f)
                lineToRelative(-6.262f, 6.262f)
                curveToRelative(-1.41f, -0.885f, -2.349f, -2.454f, -2.349f, -4.237f)
                close()
                moveTo(3.0f, 13.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(17.39f, 19.024f)
                curveToRelative(-1.276f, 1.277f, -3.502f, 1.277f, -4.78f, 0.0f)
                lineToRelative(-0.634f, -0.635f)
                curveToRelative(-0.521f, -0.521f, -1.43f, -0.521f, -1.951f, 0.0f)
                lineToRelative(-5.58f, 5.579f)
                curveToRelative(0.182f, 0.02f, 0.367f, 0.031f, 0.555f, 0.031f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.586f)
                lineToRelative(-6.61f, 6.61f)
                close()
            }
        }
        .build()
        return _calendarImage!!
    }

private var _calendarImage: ImageVector? = null
