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

public val Icons.Bold.CarCircleBolt: ImageVector
    get() {
        if (_carCircleBolt != null) {
            return _carCircleBolt!!
        }
        _carCircleBolt = Builder(name = "CarCircleBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(1.682f)
                curveToRelative(0.0f, 1.278f, 1.04f, 2.318f, 2.318f, 2.318f)
                horizontalLineToRelative(2.182f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.533f)
                curveToRelative(-1.774f, -0.863f, -3.0f, -2.684f, -3.0f, -4.786f)
                verticalLineToRelative(-2.727f)
                curveToRelative(0.0f, -0.809f, 0.14f, -1.604f, 0.417f, -2.364f)
                lineTo(2.995f, 3.5f)
                curveTo(3.756f, 1.407f, 5.765f, 0.0f, 7.993f, 0.0f)
                horizontalLineToRelative(8.015f)
                curveToRelative(2.228f, 0.0f, 4.236f, 1.407f, 4.997f, 3.5f)
                lineToRelative(1.632f, 4.487f)
                curveToRelative(0.283f, 0.778f, -0.118f, 1.639f, -0.896f, 1.922f)
                reflectiveCurveToRelative(-1.64f, -0.119f, -1.922f, -0.897f)
                lineToRelative(-1.632f, -4.487f)
                curveToRelative(-0.332f, -0.913f, -1.208f, -1.526f, -2.179f, -1.526f)
                lineTo(7.993f, 2.999f)
                curveToRelative(-0.971f, 0.0f, -1.847f, 0.613f, -2.179f, 1.526f)
                lineToRelative(-2.354f, 6.474f)
                horizontalLineToRelative(5.04f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(20.748f, 17.108f)
                curveToRelative(-0.366f, -0.684f, -1.077f, -1.108f, -1.853f, -1.108f)
                horizontalLineToRelative(-1.173f)
                lineToRelative(0.448f, -0.73f)
                curveToRelative(0.43f, -0.702f, 0.211f, -1.619f, -0.49f, -2.051f)
                curveToRelative(-0.708f, -0.436f, -1.635f, -0.209f, -2.062f, 0.504f)
                lineToRelative(-1.527f, 2.55f)
                curveToRelative(-0.193f, 0.638f, -0.07f, 1.337f, 0.326f, 1.873f)
                curveToRelative(0.397f, 0.535f, 1.032f, 0.854f, 1.698f, 0.854f)
                horizontalLineToRelative(0.938f)
                lineToRelative(-0.501f, 0.612f)
                curveToRelative(-0.529f, 0.647f, -0.423f, 1.603f, 0.235f, 2.118f)
                curveToRelative(0.644f, 0.504f, 1.573f, 0.396f, 2.084f, -0.242f)
                lineToRelative(1.778f, -2.223f)
                curveToRelative(0.429f, -0.647f, 0.467f, -1.474f, 0.1f, -2.157f)
                close()
            }
        }
        .build()
        return _carCircleBolt!!
    }

private var _carCircleBolt: ImageVector? = null
