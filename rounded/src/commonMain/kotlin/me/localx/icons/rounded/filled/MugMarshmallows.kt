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

public val Icons.Filled.MugMarshmallows: ImageVector
    get() {
        if (_mugMarshmallows != null) {
            return _mugMarshmallows!!
        }
        _mugMarshmallows = Builder(name = "MugMarshmallows", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.503f, 11.003f)
                horizontalLineToRelative(-0.503f)
                curveToRelative(0.0f, -1.655f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(4.0f, 8.003f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(0.601f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.499f)
                lineToRelative(0.003f, -2.001f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 16.503f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.503f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.498f)
                lineToRelative(-0.003f, 2.001f)
                close()
                moveTo(8.76f, 3.415f)
                lineToRelative(2.829f, -2.829f)
                curveToRelative(0.779f, -0.779f, 2.048f, -0.78f, 2.828f, 0.0f)
                lineToRelative(2.829f, 2.83f)
                curveToRelative(0.378f, 0.377f, 0.586f, 0.879f, 0.586f, 1.414f)
                curveToRelative(0.0f, 0.428f, -0.139f, 0.832f, -0.387f, 1.172f)
                horizontalLineToRelative(-8.883f)
                curveToRelative(-0.568f, -0.782f, -0.506f, -1.882f, 0.198f, -2.586f)
                close()
                moveTo(3.003f, 6.001f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(3.003f, 2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.107f, 0.0f, 0.209f, 0.015f, 0.312f, 0.031f)
                lineToRelative(-1.969f, 1.969f)
                curveToRelative(-1.082f, 1.082f, -1.395f, 2.63f, -0.976f, 4.0f)
                horizontalLineToRelative(-3.367f)
                close()
            }
        }
        .build()
        return _mugMarshmallows!!
    }

private var _mugMarshmallows: ImageVector? = null
