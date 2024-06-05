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

public val Icons.Bold.TicketAirline: ImageVector
    get() {
        if (_ticketAirline != null) {
            return _ticketAirline!!
        }
        _ticketAirline = Builder(name = "TicketAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 10.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                lineTo(5.5f, 3.0f)
                curveTo(2.468f, 3.0f, 0.0f, 5.468f, 0.0f, 8.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.898f, 16.206f)
                curveToRelative(-0.305f, 1.035f, -1.265f, 1.794f, -2.398f, 1.794f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.134f, 0.0f, 2.094f, 0.759f, 2.398f, 1.794f)
                curveToRelative(-1.693f, 0.647f, -2.898f, 2.288f, -2.898f, 4.206f)
                reflectiveCurveToRelative(1.205f, 3.559f, 2.898f, 4.206f)
                close()
                moveTo(15.0f, 12.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.911f, 2.421f)
                curveToRelative(-0.195f, 0.357f, -0.569f, 0.579f, -0.975f, 0.579f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.382f, 0.0f, -0.644f, -0.384f, -0.506f, -0.74f)
                lineToRelative(0.879f, -2.26f)
                horizontalLineToRelative(-2.32f)
                curveToRelative(-0.442f, 0.0f, -0.862f, -0.195f, -1.147f, -0.533f)
                lineToRelative(-1.096f, -1.3f)
                curveToRelative(-0.297f, -0.52f, 0.078f, -1.167f, 0.677f, -1.167f)
                curveToRelative(0.207f, 0.0f, 0.405f, 0.082f, 0.551f, 0.228f)
                lineToRelative(1.11f, 0.772f)
                horizontalLineToRelative(2.241f)
                lineToRelative(-0.891f, -2.258f)
                curveToRelative(-0.141f, -0.356f, 0.122f, -0.742f, 0.505f, -0.742f)
                horizontalLineToRelative(0.298f)
                curveToRelative(0.407f, 0.0f, 0.781f, 0.222f, 0.975f, 0.579f)
                lineToRelative(1.929f, 2.421f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ticketAirline!!
    }

private var _ticketAirline: ImageVector? = null
