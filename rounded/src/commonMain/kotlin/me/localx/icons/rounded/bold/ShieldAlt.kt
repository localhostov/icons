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

public val Icons.Bold.ShieldAlt: ImageVector
    get() {
        if (_shieldAlt != null) {
            return _shieldAlt!!
        }
        _shieldAlt = Builder(name = "ShieldAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.383f, 2.036f)
                lineTo(12.472f, 0.076f)
                curveToRelative(-0.307f, -0.102f, -0.637f, -0.102f, -0.943f, 0.0f)
                lineToRelative(-5.912f, 1.96f)
                curveToRelative(-2.163f, 0.718f, -3.616f, 2.73f, -3.616f, 5.01f)
                verticalLineToRelative(5.105f)
                curveToRelative(0.0f, 6.52f, 6.852f, 10.45f, 8.95f, 11.499f)
                lineToRelative(0.38f, 0.19f)
                curveToRelative(0.211f, 0.105f, 0.441f, 0.159f, 0.672f, 0.159f)
                curveToRelative(0.19f, 0.0f, 0.381f, -0.036f, 0.562f, -0.109f)
                lineToRelative(0.393f, -0.158f)
                curveToRelative(2.122f, -0.854f, 9.044f, -4.21f, 9.044f, -11.581f)
                verticalLineToRelative(-5.105f)
                curveToRelative(0.0f, -2.279f, -1.453f, -4.292f, -3.617f, -5.01f)
                close()
                moveTo(5.0f, 12.151f)
                verticalLineToRelative(-5.105f)
                curveToRelative(0.0f, -0.983f, 0.627f, -1.853f, 1.561f, -2.162f)
                lineToRelative(3.939f, -1.306f)
                verticalLineToRelative(16.371f)
                curveToRelative(-2.297f, -1.465f, -5.5f, -4.161f, -5.5f, -7.797f)
                close()
                moveTo(19.0f, 12.151f)
                curveToRelative(0.0f, 4.219f, -3.238f, 6.75f, -5.5f, 8.003f)
                lineTo(13.5f, 3.578f)
                lineToRelative(3.938f, 1.306f)
                curveToRelative(0.935f, 0.31f, 1.562f, 1.179f, 1.562f, 2.162f)
                verticalLineToRelative(5.105f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
