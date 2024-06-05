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

public val Icons.Bold.CalendarCall: ImageVector
    get() {
        if (_calendarCall != null) {
            return _calendarCall!!
        }
        _calendarCall = Builder(name = "CalendarCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 7.5f)
                curveTo(0.0f, 4.467f, 2.467f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(22.364f, 19.763f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                lineToRelative(-1.036f, 1.025f)
                curveToRelative(-2.071f, -0.791f, -3.599f, -2.256f, -4.5f, -4.5f)
                lineToRelative(1.025f, -1.036f)
                curveToRelative(0.446f, -0.446f, 0.446f, -1.17f, 0.0f, -1.616f)
                lineToRelative(-1.208f, -1.302f)
                curveToRelative(-0.446f, -0.446f, -1.17f, -0.446f, -1.616f, 0.0f)
                lineToRelative(-0.6f, 0.522f)
                curveToRelative(-0.552f, 0.551f, -0.813f, 1.277f, -0.813f, 2.0f)
                curveToRelative(0.0f, 4.0f, 5.429f, 9.143f, 9.143f, 9.143f)
                curveToRelative(0.723f, 0.0f, 1.449f, -0.261f, 2.0f, -0.813f)
                lineToRelative(0.522f, -0.6f)
                curveToRelative(0.446f, -0.446f, 0.446f, -1.17f, 0.0f, -1.616f)
                lineToRelative(-1.302f, -1.208f)
                close()
            }
        }
        .build()
        return _calendarCall!!
    }

private var _calendarCall: ImageVector? = null
