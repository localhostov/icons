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

public val Icons.Bold.CalendarCheck: ImageVector
    get() {
        if (_calendarCheck != null) {
            return _calendarCheck!!
        }
        _calendarCheck = Builder(name = "CalendarCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                curveTo(2.468f, 2.0f, 0.0f, 4.467f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(17.845f, 11.974f)
                curveToRelative(0.566f, 0.604f, 0.535f, 1.554f, -0.069f, 2.12f)
                lineToRelative(-4.176f, 3.914f)
                curveToRelative(-0.626f, 0.627f, -1.505f, 0.992f, -2.439f, 0.992f)
                reflectiveCurveToRelative(-1.814f, -0.364f, -2.476f, -1.026f)
                lineToRelative(-2.478f, -2.396f)
                curveToRelative(-0.596f, -0.576f, -0.611f, -1.525f, -0.035f, -2.121f)
                curveToRelative(0.576f, -0.594f, 1.526f, -0.61f, 2.121f, -0.035f)
                lineToRelative(2.496f, 2.414f)
                curveToRelative(0.146f, 0.145f, 0.294f, 0.164f, 0.371f, 0.164f)
                reflectiveCurveToRelative(0.226f, -0.019f, 0.354f, -0.146f)
                lineToRelative(4.211f, -3.948f)
                curveToRelative(0.604f, -0.567f, 1.552f, -0.536f, 2.12f, 0.068f)
                close()
            }
        }
        .build()
        return _calendarCheck!!
    }

private var _calendarCheck: ImageVector? = null
