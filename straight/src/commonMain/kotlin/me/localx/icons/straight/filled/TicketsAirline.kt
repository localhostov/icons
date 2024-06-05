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

public val Icons.Filled.TicketsAirline: ImageVector
    get() {
        if (_ticketsAirline != null) {
            return _ticketsAirline!!
        }
        _ticketsAirline = Builder(name = "TicketsAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-1.113f)
                lineToRelative(1.359f, -3.0f)
                horizontalLineToRelative(-2.709f)
                lineToRelative(-1.546f, -1.833f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(0.924f, 0.772f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-1.376f, -3.0f)
                horizontalLineToRelative(1.096f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.802f, 0.0f, 1.25f, 0.448f, 1.25f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _ticketsAirline!!
    }

private var _ticketsAirline: ImageVector? = null
