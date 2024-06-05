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

public val Icons.Filled.TruckContainer: ImageVector
    get() {
        if (_truckContainer != null) {
            return _truckContainer!!
        }
        _truckContainer = Builder(name = "TruckContainer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.942f, 20.0f)
                curveTo(5.529f, 23.954f, -0.53f, 23.952f, 0.058f, 20.0f)
                close()
                moveTo(22.632f, 7.735f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 18.838f, 5.0f)
                lineTo(16.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.716f)
                curveTo(23.692f, 10.92f, 22.632f, 7.735f, 22.632f, 7.735f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(1.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(2.744f, -0.026f, 4.3f, -2.416f, 4.0f, -5.0f)
                close()
                moveTo(6.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(15.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
                moveTo(14.0f, 5.5f)
                lineTo(14.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(1.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(0.0f, 5.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 4.5f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 14.0f, 5.5f)
                close()
                moveTo(4.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _truckContainer!!
    }

private var _truckContainer: ImageVector? = null
