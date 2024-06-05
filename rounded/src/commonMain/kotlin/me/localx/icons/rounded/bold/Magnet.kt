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

public val Icons.Bold.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.307f)
                curveToRelative(0.0f, 1.638f, -1.187f, 3.035f, -2.701f, 3.179f)
                curveToRelative(-0.858f, 0.083f, -1.684f, -0.189f, -2.316f, -0.765f)
                curveToRelative(-0.625f, -0.568f, -0.983f, -1.377f, -0.983f, -2.221f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(8.152f)
                curveToRelative(0.0f, 6.689f, 5.18f, 12.348f, 12.003f, 12.348f)
                curveToRelative(3.164f, 0.0f, 6.142f, -1.216f, 8.404f, -3.437f)
                curveToRelative(2.316f, -2.275f, 3.593f, -5.316f, 3.593f, -8.563f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, 2.435f, -0.957f, 4.716f, -2.695f, 6.422f)
                curveToRelative(-1.736f, 1.706f, -4.039f, 2.618f, -6.474f, 2.576f)
                curveToRelative(-4.869f, -0.089f, -8.831f, -4.282f, -8.831f, -9.347f)
                verticalLineToRelative(-5.652f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.687f, 0.716f, 3.305f, 1.965f, 4.44f)
                curveToRelative(1.248f, 1.135f, 2.932f, 1.695f, 4.62f, 1.532f)
                curveToRelative(3.037f, -0.29f, 5.416f, -2.998f, 5.416f, -6.166f)
                verticalLineToRelative(-5.807f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
