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
                moveToRelative(19.679f, 2.546f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-7.678f, 2.546f)
                curveToRelative(-1.39f, 0.459f, -2.322f, 1.75f, -2.322f, 3.211f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.52f, 6.852f, 10.45f, 8.95f, 11.499f)
                lineToRelative(0.985f, 0.494f)
                lineToRelative(1.021f, -0.412f)
                curveToRelative(2.122f, -0.854f, 9.044f, -4.21f, 9.044f, -11.581f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.461f, -0.933f, -2.752f, -2.321f, -3.211f)
                close()
                moveTo(5.0f, 11.919f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -0.165f, 0.106f, -0.311f, 0.265f, -0.363f)
                lineToRelative(5.235f, -1.736f)
                verticalLineToRelative(16.055f)
                curveToRelative(-2.298f, -1.465f, -5.5f, -4.156f, -5.5f, -7.794f)
                close()
                moveTo(19.0f, 11.919f)
                curveToRelative(0.0f, 4.221f, -3.237f, 6.749f, -5.5f, 8.001f)
                lineTo(13.5f, 3.657f)
                lineToRelative(5.236f, 1.736f)
                curveToRelative(0.157f, 0.053f, 0.264f, 0.198f, 0.264f, 0.363f)
                verticalLineToRelative(6.162f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
