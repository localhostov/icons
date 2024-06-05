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

public val Icons.Filled.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 8.141f)
                verticalLineToRelative(10.859f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-6.999f)
                curveToRelative(0.523f, 0.0f, 1.026f, -0.222f, 1.378f, -0.61f)
                lineToRelative(1.707f, -1.884f)
                curveToRelative(0.745f, -0.721f, 1.068f, -1.797f, 0.841f, -2.812f)
                lineToRelative(-1.689f, -7.519f)
                lineToRelative(7.331f, -7.331f)
                lineToRelative(0.204f, 0.136f)
                curveToRelative(1.394f, 0.929f, 2.227f, 2.484f, 2.227f, 4.16f)
                close()
                moveTo(10.023f, 8.609f)
                lineToRelative(0.848f, -2.826f)
                lineTo(5.925f, 0.816f)
                curveToRelative(-0.293f, 0.19f, -0.569f, 0.406f, -0.817f, 0.655f)
                lineToRelative(-1.109f, 1.114f)
                lineToRelative(6.025f, 6.025f)
                close()
                moveTo(13.975f, 19.132f)
                lineToRelative(-1.976f, -8.795f)
                lineToRelative(-1.947f, 8.672f)
                curveToRelative(-0.114f, 0.405f, -0.017f, 0.781f, 0.24f, 1.038f)
                lineToRelative(1.708f, 1.886f)
                lineToRelative(1.649f, -1.817f)
                curveToRelative(0.294f, -0.287f, 0.401f, -0.646f, 0.326f, -0.983f)
                close()
                moveTo(18.872f, 1.458f)
                curveToRelative(-0.235f, -0.235f, -0.492f, -0.443f, -0.767f, -0.625f)
                lineToRelative(-4.975f, 4.954f)
                lineToRelative(0.847f, 2.823f)
                lineToRelative(6.023f, -6.023f)
                lineToRelative(-1.128f, -1.128f)
                close()
                moveTo(8.844f, 21.424f)
                curveToRelative(-0.735f, -0.734f, -1.028f, -1.863f, -0.729f, -2.91f)
                lineToRelative(1.647f, -7.338f)
                lineTo(2.43f, 3.845f)
                lineToRelative(-0.204f, 0.136f)
                curveToRelative(-1.394f, 0.929f, -2.227f, 2.484f, -2.227f, 4.16f)
                verticalLineToRelative(10.859f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(-0.524f, 0.0f, -1.026f, -0.223f, -1.378f, -0.612f)
                lineToRelative(-1.777f, -1.964f)
                close()
                moveTo(12.003f, 4.086f)
                lineTo(16.042f, 0.064f)
                curveToRelative(-0.233f, -0.034f, -0.467f, -0.071f, -0.704f, -0.071f)
                horizontalLineToRelative(-0.005f)
                lineTo(8.646f, -0.001f)
                curveToRelative(-0.218f, 0.0f, -0.433f, 0.037f, -0.648f, 0.066f)
                lineToRelative(4.005f, 4.022f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
