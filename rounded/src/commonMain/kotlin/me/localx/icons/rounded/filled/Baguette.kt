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

public val Icons.Filled.Baguette: ImageVector
    get() {
        if (_baguette != null) {
            return _baguette!!
        }
        _baguette = Builder(name = "Baguette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.036f, 0.964f)
                curveToRelative(-1.194f, -1.194f, -3.355f, -1.284f, -6.089f, -0.254f)
                curveToRelative(-1.455f, 0.548f, -2.967f, 1.39f, -4.402f, 2.421f)
                lineToRelative(3.162f, 3.162f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-3.329f, -3.329f)
                curveToRelative(-0.428f, 0.368f, -0.847f, 0.747f, -1.245f, 1.145f)
                lineToRelative(-1.391f, 1.391f)
                lineToRelative(3.379f, 3.379f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-3.379f, -3.379f)
                lineToRelative(-1.391f, 1.391f)
                curveToRelative(-0.397f, 0.397f, -0.776f, 0.817f, -1.145f, 1.245f)
                lineToRelative(3.329f, 3.329f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-3.162f, -3.162f)
                curveToRelative(-1.031f, 1.435f, -1.873f, 2.947f, -2.421f, 4.401f)
                curveToRelative(-1.03f, 2.733f, -0.94f, 4.896f, 0.254f, 6.09f)
                curveToRelative(0.644f, 0.644f, 1.567f, 0.967f, 2.711f, 0.967f)
                curveToRelative(0.979f, 0.0f, 2.118f, -0.237f, 3.378f, -0.713f)
                curveToRelative(2.464f, -0.929f, 5.098f, -2.683f, 7.228f, -4.812f)
                lineToRelative(4.197f, -4.196f)
                curveToRelative(2.13f, -2.13f, 3.884f, -4.765f, 4.813f, -7.228f)
                curveToRelative(1.03f, -2.733f, 0.94f, -4.896f, -0.254f, -6.09f)
                close()
            }
        }
        .build()
        return _baguette!!
    }

private var _baguette: ImageVector? = null
