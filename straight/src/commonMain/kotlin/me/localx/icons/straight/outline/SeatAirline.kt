package me.localx.icons.straight.outline

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

public val Icons.Outline.SeatAirline: ImageVector
    get() {
        if (_seatAirline != null) {
            return _seatAirline!!
        }
        _seatAirline = Builder(name = "SeatAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.067f, 15.504f)
                curveToRelative(-0.232f, -1.428f, -1.55f, -2.504f, -3.067f, -2.504f)
                lineTo(10.841f, 13.0f)
                lineToRelative(-0.82f, -3.0f)
                horizontalLineToRelative(8.978f)
                verticalLineToRelative(-2.0f)
                lineTo(9.475f, 8.0f)
                lineToRelative(-1.549f, -5.668f)
                curveTo(7.52f, 0.784f, 6.076f, -0.214f, 4.564f, 0.008f)
                curveToRelative(-0.844f, 0.124f, -1.598f, 0.603f, -2.067f, 1.313f)
                curveToRelative(-0.469f, 0.71f, -0.615f, 1.59f, -0.396f, 2.421f)
                lineToRelative(3.334f, 12.304f)
                curveToRelative(0.252f, 0.929f, 0.821f, 1.708f, 1.572f, 2.232f)
                lineToRelative(-0.69f, 1.38f)
                curveToRelative(-0.468f, 0.938f, -0.419f, 2.028f, 0.132f, 2.919f)
                reflectiveCurveToRelative(1.504f, 1.423f, 2.552f, 1.423f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.0f, 22.0f)
                curveToRelative(-0.503f, 0.0f, -0.762f, -0.332f, -0.851f, -0.474f)
                curveToRelative(-0.088f, -0.144f, -0.269f, -0.523f, -0.044f, -0.974f)
                lineToRelative(0.787f, -1.574f)
                curveToRelative(0.133f, 0.013f, 0.267f, 0.021f, 0.403f, 0.021f)
                horizontalLineToRelative(9.812f)
                curveToRelative(0.881f, 0.0f, 1.715f, -0.386f, 2.286f, -1.058f)
                reflectiveCurveToRelative(0.816f, -1.561f, 0.674f, -2.438f)
                close()
                moveTo(19.87f, 16.648f)
                curveToRelative(-0.191f, 0.224f, -0.469f, 0.353f, -0.763f, 0.353f)
                lineTo(9.295f, 17.001f)
                curveToRelative(-0.901f, 0.0f, -1.695f, -0.607f, -1.93f, -1.478f)
                lineTo(4.033f, 3.227f)
                curveToRelative(-0.073f, -0.278f, -0.026f, -0.563f, 0.133f, -0.803f)
                curveToRelative(0.158f, -0.24f, 0.464f, -0.446f, 0.812f, -0.446f)
                curveToRelative(0.45f, 0.0f, 0.881f, 0.357f, 1.016f, 0.872f)
                lineToRelative(3.319f, 12.15f)
                horizontalLineToRelative(9.686f)
                curveToRelative(0.538f, 0.0f, 1.018f, 0.362f, 1.093f, 0.825f)
                curveToRelative(0.049f, 0.303f, -0.03f, 0.595f, -0.223f, 0.822f)
                close()
            }
        }
        .build()
        return _seatAirline!!
    }

private var _seatAirline: ImageVector? = null
