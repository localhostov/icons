package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.EarMuffs: ImageVector
    get() {
        if (_earMuffs != null) {
            return _earMuffs!!
        }
        _earMuffs = Builder(name = "EarMuffs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.353f)
                curveToRelative(0.0f, -0.74f, -0.339f, -1.392f, -0.857f, -1.823f)
                curveToRelative(0.177f, -0.334f, 0.286f, -0.711f, 0.286f, -1.118f)
                curveToRelative(0.0f, -1.3f, -1.023f, -2.353f, -2.286f, -2.353f)
                curveToRelative(-0.023f, 0.0f, -0.044f, 0.006f, -0.067f, 0.007f)
                curveToRelative(-0.147f, -0.671f, -0.54f, -1.246f, -1.076f, -1.618f)
                verticalLineToRelative(-1.474f)
                curveTo(20.0f, 3.563f, 16.411f, -0.026f, 12.0f, -0.026f)
                reflectiveCurveTo(4.0f, 3.563f, 4.0f, 7.974f)
                verticalLineToRelative(1.474f)
                curveToRelative(-0.537f, 0.372f, -0.93f, 0.947f, -1.076f, 1.618f)
                curveToRelative(-0.023f, 0.0f, -0.044f, -0.007f, -0.067f, -0.007f)
                curveToRelative(-1.262f, 0.0f, -2.286f, 1.053f, -2.286f, 2.353f)
                curveToRelative(0.0f, 0.407f, 0.109f, 0.784f, 0.286f, 1.118f)
                curveToRelative(-0.519f, 0.431f, -0.857f, 1.083f, -0.857f, 1.823f)
                curveToRelative(0.0f, 0.792f, 0.383f, 1.489f, 0.965f, 1.915f)
                curveToRelative(-0.248f, 0.376f, -0.394f, 0.831f, -0.394f, 1.32f)
                curveToRelative(0.0f, 1.299f, 1.023f, 2.353f, 2.286f, 2.353f)
                curveToRelative(0.023f, 0.0f, 0.044f, -0.006f, 0.067f, -0.007f)
                curveToRelative(0.258f, 1.181f, 1.279f, 2.066f, 2.505f, 2.066f)
                curveToRelative(1.42f, 0.0f, 2.571f, -1.185f, 2.571f, -2.647f)
                verticalLineToRelative(-9.706f)
                curveToRelative(0.0f, -1.26f, -0.855f, -2.313f, -2.0f, -2.581f)
                verticalLineToRelative(-1.092f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                verticalLineToRelative(1.092f)
                curveToRelative(-1.145f, 0.268f, -2.0f, 1.321f, -2.0f, 2.581f)
                verticalLineToRelative(9.706f)
                curveToRelative(0.0f, 1.462f, 1.151f, 2.647f, 2.571f, 2.647f)
                curveToRelative(1.226f, 0.0f, 2.247f, -0.884f, 2.505f, -2.066f)
                curveToRelative(0.023f, 0.0f, 0.044f, 0.007f, 0.067f, 0.007f)
                curveToRelative(1.262f, 0.0f, 2.286f, -1.053f, 2.286f, -2.353f)
                curveToRelative(0.0f, -0.489f, -0.146f, -0.944f, -0.394f, -1.32f)
                curveToRelative(0.583f, -0.426f, 0.965f, -1.123f, 0.965f, -1.915f)
                close()
            }
        }
        .build()
        return _earMuffs!!
    }

private var _earMuffs: ImageVector? = null
