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

public val Icons.Filled.Mace: ImageVector
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
                curveToRelative(0.163f, -0.384f, 0.29f, -0.787f, 0.378f, -1.205f)
                lineToRelative(1.882f, -0.879f)
                curveToRelative(0.342f, -0.205f, 0.342f, -0.7f, 0.0f, -0.905f)
                lineToRelative(-1.882f, -0.879f)
                curveToRelative(-0.13f, -0.62f, -0.347f, -1.207f, -0.64f, -1.749f)
                lineToRelative(2.728f, -4.796f)
                curveToRelative(0.192f, -0.369f, -0.205f, -0.766f, -0.574f, -0.574f)
                lineToRelative(-4.796f, 2.728f)
                curveToRelative(-0.542f, -0.293f, -1.129f, -0.51f, -1.749f, -0.64f)
                lineToRelative(-0.879f, -1.882f)
                curveToRelative(-0.205f, -0.342f, -0.7f, -0.342f, -0.905f, 0.0f)
                lineToRelative(-0.879f, 1.882f)
                curveToRelative(-0.417f, 0.087f, -0.82f, 0.214f, -1.203f, 0.377f)
                lineTo(8.658f, 0.05f)
                curveToRelative(-0.369f, -0.192f, -0.766f, 0.205f, -0.574f, 0.574f)
                lineToRelative(2.234f, 3.969f)
                curveToRelative(-0.567f, 0.75f, -0.98f, 1.623f, -1.179f, 2.576f)
                lineToRelative(-1.882f, 0.879f)
                curveToRelative(-0.342f, 0.205f, -0.342f, 0.7f, 0.0f, 0.905f)
                lineToRelative(1.882f, 0.879f)
                curveToRelative(0.192f, 0.919f, 0.584f, 1.764f, 1.12f, 2.497f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(9.965f, -9.965f)
                curveToRelative(0.733f, 0.536f, 1.577f, 0.928f, 2.497f, 1.12f)
                lineToRelative(0.879f, 1.882f)
                curveToRelative(0.205f, 0.342f, 0.7f, 0.342f, 0.905f, 0.0f)
                lineToRelative(0.879f, -1.882f)
                curveToRelative(0.951f, -0.199f, 1.823f, -0.611f, 2.573f, -1.177f)
                lineToRelative(3.972f, 2.244f)
                curveToRelative(0.369f, 0.192f, 0.766f, -0.205f, 0.574f, -0.574f)
                lineToRelative(-2.466f, -4.319f)
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
