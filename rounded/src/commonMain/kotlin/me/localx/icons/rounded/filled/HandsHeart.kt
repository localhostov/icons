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

public val Icons.Filled.HandsHeart: ImageVector
    get() {
        if (_handsHeart != null) {
            return _handsHeart!!
        }
        _handsHeart = Builder(name = "HandsHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.708f, 12.55f)
                curveToRelative(-1.007f, -0.934f, -2.66f, -0.748f, -3.412f, 0.498f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.488f, 0.81f, -0.35f, 1.855f, 0.245f, 2.589f)
                lineToRelative(1.788f, 2.304f)
                curveToRelative(0.339f, 0.436f, 0.26f, 1.064f, -0.177f, 1.403f)
                curveToRelative(-0.436f, 0.339f, -1.064f, 0.26f, -1.403f, -0.177f)
                lineToRelative(-1.788f, -2.304f)
                curveToRelative(-1.122f, -1.383f, -1.285f, -3.345f, -0.378f, -4.848f)
                curveToRelative(0.123f, -0.204f, 0.266f, -0.391f, 0.417f, -0.568f)
                verticalLineToRelative(-5.844f)
                curveToRelative(0.0f, -1.308f, -0.941f, -2.499f, -2.242f, -2.63f)
                curveToRelative(-1.496f, -0.15f, -2.758f, 1.021f, -2.758f, 2.487f)
                verticalLineToRelative(10.547f)
                curveToRelative(0.0f, 2.134f, 0.853f, 4.18f, 2.369f, 5.683f)
                lineToRelative(1.792f, 1.775f)
                curveToRelative(0.37f, 0.343f, 0.855f, 0.533f, 1.36f, 0.533f)
                horizontalLineToRelative(7.479f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.82f)
                curveToRelative(0.0f, -1.655f, -0.684f, -3.237f, -1.89f, -4.371f)
                lineToRelative(-2.402f, -2.258f)
                close()
                moveTo(21.242f, 2.975f)
                curveToRelative(-1.301f, 0.13f, -2.242f, 1.322f, -2.242f, 2.63f)
                verticalLineToRelative(5.844f)
                curveToRelative(0.151f, 0.177f, 0.293f, 0.363f, 0.417f, 0.568f)
                curveToRelative(0.906f, 1.503f, 0.744f, 3.465f, -0.378f, 4.848f)
                lineToRelative(-3.038f, 3.024f)
                verticalLineToRelative(3.112f)
                curveToRelative(0.0f, 0.352f, -0.072f, 0.686f, -0.184f, 1.0f)
                horizontalLineToRelative(2.664f)
                curveToRelative(0.504f, 0.0f, 0.99f, -0.19f, 1.36f, -0.533f)
                lineToRelative(1.79f, -1.772f)
                curveToRelative(1.517f, -1.502f, 2.371f, -3.549f, 2.371f, -5.685f)
                lineTo(24.002f, 5.462f)
                curveToRelative(0.0f, -1.466f, -1.261f, -2.637f, -2.758f, -2.487f)
                close()
                moveTo(17.704f, 13.049f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.752f, -1.246f, -2.405f, -1.432f, -3.412f, -0.498f)
                lineToRelative(-0.832f, 0.782f)
                lineToRelative(0.02f, 0.019f)
                curveToRelative(1.141f, 1.073f, 1.921f, 2.464f, 2.283f, 3.968f)
                lineToRelative(1.695f, -1.682f)
                curveToRelative(0.595f, -0.734f, 0.733f, -1.78f, 0.245f, -2.589f)
                close()
                moveTo(17.003f, 2.751f)
                curveToRelative(0.0f, 2.163f, -2.82f, 4.851f, -4.225f, 5.978f)
                curveToRelative(-0.453f, 0.363f, -1.097f, 0.363f, -1.55f, 0.0f)
                curveToRelative(-1.405f, -1.128f, -4.225f, -3.815f, -4.225f, -5.978f)
                curveToRelative(-0.066f, -1.449f, 1.052f, -2.678f, 2.5f, -2.75f)
                curveToRelative(1.448f, 0.072f, 2.566f, 1.301f, 2.5f, 2.75f)
                curveToRelative(-0.066f, -1.449f, 1.052f, -2.678f, 2.5f, -2.75f)
                curveToRelative(1.448f, 0.072f, 2.566f, 1.301f, 2.5f, 2.75f)
                close()
            }
        }
        .build()
        return _handsHeart!!
    }

private var _handsHeart: ImageVector? = null
