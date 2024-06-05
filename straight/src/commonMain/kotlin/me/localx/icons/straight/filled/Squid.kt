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
                moveToRelative(15.156f, 18.949f)
                lineToRelative(1.412f, 1.416f)
                lineToRelative(-2.696f, 2.691f)
                curveToRelative(-0.628f, 0.627f, -1.454f, 0.941f, -2.279f, 0.941f)
                reflectiveCurveToRelative(-1.651f, -0.313f, -2.28f, -0.942f)
                curveToRelative(-1.141f, -1.14f, -1.236f, -2.924f, -0.307f, -4.185f)
                lineToRelative(-1.207f, -1.207f)
                lineToRelative(-3.588f, 3.588f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.588f, -3.588f)
                lineToRelative(-1.191f, -1.191f)
                curveToRelative(-1.268f, 0.982f, -3.09f, 0.905f, -4.249f, -0.254f)
                curveToRelative(-1.256f, -1.258f, -1.256f, -3.303f, 0.0f, -4.561f)
                lineToRelative(2.69f, -2.695f)
                lineToRelative(1.416f, 1.414f)
                lineToRelative(-2.691f, 2.695f)
                curveToRelative(-0.478f, 0.478f, -0.478f, 1.255f, 0.0f, 1.732f)
                curveToRelative(0.479f, 0.479f, 1.254f, 0.479f, 1.732f, 0.0f)
                lineToRelative(3.141f, -3.183f)
                lineToRelative(0.002f, 0.002f)
                curveToRelative(4.404f, -4.403f, 9.696f, -5.15f, 11.821f, -5.266f)
                curveToRelative(-0.115f, 2.126f, -0.863f, 7.418f, -5.266f, 11.821f)
                lineToRelative(0.016f, 0.016f)
                lineToRelative(-3.073f, 3.122f)
                curveToRelative(-0.483f, 0.483f, -0.483f, 1.261f, -0.006f, 1.738f)
                reflectiveCurveToRelative(1.256f, 0.477f, 1.732f, 0.0f)
                lineToRelative(2.697f, -2.692f)
                close()
                moveTo(13.178f, 0.0f)
                curveToRelative(-1.142f, 0.0f, -2.215f, 0.444f, -3.022f, 1.252f)
                curveToRelative(-1.02f, 1.02f, -1.401f, 2.594f, -0.997f, 4.108f)
                lineToRelative(0.17f, 0.639f)
                curveToRelative(5.327f, -3.348f, 10.535f, -3.083f, 10.801f, -3.065f)
                lineToRelative(0.882f, 0.055f)
                lineToRelative(0.055f, 0.882f)
                curveToRelative(0.017f, 0.265f, 0.283f, 5.473f, -3.065f, 10.801f)
                lineToRelative(0.639f, 0.17f)
                curveToRelative(0.399f, 0.106f, 0.803f, 0.159f, 1.199f, 0.159f)
                curveToRelative(1.106f, 0.0f, 2.158f, -0.405f, 2.909f, -1.156f)
                curveToRelative(0.808f, -0.808f, 1.252f, -1.881f, 1.252f, -3.022f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-10.822f)
                close()
            }
        }
        .build()
        return _squid!!
    }

private var _squid: ImageVector? = null
