package me.localx.icons.rounded.outline

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

public val Icons.Outline.TruckPickup: ImageVector
    get() {
        if (_truckPickup != null) {
            return _truckPickup!!
        }
        _truckPickup = Builder(name = "TruckPickup", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.548f, 10.038f)
                lineToRelative(-4.111f, -5.9f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.335f, 2.0f)
                lineTo(12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(9.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(22.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(24.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.548f, 10.038f)
                close()
                moveTo(11.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(0.335f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.8f, 5.284f)
                lineTo(18.084f, 10.0f)
                lineTo(11.0f, 10.0f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(4.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(20.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(20.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
