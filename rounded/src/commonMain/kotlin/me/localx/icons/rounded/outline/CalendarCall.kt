package me.localx.icons.rounded.outline

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

public val Icons.Outline.CalendarCall: ImageVector
    get() {
        if (_calendarCall != null) {
            return _calendarCall!!
        }
        _calendarCall = Builder(name = "CalendarCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(2.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 8.0f)
                close()
                moveTo(23.665f, 20.971f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-0.522f, 0.6f)
                curveToRelative(-0.551f, 0.552f, -1.277f, 0.813f, -2.0f, 0.813f)
                curveToRelative(-3.714f, 0.0f, -9.143f, -5.143f, -9.143f, -9.143f)
                curveToRelative(0.0f, -0.723f, 0.261f, -1.449f, 0.813f, -2.0f)
                lineToRelative(0.6f, -0.522f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                lineToRelative(1.208f, 1.302f)
                curveToRelative(0.446f, 0.446f, 0.446f, 1.17f, 0.0f, 1.616f)
                lineToRelative(-1.025f, 1.036f)
                curveToRelative(0.901f, 2.244f, 2.429f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.036f, -1.025f)
                curveToRelative(0.446f, -0.446f, 1.17f, -0.446f, 1.616f, 0.0f)
                lineToRelative(1.302f, 1.208f)
                close()
            }
        }
        .build()
        return _calendarCall!!
    }

private var _calendarCall: ImageVector? = null
