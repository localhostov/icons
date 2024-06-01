package me.localx.icons.straight.filled

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

public val Icons.Filled.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 0.016f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(21.8601f)
                    lineTo(17.0002f, 0.016f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9998f, 7.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(9.9998f)
                    curveTo(9.2042f, 0.0f, 8.4411f, 0.3161f, 7.8785f, 0.8787f)
                    curveTo(7.3159f, 1.4413f, 6.9998f, 2.2043f, 6.9998f, 3.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(21.9998f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(14.9998f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0002f, 21.0002f)
                    verticalLineTo(4.0002f)
                    curveTo(4.2045f, 4.0002f, 3.4414f, 4.3163f, 2.8788f, 4.8789f)
                    curveTo(2.3162f, 5.4415f, 2.0001f, 6.2046f, 2.0001f, 7.0002f)
                    verticalLineTo(24.0002f)
                    horizontalLineTo(18.0002f)
                    verticalLineTo(21.0002f)
                    horizontalLineTo(5.0002f)
                    close()
                }
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
