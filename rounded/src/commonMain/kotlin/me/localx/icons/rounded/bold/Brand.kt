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

public val Icons.Bold.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.311f, 11.408f)
                lineToRelative(-7.416f, -7.438f)
                curveToRelative(-1.254f, -1.246f, -3.053f, -1.851f, -4.844f, -1.613f)
                lineToRelative(-4.796f, 0.775f)
                lineTo(2.563f, 0.439f)
                curveTo(1.977f, -0.146f, 1.028f, -0.146f, 0.442f, 0.439f)
                reflectiveCurveTo(-0.144f, 1.975f, 0.442f, 2.561f)
                lineToRelative(2.626f, 2.626f)
                lineToRelative(-0.72f, 5.17f)
                curveToRelative(-0.136f, 1.689f, 0.478f, 3.343f, 1.676f, 4.53f)
                lineToRelative(7.436f, 7.446f)
                curveToRelative(1.084f, 1.076f, 2.52f, 1.667f, 4.046f, 1.667f)
                horizontalLineToRelative(0.024f)
                curveToRelative(1.535f, -0.006f, 2.976f, -0.61f, 4.057f, -1.701f)
                lineToRelative(2.751f, -2.776f)
                curveToRelative(2.228f, -2.247f, 2.214f, -5.891f, -0.026f, -8.114f)
                close()
                moveTo(20.207f, 17.411f)
                lineToRelative(-2.751f, 2.776f)
                curveToRelative(-0.517f, 0.521f, -1.205f, 0.81f, -1.938f, 0.812f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.729f, 0.0f, -1.415f, -0.282f, -1.928f, -0.791f)
                lineToRelative(-7.437f, -7.447f)
                curveToRelative(-0.574f, -0.569f, -0.867f, -1.359f, -0.812f, -2.078f)
                lineToRelative(0.397f, -2.84f)
                lineToRelative(1.312f, 1.312f)
                curveToRelative(-0.016f, 0.114f, -0.035f, 0.227f, -0.035f, 0.345f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.118f, 0.0f, -0.23f, 0.019f, -0.344f, 0.035f)
                lineToRelative(-1.288f, -1.288f)
                lineToRelative(2.616f, -0.423f)
                curveToRelative(0.85f, -0.113f, 1.688f, 0.171f, 2.289f, 0.769f)
                lineToRelative(7.416f, 7.438f)
                curveToRelative(1.072f, 1.065f, 1.079f, 2.806f, 0.015f, 3.88f)
                close()
                moveTo(17.563f, 13.439f)
                curveToRelative(0.586f, 0.586f, 0.586f, 1.535f, 0.0f, 2.121f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.586f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
