package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Compress: ImageVector
    get() {
        if (_compress != null) {
            return _compress!!
        }
        _compress = Builder(name = "Compress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.5f, 5.5f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(8.5f)
                    horizontalLineTo(6.0f)
                    curveTo(6.663f, 8.5f, 7.2989f, 8.2366f, 7.7678f, 7.7678f)
                    curveTo(8.2366f, 7.2989f, 8.5f, 6.663f, 8.5f, 6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(5.5f)
                    verticalLineTo(5.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4999f, 18.0001f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(18.4999f)
                    verticalLineTo(18.5001f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(15.5001f)
                    horizontalLineTo(17.9999f)
                    curveTo(17.3369f, 15.5001f, 16.701f, 15.7635f, 16.2321f, 16.2324f)
                    curveTo(15.7633f, 16.7012f, 15.4999f, 17.3371f, 15.4999f, 18.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.4999f, 5.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(15.4999f)
                    verticalLineTo(6.0f)
                    curveTo(15.4999f, 6.663f, 15.7633f, 7.2989f, 16.2321f, 7.7678f)
                    curveTo(16.701f, 8.2366f, 17.3369f, 8.5f, 17.9999f, 8.5f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(5.5f)
                    horizontalLineTo(18.4999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 15.5001f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(18.5001f)
                    horizontalLineTo(5.5f)
                    verticalLineTo(24.0001f)
                    horizontalLineTo(8.5f)
                    verticalLineTo(18.0001f)
                    curveTo(8.5f, 17.3371f, 8.2366f, 16.7012f, 7.7678f, 16.2324f)
                    curveTo(7.2989f, 15.7635f, 6.663f, 15.5001f, 6.0f, 15.5001f)
                    close()
                }
            }
        }
        .build()
        return _compress!!
    }

private var _compress: ImageVector? = null
