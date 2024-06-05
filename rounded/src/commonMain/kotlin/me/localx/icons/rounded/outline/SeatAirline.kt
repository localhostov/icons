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
                moveTo(21.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.503f, 0.0f, -0.762f, -0.332f, -0.851f, -0.474f)
                curveToRelative(-0.088f, -0.144f, -0.269f, -0.523f, -0.044f, -0.974f)
                lineToRelative(1.005f, -2.009f)
                curveToRelative(0.777f, 0.296f, 1.614f, 0.456f, 2.48f, 0.456f)
                horizontalLineToRelative(7.409f)
                curveToRelative(0.881f, 0.0f, 1.714f, -0.385f, 2.286f, -1.057f)
                reflectiveCurveToRelative(0.817f, -1.561f, 0.674f, -2.44f)
                curveToRelative(-0.232f, -1.427f, -1.551f, -2.503f, -3.066f, -2.503f)
                horizontalLineToRelative(-7.289f)
                curveToRelative(-0.45f, 0.0f, -0.846f, -0.303f, -0.964f, -0.736f)
                lineToRelative(-0.618f, -2.264f)
                horizontalLineToRelative(8.978f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(9.475f)
                lineToRelative(-1.549f, -5.668f)
                curveTo(7.52f, 0.784f, 6.076f, -0.214f, 4.564f, 0.008f)
                curveToRelative(-0.844f, 0.124f, -1.598f, 0.603f, -2.067f, 1.313f)
                curveToRelative(-0.469f, 0.71f, -0.615f, 1.59f, -0.396f, 2.421f)
                lineToRelative(2.733f, 10.089f)
                curveToRelative(0.415f, 1.53f, 1.324f, 2.828f, 2.526f, 3.741f)
                lineToRelative(-1.043f, 2.086f)
                curveToRelative(-0.468f, 0.938f, -0.419f, 2.028f, 0.132f, 2.919f)
                reflectiveCurveToRelative(1.504f, 1.423f, 2.552f, 1.423f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(4.033f, 3.227f)
                curveToRelative(-0.073f, -0.278f, -0.026f, -0.563f, 0.133f, -0.803f)
                curveToRelative(0.158f, -0.24f, 0.449f, -0.446f, 0.812f, -0.446f)
                curveToRelative(0.45f, 0.0f, 0.881f, 0.357f, 1.016f, 0.872f)
                lineToRelative(2.716f, 9.941f)
                curveToRelative(0.355f, 1.301f, 1.545f, 2.209f, 2.894f, 2.209f)
                horizontalLineToRelative(7.289f)
                curveToRelative(0.537f, 0.0f, 1.017f, 0.362f, 1.093f, 0.824f)
                curveToRelative(0.049f, 0.304f, -0.03f, 0.596f, -0.224f, 0.823f)
                curveToRelative(-0.19f, 0.224f, -0.468f, 0.353f, -0.762f, 0.353f)
                horizontalLineToRelative(-7.409f)
                curveToRelative(-2.253f, 0.0f, -4.237f, -1.519f, -4.826f, -3.692f)
                lineTo(4.033f, 3.227f)
                close()
            }
        }
        .build()
        return _seatAirline!!
    }

private var _seatAirline: ImageVector? = null
