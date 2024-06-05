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

public val Icons.Bold.Mace: ImageVector
    get() {
        if (_mace != null) {
            return _mace!!
        }
        _mace = Builder(name = "Mace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.484f, 11.036f)
                curveToRelative(0.164f, -0.385f, 0.291f, -0.788f, 0.378f, -1.206f)
                lineToRelative(1.881f, -0.878f)
                curveToRelative(0.342f, -0.205f, 0.342f, -0.7f, 0.0f, -0.905f)
                lineToRelative(-1.881f, -0.878f)
                curveToRelative(-0.13f, -0.62f, -0.348f, -1.208f, -0.64f, -1.75f)
                lineToRelative(2.728f, -4.795f)
                curveToRelative(0.192f, -0.369f, -0.205f, -0.766f, -0.574f, -0.574f)
                lineToRelative(-4.795f, 2.728f)
                curveToRelative(-0.542f, -0.293f, -1.13f, -0.511f, -1.75f, -0.64f)
                lineToRelative(-0.878f, -1.881f)
                curveToRelative(-0.205f, -0.342f, -0.7f, -0.342f, -0.905f, 0.0f)
                lineToRelative(-0.878f, 1.881f)
                curveToRelative(-0.417f, 0.087f, -0.82f, 0.214f, -1.204f, 0.378f)
                lineTo(8.658f, 0.05f)
                curveToRelative(-0.369f, -0.192f, -0.766f, 0.205f, -0.574f, 0.574f)
                lineToRelative(2.23f, 3.962f)
                curveToRelative(-0.568f, 0.751f, -0.977f, 1.629f, -1.177f, 2.583f)
                lineToRelative(-1.881f, 0.878f)
                curveToRelative(-0.342f, 0.205f, -0.342f, 0.7f, 0.0f, 0.905f)
                lineToRelative(1.881f, 0.878f)
                curveToRelative(0.156f, 0.748f, 0.442f, 1.449f, 0.832f, 2.079f)
                lineTo(0.439f, 21.439f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(9.529f, -9.529f)
                curveToRelative(0.63f, 0.39f, 1.331f, 0.675f, 2.079f, 0.832f)
                lineToRelative(0.878f, 1.881f)
                curveToRelative(0.205f, 0.342f, 0.7f, 0.342f, 0.905f, 0.0f)
                lineToRelative(0.878f, -1.881f)
                curveToRelative(0.953f, -0.199f, 1.83f, -0.607f, 2.58f, -1.174f)
                lineToRelative(3.965f, 2.241f)
                curveToRelative(0.369f, 0.192f, 0.766f, -0.205f, 0.574f, -0.574f)
                lineToRelative(-2.466f, -4.318f)
                close()
                moveTo(12.0f, 8.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _mace!!
    }

private var _mace: ImageVector? = null
