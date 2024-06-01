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

public val Icons.Filled.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 6.9993f)
                    horizontalLineTo(10.17f)
                    verticalLineTo(5.4133f)
                    curveTo(10.1699f, 5.0178f, 10.0526f, 4.6312f, 9.8328f, 4.3024f)
                    curveTo(9.613f, 3.9736f, 9.3007f, 3.7173f, 8.9353f, 3.566f)
                    curveTo(8.5699f, 3.4146f, 8.1678f, 3.375f, 7.7799f, 3.4522f)
                    curveTo(7.392f, 3.5293f, 7.0357f, 3.7197f, 6.756f, 3.9993f)
                    lineTo(0.876f, 9.8783f)
                    curveTo(0.3136f, 10.4409f, -0.0024f, 11.2038f, -0.0024f, 11.9993f)
                    curveTo(-0.0024f, 12.7948f, 0.3136f, 13.5577f, 0.876f, 14.1203f)
                    lineTo(6.756f, 19.9993f)
                    curveTo(7.0357f, 20.2789f, 7.392f, 20.4693f, 7.7799f, 20.5465f)
                    curveTo(8.1678f, 20.6236f, 8.5699f, 20.584f, 8.9353f, 20.4327f)
                    curveTo(9.3007f, 20.2813f, 9.613f, 20.025f, 9.8328f, 19.6962f)
                    curveTo(10.0526f, 19.3674f, 10.1699f, 18.9808f, 10.17f, 18.5853f)
                    verticalLineTo(16.9993f)
                    horizontalLineTo(16.0f)
                    curveTo(17.5908f, 17.0009f, 19.116f, 17.6336f, 20.2409f, 18.7584f)
                    curveTo(21.3657f, 19.8833f, 21.9984f, 21.4085f, 22.0f, 22.9993f)
                    curveTo(22.0f, 23.2645f, 22.1053f, 23.5189f, 22.2929f, 23.7064f)
                    curveTo(22.4804f, 23.8939f, 22.7348f, 23.9993f, 23.0f, 23.9993f)
                    curveTo(23.2652f, 23.9993f, 23.5196f, 23.8939f, 23.7071f, 23.7064f)
                    curveTo(23.8946f, 23.5189f, 24.0f, 23.2645f, 24.0f, 22.9993f)
                    verticalLineTo(15.9993f)
                    curveTo(23.9973f, 13.6132f, 23.0483f, 11.3255f, 21.361f, 9.6383f)
                    curveTo(19.6738f, 7.951f, 17.3861f, 7.002f, 15.0f, 6.9993f)
                    close()
                }
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
