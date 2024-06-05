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

public val Icons.Bold.Scarf: ImageVector
    get() {
        if (_scarf != null) {
            return _scarf!!
        }
        _scarf = Builder(name = "Scarf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.766f, 18.149f)
                lineToRelative(-4.812f, -4.789f)
                lineToRelative(3.738f, -3.738f)
                lineToRelative(-0.112f, -0.748f)
                curveToRelative(-0.376f, -2.504f, -1.376f, -4.493f, -3.519f, -6.934f)
                curveToRelative(-0.198f, -0.199f, -2.055f, -1.939f, -6.061f, -1.939f)
                curveToRelative(-3.955f, 0.0f, -6.302f, 1.727f, -6.4f, 1.8f)
                lineToRelative(-0.229f, 0.212f)
                curveToRelative(-2.144f, 2.448f, -2.605f, 4.556f, -2.951f, 6.862f)
                lineToRelative(-0.112f, 0.748f)
                lineToRelative(3.734f, 3.734f)
                lineToRelative(-4.807f, 4.795f)
                lineToRelative(6.044f, 5.883f)
                lineToRelative(4.72f, -4.72f)
                lineToRelative(4.72f, 4.72f)
                lineToRelative(6.045f, -5.885f)
                close()
                moveTo(15.828f, 11.244f)
                lineToRelative(-1.716f, -1.708f)
                lineToRelative(3.387f, -3.372f)
                curveToRelative(0.475f, 0.799f, 0.784f, 1.575f, 0.978f, 2.43f)
                lineToRelative(-2.65f, 2.65f)
                close()
                moveTo(12.001f, 3.0f)
                curveToRelative(1.912f, 0.0f, 3.059f, 0.504f, 3.596f, 0.825f)
                lineToRelative(-2.255f, 2.245f)
                curveToRelative(-0.878f, -0.092f, -1.807f, -0.092f, -2.711f, 0.0f)
                lineToRelative(-2.352f, -2.341f)
                curveToRelative(0.773f, -0.338f, 2.035f, -0.73f, 3.722f, -0.73f)
                close()
                moveTo(6.278f, 5.972f)
                lineToRelative(11.133f, 11.08f)
                lineToRelative(-1.738f, 1.692f)
                lineTo(5.507f, 8.578f)
                curveToRelative(0.179f, -1.012f, 0.398f, -1.83f, 0.77f, -2.606f)
                close()
                moveTo(8.279f, 18.793f)
                lineToRelative(-1.74f, -1.695f)
                lineToRelative(1.625f, -1.621f)
                lineToRelative(1.715f, 1.715f)
                lineToRelative(-1.6f, 1.6f)
                close()
            }
        }
        .build()
        return _scarf!!
    }

private var _scarf: ImageVector? = null
