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

public val Icons.Outline.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 4.293f)
                lineTo(19.707f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.293f, 1.293f)
                lineToRelative(-8.319f, 8.319f)
                lineToRelative(-1.525f, -1.525f)
                curveToRelative(-1.559f, -1.559f, -4.097f, -1.56f, -5.657f, 0.0f)
                lineToRelative(-3.206f, 3.206f)
                curveToRelative(-1.17f, 1.169f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(5.879f, 5.879f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.122f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                lineToRelative(3.206f, -3.206f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.829f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.172f, -2.828f)
                lineToRelative(-1.525f, -1.525f)
                lineToRelative(8.319f, -8.319f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(13.378f, 17.087f)
                curveToRelative(0.0f, 0.535f, -0.208f, 1.037f, -0.586f, 1.415f)
                lineToRelative(-3.206f, 3.206f)
                curveToRelative(-0.39f, 0.39f, -1.025f, 0.389f, -1.415f, 0.0f)
                lineToRelative(-0.747f, -0.747f)
                lineToRelative(3.279f, -3.25f)
                curveToRelative(0.392f, -0.389f, 0.395f, -1.022f, 0.006f, -1.415f)
                curveToRelative(-0.389f, -0.392f, -1.021f, -0.394f, -1.415f, -0.006f)
                lineToRelative(-3.286f, 3.256f)
                lineToRelative(-1.585f, -1.585f)
                lineToRelative(3.279f, -3.25f)
                curveToRelative(0.392f, -0.389f, 0.395f, -1.022f, 0.006f, -1.415f)
                curveToRelative(-0.389f, -0.392f, -1.021f, -0.394f, -1.415f, -0.006f)
                lineToRelative(-3.286f, 3.256f)
                lineToRelative(-0.717f, -0.717f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(3.206f, -3.206f)
                curveToRelative(0.39f, -0.39f, 0.902f, -0.585f, 1.415f, -0.585f)
                reflectiveCurveToRelative(1.024f, 0.195f, 1.414f, 0.585f)
                lineToRelative(4.465f, 4.465f)
                curveToRelative(0.378f, 0.378f, 0.586f, 0.88f, 0.586f, 1.414f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
