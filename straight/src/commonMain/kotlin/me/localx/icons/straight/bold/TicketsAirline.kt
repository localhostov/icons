package me.localx.icons.straight.bold

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

public val Icons.Bold.TicketsAirline: ImageVector
    get() {
        if (_ticketsAirline != null) {
            return _ticketsAirline!!
        }
        _ticketsAirline = Builder(name = "TicketsAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21.0f, 5.757f)
                curveToRelative(-1.746f, 0.619f, -3.0f, 2.287f, -3.0f, 4.243f)
                reflectiveCurveToRelative(1.254f, 3.624f, 3.0f, 4.243f)
                verticalLineToRelative(1.257f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(8.0f, 4.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(1.257f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-1.113f)
                lineToRelative(1.359f, -3.0f)
                horizontalLineToRelative(-1.709f)
                lineToRelative(-1.546f, -1.833f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(0.924f, 0.772f)
                horizontalLineToRelative(1.12f)
                lineToRelative(-1.376f, -3.0f)
                horizontalLineToRelative(1.096f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.802f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(8.5f, 21.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-10.5f)
                curveTo(3.813f, 24.0f, 0.0f, 20.187f, 0.0f, 15.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _ticketsAirline!!
    }

private var _ticketsAirline: ImageVector? = null
