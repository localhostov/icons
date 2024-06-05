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

public val Icons.Filled.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = Builder(name = "Galaxy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.999f, 14.545f)
                curveToRelative(-0.001f, -3.989f, -2.622f, -7.619f, -6.495f, -8.575f)
                curveToRelative(-1.311f, -0.324f, -2.577f, -0.326f, -3.756f, -0.087f)
                curveToRelative(-0.429f, 0.087f, -0.773f, -0.328f, -0.642f, -0.746f)
                curveToRelative(0.63f, -2.008f, 1.794f, -3.778f, 3.334f, -5.137f)
                horizontalLineToRelative(-1.896f)
                curveToRelative(-3.989f, 0.002f, -7.619f, 2.623f, -8.575f, 6.495f)
                curveToRelative(-0.324f, 1.311f, -0.326f, 2.577f, -0.087f, 3.755f)
                curveToRelative(0.087f, 0.429f, -0.328f, 0.774f, -0.746f, 0.643f)
                curveToRelative(-2.008f, -0.63f, -3.778f, -1.794f, -5.137f, -3.334f)
                verticalLineToRelative(1.896f)
                curveToRelative(0.002f, 3.989f, 2.623f, 7.619f, 6.495f, 8.575f)
                curveToRelative(1.311f, 0.324f, 2.577f, 0.326f, 3.756f, 0.087f)
                curveToRelative(0.429f, -0.087f, 0.773f, 0.328f, 0.642f, 0.746f)
                curveToRelative(-0.63f, 2.008f, -1.794f, 3.778f, -3.334f, 5.137f)
                horizontalLineToRelative(1.896f)
                curveToRelative(3.989f, -0.002f, 7.619f, -2.623f, 8.575f, -6.495f)
                curveToRelative(0.324f, -1.311f, 0.326f, -2.577f, 0.087f, -3.756f)
                curveToRelative(-0.087f, -0.429f, 0.328f, -0.773f, 0.746f, -0.642f)
                curveToRelative(2.008f, 0.63f, 3.778f, 1.794f, 5.137f, 3.334f)
                verticalLineToRelative(-1.896f)
                close()
                moveTo(11.999f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
