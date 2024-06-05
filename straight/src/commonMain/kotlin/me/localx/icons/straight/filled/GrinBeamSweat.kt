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

public val Icons.Filled.GrinBeamSweat: ImageVector
    get() {
        if (_grinBeamSweat != null) {
            return _grinBeamSweat!!
        }
        _grinBeamSweat = Builder(name = "GrinBeamSweat", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 0.0f)
                reflectiveCurveTo(24.0f, 2.462f, 24.0f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveTo(19.0f, 2.513f, 21.5f, 0.0f, 21.5f, 0.0f)
                close()
                moveTo(23.483f, 8.519f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 0.0f, 12.0f)
                curveTo(-0.178f, 2.988f, 10.158f, -3.006f, 17.868f, 1.539f)
                curveTo(15.265f, 5.523f, 19.005f, 10.608f, 23.483f, 8.519f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveTo(10.752f, 5.713f, 5.246f, 5.719f, 5.0f, 11.0f)
                close()
                moveTo(18.007f, 14.0f)
                arcTo(21.923f, 21.923f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(21.841f, 21.841f, 0.0f, false, true, -6.0f, -1.0f)
                curveToRelative(0.615f, 2.28f, 2.671f, 5.0f, 6.007f, 5.0f)
                reflectiveCurveTo(17.392f, 16.28f, 18.007f, 14.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(-0.249f, -5.287f, -5.754f, -5.28f, -6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.054f, 0.68f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                close()
            }
        }
        .build()
        return _grinBeamSweat!!
    }

private var _grinBeamSweat: ImageVector? = null
