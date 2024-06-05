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

public val Icons.Filled.SeatAirline: ImageVector
    get() {
        if (_seatAirline != null) {
            return _seatAirline!!
        }
        _seatAirline = Builder(name = "SeatAirline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.899f, 18.967f)
                curveToRelative(0.132f, 0.013f, 0.262f, 0.033f, 0.397f, 0.033f)
                horizontalLineToRelative(9.812f)
                curveToRelative(0.881f, 0.0f, 1.715f, -0.386f, 2.286f, -1.058f)
                reflectiveCurveToRelative(0.816f, -1.561f, 0.674f, -2.438f)
                curveToRelative(-0.232f, -1.428f, -1.55f, -2.504f, -3.067f, -2.504f)
                horizontalLineTo(10.841f)
                lineToRelative(-0.82f, -3.0f)
                horizontalLineToRelative(8.978f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.475f)
                lineToRelative(-1.549f, -5.668f)
                curveTo(7.52f, 0.784f, 6.076f, -0.214f, 4.564f, 0.008f)
                curveToRelative(-0.844f, 0.124f, -1.598f, 0.603f, -2.067f, 1.313f)
                curveToRelative(-0.469f, 0.71f, -0.615f, 1.59f, -0.396f, 2.421f)
                lineToRelative(3.334f, 12.304f)
                curveToRelative(0.251f, 0.928f, 0.826f, 1.699f, 1.577f, 2.223f)
                lineToRelative(-0.695f, 1.389f)
                curveToRelative(-0.468f, 0.938f, -0.419f, 2.028f, 0.132f, 2.919f)
                reflectiveCurveToRelative(1.504f, 1.423f, 2.552f, 1.423f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.503f, 0.0f, -0.762f, -0.332f, -0.851f, -0.474f)
                curveToRelative(-0.088f, -0.144f, -0.269f, -0.523f, -0.044f, -0.974f)
                lineToRelative(0.793f, -1.586f)
                close()
            }
        }
        .build()
        return _seatAirline!!
    }

private var _seatAirline: ImageVector? = null
