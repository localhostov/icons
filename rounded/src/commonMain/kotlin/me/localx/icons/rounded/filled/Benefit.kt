package me.localx.icons.rounded.filled

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

public val Icons.Filled.Benefit: ImageVector
    get() {
        if (_benefit != null) {
            return _benefit!!
        }
        _benefit = Builder(name = "Benefit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.601f, 9.0f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(-7.2f, -0.017f)
                curveToRelative(-1.321f, -0.002f, -2.395f, -1.079f, -2.395f, -2.4f)
                lineTo(3.0f, 1.113f)
                curveToRelative(0.0f, -0.429f, 0.242f, -0.809f, 0.632f, -0.99f)
                curveToRelative(0.36f, -0.163f, 0.785f, -0.137f, 1.064f, 0.063f)
                curveToRelative(0.05f, 0.036f, 1.635f, 2.819f, 1.635f, 2.819f)
                lineToRelative(1.525f, -2.481f)
                curveToRelative(0.643f, -0.646f, 1.628f, -0.66f, 2.227f, -0.066f)
                lineToRelative(1.582f, 2.542f)
                lineToRelative(1.376f, -2.567f)
                curveToRelative(0.318f, -0.392f, 0.794f, -0.526f, 1.235f, -0.369f)
                curveToRelative(0.441f, 0.159f, 0.724f, 0.562f, 0.724f, 1.028f)
                verticalLineToRelative(5.508f)
                curveToRelative(0.0f, 0.642f, -0.25f, 1.246f, -0.705f, 1.699f)
                curveToRelative(-0.454f, 0.452f, -1.055f, 0.701f, -1.695f, 0.701f)
                close()
                moveTo(23.342f, 12.345f)
                lineToRelative(-7.702f, 8.409f)
                curveToRelative(-1.894f, 2.068f, -4.57f, 3.246f, -7.374f, 3.246f)
                horizontalLineToRelative(-4.262f)
                curveTo(1.794f, 24.0f, 0.003f, 22.209f, 0.003f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(0.003f, 12.791f, 1.794f, 11.0f, 4.003f, 11.0f)
                horizontalLineToRelative(7.787f)
                curveToRelative(1.374f, 0.0f, 2.46f, 1.26f, 2.164f, 2.685f)
                curveToRelative(-0.193f, 0.926f, -1.004f, 1.598f, -1.94f, 1.732f)
                lineToRelative(-4.162f, 0.583f)
                curveToRelative(-0.547f, 0.078f, -0.927f, 0.585f, -0.848f, 1.131f)
                curveToRelative(0.078f, 0.547f, 0.585f, 0.926f, 1.131f, 0.848f)
                lineToRelative(4.252f, -0.596f)
                curveToRelative(2.062f, -0.294f, 3.617f, -2.087f, 3.617f, -4.17f)
                curveToRelative(0.0f, -0.219f, -0.032f, -0.429f, -0.065f, -0.638f)
                lineToRelative(3.541f, -3.737f)
                curveToRelative(0.455f, -0.5f, 1.097f, -0.803f, 1.794f, -0.835f)
                curveToRelative(0.692f, -0.034f, 1.363f, 0.209f, 1.878f, 0.678f)
                curveToRelative(1.052f, 0.958f, 1.138f, 2.602f, 0.189f, 3.665f)
                close()
            }
        }
        .build()
        return _benefit!!
    }

private var _benefit: ImageVector? = null
