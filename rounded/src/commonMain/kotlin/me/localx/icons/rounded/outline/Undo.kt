package me.localx.icons.rounded.outline

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

public val Icons.Outline.Undo: ImageVector
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
                    moveTo(23.0f, 23.9993f)
                    curveTo(22.7348f, 23.9993f, 22.4804f, 23.8939f, 22.2929f, 23.7064f)
                    curveTo(22.1054f, 23.5189f, 22.0f, 23.2645f, 22.0f, 22.9993f)
                    curveTo(21.9984f, 21.4085f, 21.3658f, 19.8833f, 20.2409f, 18.7584f)
                    curveTo(19.116f, 17.6336f, 17.5908f, 17.0009f, 16.0f, 16.9993f)
                    horizontalLineTo(10.17f)
                    verticalLineTo(18.5853f)
                    curveTo(10.1699f, 18.9808f, 10.0526f, 19.3674f, 9.8328f, 19.6962f)
                    curveTo(9.6131f, 20.025f, 9.3007f, 20.2813f, 8.9353f, 20.4327f)
                    curveTo(8.5699f, 20.584f, 8.1679f, 20.6236f, 7.78f, 20.5465f)
                    curveTo(7.392f, 20.4693f, 7.0357f, 20.2789f, 6.756f, 19.9993f)
                    lineTo(0.877f, 14.1203f)
                    curveTo(0.3146f, 13.5577f, -0.0013f, 12.7948f, -0.0013f, 11.9993f)
                    curveTo(-0.0013f, 11.2038f, 0.3146f, 10.4409f, 0.877f, 9.8783f)
                    lineTo(6.756f, 3.9993f)
                    curveTo(7.0357f, 3.7197f, 7.392f, 3.5293f, 7.78f, 3.4522f)
                    curveTo(8.1679f, 3.375f, 8.5699f, 3.4146f, 8.9353f, 3.566f)
                    curveTo(9.3007f, 3.7173f, 9.6131f, 3.9736f, 9.8328f, 4.3024f)
                    curveTo(10.0526f, 4.6312f, 10.1699f, 5.0178f, 10.17f, 5.4133f)
                    verticalLineTo(6.9993f)
                    horizontalLineTo(15.0f)
                    curveTo(17.3862f, 7.002f, 19.6738f, 7.951f, 21.3611f, 9.6383f)
                    curveTo(23.0483f, 11.3255f, 23.9974f, 13.6132f, 24.0f, 15.9993f)
                    verticalLineTo(22.9993f)
                    curveTo(24.0f, 23.2645f, 23.8947f, 23.5189f, 23.7071f, 23.7064f)
                    curveTo(23.5196f, 23.8939f, 23.2652f, 23.9993f, 23.0f, 23.9993f)
                    close()
                    moveTo(8.17f, 5.4133f)
                    lineTo(2.291f, 11.2923f)
                    curveTo(2.1035f, 11.4798f, 1.9982f, 11.7342f, 1.9982f, 11.9993f)
                    curveTo(1.9982f, 12.2645f, 2.1035f, 12.5188f, 2.291f, 12.7063f)
                    lineTo(8.17f, 18.5853f)
                    verticalLineTo(15.9993f)
                    curveTo(8.17f, 15.7341f, 8.2754f, 15.4797f, 8.4629f, 15.2922f)
                    curveTo(8.6504f, 15.1047f, 8.9048f, 14.9993f, 9.17f, 14.9993f)
                    horizontalLineTo(16.0f)
                    curveTo(17.1356f, 14.999f, 18.2582f, 15.2409f, 19.2929f, 15.7089f)
                    curveTo(20.3275f, 16.1769f, 21.2505f, 16.8603f, 22.0f, 17.7133f)
                    verticalLineTo(15.9993f)
                    curveTo(21.9979f, 14.1435f, 21.2597f, 12.3642f, 19.9474f, 11.0519f)
                    curveTo(18.6351f, 9.7396f, 16.8559f, 9.0014f, 15.0f, 8.9993f)
                    horizontalLineTo(9.17f)
                    curveTo(8.9048f, 8.9993f, 8.6504f, 8.894f, 8.4629f, 8.7064f)
                    curveTo(8.2754f, 8.5189f, 8.17f, 8.2645f, 8.17f, 7.9993f)
                    verticalLineTo(5.4133f)
                    close()
                }
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
