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

public val Icons.Filled.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 14.0f)
                    curveTo(23.9956f, 10.9927f, 22.8631f, 8.0965f, 20.8263f, 5.884f)
                    curveTo(18.7895f, 3.6715f, 15.9967f, 2.3037f, 13.0f, 2.051f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(2.051f)
                    curveTo(8.0033f, 2.3037f, 5.2105f, 3.6715f, 3.1737f, 5.884f)
                    curveTo(1.1369f, 8.0965f, 0.0044f, 10.9927f, 0.0f, 14.0f)
                    lineTo(0.0f, 15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(21.0f)
                    curveTo(11.0f, 21.2652f, 10.8946f, 21.5196f, 10.7071f, 21.7071f)
                    curveTo(10.5196f, 21.8946f, 10.2652f, 22.0f, 10.0f, 22.0f)
                    curveTo(9.7348f, 22.0f, 9.4804f, 21.8946f, 9.2929f, 21.7071f)
                    curveTo(9.1054f, 21.5196f, 9.0f, 21.2652f, 9.0f, 21.0f)
                    horizontalLineTo(7.0f)
                    curveTo(7.0f, 21.7956f, 7.3161f, 22.5587f, 7.8787f, 23.1213f)
                    curveTo(8.4413f, 23.6839f, 9.2044f, 24.0f, 10.0f, 24.0f)
                    curveTo(10.7956f, 24.0f, 11.5587f, 23.6839f, 12.1213f, 23.1213f)
                    curveTo(12.6839f, 22.5587f, 13.0f, 21.7956f, 13.0f, 21.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
