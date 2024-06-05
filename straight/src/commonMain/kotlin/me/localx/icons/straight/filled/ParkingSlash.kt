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

public val Icons.Filled.ParkingSlash: ImageVector
    get() {
        if (_parkingSlash != null) {
            return _parkingSlash!!
        }
        _parkingSlash = Builder(name = "ParkingSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.692f, 14.0f)
                lineToRelative(10.0f, 10.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.308f)
                lineToRelative(7.0f, 7.0f)
                verticalLineToRelative(7.692f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(0.692f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-1.48f)
                lineTo(0.278f, 1.757f)
                curveTo(0.752f, 0.723f, 1.79f, 0.0f, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(7.615f, 6.201f)
                lineToRelative(1.455f, 1.455f)
                curveToRelative(0.141f, -0.381f, 0.501f, -0.656f, 0.93f, -0.656f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.086f)
                lineToRelative(1.691f, 1.691f)
                curveToRelative(1.688f, -0.649f, 2.895f, -2.277f, 2.895f, -4.191f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.977f, 0.0f, -1.837f, 0.476f, -2.385f, 1.201f)
                close()
            }
        }
        .build()
        return _parkingSlash!!
    }

private var _parkingSlash: ImageVector? = null
