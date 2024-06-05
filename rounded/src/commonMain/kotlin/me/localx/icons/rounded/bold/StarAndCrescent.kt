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

public val Icons.Bold.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.826f, 19.594f)
                curveToRelative(-2.977f, -1.753f, -4.826f, -4.663f, -4.826f, -7.594f)
                reflectiveCurveToRelative(1.849f, -5.839f, 4.822f, -7.592f)
                curveToRelative(0.894f, -0.526f, 1.343f, -1.549f, 1.119f, -2.546f)
                curveToRelative(-0.223f, -0.988f, -1.151f, -1.7f, -2.192f, -1.814f)
                curveTo(7.409f, -0.467f, 1.782f, 3.333f, 0.36f, 9.084f)
                curveToRelative(-0.882f, 3.564f, -0.102f, 7.25f, 2.14f, 10.114f)
                curveToRelative(2.389f, 3.052f, 6.038f, 4.802f, 10.013f, 4.802f)
                curveToRelative(0.448f, 0.0f, 0.878f, -0.015f, 1.3f, -0.051f)
                curveToRelative(1.047f, -0.09f, 1.903f, -0.823f, 2.13f, -1.823f)
                curveToRelative(0.225f, -0.989f, -0.224f, -2.006f, -1.116f, -2.531f)
                close()
                moveTo(4.862f, 17.349f)
                curveToRelative(-1.693f, -2.164f, -2.258f, -4.843f, -1.59f, -7.544f)
                curveToRelative(0.921f, -3.726f, 4.254f, -6.356f, 8.265f, -6.753f)
                curveToRelative(-2.84f, 2.323f, -4.537f, 5.605f, -4.537f, 8.948f)
                reflectiveCurveToRelative(1.701f, 6.631f, 4.545f, 8.955f)
                curveToRelative(-2.663f, -0.25f, -5.061f, -1.533f, -6.683f, -3.605f)
                close()
                moveTo(23.703f, 11.496f)
                lineToRelative(-1.971f, 1.606f)
                lineToRelative(0.815f, 2.484f)
                curveToRelative(0.112f, 0.336f, -0.002f, 0.706f, -0.282f, 0.922f)
                curveToRelative(-0.281f, 0.216f, -0.667f, 0.231f, -0.964f, 0.038f)
                lineToRelative(-2.295f, -1.495f)
                lineToRelative(-2.257f, 1.51f)
                curveToRelative(-0.14f, 0.094f, -0.302f, 0.141f, -0.463f, 0.141f)
                curveToRelative(-0.176f, 0.0f, -0.352f, -0.056f, -0.5f, -0.166f)
                curveToRelative(-0.283f, -0.212f, -0.401f, -0.58f, -0.295f, -0.917f)
                lineToRelative(0.784f, -2.513f)
                lineToRelative(-1.981f, -1.612f)
                curveToRelative(-0.267f, -0.226f, -0.364f, -0.594f, -0.243f, -0.922f)
                curveToRelative(0.12f, -0.328f, 0.433f, -0.546f, 0.782f, -0.546f)
                horizontalLineToRelative(2.501f)
                lineToRelative(0.885f, -2.483f)
                curveToRelative(0.121f, -0.326f, 0.433f, -0.542f, 0.781f, -0.542f)
                reflectiveCurveToRelative(0.66f, 0.216f, 0.781f, 0.542f)
                lineToRelative(0.885f, 2.483f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.35f, 0.0f, 0.663f, 0.219f, 0.783f, 0.548f)
                curveToRelative(0.12f, 0.329f, 0.022f, 0.698f, -0.246f, 0.923f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
