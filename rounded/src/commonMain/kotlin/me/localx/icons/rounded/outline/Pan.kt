package me.localx.icons.rounded.outline

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

public val Icons.Outline.Pan: ImageVector
    get() {
        if (_pan != null) {
            return _pan!!
        }
        _pan = Builder(name = "Pan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 0.0f)
                curveTo(6.664f, -0.19f, 1.6f, 8.253f, 5.139f, 14.619f)
                lineTo(0.878f, 18.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.243f, 4.243f)
                lineToRelative(4.26f, -4.261f)
                curveTo(15.748f, 22.4f, 24.189f, 17.336f, 24.0f, 10.0f)
                arcTo(10.013f, 10.013f, 0.0f, false, false, 14.0f, 0.0f)
                close()
                moveTo(3.707f, 21.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.415f, -1.414f)
                lineToRelative(3.969f, -3.97f)
                arcToRelative(10.12f, 10.12f, 0.0f, false, false, 1.415f, 1.415f)
                close()
                moveTo(14.0f, 18.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, -8.0f)
                curveTo(6.375f, -0.589f, 21.626f, -0.586f, 22.0f, 10.0f)
                arcTo(8.01f, 8.01f, 0.0f, false, true, 14.0f, 18.0f)
                close()
                moveTo(20.0f, 10.0f)
                curveToRelative(-0.251f, 7.93f, -11.75f, 7.928f, -12.0f, 0.0f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, true, 6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                curveToRelative(0.138f, 5.275f, 7.863f, 5.274f, 8.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _pan!!
    }

private var _pan: ImageVector? = null
