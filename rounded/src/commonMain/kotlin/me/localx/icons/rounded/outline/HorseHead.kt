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

public val Icons.Outline.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = Builder(name = "HorseHead", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 13.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.303f, 13.887f)
                curveToRelative(-0.215f, -0.191f, -0.409f, -0.37f, -0.564f, -0.526f)
                curveToRelative(-1.852f, -1.852f, -3.105f, -4.005f, -4.211f, -5.904f)
                curveToRelative(-0.873f, -1.5f, -1.636f, -2.81f, -2.527f, -3.614f)
                lineTo(15.001f, 0.814f)
                curveToRelative(0.0f, -0.543f, -0.521f, -0.926f, -1.045f, -0.785f)
                curveToRelative(-1.453f, 0.392f, -2.578f, 1.583f, -2.876f, 3.073f)
                curveTo(2.391f, 4.057f, 0.0f, 11.488f, 0.0f, 16.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.126f, 0.309f, -11.0f, 11.0f, -11.0f)
                curveToRelative(0.782f, 0.0f, 1.761f, 1.682f, 2.798f, 3.463f)
                curveToRelative(1.11f, 1.905f, 2.49f, 4.277f, 4.525f, 6.311f)
                curveToRelative(0.178f, 0.179f, 0.401f, 0.386f, 0.65f, 0.607f)
                curveToRelative(1.184f, 1.053f, 1.363f, 2.85f, 0.41f, 4.089f)
                lineToRelative(-0.084f, 0.109f)
                curveToRelative(-0.322f, 0.418f, -0.891f, 0.541f, -1.352f, 0.294f)
                curveToRelative(-0.355f, -0.191f, -0.789f, -0.415f, -1.272f, -0.664f)
                curveToRelative(-1.493f, -0.771f, -3.537f, -1.825f, -5.12f, -2.886f)
                curveToRelative(-0.605f, -0.406f, -1.389f, -0.366f, -1.95f, 0.094f)
                curveToRelative(-0.558f, 0.458f, -0.747f, 1.213f, -0.47f, 1.88f)
                curveToRelative(0.856f, 2.065f, 2.729f, 5.104f, 2.809f, 5.232f)
                curveToRelative(0.189f, 0.306f, 0.517f, 0.474f, 0.852f, 0.474f)
                curveToRelative(0.179f, 0.0f, 0.361f, -0.048f, 0.525f, -0.149f)
                curveToRelative(0.47f, -0.29f, 0.615f, -0.906f, 0.325f, -1.376f)
                curveToRelative(-0.015f, -0.024f, -1.256f, -2.037f, -2.142f, -3.818f)
                curveToRelative(1.443f, 0.876f, 3.029f, 1.694f, 4.254f, 2.327f)
                curveToRelative(0.472f, 0.243f, 0.895f, 0.462f, 1.243f, 0.649f)
                curveToRelative(1.329f, 0.712f, 2.961f, 0.361f, 3.882f, -0.835f)
                lineToRelative(0.084f, -0.109f)
                curveToRelative(1.59f, -2.068f, 1.298f, -5.057f, -0.665f, -6.804f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
