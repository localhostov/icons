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

public val Icons.Filled.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-6.317f, -6.317f)
                lineToRelative(2.105f, -3.43f)
                curveToRelative(0.606f, -0.894f, 0.668f, -2.041f, 0.163f, -2.995f)
                curveToRelative(-0.506f, -0.954f, -1.491f, -1.547f, -2.569f, -1.547f)
                lineToRelative(-3.833f, -0.003f)
                lineToRelative(1.205f, -5.227f)
                curveToRelative(0.309f, -1.078f, -0.139f, -2.172f, -1.064f, -2.6f)
                curveToRelative(-0.88f, -0.407f, -1.865f, -0.086f, -2.473f, 0.826f)
                lineToRelative(-3.236f, 5.273f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.684f, -0.098f, 0.293f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.293f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(15.236f, 19.478f)
                lineToRelative(-2.164f, 3.524f)
                curveToRelative(-0.432f, 0.65f, -1.057f, 1.0f, -1.699f, 1.0f)
                curveToRelative(-0.259f, 0.0f, -0.521f, -0.057f, -0.773f, -0.174f)
                curveToRelative(-0.925f, -0.428f, -1.373f, -1.521f, -1.064f, -2.6f)
                lineToRelative(1.204f, -5.226f)
                horizontalLineToRelative(-3.83f)
                curveToRelative(-1.08f, 0.0f, -2.064f, -0.593f, -2.57f, -1.547f)
                curveToRelative(-0.506f, -0.954f, -0.443f, -2.103f, 0.163f, -2.996f)
                lineToRelative(1.033f, -1.683f)
                lineToRelative(9.701f, 9.701f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
