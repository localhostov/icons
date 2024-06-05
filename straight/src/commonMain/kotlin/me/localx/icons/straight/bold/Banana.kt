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

public val Icons.Bold.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.781f, 16.352f)
                lineToRelative(1.219f, -0.775f)
                curveToRelative(-0.775f, -1.959f, -2.24f, -3.438f, -4.001f, -4.291f)
                curveTo(19.985f, 6.386f, 19.47f, 0.023f, 15.451f, 0.009f)
                horizontalLineToRelative(-0.016f)
                curveTo(12.094f, 0.009f, 10.859f, 3.905f, 10.255f, 8.259f)
                curveToRelative(-0.211f, -0.053f, -0.435f, -0.103f, -0.688f, -0.146f)
                curveToRelative(-2.125f, -0.359f, -4.273f, 0.132f, -6.035f, 1.383f)
                lineToRelative(0.471f, 1.504f)
                curveToRelative(2.691f, -0.245f, 4.416f, 0.306f, 5.572f, 1.06f)
                curveToRelative(-0.53f, 1.465f, -1.683f, 3.523f, -4.168f, 4.767f)
                curveToRelative(-2.407f, 1.037f, -3.631f, 2.571f, -4.042f, 3.173f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.234f)
                lineToRelative(0.514f, 0.298f)
                curveToRelative(0.202f, 0.117f, 1.333f, 0.702f, 3.752f, 0.702f)
                curveToRelative(4.427f, 0.0f, 7.483f, -1.221f, 9.59f, -2.812f)
                curveToRelative(-0.203f, -1.335f, -0.587f, -2.233f, -1.167f, -2.922f)
                curveToRelative(-1.962f, 1.803f, -4.766f, 2.734f, -8.423f, 2.734f)
                curveToRelative(-0.39f, 0.0f, -0.725f, -0.019f, -1.008f, -0.047f)
                curveToRelative(0.461f, -0.436f, 1.168f, -0.97f, 2.179f, -1.406f)
                curveToRelative(2.682f, -1.341f, 4.227f, -3.343f, 5.122f, -5.112f)
                curveToRelative(2.506f, 1.242f, 4.748f, 2.459f, 5.315f, 6.679f)
                lineToRelative(1.392f, 0.386f)
                curveToRelative(1.058f, -2.133f, 1.417f, -4.466f, 0.881f, -6.489f)
                curveToRelative(0.01f, -0.031f, 0.017f, -0.06f, 0.027f, -0.091f)
                curveToRelative(1.054f, 0.182f, 2.168f, 0.606f, 3.374f, 1.431f)
                close()
                moveTo(13.05f, 10.128f)
                curveToRelative(0.743f, -6.747f, 2.112f, -7.119f, 2.388f, -7.119f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.016f, 0.0f, 1.561f, 0.504f, 1.561f, 8.485f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.006f, 0.0f, 0.006f)
                curveToRelative(0.0f, 0.002f, -0.499f, 0.991f, -1.791f, 0.998f)
                curveToRelative(-0.617f, -0.039f, -2.014f, -0.356f, -2.158f, -2.371f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
