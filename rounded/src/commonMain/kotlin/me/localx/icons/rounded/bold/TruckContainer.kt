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

public val Icons.Bold.TruckContainer: ImageVector
    get() {
        if (_truckContainer != null) {
            return _truckContainer!!
        }
        _truckContainer = Builder(name = "TruckContainer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.615f, 10.6f)
                lineToRelative(-0.842f, -2.525f)
                arcTo(4.494f, 4.494f, 0.0f, false, false, 18.5f, 5.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 6.5f)
                lineTo(15.0f, 17.0f)
                lineTo(1.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 18.513f)
                lineTo(0.0f, 18.513f)
                verticalLineToRelative(2.064f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                lineTo(5.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(0.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.577f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.915f)
                arcTo(3.506f, 3.506f, 0.0f, false, false, 24.0f, 16.5f)
                lineTo(24.0f, 12.974f)
                arcTo(7.487f, 7.487f, 0.0f, false, false, 23.615f, 10.6f)
                close()
                moveTo(18.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.424f, 1.026f)
                lineToRelative(0.842f, 2.525f)
                arcTo(4.483f, 4.483f, 0.0f, false, true, 21.0f, 12.974f)
                lineTo(21.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 8.0f)
                close()
                moveTo(1.5f, 15.0f)
                horizontalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 13.5f)
                verticalLineToRelative(-8.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 8.5f, 1.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 15.0f)
                close()
                moveTo(3.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 5.5f)
                lineTo(10.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(5.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _truckContainer!!
    }

private var _truckContainer: ImageVector? = null
