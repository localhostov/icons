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
                moveTo(24.02f, 21.605f)
                lineTo(22.605f, 23.02f)
                lineTo(20.0f, 20.414f)
                lineTo(20.0f, 16.0f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(15.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 9.586f)
                lineToRelative(2.543f, -2.543f)
                lineToRelative(1.414f, 1.414f)
                lineTo(22.0f, 10.414f)
                verticalLineToRelative(9.172f)
                close()
                moveTo(2.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(11.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(10.84f, 3.285f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.379f, 2.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 9.0f)
                lineTo(14.824f, 9.0f)
                close()
            }
        }
        .build()
        return _truckPlow!!
    }

private var _truckPlow: ImageVector? = null
