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

public val Icons.Bold.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.796f, 9.518f)
                curveToRelative(-0.506f, -0.467f, -0.796f, -1.133f, -0.796f, -1.828f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4.69f)
                curveToRelative(0.0f, 0.694f, -0.29f, 1.36f, -0.795f, 1.827f)
                curveTo(3.374f, 12.131f, 0.0f, 15.984f, 0.0f, 19.5f)
                curveToRelative(0.0f, 0.852f, 0.211f, 1.641f, 0.629f, 2.347f)
                curveToRelative(0.789f, 1.328f, 2.307f, 2.153f, 3.961f, 2.153f)
                horizontalLineToRelative(14.82f)
                curveToRelative(1.654f, 0.0f, 3.172f, -0.825f, 3.962f, -2.155f)
                curveToRelative(0.417f, -0.704f, 0.628f, -1.493f, 0.628f, -2.345f)
                curveToRelative(0.0f, -3.516f, -3.374f, -7.369f, -6.204f, -9.982f)
                close()
                moveTo(20.791f, 20.315f)
                curveToRelative(-0.247f, 0.417f, -0.789f, 0.686f, -1.381f, 0.686f)
                lineTo(4.59f, 21.001f)
                curveToRelative(-0.592f, 0.0f, -1.134f, -0.269f, -1.38f, -0.684f)
                curveToRelative(-0.142f, -0.238f, -0.21f, -0.505f, -0.21f, -0.816f)
                curveToRelative(0.0f, -0.697f, 0.281f, -1.548f, 0.809f, -2.5f)
                horizontalLineToRelative(10.691f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                lineTo(5.999f, 14.001f)
                curveToRelative(0.654f, -0.741f, 1.405f, -1.506f, 2.243f, -2.279f)
                curveToRelative(1.117f, -1.033f, 1.759f, -2.502f, 1.759f, -4.031f)
                lineTo(10.001f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.69f)
                curveToRelative(0.0f, 1.528f, 0.642f, 2.998f, 1.76f, 4.031f)
                curveToRelative(3.281f, 3.03f, 5.24f, 5.938f, 5.24f, 7.779f)
                curveToRelative(0.0f, 0.311f, -0.068f, 0.578f, -0.209f, 0.814f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
