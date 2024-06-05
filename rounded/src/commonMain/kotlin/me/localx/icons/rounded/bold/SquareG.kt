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

public val Icons.Bold.SquareG: ImageVector
    get() {
        if (_squareG != null) {
            return _squareG!!
        }
        _squareG = Builder(name = "SquareG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(17.997f, 13.057f)
                curveToRelative(0.068f, 1.776f, -0.748f, 3.499f, -2.239f, 4.66f)
                curveToRelative(-1.081f, 0.841f, -2.41f, 1.283f, -3.76f, 1.283f)
                curveToRelative(-0.583f, 0.0f, -1.168f, -0.083f, -1.74f, -0.25f)
                curveToRelative(-2.506f, -0.735f, -4.257f, -3.122f, -4.257f, -5.803f)
                verticalLineToRelative(-1.819f)
                curveToRelative(0.0f, -1.655f, 0.688f, -3.271f, 1.889f, -4.433f)
                curveToRelative(1.18f, -1.141f, 2.716f, -1.739f, 4.322f, -1.688f)
                curveToRelative(1.635f, 0.053f, 3.201f, 0.777f, 4.296f, 1.987f)
                curveToRelative(0.556f, 0.614f, 0.509f, 1.562f, -0.105f, 2.119f)
                curveToRelative(-0.614f, 0.557f, -1.563f, 0.51f, -2.119f, -0.105f)
                curveToRelative(-0.561f, -0.619f, -1.332f, -0.975f, -2.17f, -1.002f)
                curveToRelative(-0.778f, -0.027f, -1.548f, 0.275f, -2.138f, 0.846f)
                curveToRelative(-0.62f, 0.6f, -0.975f, 1.43f, -0.975f, 2.277f)
                verticalLineToRelative(1.819f)
                curveToRelative(0.0f, 1.359f, 0.864f, 2.562f, 2.102f, 2.924f)
                curveToRelative(0.988f, 0.292f, 2.015f, 0.1f, 2.813f, -0.522f)
                curveToRelative(0.465f, -0.361f, 0.794f, -0.83f, 0.96f, -1.349f)
                horizontalLineToRelative(-1.375f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.538f, 0.0f, 1.035f, 0.202f, 1.401f, 0.57f)
                curveToRelative(0.558f, 0.561f, 0.597f, 1.28f, 0.596f, 1.487f)
                close()
            }
        }
        .build()
        return _squareG!!
    }

private var _squareG: ImageVector? = null
