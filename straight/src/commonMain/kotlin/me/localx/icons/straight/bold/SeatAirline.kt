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

public val Icons.Bold.SeatAirline: ImageVector
    get() {
        if (_seatAirline != null) {
            return _seatAirline!!
        }
        _seatAirline = Builder(name = "SeatAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.947f, 14.344f)
                curveToRelative(-0.309f, -1.906f, -2.052f, -3.344f, -4.054f, -3.344f)
                horizontalLineToRelative(-7.449f)
                lineToRelative(-0.646f, -2.0f)
                horizontalLineToRelative(8.202f)
                verticalLineToRelative(-3.0f)
                lineTo(9.83f, 6.0f)
                lineToRelative(-0.937f, -2.901f)
                curveTo(8.369f, 1.102f, 6.407f, -0.248f, 4.416f, 0.039f)
                curveTo(3.291f, 0.206f, 2.287f, 0.845f, 1.662f, 1.79f)
                curveToRelative(-0.626f, 0.947f, -0.819f, 2.122f, -0.511f, 3.291f)
                lineToRelative(3.211f, 10.226f)
                curveToRelative(0.269f, 0.995f, 0.83f, 1.852f, 1.576f, 2.49f)
                lineToRelative(-0.569f, 1.138f)
                curveToRelative(-0.546f, 1.094f, -0.489f, 2.366f, 0.154f, 3.406f)
                curveToRelative(0.643f, 1.039f, 1.755f, 1.659f, 2.977f, 1.659f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-3.0f)
                lineTo(8.5f, 21.0f)
                curveToRelative(-0.243f, 0.0f, -0.371f, -0.148f, -0.425f, -0.237f)
                curveToRelative(-0.055f, -0.088f, -0.13f, -0.27f, -0.022f, -0.486f)
                lineToRelative(0.65f, -1.3f)
                curveToRelative(0.16f, 0.016f, 0.322f, 0.024f, 0.485f, 0.024f)
                horizontalLineToRelative(9.812f)
                curveToRelative(1.176f, 0.0f, 2.287f, -0.515f, 3.048f, -1.41f)
                curveToRelative(0.761f, -0.895f, 1.089f, -2.078f, 0.899f, -3.246f)
                close()
                moveTo(19.762f, 15.648f)
                curveToRelative(-0.191f, 0.224f, -0.468f, 0.353f, -0.762f, 0.353f)
                lineTo(9.188f, 16.001f)
                curveToRelative(-0.901f, 0.0f, -1.695f, -0.607f, -1.947f, -1.534f)
                lineTo(4.033f, 4.251f)
                curveToRelative(-0.072f, -0.276f, -0.024f, -0.57f, 0.132f, -0.808f)
                curveToRelative(0.156f, -0.235f, 0.464f, -0.444f, 0.796f, -0.444f)
                curveToRelative(0.452f, 0.0f, 0.9f, 0.37f, 1.052f, 0.941f)
                lineToRelative(3.246f, 10.06f)
                horizontalLineToRelative(9.633f)
                curveToRelative(0.538f, 0.0f, 1.018f, 0.362f, 1.093f, 0.824f)
                curveToRelative(0.048f, 0.299f, -0.033f, 0.599f, -0.224f, 0.823f)
                close()
            }
        }
        .build()
        return _seatAirline!!
    }

private var _seatAirline: ImageVector? = null
