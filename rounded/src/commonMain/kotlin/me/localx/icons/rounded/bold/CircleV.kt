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

public val Icons.Bold.CircleV: ImageVector
    get() {
        if (_circleV != null) {
            return _circleV!!
        }
        _circleV = Builder(name = "CircleV", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.41f, 8.511f)
                lineToRelative(-2.776f, 7.666f)
                curveToRelative(-0.44f, 1.122f, -1.469f, 1.823f, -2.634f, 1.823f)
                reflectiveCurveToRelative(-2.194f, -0.701f, -2.62f, -1.785f)
                lineToRelative(-2.79f, -7.704f)
                curveToRelative(-0.282f, -0.779f, 0.121f, -1.639f, 0.899f, -1.921f)
                curveToRelative(0.779f, -0.283f, 1.639f, 0.12f, 1.921f, 0.899f)
                lineToRelative(2.59f, 7.152f)
                lineToRelative(2.589f, -7.152f)
                curveToRelative(0.282f, -0.779f, 1.144f, -1.183f, 1.921f, -0.899f)
                curveToRelative(0.779f, 0.282f, 1.182f, 1.142f, 0.899f, 1.921f)
                close()
                moveTo(24.0f, 11.5f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.117f, 0.0f, 11.5f)
                reflectiveCurveTo(5.383f, -0.5f, 12.0f, -0.5f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(21.0f, 11.5f)
                curveToRelative(0.0f, -4.963f, -4.038f, -9.0f, -9.0f, -9.0f)
                reflectiveCurveTo(3.0f, 6.537f, 3.0f, 11.5f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _circleV!!
    }

private var _circleV: ImageVector? = null
