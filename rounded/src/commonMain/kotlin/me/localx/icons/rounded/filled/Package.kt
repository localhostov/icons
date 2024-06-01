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

public val Icons.Filled.Package: ImageVector
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
                    moveTo(24.0f, 11.0f)
                    verticalLineTo(23.0f)
                    curveTo(24.0f, 23.2652f, 23.8946f, 23.5196f, 23.7071f, 23.7071f)
                    curveTo(23.5196f, 23.8946f, 23.2652f, 24.0f, 23.0f, 24.0f)
                    curveTo(22.7348f, 24.0f, 22.4804f, 23.8946f, 22.2929f, 23.7071f)
                    curveTo(22.1054f, 23.5196f, 22.0f, 23.2652f, 22.0f, 23.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(23.0f)
                    curveTo(2.0f, 23.2652f, 1.8946f, 23.5196f, 1.7071f, 23.7071f)
                    curveTo(1.5196f, 23.8946f, 1.2652f, 24.0f, 1.0f, 24.0f)
                    curveTo(0.7348f, 24.0f, 0.4804f, 23.8946f, 0.2929f, 23.7071f)
                    curveTo(0.1054f, 23.5196f, 0.0f, 23.2652f, 0.0f, 23.0f)
                    verticalLineTo(12.5f)
                    curveTo(0.0f, 11.0413f, 0.5795f, 9.6424f, 1.6109f, 8.6109f)
                    curveTo(2.6424f, 7.5795f, 4.0413f, 7.0f, 5.5f, 7.0f)
                    curveTo(6.9587f, 7.0f, 8.3576f, 7.5795f, 9.3891f, 8.6109f)
                    curveTo(10.4205f, 9.6424f, 11.0f, 11.0413f, 11.0f, 12.5f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(11.0f)
                    curveTo(14.0f, 10.2044f, 14.3161f, 9.4413f, 14.8787f, 8.8787f)
                    curveTo(15.4413f, 8.3161f, 16.2044f, 8.0f, 17.0f, 8.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(10.0f)
                    curveTo(18.0f, 10.2652f, 18.1054f, 10.5196f, 18.2929f, 10.7071f)
                    curveTo(18.4804f, 10.8946f, 18.7348f, 11.0f, 19.0f, 11.0f)
                    curveTo(19.2652f, 11.0f, 19.5196f, 10.8946f, 19.7071f, 10.7071f)
                    curveTo(19.8946f, 10.5196f, 20.0f, 10.2652f, 20.0f, 10.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 8.0f, 22.5587f, 8.3161f, 23.1213f, 8.8787f)
                    curveTo(23.6839f, 9.4413f, 24.0f, 10.2044f, 24.0f, 11.0f)
                    close()
                    moveTo(9.0f, 3.5f)
                    curveTo(9.0f, 2.8078f, 8.7947f, 2.1311f, 8.4101f, 1.5555f)
                    curveTo(8.0256f, 0.9799f, 7.4789f, 0.5313f, 6.8394f, 0.2664f)
                    curveTo(6.1999f, 0.0015f, 5.4961f, -0.0678f, 4.8172f, 0.0673f)
                    curveTo(4.1382f, 0.2023f, 3.5146f, 0.5356f, 3.0251f, 1.0251f)
                    curveTo(2.5356f, 1.5146f, 2.2023f, 2.1383f, 2.0673f, 2.8172f)
                    curveTo(1.9322f, 3.4961f, 2.0015f, 4.1999f, 2.2664f, 4.8394f)
                    curveTo(2.5313f, 5.4789f, 2.9799f, 6.0256f, 3.5555f, 6.4102f)
                    curveTo(4.1311f, 6.7947f, 4.8078f, 7.0f, 5.5f, 7.0f)
                    curveTo(6.4283f, 7.0f, 7.3185f, 6.6312f, 7.9749f, 5.9749f)
                    curveTo(8.6313f, 5.3185f, 9.0f, 4.4283f, 9.0f, 3.5f)
                    close()
                }
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
