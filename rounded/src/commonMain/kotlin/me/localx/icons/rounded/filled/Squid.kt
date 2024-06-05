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

public val Icons.Filled.Squid: ImageVector
    get() {
        if (_squid != null) {
            return _squid!!
        }
        _squid = Builder(name = "Squid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.217f, 19.303f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, 0.391f, 0.389f, 1.024f, -0.002f, 1.414f)
                lineToRelative(-2.344f, 2.34f)
                curveToRelative(-0.628f, 0.627f, -1.454f, 0.941f, -2.279f, 0.941f)
                reflectiveCurveToRelative(-1.651f, -0.313f, -2.28f, -0.942f)
                curveToRelative(-1.141f, -1.14f, -1.236f, -2.924f, -0.307f, -4.185f)
                lineToRelative(-1.207f, -1.207f)
                lineToRelative(-3.091f, 3.044f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(3.091f, -3.044f)
                lineToRelative(-1.191f, -1.191f)
                curveToRelative(-1.349f, 1.044f, -3.325f, 0.891f, -4.462f, -0.489f)
                curveToRelative(-1.074f, -1.302f, -0.865f, -3.245f, 0.328f, -4.44f)
                lineToRelative(2.233f, -2.236f)
                curveToRelative(0.39f, -0.391f, 1.023f, -0.391f, 1.414f, -0.001f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.001f, 1.415f)
                lineToRelative(-2.348f, 2.351f)
                curveToRelative(-0.478f, 0.478f, -0.478f, 1.255f, 0.0f, 1.732f)
                curveToRelative(0.479f, 0.479f, 1.254f, 0.479f, 1.732f, 0.0f)
                lineToRelative(3.141f, -3.183f)
                lineToRelative(0.002f, 0.002f)
                curveToRelative(3.372f, -3.371f, 7.41f, -4.745f, 10.003f, -5.188f)
                curveToRelative(1.031f, -0.176f, 1.916f, 0.71f, 1.74f, 1.741f)
                curveToRelative(-0.442f, 2.593f, -1.817f, 6.632f, -5.188f, 10.003f)
                lineToRelative(0.016f, 0.016f)
                lineToRelative(-3.073f, 3.122f)
                curveToRelative(-0.483f, 0.483f, -0.483f, 1.261f, -0.006f, 1.738f)
                reflectiveCurveToRelative(1.256f, 0.477f, 1.732f, 0.0f)
                lineToRelative(2.344f, -2.34f)
                curveToRelative(0.391f, -0.39f, 1.024f, -0.39f, 1.414f, 0.002f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(6.822f)
                curveToRelative(0.0f, 1.142f, -0.444f, 2.215f, -1.252f, 3.022f)
                curveToRelative(-0.751f, 0.751f, -1.803f, 1.156f, -2.909f, 1.156f)
                curveToRelative(-0.396f, 0.0f, -0.8f, -0.053f, -1.199f, -0.159f)
                lineToRelative(-0.639f, -0.17f)
                curveToRelative(1.973f, -3.139f, 2.709f, -6.171f, 2.949f, -7.574f)
                curveToRelative(0.191f, -1.122f, -0.173f, -2.271f, -0.976f, -3.072f)
                curveToRelative(-0.802f, -0.803f, -1.952f, -1.165f, -3.072f, -0.976f)
                curveToRelative(-1.404f, 0.24f, -4.434f, 0.976f, -7.574f, 2.95f)
                lineToRelative(-0.17f, -0.639f)
                curveToRelative(-0.404f, -1.515f, -0.022f, -3.089f, 0.997f, -4.108f)
                curveToRelative(0.808f, -0.808f, 1.881f, -1.252f, 3.022f, -1.252f)
                horizontalLineToRelative(6.822f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _squid!!
    }

private var _squid: ImageVector? = null
