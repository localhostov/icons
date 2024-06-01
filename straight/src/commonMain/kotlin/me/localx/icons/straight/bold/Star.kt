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

public val Icons.Bold.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 6.9863f)
                    horizontalLineTo(16.272f)
                    lineTo(14.046f, 0.0303f)
                    horizontalLineTo(9.954f)
                    lineTo(7.728f, 6.9863f)
                    horizontalLineTo(1.0f)
                    lineTo(0.0f, 11.4533f)
                    lineTo(5.1f, 15.1873f)
                    lineTo(2.567f, 23.0473f)
                    lineTo(6.892f, 24.0303f)
                    lineTo(12.0f, 20.2623f)
                    lineTo(17.112f, 24.0303f)
                    lineTo(21.436f, 23.0433f)
                    lineTo(18.9f, 15.1873f)
                    lineTo(24.0f, 11.4533f)
                    lineTo(23.0f, 6.9863f)
                    close()
                    moveTo(15.382f, 14.0413f)
                    lineTo(17.482f, 20.5743f)
                    lineTo(12.0f, 16.5293f)
                    lineTo(6.513f, 20.5743f)
                    lineTo(8.618f, 14.0413f)
                    lineTo(3.094f, 9.9943f)
                    horizontalLineTo(9.916f)
                    lineTo(12.0f, 3.4813f)
                    lineTo(14.084f, 9.9943f)
                    horizontalLineTo(20.906f)
                    lineTo(15.382f, 14.0413f)
                    close()
                }
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
