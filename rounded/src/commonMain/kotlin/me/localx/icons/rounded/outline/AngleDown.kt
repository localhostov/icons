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

public val Icons.Outline.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 17.17f)
                    curveTo(11.3431f, 17.1712f, 10.6922f, 17.0429f, 10.0848f, 16.7923f)
                    curveTo(9.4774f, 16.5418f, 8.9253f, 16.174f, 8.4601f, 15.71f)
                    lineTo(0.2901f, 7.54f)
                    curveTo(0.1018f, 7.3517f, -0.004f, 7.0963f, -0.004f, 6.83f)
                    curveTo(-0.004f, 6.5637f, 0.1018f, 6.3083f, 0.2901f, 6.12f)
                    curveTo(0.4784f, 5.9317f, 0.7338f, 5.8259f, 1.0001f, 5.8259f)
                    curveTo(1.2664f, 5.8259f, 1.5218f, 5.9317f, 1.7101f, 6.12f)
                    lineTo(9.8801f, 14.29f)
                    curveTo(10.4426f, 14.8518f, 11.2051f, 15.1674f, 12.0001f, 15.1674f)
                    curveTo(12.7951f, 15.1674f, 13.5576f, 14.8518f, 14.1201f, 14.29f)
                    lineTo(22.2901f, 6.12f)
                    curveTo(22.4784f, 5.9317f, 22.7338f, 5.8259f, 23.0001f, 5.8259f)
                    curveTo(23.2664f, 5.8259f, 23.5218f, 5.9317f, 23.7101f, 6.12f)
                    curveTo(23.8984f, 6.3083f, 24.0042f, 6.5637f, 24.0042f, 6.83f)
                    curveTo(24.0042f, 7.0963f, 23.8984f, 7.3517f, 23.7101f, 7.54f)
                    lineTo(15.5401f, 15.71f)
                    curveTo(15.0749f, 16.174f, 14.5228f, 16.5418f, 13.9154f, 16.7923f)
                    curveTo(13.308f, 17.0429f, 12.6572f, 17.1712f, 12.0001f, 17.17f)
                    close()
                }
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
