package me.localx.icons.rounded.bold

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
                moveTo(21.171f, 10.322f)
                lineTo(17.012f, 4.354f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 12.5f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 5.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 14.5f)
                verticalLineToRelative(2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineToRelative(-2.0f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 21.171f, 10.322f)
                close()
                moveTo(11.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.051f, 1.07f)
                lineTo(17.29f, 10.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 13.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 14.5f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
