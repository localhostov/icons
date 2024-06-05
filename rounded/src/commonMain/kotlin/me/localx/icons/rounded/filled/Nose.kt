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

public val Icons.Filled.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = Builder(name = "Nose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.985f, 19.439f)
                curveToRelative(-0.021f, -1.424f, -0.78f, -2.975f, -2.258f, -4.61f)
                curveToRelative(-1.452f, -1.606f, -2.898f, -4.765f, -3.955f, -7.071f)
                lineToRelative(-0.722f, -1.556f)
                curveToRelative(-0.704f, -1.495f, -0.963f, -2.045f, -1.039f, -3.703f)
                verticalLineToRelative(-0.013f)
                curveToRelative(-0.061f, -1.39f, -1.206f, -2.486f, -2.598f, -2.486f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.998f, 0.0f, -5.429f, 2.43f, -5.429f, 5.429f)
                verticalLineToRelative(6.259f)
                curveToRelative(0.858f, -0.393f, 1.649f, -0.677f, 2.239f, -0.866f)
                curveToRelative(0.554f, -0.178f, 1.14f, 0.16f, 1.273f, 0.726f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.12f, 0.51f, -0.171f, 1.023f, -0.669f, 1.183f)
                curveToRelative(-2.031f, 0.653f, -6.842f, 2.59f, -6.842f, 6.269f)
                curveToRelative(0.0f, 2.408f, 1.564f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.403f)
                curveToRelative(-0.242f, -0.341f, -0.346f, -0.674f, -0.381f, -0.945f)
                curveToRelative(-0.077f, -0.595f, 0.138f, -1.029f, 0.205f, -1.148f)
                reflectiveCurveToRelative(0.331f, -0.526f, 0.88f, -0.766f)
                curveToRelative(0.47f, -0.207f, 1.249f, -0.327f, 2.282f, 0.259f)
                curveToRelative(0.644f, 0.365f, 1.157f, 0.799f, 1.652f, 1.219f)
                curveToRelative(0.847f, 0.715f, 1.535f, 1.286f, 2.685f, 1.366f)
                curveToRelative(1.958f, -0.041f, 3.426f, -0.581f, 4.337f, -1.632f)
                curveToRelative(1.024f, -1.182f, 0.972f, -2.542f, 0.936f, -2.912f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
