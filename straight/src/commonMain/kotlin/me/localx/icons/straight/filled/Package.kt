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
                    moveTo(24.0f, 8.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.481f)
                    curveTo(0.0f, 12.0223f, 0.5795f, 10.6234f, 1.6109f, 9.5919f)
                    curveTo(2.6424f, 8.5605f, 4.0413f, 7.981f, 5.5f, 7.981f)
                    curveTo(6.9587f, 7.981f, 8.3576f, 8.5605f, 9.3891f, 9.5919f)
                    curveTo(10.4205f, 10.6234f, 11.0f, 12.0223f, 11.0f, 13.481f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(5.5f, 7.0f)
                    curveTo(6.1922f, 7.0f, 6.8689f, 6.7947f, 7.4445f, 6.4102f)
                    curveTo(8.0201f, 6.0256f, 8.4687f, 5.4789f, 8.7336f, 4.8394f)
                    curveTo(8.9985f, 4.1999f, 9.0678f, 3.4961f, 8.9327f, 2.8172f)
                    curveTo(8.7977f, 2.1383f, 8.4644f, 1.5146f, 7.9749f, 1.0251f)
                    curveTo(7.4854f, 0.5356f, 6.8618f, 0.2023f, 6.1828f, 0.0673f)
                    curveTo(5.5039f, -0.0678f, 4.8001f, 0.0015f, 4.1606f, 0.2664f)
                    curveTo(3.5211f, 0.5313f, 2.9744f, 0.9799f, 2.5899f, 1.5555f)
                    curveTo(2.2053f, 2.1311f, 2.0f, 2.8078f, 2.0f, 3.5f)
                    curveTo(2.0f, 4.4283f, 2.3688f, 5.3185f, 3.0251f, 5.9749f)
                    curveTo(3.6815f, 6.6312f, 4.5717f, 7.0f, 5.5f, 7.0f)
                    close()
                }
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
