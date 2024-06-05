package me.localx.icons.rounded.bold

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

public val Icons.Bold.CalendarImage: ImageVector
    get() {
        if (_calendarImage != null) {
            return _calendarImage!!
        }
        _calendarImage = Builder(name = "CalendarImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.467f, 2.0f, 0.0f, 4.468f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.911f, 0.98f, 3.597f, 2.463f, 4.583f)
                curveToRelative(0.182f, 0.175f, 0.398f, 0.295f, 0.626f, 0.359f)
                curveToRelative(0.728f, 0.357f, 1.547f, 0.557f, 2.411f, 0.557f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(3.45f, 19.929f)
                curveToRelative(-0.283f, -0.405f, -0.45f, -0.898f, -0.45f, -1.429f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(1.379f)
                lineToRelative(-5.378f, 5.378f)
                curveToRelative(-0.332f, 0.332f, -0.911f, 0.332f, -1.244f, 0.0f)
                lineToRelative(-0.634f, -0.635f)
                curveToRelative(-1.466f, -1.467f, -4.022f, -1.467f, -5.487f, 0.0f)
                lineToRelative(-4.807f, 4.807f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(6.621f, 21.0f)
                lineToRelative(3.757f, -3.757f)
                curveToRelative(0.332f, -0.332f, 0.911f, -0.332f, 1.244f, 0.0f)
                lineToRelative(0.634f, 0.635f)
                curveToRelative(1.466f, 1.467f, 4.022f, 1.467f, 5.487f, 0.0f)
                lineToRelative(3.257f, -3.257f)
                verticalLineToRelative(3.879f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(8.0f, 12.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _calendarImage!!
    }

private var _calendarImage: ImageVector? = null
