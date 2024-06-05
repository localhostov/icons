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

public val Icons.Bold.Tap: ImageVector
    get() {
        if (_tap != null) {
            return _tap!!
        }
        _tap = Builder(name = "Tap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 19.233f)
                verticalLineToRelative(3.267f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.267f)
                curveToRelative(0.0f, -0.919f, -0.623f, -1.717f, -1.515f, -1.94f)
                lineToRelative(-7.485f, -1.871f)
                verticalLineToRelative(7.079f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.267f)
                curveToRelative(-0.966f, 0.0f, -1.898f, -0.405f, -2.558f, -1.111f)
                curveToRelative(0.0f, 0.0f, -2.226f, -2.387f, -2.26f, -2.434f)
                curveToRelative(-0.524f, -0.711f, -0.636f, -1.849f, 0.166f, -2.649f)
                curveToRelative(0.775f, -0.779f, 1.893f, -0.703f, 2.593f, -0.223f)
                curveToRelative(0.079f, 0.054f, 2.562f, 2.545f, 2.562f, 2.545f)
                curveToRelative(0.024f, 0.024f, 0.07f, 0.07f, 0.167f, 0.03f)
                curveToRelative(0.097f, -0.04f, 0.097f, -0.106f, 0.097f, -0.145f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(5.829f)
                lineToRelative(8.213f, 2.053f)
                curveToRelative(2.229f, 0.557f, 3.787f, 2.551f, 3.787f, 4.851f)
                close()
                moveTo(3.93f, 10.0f)
                curveToRelative(0.201f, 0.0f, 0.404f, -0.041f, 0.6f, -0.126f)
                curveToRelative(0.759f, -0.332f, 1.105f, -1.216f, 0.773f, -1.976f)
                curveToRelative(-0.583f, -1.332f, -0.299f, -2.853f, 0.722f, -3.874f)
                curveToRelative(1.322f, -1.322f, 3.628f, -1.322f, 4.95f, 0.0f)
                curveToRelative(1.021f, 1.021f, 1.304f, 2.542f, 0.722f, 3.875f)
                curveToRelative(-0.332f, 0.759f, 0.015f, 1.643f, 0.774f, 1.975f)
                curveToRelative(0.759f, 0.332f, 1.643f, -0.015f, 1.975f, -0.774f)
                curveToRelative(1.081f, -2.472f, 0.551f, -5.297f, -1.349f, -7.197f)
                curveTo(10.562f, -0.63f, 6.438f, -0.63f, 3.904f, 1.904f)
                curveToRelative(-1.901f, 1.9f, -2.43f, 4.726f, -1.35f, 7.197f)
                curveToRelative(0.247f, 0.563f, 0.797f, 0.899f, 1.375f, 0.899f)
                close()
            }
        }
        .build()
        return _tap!!
    }

private var _tap: ImageVector? = null
