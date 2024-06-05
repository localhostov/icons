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

public val Icons.Filled.Sell: ImageVector
    get() {
        if (_sell != null) {
            return _sell!!
        }
        _sell = Builder(name = "Sell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.317f, 14.658f)
                lineToRelative(-9.732f, -3.538f)
                curveToRelative(-0.7f, -0.259f, -1.49f, -0.083f, -2.018f, 0.445f)
                curveToRelative(-0.533f, 0.532f, -0.704f, 1.304f, -0.446f, 2.012f)
                lineToRelative(3.541f, 9.737f)
                lineToRelative(3.621f, -3.621f)
                lineToRelative(4.242f, 4.241f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.242f, -4.241f)
                lineToRelative(3.621f, -3.621f)
                close()
                moveTo(21.0f, 0.017f)
                lineTo(3.0f, 0.017f)
                curveTo(1.343f, 0.017f, 0.0f, 1.36f, 0.0f, 3.017f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(5.108f)
                curveToRelative(0.164f, -0.69f, 0.515f, -1.336f, 1.046f, -1.866f)
                curveToRelative(0.634f, -0.634f, 1.457f, -1.011f, 2.317f, -1.112f)
                lineTo(8.471f, 2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.551f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.459f)
                lineToRelative(5.935f, 2.158f)
                horizontalLineToRelative(6.095f)
                lineTo(24.001f, 3.017f)
                curveTo(24.0f, 1.36f, 22.657f, 0.017f, 21.0f, 0.017f)
                close()
                moveTo(7.442f, 7.98f)
                curveToRelative(-0.191f, 1.175f, -1.215f, 2.028f, -2.436f, 2.028f)
                curveToRelative(-0.965f, 0.0f, -1.873f, -0.413f, -2.506f, -1.136f)
                lineToRelative(1.009f, -1.006f)
                curveToRelative(0.373f, 0.406f, 0.925f, 0.646f, 1.497f, 0.646f)
                curveToRelative(0.604f, 0.0f, 1.031f, -0.404f, 1.096f, -0.795f)
                curveToRelative(0.089f, -0.55f, -0.602f, -0.873f, -0.817f, -0.959f)
                curveToRelative(-0.915f, -0.371f, -1.751f, -0.78f, -1.753f, -0.78f)
                curveToRelative(-0.692f, -0.484f, -1.027f, -1.231f, -0.921f, -2.049f)
                curveToRelative(0.111f, -0.845f, 0.674f, -1.534f, 1.471f, -1.796f)
                curveToRelative(1.324f, -0.437f, 2.462f, 0.317f, 2.863f, 0.686f)
                lineToRelative(-0.86f, 1.113f)
                curveToRelative(-0.219f, -0.166f, -0.881f, -0.602f, -1.611f, -0.367f)
                curveToRelative(-0.412f, 0.136f, -0.517f, 0.447f, -0.515f, 0.577f)
                curveToRelative(0.005f, 0.442f, 0.335f, 0.57f, 0.433f, 0.615f)
                curveToRelative(0.282f, 0.128f, 0.806f, 0.368f, 1.366f, 0.595f)
                curveToRelative(1.461f, 0.591f, 1.828f, 1.745f, 1.685f, 2.627f)
                close()
                moveTo(16.971f, 10.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.471f, 2.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(21.471f, 10.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(17.971f, 2.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                close()
            }
        }
        .build()
        return _sell!!
    }

private var _sell: ImageVector? = null
