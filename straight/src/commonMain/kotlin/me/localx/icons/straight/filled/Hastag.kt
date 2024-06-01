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

public val Icons.Filled.Hastag: ImageVector
    get() {
        if (_hastag != null) {
            return _hastag!!
        }
        _hastag = Builder(name = "Hastag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.765f, 9.0f)
                    lineTo(24.0f, 7.0f)
                    horizontalLineTo(18.054f)
                    lineTo(18.9f, 0.0f)
                    horizontalLineTo(16.883f)
                    lineTo(16.042f, 7.0f)
                    horizontalLineTo(9.159f)
                    lineTo(10.0f, 0.0f)
                    horizontalLineTo(7.988f)
                    lineTo(7.147f, 7.0f)
                    horizontalLineTo(0.941f)
                    lineTo(0.706f, 9.0f)
                    horizontalLineTo(6.906f)
                    lineTo(6.185f, 15.0f)
                    horizontalLineTo(0.235f)
                    lineTo(0.0f, 17.0f)
                    horizontalLineTo(5.946f)
                    lineTo(5.105f, 24.0f)
                    horizontalLineTo(7.117f)
                    lineTo(7.958f, 17.0f)
                    horizontalLineTo(14.841f)
                    lineTo(14.0f, 24.0f)
                    horizontalLineTo(16.012f)
                    lineTo(16.853f, 17.0f)
                    horizontalLineTo(23.059f)
                    lineTo(23.294f, 15.0f)
                    horizontalLineTo(17.094f)
                    lineTo(17.815f, 9.0f)
                    horizontalLineTo(23.765f)
                    close()
                    moveTo(15.081f, 15.0f)
                    horizontalLineTo(8.2f)
                    lineTo(8.921f, 9.0f)
                    horizontalLineTo(15.8f)
                    lineTo(15.081f, 15.0f)
                    close()
                }
            }
        }
        .build()
        return _hastag!!
    }

private var _hastag: ImageVector? = null
