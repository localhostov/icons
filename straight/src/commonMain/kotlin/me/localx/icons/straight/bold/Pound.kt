package me.localx.icons.straight.bold

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

public val Icons.Bold.Pound: ImageVector
    get() {
        if (_pound != null) {
            return _pound!!
        }
        _pound = Builder(name = "Pound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0001f, 17.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(8.0f)
                    curveTo(9.0001f, 6.6739f, 9.5269f, 5.4022f, 10.4646f, 4.4645f)
                    curveTo(11.4023f, 3.5268f, 12.674f, 3.0f, 14.0001f, 3.0f)
                    curveTo(15.3262f, 3.0f, 16.598f, 3.5268f, 17.5357f, 4.4645f)
                    curveTo(18.4733f, 5.4022f, 19.0001f, 6.6739f, 19.0001f, 8.0f)
                    horizontalLineTo(22.0001f)
                    curveTo(22.0001f, 5.8783f, 21.1573f, 3.8434f, 19.657f, 2.3431f)
                    curveTo(18.1567f, 0.8429f, 16.1219f, 0.0f, 14.0001f, 0.0f)
                    curveTo(11.8784f, 0.0f, 9.8436f, 0.8429f, 8.3433f, 2.3431f)
                    curveTo(6.843f, 3.8434f, 6.0001f, 5.8783f, 6.0001f, 8.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0001f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(17.0f)
                    curveTo(6.0358f, 17.5345f, 5.9568f, 18.0705f, 5.7684f, 18.572f)
                    curveTo(5.58f, 19.0734f, 5.2866f, 19.5289f, 4.9078f, 19.9077f)
                    curveTo(4.529f, 20.2865f, 4.0736f, 20.5799f, 3.5721f, 20.7683f)
                    curveTo(3.0706f, 20.9567f, 2.5346f, 21.0357f, 2.0001f, 21.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(7.8531f)
                    curveTo(8.6201f, 19.8083f, 9.019f, 18.4171f, 9.0001f, 17.0f)
                    close()
                }
            }
        }
        .build()
        return _pound!!
    }

private var _pound: ImageVector? = null
