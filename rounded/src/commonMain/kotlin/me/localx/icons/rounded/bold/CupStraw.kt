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

public val Icons.Bold.CupStraw: ImageVector
    get() {
        if (_cupStraw != null) {
            return _cupStraw!!
        }
        _cupStraw = Builder(name = "CupStraw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.0f)
                horizontalLineToRelative(-6.946f)
                lineToRelative(0.205f, -1.564f)
                curveToRelative(0.032f, -0.248f, 0.246f, -0.436f, 0.496f, -0.436f)
                horizontalLineToRelative(2.745f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.745f)
                curveToRelative(-1.75f, 0.0f, -3.242f, 1.309f, -3.471f, 3.045f)
                lineToRelative(-0.256f, 1.955f)
                lineTo(2.0f, 5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.167f)
                lineToRelative(1.315f, 11.145f)
                curveToRelative(0.327f, 2.768f, 2.676f, 4.855f, 5.462f, 4.855f)
                horizontalLineToRelative(6.111f)
                curveToRelative(2.786f, 0.0f, 5.135f, -2.087f, 5.462f, -4.855f)
                lineToRelative(1.315f, -11.145f)
                horizontalLineToRelative(0.167f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.539f, 18.792f)
                curveToRelative(-0.149f, 1.258f, -1.217f, 2.208f, -2.483f, 2.208f)
                horizontalLineToRelative(-6.111f)
                curveToRelative(-1.267f, 0.0f, -2.334f, -0.949f, -2.483f, -2.207f)
                lineToRelative(-1.274f, -10.793f)
                horizontalLineToRelative(13.626f)
                lineToRelative(-1.274f, 10.792f)
                close()
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
