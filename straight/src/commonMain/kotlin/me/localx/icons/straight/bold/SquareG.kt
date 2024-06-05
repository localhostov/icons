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
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(18.008f, 11.0f)
                lineToRelative(-0.011f, 2.057f)
                curveToRelative(0.068f, 1.776f, -0.748f, 3.499f, -2.239f, 4.66f)
                curveToRelative(-1.081f, 0.841f, -2.41f, 1.283f, -3.76f, 1.283f)
                curveToRelative(-0.583f, 0.0f, -1.168f, -0.083f, -1.74f, -0.25f)
                curveToRelative(-2.506f, -0.735f, -4.257f, -3.122f, -4.257f, -5.803f)
                verticalLineToRelative(-1.819f)
                curveToRelative(0.0f, -1.655f, 0.688f, -3.271f, 1.889f, -4.433f)
                curveToRelative(1.18f, -1.141f, 2.716f, -1.739f, 4.322f, -1.688f)
                curveToRelative(1.935f, 0.063f, 3.736f, 1.055f, 4.819f, 2.652f)
                lineToRelative(-2.484f, 1.683f)
                curveToRelative(-0.545f, -0.805f, -1.455f, -1.305f, -2.433f, -1.337f)
                curveToRelative(-0.789f, -0.033f, -1.548f, 0.274f, -2.138f, 0.846f)
                curveToRelative(-0.62f, 0.6f, -0.975f, 1.43f, -0.975f, 2.277f)
                verticalLineToRelative(1.819f)
                curveToRelative(0.0f, 1.359f, 0.864f, 2.562f, 2.102f, 2.924f)
                curveToRelative(0.988f, 0.292f, 2.015f, 0.1f, 2.813f, -0.522f)
                curveToRelative(0.465f, -0.361f, 0.794f, -0.83f, 0.96f, -1.349f)
                horizontalLineToRelative(-2.875f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.008f)
                close()
            }
        }
        .build()
        return _squareG!!
    }

private var _squareG: ImageVector? = null
