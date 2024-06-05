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

public val Icons.Filled.ThumbsUpTrust: ImageVector
    get() {
        if (_thumbsUpTrust != null) {
            return _thumbsUpTrust!!
        }
        _thumbsUpTrust = Builder(name = "ThumbsUpTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.095f, 18.042f)
                lineToRelative(0.628f, 2.825f)
                curveToRelative(0.407f, 1.83f, 2.03f, 3.132f, 3.905f, 3.132f)
                horizontalLineToRelative(4.373f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-0.456f)
                reflectiveCurveToRelative(-2.193f, -4.149f, -2.193f, -4.149f)
                curveToRelative(-0.18f, -0.352f, -0.428f, -0.614f, -0.682f, -0.719f)
                curveToRelative(-0.212f, -0.088f, -0.427f, -0.132f, -0.64f, -0.132f)
                curveToRelative(-0.682f, 0.0f, -1.244f, 0.446f, -1.432f, 1.136f)
                curveToRelative(-0.022f, 0.08f, -0.05f, 0.265f, 0.007f, 0.599f)
                lineToRelative(0.58f, 3.265f)
                horizontalLineToRelative(-3.649f)
                curveToRelative(-1.599f, 0.0f, -2.787f, 1.481f, -2.44f, 3.042f)
                close()
                moveTo(9.5f, 0.0f)
                curveTo(4.253f, 0.0f, 0.0f, 4.253f, 0.0f, 9.5f)
                curveToRelative(0.0f, 4.818f, 3.59f, 8.788f, 8.238f, 9.407f)
                lineToRelative(-0.096f, -0.431f)
                curveToRelative(-0.298f, -1.339f, 0.024f, -2.722f, 0.883f, -3.792f)
                curveToRelative(0.858f, -1.069f, 2.138f, -1.684f, 3.51f, -1.684f)
                horizontalLineToRelative(1.263f)
                lineToRelative(-0.162f, -0.916f)
                curveToRelative(-0.098f, -0.561f, -0.084f, -1.059f, 0.036f, -1.489f)
                curveToRelative(0.42f, -1.546f, 1.771f, -2.596f, 3.356f, -2.596f)
                curveToRelative(0.478f, 0.0f, 0.951f, 0.096f, 1.407f, 0.285f)
                curveToRelative(0.179f, 0.074f, 0.352f, 0.17f, 0.517f, 0.283f)
                curveTo(18.484f, 3.759f, 14.432f, 0.0f, 9.5f, 0.0f)
                close()
                moveTo(13.9f, 7.219f)
                lineToRelative(-3.721f, 3.566f)
                curveToRelative(-0.975f, 0.956f, -2.537f, 0.953f, -3.508f, -0.007f)
                lineToRelative(-1.873f, -1.778f)
                curveToRelative(-0.393f, -0.388f, -0.397f, -1.02f, -0.011f, -1.415f)
                curveToRelative(0.388f, -0.395f, 1.022f, -0.402f, 1.418f, -0.014f)
                lineToRelative(2.21f, 2.097f)
                lineToRelative(4.086f, -3.885f)
                curveToRelative(0.398f, -0.385f, 1.032f, -0.376f, 1.418f, 0.022f)
                curveToRelative(0.384f, 0.396f, 0.376f, 1.028f, -0.018f, 1.414f)
                close()
            }
        }
        .build()
        return _thumbsUpTrust!!
    }

private var _thumbsUpTrust: ImageVector? = null
