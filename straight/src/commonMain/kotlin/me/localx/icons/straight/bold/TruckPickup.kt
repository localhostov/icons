package me.localx.icons.straight.bold

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

public val Icons.Bold.TruckPickup: ImageVector
    get() {
        if (_truckPickup != null) {
            return _truckPickup!!
        }
        _truckPickup = Builder(name = "TruckPickup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 10.0f)
                horizontalLineToRelative(-0.217f)
                lineTo(15.75f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.879f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(1.879f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, 0.214f)
                lineTo(16.626f, 10.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
