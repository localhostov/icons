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

public val Icons.Bold.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9846f, 23.9946f)
                lineTo(19.0471f, 17.0869f)
                curveTo(22.9648f, 13.2035f, 22.9925f, 6.8795f, 19.1091f, 2.9619f)
                curveTo(15.2257f, -0.9558f, 8.9017f, -0.9836f, 4.9841f, 2.8998f)
                curveTo(4.9633f, 2.9204f, 4.9426f, 2.9411f, 4.9221f, 2.9619f)
                curveTo(1.0216f, 6.8625f, 1.0216f, 13.1865f, 4.9222f, 17.087f)
                curveTo(4.9261f, 17.091f, 4.9301f, 17.095f, 4.934f, 17.0989f)
                lineTo(11.9846f, 23.9946f)
                close()
                moveTo(7.0415f, 5.0803f)
                curveTo(9.7959f, 2.3741f, 14.2226f, 2.4132f, 16.9288f, 5.1676f)
                curveTo(19.597f, 7.8833f, 19.6018f, 12.2348f, 16.9396f, 14.9564f)
                lineTo(11.9846f, 19.8036f)
                lineTo(7.0405f, 14.9684f)
                curveTo(4.31f, 12.2382f, 4.3097f, 7.8113f, 7.04f, 5.0808f)
                curveTo(7.0402f, 5.0806f, 7.0403f, 5.0805f, 7.0405f, 5.0803f)
                horizontalLineTo(7.0415f)
                close()
                moveTo(10.4864f, 11.5226f)
                horizontalLineTo(7.9894f)
                verticalLineTo(8.5262f)
                horizontalLineTo(10.4864f)
                verticalLineTo(6.0292f)
                horizontalLineTo(13.4827f)
                verticalLineTo(8.5262f)
                horizontalLineTo(15.9797f)
                verticalLineTo(11.5226f)
                horizontalLineTo(13.4827f)
                verticalLineTo(14.0195f)
                horizontalLineTo(10.4864f)
                verticalLineTo(11.5226f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
