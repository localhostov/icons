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

public val Icons.Bold.TruckPlow: ImageVector
    get() {
        if (_truckPlow != null) {
            return _truckPlow!!
        }
        _truckPlow = Builder(name = "TruckPlow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.318f)
                verticalLineTo(11.682f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, true, 1.618f, -4.17f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.4f, 5.488f)
                arcTo(9.171f, 9.171f, 0.0f, false, false, 19.0f, 11.682f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.291f)
                curveToRelative(-0.019f, -0.036f, -0.04f, -0.071f, -0.062f, -0.105f)
                lineTo(11.361f, 4.481f)
                arcTo(5.483f, 5.483f, 0.0f, false, false, 6.764f, 2.0f)
                horizontalLineTo(6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(4.757f)
                arcTo(4.508f, 4.508f, 0.0f, false, false, 0.0f, 14.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineToRelative(0.55f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineToRelative(-0.55f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, false, 2.0f, -2.45f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.318f)
                arcToRelative(9.171f, 9.171f, 0.0f, false, false, 2.4f, 6.194f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.215f, -2.024f)
                arcTo(6.17f, 6.17f, 0.0f, false, true, 22.0f, 15.318f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(0.264f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 2.09f, 1.128f)
                lineTo(11.4f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.5f, 5.0f)
                close()
                moveTo(3.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 13.0f)
                horizontalLineToRelative(8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 14.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _truckPlow!!
    }

private var _truckPlow: ImageVector? = null
