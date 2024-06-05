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

public val Icons.Bold.Toothbrush: ImageVector
    get() {
        if (_toothbrush != null) {
            return _toothbrush!!
        }
        _toothbrush = Builder(name = "Toothbrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.5f)
                verticalLineToRelative(-0.412f)
                curveToRelative(0.0f, -0.827f, -0.492f, -1.572f, -1.254f, -1.898f)
                curveToRelative(-0.753f, -0.324f, -1.619f, -0.168f, -2.212f, 0.396f)
                curveToRelative(-0.279f, 0.267f, -0.646f, 0.414f, -1.034f, 0.414f)
                lineTo(7.193f, 1.0f)
                curveTo(4.093f, 1.0f, 1.354f, 2.863f, 0.216f, 5.746f)
                curveToRelative(-0.374f, 0.948f, -0.253f, 2.021f, 0.325f, 2.872f)
                curveToRelative(0.364f, 0.535f, 0.875f, 0.936f, 1.459f, 1.165f)
                verticalLineToRelative(9.267f)
                curveToRelative(-1.141f, 0.232f, -2.0f, 1.24f, -2.0f, 2.45f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-9.868f)
                curveToRelative(2.377f, -1.259f, 4.0f, -3.759f, 4.0f, -6.632f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.502f)
                curveToRelative(0.167f, 0.0f, 0.333f, -0.006f, 0.498f, -0.017f)
                verticalLineToRelative(9.017f)
                close()
                moveTo(16.502f, 7.0f)
                lineTo(3.148f, 7.0f)
                curveToRelative(-0.065f, 0.0f, -0.104f, -0.038f, -0.142f, -0.152f)
                curveToRelative(0.683f, -1.729f, 2.326f, -2.848f, 4.187f, -2.848f)
                horizontalLineToRelative(12.307f)
                curveToRelative(0.448f, 0.0f, 0.888f, -0.065f, 1.307f, -0.192f)
                curveToRelative(-0.562f, 1.846f, -2.279f, 3.192f, -4.305f, 3.192f)
                close()
            }
        }
        .build()
        return _toothbrush!!
    }

private var _toothbrush: ImageVector? = null
