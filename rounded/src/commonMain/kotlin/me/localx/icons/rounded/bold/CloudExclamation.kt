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

public val Icons.Bold.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) {
            return _cloudExclamation!!
        }
        _cloudExclamation = Builder(name = "CloudExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.5f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.811f, 5.923f)
                curveToRelative(-0.149f, -0.03f, -0.265f, -0.116f, -0.324f, -0.242f)
                curveTo(15.901f, 2.335f, 12.232f, 0.468f, 8.558f, 1.141f)
                curveToRelative(-3.349f, 0.612f, -5.975f, 3.286f, -6.533f, 6.652f)
                curveToRelative(-0.165f, 0.993f, -0.154f, 1.985f, 0.034f, 2.952f)
                curveToRelative(0.02f, 0.103f, -0.046f, 0.248f, -0.161f, 0.353f)
                curveToRelative(-1.188f, 1.08f, -1.897f, 2.727f, -1.897f, 4.402f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.82f, 0.359f, -1.677f, 0.916f, -2.183f)
                curveToRelative(0.891f, -0.81f, 1.308f, -2.015f, 1.088f, -3.145f)
                curveToRelative(-0.119f, -0.613f, -0.126f, -1.249f, -0.02f, -1.888f)
                curveToRelative(0.347f, -2.09f, 2.038f, -3.813f, 4.114f, -4.193f)
                curveToRelative(2.372f, -0.436f, 4.656f, 0.719f, 5.678f, 2.875f)
                curveToRelative(0.469f, 0.988f, 1.36f, 1.68f, 2.446f, 1.897f)
                curveToRelative(2.188f, 0.437f, 3.777f, 2.386f, 3.777f, 4.636f)
                curveToRelative(0.0f, 2.76f, -2.026f, 5.131f, -4.712f, 5.515f)
                curveToRelative(-0.82f, 0.118f, -1.39f, 0.878f, -1.272f, 1.698f)
                curveToRelative(0.107f, 0.748f, 0.749f, 1.287f, 1.483f, 1.287f)
                curveToRelative(0.071f, 0.0f, 0.143f, -0.005f, 0.214f, -0.015f)
                curveToRelative(4.155f, -0.595f, 7.288f, -4.242f, 7.288f, -8.485f)
                curveToRelative(0.0f, -3.676f, -2.604f, -6.862f, -6.189f, -7.577f)
                close()
            }
        }
        .build()
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null
