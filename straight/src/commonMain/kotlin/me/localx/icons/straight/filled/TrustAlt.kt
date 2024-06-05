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

public val Icons.Filled.TrustAlt: ImageVector
    get() {
        if (_trustAlt != null) {
            return _trustAlt!!
        }
        _trustAlt = Builder(name = "TrustAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.619f, 20.414f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.209f, -1.413f, -0.587f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.013f, 2.013f)
                lineToRelative(3.615f, -3.615f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.615f, 3.615f)
                close()
                moveTo(8.344f, 7.226f)
                lineTo(14.646f, 1.073f)
                curveToRelative(1.51f, -1.173f, 3.618f, -1.393f, 5.308f, -0.548f)
                lineToRelative(3.046f, 1.523f)
                lineToRelative(1.0f, -0.049f)
                verticalLineToRelative(10.721f)
                curveToRelative(-1.466f, -1.665f, -3.607f, -2.721f, -6.0f, -2.721f)
                curveToRelative(-0.572f, 0.0f, -1.13f, 0.063f, -1.668f, 0.177f)
                lineToRelative(-2.822f, -2.358f)
                lineToRelative(1.736f, -1.662f)
                lineToRelative(-1.383f, -1.445f)
                lineToRelative(-4.173f, 3.995f)
                curveToRelative(-0.207f, 0.208f, -0.493f, 0.315f, -0.788f, 0.29f)
                curveToRelative(-0.298f, -0.024f, -0.56f, -0.175f, -0.739f, -0.425f)
                curveToRelative(-0.274f, -0.38f, -0.19f, -0.975f, 0.181f, -1.347f)
                close()
                moveTo(10.557f, 20.918f)
                lineToRelative(-7.89f, -5.918f)
                lineTo(0.0f, 15.0f)
                lineTo(0.0f, 2.0f)
                horizontalLineToRelative(2.764f)
                lineToRelative(1.949f, -1.475f)
                curveToRelative(0.687f, -0.344f, 1.456f, -0.525f, 2.227f, -0.525f)
                curveToRelative(1.28f, 0.0f, 2.471f, 0.461f, 3.39f, 1.298f)
                lineToRelative(0.617f, 0.593f)
                lineToRelative(-4.007f, 3.911f)
                curveToRelative(-1.073f, 1.072f, -1.244f, 2.767f, -0.398f, 3.938f)
                curveToRelative(0.52f, 0.723f, 1.46f, 1.259f, 2.444f, 1.259f)
                curveToRelative(0.793f, 0.0f, 1.554f, -0.312f, 2.104f, -0.863f)
                lineToRelative(0.967f, -0.925f)
                lineToRelative(2.113f, 1.765f)
                curveToRelative(-2.483f, 1.358f, -4.168f, 3.993f, -4.168f, 7.023f)
                curveToRelative(0.0f, 1.031f, 0.202f, 2.013f, 0.557f, 2.918f)
                close()
            }
        }
        .build()
        return _trustAlt!!
    }

private var _trustAlt: ImageVector? = null
