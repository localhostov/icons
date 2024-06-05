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

public val Icons.Bold.Dagger: ImageVector
    get() {
        if (_dagger != null) {
            return _dagger!!
        }
        _dagger = Builder(name = "Dagger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.218f, 8.096f)
                lineToRelative(-1.597f, -1.596f)
                lineToRelative(3.939f, -3.939f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-3.94f, 3.94f)
                lineToRelative(-1.597f, -1.596f)
                curveTo(14.208f, 1.087f, 11.955f, 0.102f, 9.559f, 0.007f)
                curveToRelative(-0.821f, -0.022f, -1.524f, 0.613f, -1.558f, 1.44f)
                curveToRelative(-0.032f, 0.828f, 0.612f, 1.525f, 1.44f, 1.558f)
                curveToRelative(1.267f, 0.049f, 2.476f, 0.464f, 3.495f, 1.185f)
                lineToRelative(-5.683f, 5.683f)
                curveToRelative(-2.501f, 2.5f, -4.576f, 5.371f, -6.168f, 8.532f)
                curveToRelative(0.0f, 0.0f, -0.996f, 2.014f, -1.023f, 2.136f)
                curveToRelative(-0.21f, 0.952f, 0.076f, 1.932f, 0.766f, 2.621f)
                curveToRelative(0.54f, 0.541f, 1.26f, 0.833f, 2.004f, 0.833f)
                curveToRelative(0.204f, 0.0f, 0.411f, -0.022f, 0.617f, -0.067f)
                curveToRelative(0.121f, -0.027f, 2.137f, -1.023f, 2.137f, -1.023f)
                curveToRelative(3.159f, -1.591f, 6.029f, -3.666f, 8.531f, -6.167f)
                lineToRelative(5.684f, -5.685f)
                curveToRelative(0.726f, 1.022f, 1.143f, 2.235f, 1.193f, 3.507f)
                curveToRelative(0.032f, 0.808f, 0.696f, 1.441f, 1.498f, 1.441f)
                curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f)
                curveToRelative(0.828f, -0.033f, 1.473f, -0.73f, 1.44f, -1.558f)
                curveToRelative(-0.095f, -2.396f, -1.08f, -4.649f, -2.775f, -6.345f)
                close()
                moveTo(11.996f, 14.616f)
                curveToRelative(-2.275f, 2.275f, -4.887f, 4.162f, -7.76f, 5.609f)
                lineToRelative(-0.948f, 0.477f)
                lineToRelative(0.478f, -0.947f)
                curveToRelative(1.447f, -2.875f, 3.335f, -5.485f, 5.609f, -7.76f)
                lineToRelative(5.749f, -5.749f)
                lineToRelative(2.621f, 2.621f)
                lineToRelative(-5.749f, 5.75f)
                close()
            }
        }
        .build()
        return _dagger!!
    }

private var _dagger: ImageVector? = null
