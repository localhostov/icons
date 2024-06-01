package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.244f, 3.9993f)
                    curveTo(16.9643f, 3.7197f, 16.608f, 3.5293f, 16.2201f, 3.4522f)
                    curveTo(15.8322f, 3.375f, 15.4301f, 3.4146f, 15.0647f, 3.566f)
                    curveTo(14.6993f, 3.7173f, 14.387f, 3.9736f, 14.1672f, 4.3024f)
                    curveTo(13.9474f, 4.6312f, 13.8301f, 5.0178f, 13.83f, 5.4133f)
                    verticalLineTo(6.9993f)
                    horizontalLineTo(9.0f)
                    curveTo(6.6139f, 7.002f, 4.3262f, 7.951f, 2.639f, 9.6383f)
                    curveTo(0.9517f, 11.3255f, 0.0026f, 13.6132f, 0.0f, 15.9993f)
                    lineTo(0.0f, 22.9993f)
                    curveTo(0.0f, 23.2645f, 0.1054f, 23.5189f, 0.2929f, 23.7064f)
                    curveTo(0.4804f, 23.8939f, 0.7348f, 23.9993f, 1.0f, 23.9993f)
                    curveTo(1.2652f, 23.9993f, 1.5196f, 23.8939f, 1.7071f, 23.7064f)
                    curveTo(1.8946f, 23.5189f, 2.0f, 23.2645f, 2.0f, 22.9993f)
                    curveTo(2.0016f, 21.4085f, 2.6342f, 19.8833f, 3.7591f, 18.7584f)
                    curveTo(4.884f, 17.6336f, 6.4092f, 17.0009f, 8.0f, 16.9993f)
                    horizontalLineTo(13.83f)
                    verticalLineTo(18.5853f)
                    curveTo(13.8301f, 18.9808f, 13.9474f, 19.3674f, 14.1672f, 19.6962f)
                    curveTo(14.387f, 20.025f, 14.6993f, 20.2813f, 15.0647f, 20.4327f)
                    curveTo(15.4301f, 20.584f, 15.8322f, 20.6236f, 16.2201f, 20.5465f)
                    curveTo(16.608f, 20.4693f, 16.9643f, 20.2789f, 17.244f, 19.9993f)
                    lineTo(23.123f, 14.1203f)
                    curveTo(23.6854f, 13.5577f, 24.0014f, 12.7948f, 24.0014f, 11.9993f)
                    curveTo(24.0014f, 11.2038f, 23.6854f, 10.4409f, 23.123f, 9.8783f)
                    lineTo(17.244f, 3.9993f)
                    close()
                }
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
