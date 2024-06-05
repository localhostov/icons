package me.localx.icons.rounded.outline

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

public val Icons.Outline.StarExclamation: ImageVector
    get() {
        if (_starExclamation != null) {
            return _starExclamation!!
        }
        _starExclamation = Builder(name = "StarExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 18.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23.833f, 8.53f)
                curveToRelative(-0.438f, -1.352f, -1.643f, -2.226f, -3.067f, -2.226f)
                horizontalLineToRelative(-4.373f)
                lineToRelative(-1.323f, -4.047f)
                curveTo(14.631f, 0.896f, 13.425f, 0.018f, 11.997f, 0.018f)
                reflectiveCurveToRelative(-2.637f, 0.88f, -3.072f, 2.236f)
                lineToRelative(-1.323f, 4.049f)
                lineTo(3.229f, 6.303f)
                curveToRelative(-1.425f, 0.0f, -2.63f, 0.876f, -3.069f, 2.229f)
                curveToRelative(-0.44f, 1.348f, 0.015f, 2.762f, 1.162f, 3.602f)
                lineToRelative(3.566f, 2.606f)
                lineToRelative(-1.355f, 4.272f)
                curveToRelative(-0.438f, 1.358f, 0.026f, 2.774f, 1.184f, 3.609f)
                curveToRelative(0.562f, 0.405f, 1.216f, 0.62f, 1.89f, 0.62f)
                curveToRelative(0.423f, 0.0f, 0.885f, -0.227f, 1.199f, -0.417f)
                curveToRelative(0.472f, -0.286f, 0.622f, -0.899f, 0.336f, -1.371f)
                curveToRelative(-0.284f, -0.471f, -0.899f, -0.625f, -1.372f, -0.34f)
                curveToRelative(-0.076f, 0.045f, -0.179f, 0.097f, -0.245f, 0.125f)
                curveToRelative(-0.224f, -0.016f, -0.443f, -0.098f, -0.639f, -0.239f)
                curveToRelative(-0.447f, -0.322f, -0.62f, -0.849f, -0.449f, -1.378f)
                lineToRelative(1.574f, -4.962f)
                curveToRelative(0.13f, -0.409f, -0.016f, -0.856f, -0.363f, -1.109f)
                lineToRelative(-4.146f, -3.03f)
                curveToRelative(-0.442f, -0.324f, -0.612f, -0.848f, -0.441f, -1.369f)
                curveToRelative(0.169f, -0.522f, 0.617f, -0.847f, 1.167f, -0.847f)
                horizontalLineToRelative(5.098f)
                curveToRelative(0.433f, 0.0f, 0.816f, -0.279f, 0.951f, -0.69f)
                lineToRelative(1.55f, -4.744f)
                curveToRelative(0.168f, -0.525f, 0.617f, -0.852f, 1.169f, -0.852f)
                reflectiveCurveToRelative(1.0f, 0.327f, 1.17f, 0.856f)
                lineToRelative(1.549f, 4.74f)
                curveToRelative(0.135f, 0.411f, 0.518f, 0.689f, 0.951f, 0.689f)
                horizontalLineToRelative(5.098f)
                curveToRelative(0.55f, 0.0f, 0.997f, 0.323f, 1.166f, 0.846f)
                curveToRelative(0.17f, 0.521f, 0.0f, 1.047f, -0.442f, 1.372f)
                lineToRelative(-4.144f, 3.029f)
                curveToRelative(-0.347f, 0.253f, -0.493f, 0.7f, -0.363f, 1.109f)
                lineToRelative(1.575f, 4.968f)
                curveToRelative(0.169f, 0.525f, -0.002f, 1.05f, -0.449f, 1.372f)
                curveToRelative(-0.199f, 0.144f, -0.422f, 0.227f, -0.65f, 0.241f)
                curveToRelative(-0.054f, -0.023f, -0.135f, -0.067f, -0.192f, -0.104f)
                curveToRelative(-0.459f, -0.305f, -1.079f, -0.18f, -1.385f, 0.279f)
                curveToRelative(-0.306f, 0.459f, -0.182f, 1.081f, 0.277f, 1.387f)
                curveToRelative(0.247f, 0.165f, 0.734f, 0.44f, 1.228f, 0.44f)
                curveToRelative(0.676f, 0.0f, 1.331f, -0.215f, 1.893f, -0.622f)
                curveToRelative(1.156f, -0.833f, 1.62f, -2.25f, 1.183f, -3.603f)
                lineToRelative(-1.356f, -4.278f)
                lineToRelative(3.564f, -2.605f)
                curveToRelative(1.148f, -0.84f, 1.604f, -2.256f, 1.163f, -3.605f)
                close()
            }
        }
        .build()
        return _starExclamation!!
    }

private var _starExclamation: ImageVector? = null
