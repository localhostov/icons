package me.localx.icons.straight.outline

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

public val Icons.Outline.MapMarkerPlus: ImageVector
    get() {
        if (_mapMarkerPlus != null) {
            return _mapMarkerPlus!!
        }
        _mapMarkerPlus = Builder(name = "MapMarkerPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9842f, 23.9946f)
                lineTo(19.0467f, 17.0869f)
                curveTo(22.9644f, 13.2035f, 22.9921f, 6.8795f, 19.1087f, 2.9619f)
                curveTo(15.2253f, -0.9558f, 8.9013f, -0.9836f, 4.9837f, 2.8998f)
                curveTo(4.9629f, 2.9204f, 4.9423f, 2.9411f, 4.9217f, 2.9619f)
                curveTo(1.0212f, 6.8625f, 1.0212f, 13.1865f, 4.9218f, 17.087f)
                curveTo(4.9245f, 17.0897f, 4.9271f, 17.0923f, 4.9297f, 17.0949f)
                lineTo(11.9842f, 23.9946f)
                close()
                moveTo(6.334f, 4.3742f)
                curveTo(9.4523f, 1.2514f, 14.5117f, 1.2478f, 17.6344f, 4.3662f)
                curveTo(20.7571f, 7.4845f, 20.7608f, 12.5439f, 17.6424f, 15.6666f)
                lineTo(11.9842f, 21.1999f)
                lineTo(6.334f, 15.6746f)
                curveTo(3.2135f, 12.5542f, 3.2133f, 7.495f, 6.3337f, 4.3744f)
                curveTo(6.3338f, 4.3744f, 6.3339f, 4.3742f, 6.334f, 4.3742f)
                close()
                moveTo(10.9854f, 11.0232f)
                horizontalLineTo(7.989f)
                verticalLineTo(9.0256f)
                horizontalLineTo(10.9854f)
                verticalLineTo(6.0292f)
                horizontalLineTo(12.983f)
                verticalLineTo(9.0256f)
                horizontalLineTo(15.9794f)
                verticalLineTo(11.0232f)
                horizontalLineTo(12.983f)
                verticalLineTo(14.0196f)
                horizontalLineTo(10.9854f)
                verticalLineTo(11.0232f)
                close()
            }
        }
        .build()
        return _mapMarkerPlus!!
    }

private var _mapMarkerPlus: ImageVector? = null
