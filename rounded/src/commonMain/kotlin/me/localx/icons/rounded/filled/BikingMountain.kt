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

public val Icons.Filled.BikingMountain: ImageVector
    get() {
        if (_bikingMountain != null) {
            return _bikingMountain!!
        }
        _bikingMountain = Builder(name = "BikingMountain", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, -5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 10.0f, 18.0f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 5.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 13.0f)
                close()
                moveTo(12.651f, 13.241f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 14.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 14.459f)
                lineTo(9.062f, 12.794f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -0.993f, -1.8f)
                curveTo(8.046f, 11.0f, 8.024f, 11.0f, 8.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 8.0f)
                curveTo(5.0f, 5.19f, 8.521f, 4.0f, 9.923f, 4.0f)
                arcToRelative(6.454f, 6.454f, 0.0f, false, true, 3.664f, 1.19f)
                curveToRelative(0.044f, 0.032f, 4.12f, 4.1f, 4.12f, 4.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineTo(12.966f, 7.38f)
                reflectiveCurveToRelative(-2.484f, 2.28f, -2.653f, 2.44f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 0.051f, 1.457f)
                close()
                moveTo(19.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 2.5f)
                close()
            }
        }
        .build()
        return _bikingMountain!!
    }

private var _bikingMountain: ImageVector? = null
