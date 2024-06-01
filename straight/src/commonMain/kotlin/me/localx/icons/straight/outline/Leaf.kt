package me.localx.icons.straight.outline

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

public val Icons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.913f, 0.049f)
                    curveTo(22.357f, 0.075f, 9.262f, 0.72f, 4.862f, 5.12f)
                    curveTo(3.128f, 6.8589f, 2.0998f, 9.1786f, 1.9759f, 11.6311f)
                    curveTo(1.852f, 14.0837f, 2.6411f, 16.4952f, 4.191f, 18.4f)
                    lineTo(0.0f, 22.591f)
                    lineTo(1.415f, 24.0f)
                    lineTo(5.605f, 19.816f)
                    curveTo(7.5099f, 21.3662f, 9.9217f, 22.1555f, 12.3746f, 22.0314f)
                    curveTo(14.8274f, 21.9073f, 17.1473f, 20.8786f, 18.886f, 19.144f)
                    curveTo(23.374f, 14.657f, 23.936f, 1.644f, 23.957f, 1.088f)
                    lineTo(24.0f, 0.0f)
                    lineTo(22.913f, 0.049f)
                    close()
                    moveTo(17.472f, 17.73f)
                    curveTo(16.1084f, 19.0898f, 14.2966f, 19.9069f, 12.3747f, 20.0287f)
                    curveTo(10.4529f, 20.1505f, 8.5524f, 19.5687f, 7.028f, 18.392f)
                    lineTo(16.665f, 8.755f)
                    lineTo(15.251f, 7.341f)
                    lineTo(5.614f, 16.978f)
                    curveTo(4.4373f, 15.4536f, 3.8555f, 13.5531f, 3.9773f, 11.6313f)
                    curveTo(4.0991f, 9.7094f, 4.9162f, 7.8976f, 6.276f, 6.534f)
                    curveTo(9.455f, 3.355f, 18.683f, 2.372f, 21.891f, 2.122f)
                    curveTo(21.657f, 5.315f, 20.716f, 14.486f, 17.472f, 17.73f)
                    close()
                }
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
