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

public val Icons.Filled.N: ImageVector
    get() {
        if (_n != null) {
            return _n!!
        }
        _n = Builder(name = "N", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.744f, 24.005f)
                curveToRelative(-0.748f, 0.0f, -1.457f, -0.375f, -1.88f, -1.033f)
                lineTo(4.454f, 2.116f)
                curveToRelative(-0.024f, -0.039f, -0.103f, -0.155f, -0.277f, -0.104f)
                curveToRelative(-0.177f, 0.052f, -0.177f, 0.191f, -0.177f, 0.236f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.249f)
                curveTo(2.0f, 1.243f, 2.648f, 0.377f, 3.613f, 0.093f)
                curveToRelative(0.965f, -0.283f, 1.979f, 0.094f, 2.522f, 0.94f)
                lineToRelative(13.41f, 20.856f)
                curveToRelative(0.025f, 0.038f, 0.097f, 0.158f, 0.277f, 0.103f)
                curveToRelative(0.177f, -0.052f, 0.177f, -0.19f, 0.177f, -0.236f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(21.756f)
                curveToRelative(0.0f, 1.006f, -0.648f, 1.872f, -1.613f, 2.155f)
                curveToRelative(-0.214f, 0.063f, -0.43f, 0.094f, -0.643f, 0.094f)
                close()
            }
        }
        .build()
        return _n!!
    }

private var _n: ImageVector? = null
