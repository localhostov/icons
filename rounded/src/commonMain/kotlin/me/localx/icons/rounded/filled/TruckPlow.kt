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

public val Icons.Filled.TruckPlow: ImageVector
    get() {
        if (_truckPlow != null) {
            return _truckPlow!!
        }
        _truckPlow = Builder(name = "TruckPlow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.687f, 22.739f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -0.064f)
                arcTo(8.666f, 8.666f, 0.0f, false, true, 20.0f, 16.818f)
                lineTo(20.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 15.0f)
                arcToRelative(3.855f, 3.855f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(14.0f, 11.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 3.873f, 3.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(-0.818f)
                arcToRelative(8.663f, 8.663f, 0.0f, false, true, 2.272f, -5.856f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.477f, 1.348f)
                arcTo(6.67f, 6.67f, 0.0f, false, false, 22.0f, 13.182f)
                verticalLineToRelative(3.636f)
                arcToRelative(6.666f, 6.666f, 0.0f, false, false, 1.75f, 4.508f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.687f, 22.739f)
                close()
                moveTo(14.869f, 9.063f)
                lineTo(11.437f, 4.141f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.336f, 2.0f)
                lineTo(6.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                lineTo(4.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                arcTo(6.077f, 6.077f, 0.0f, false, true, 14.869f, 9.063f)
                close()
                moveTo(2.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(11.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _truckPlow!!
    }

private var _truckPlow: ImageVector? = null
