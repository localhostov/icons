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
                moveTo(22.0f, 18.379f)
                verticalLineTo(10.621f)
                lineToRelative(1.811f, -1.81f)
                lineTo(21.689f, 6.689f)
                lineTo(19.0f, 9.379f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.964f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -1.936f, -2.648f)
                lineTo(10.25f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.379f, 2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(8.036f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 13.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineToRelative(3.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 4.9f, 0.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.621f)
                lineToRelative(2.752f, 2.752f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(7.379f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, 0.214f)
                lineTo(11.126f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(3.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _truckPlow!!
    }

private var _truckPlow: ImageVector? = null
