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

public val Icons.Filled.TrianglePersonDigging: ImageVector
    get() {
        if (_trianglePersonDigging != null) {
            return _trianglePersonDigging!!
        }
        _trianglePersonDigging = Builder(name = "TrianglePersonDigging", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.397f, 15.92f)
                lineTo(15.355f, 2.883f)
                curveToRelative(-0.749f, -1.214f, -1.938f, -1.883f, -3.347f, -1.883f)
                curveToRelative(-1.424f, 0.0f, -2.621f, 0.669f, -3.37f, 1.883f)
                lineToRelative(-3.454f, 5.599f)
                lineToRelative(2.777f, 1.834f)
                lineToRelative(0.402f, -0.99f)
                curveToRelative(0.233f, -0.651f, 0.736f, -1.172f, 1.377f, -1.43f)
                curveToRelative(0.642f, -0.258f, 1.364f, -0.229f, 1.984f, 0.079f)
                lineToRelative(0.464f, 0.232f)
                curveToRelative(0.875f, 0.435f, 1.541f, 1.182f, 1.875f, 2.101f)
                lineToRelative(0.647f, 2.574f)
                lineToRelative(-2.17f, -1.428f)
                lineToRelative(-0.155f, -0.487f)
                curveToRelative(-0.195f, -0.535f, -0.582f, -0.968f, -1.089f, -1.22f)
                lineToRelative(-0.198f, -0.095f)
                curveToRelative(-0.217f, -0.107f, -0.466f, -0.116f, -0.684f, -0.026f)
                curveToRelative(-0.222f, 0.092f, -0.389f, 0.265f, -0.469f, 0.49f)
                lineToRelative(-0.478f, 1.229f)
                lineToRelative(6.735f, 4.647f)
                lineToRelative(1.742f, -2.464f)
                lineToRelative(3.235f, 6.47f)
                horizontalLineToRelative(-7.764f)
                lineToRelative(1.596f, -2.305f)
                lineToRelative(-10.935f, -7.417f)
                lineTo(0.596f, 15.92f)
                curveToRelative(-0.771f, 1.25f, -0.804f, 2.764f, -0.088f, 4.047f)
                curveToRelative(0.71f, 1.273f, 2.001f, 2.033f, 3.454f, 2.033f)
                horizontalLineToRelative(16.07f)
                curveToRelative(1.452f, 0.0f, 2.743f, -0.76f, 3.454f, -2.033f)
                curveToRelative(0.716f, -1.284f, 0.684f, -2.797f, -0.088f, -4.047f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(6.576f, 20.0f)
                horizontalLineToRelative(-2.011f)
                lineToRelative(2.026f, -5.647f)
                lineToRelative(1.615f, 1.105f)
                lineToRelative(-1.63f, 4.542f)
                close()
                moveTo(11.334f, 20.0f)
                horizontalLineToRelative(-1.846f)
                verticalLineToRelative(-3.647f)
                lineToRelative(1.846f, 1.342f)
                verticalLineToRelative(2.305f)
                close()
            }
        }
        .build()
        return _trianglePersonDigging!!
    }

private var _trianglePersonDigging: ImageVector? = null
