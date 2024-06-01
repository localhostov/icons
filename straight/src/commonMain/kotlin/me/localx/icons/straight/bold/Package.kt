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

public val Icons.Bold.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 7.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(12.5f)
                    curveTo(11.0f, 11.0413f, 10.4205f, 9.6424f, 9.3891f, 8.6109f)
                    curveTo(8.3576f, 7.5795f, 6.9587f, 7.0f, 5.5f, 7.0f)
                    curveTo(4.0413f, 7.0f, 2.6424f, 7.5795f, 1.6109f, 8.6109f)
                    curveTo(0.5795f, 9.6424f, 0.0f, 11.0413f, 0.0f, 12.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(13.0f)
                    close()
                    moveTo(3.0f, 12.5f)
                    curveTo(3.0f, 11.837f, 3.2634f, 11.2011f, 3.7322f, 10.7322f)
                    curveTo(4.2011f, 10.2634f, 4.837f, 10.0f, 5.5f, 10.0f)
                    curveTo(6.163f, 10.0f, 6.7989f, 10.2634f, 7.2678f, 10.7322f)
                    curveTo(7.7366f, 11.2011f, 8.0f, 11.837f, 8.0f, 12.5f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(16.0f, 15.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(16.0f)
                    close()
                    moveTo(5.5f, 7.0f)
                    curveTo(4.8078f, 7.0f, 4.1311f, 6.7947f, 3.5555f, 6.4102f)
                    curveTo(2.9799f, 6.0256f, 2.5313f, 5.4789f, 2.2664f, 4.8394f)
                    curveTo(2.0015f, 4.1999f, 1.9322f, 3.4961f, 2.0673f, 2.8172f)
                    curveTo(2.2023f, 2.1383f, 2.5356f, 1.5146f, 3.0251f, 1.0251f)
                    curveTo(3.5146f, 0.5356f, 4.1382f, 0.2023f, 4.8172f, 0.0673f)
                    curveTo(5.4961f, -0.0678f, 6.1999f, 0.0015f, 6.8394f, 0.2664f)
                    curveTo(7.4789f, 0.5313f, 8.0256f, 0.9799f, 8.4101f, 1.5555f)
                    curveTo(8.7947f, 2.1311f, 9.0f, 2.8078f, 9.0f, 3.5f)
                    curveTo(9.0f, 4.4283f, 8.6313f, 5.3185f, 7.9749f, 5.9749f)
                    curveTo(7.3185f, 6.6312f, 6.4283f, 7.0f, 5.5f, 7.0f)
                    close()
                }
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
