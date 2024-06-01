package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.9619f, 8.0f)
                    lineTo(7.6429f, 0.0f)
                    horizontalLineTo(10.3999f)
                    curveTo(10.939f, -0.0f, 11.4681f, 0.1452f, 11.9316f, 0.4205f)
                    curveTo(12.3951f, 0.6957f, 12.7759f, 1.0907f, 13.0339f, 1.564f)
                    lineTo(16.2689f, 8.0f)
                    horizontalLineTo(9.9619f)
                    close()
                    moveTo(20.9999f, 10.0f)
                    horizontalLineTo(4.9869f)
                    lineTo(2.3999f, 7.411f)
                    curveTo(2.1622f, 7.1605f, 1.8403f, 7.0067f, 1.496f, 6.9791f)
                    curveTo(1.1518f, 6.9516f, 0.8095f, 7.0523f, 0.535f, 7.2618f)
                    curveTo(0.2605f, 7.4713f, 0.0731f, 7.7749f, 0.0088f, 8.1142f)
                    curveTo(-0.0554f, 8.4535f, 0.008f, 8.8046f, 0.1869f, 9.1f)
                    lineTo(3.4069f, 15.0f)
                    horizontalLineTo(10.5549f)
                    lineTo(7.0189f, 24.0f)
                    horizontalLineTo(10.0819f)
                    curveTo(10.6108f, 24.0021f, 11.1306f, 23.863f, 11.5876f, 23.597f)
                    curveTo(12.0447f, 23.331f, 12.4225f, 22.9478f, 12.6819f, 22.487f)
                    lineTo(17.2689f, 15.0f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(13.0f)
                    curveTo(23.9999f, 12.2044f, 23.6839f, 11.4413f, 23.1212f, 10.8787f)
                    curveTo(22.5586f, 10.3161f, 21.7956f, 10.0f, 20.9999f, 10.0f)
                    close()
                }
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
