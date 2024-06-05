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

public val Icons.Filled.CloudQuestion: ImageVector
    get() {
        if (_cloudQuestion != null) {
            return _cloudQuestion!!
        }
        _cloudQuestion = Builder(name = "CloudQuestion", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.975f, 7.173f)
                curveToRelative(-0.332f, -0.066f, -0.602f, -0.273f, -0.742f, -0.569f)
                curveToRelative(-1.552f, -3.271f, -5.144f, -5.099f, -8.735f, -4.438f)
                curveToRelative(-3.271f, 0.599f, -5.837f, 3.212f, -6.383f, 6.501f)
                curveToRelative(-0.162f, 0.973f, -0.151f, 1.945f, 0.033f, 2.89f)
                curveToRelative(0.06f, 0.309f, -0.073f, 0.653f, -0.346f, 0.901f)
                curveTo(0.641f, 13.514f, 0.0f, 14.949f, 0.0f, 16.5f)
                curveTo(0.0f, 19.532f, 2.468f, 22.0f, 5.501f, 22.0f)
                horizontalLineToRelative(10.499f)
                lineToRelative(1.077f, -0.003f)
                curveToRelative(3.872f, -0.295f, 6.913f, -3.579f, 6.923f, -7.481f)
                curveToRelative(-0.005f, -3.559f, -2.54f, -6.647f, -6.025f, -7.343f)
                close()
                moveTo(11.5f, 20.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.969f, 13.677f)
                curveToRelative(-0.165f, 0.076f, -0.469f, 0.468f, -0.469f, 0.823f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.224f, 0.839f, -2.272f, 1.629f, -2.638f)
                curveToRelative(0.549f, -0.254f, 1.039f, -0.919f, 0.817f, -1.777f)
                curveToRelative(-0.126f, -0.49f, -0.54f, -0.904f, -1.03f, -1.031f)
                curveToRelative(-0.483f, -0.124f, -0.957f, -0.034f, -1.333f, 0.259f)
                curveToRelative(-0.371f, 0.287f, -0.583f, 0.72f, -0.583f, 1.188f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.091f, 0.495f, -2.101f, 1.359f, -2.77f)
                curveToRelative(0.864f, -0.668f, 1.978f, -0.894f, 3.058f, -0.612f)
                curveToRelative(1.19f, 0.308f, 2.158f, 1.276f, 2.465f, 2.467f)
                curveToRelative(0.429f, 1.66f, -0.376f, 3.381f, -1.913f, 4.092f)
                close()
            }
        }
        .build()
        return _cloudQuestion!!
    }

private var _cloudQuestion: ImageVector? = null
