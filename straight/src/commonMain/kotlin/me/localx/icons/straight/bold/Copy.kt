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

public val Icons.Bold.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 19.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(3.5f)
                    curveTo(0.0f, 2.5717f, 0.3687f, 1.6815f, 1.0251f, 1.0251f)
                    curveTo(1.6815f, 0.3687f, 2.5717f, 0.0f, 3.5f, 0.0f)
                    lineTo(15.5f, 0.0f)
                    curveTo(16.4283f, 0.0f, 17.3185f, 0.3687f, 17.9749f, 1.0251f)
                    curveTo(18.6313f, 1.6815f, 19.0f, 2.5717f, 19.0f, 3.5f)
                    verticalLineTo(19.0f)
                    close()
                    moveTo(3.0f, 16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(3.5f)
                    curveTo(15.9982f, 3.368f, 15.9449f, 3.2418f, 15.8516f, 3.1484f)
                    curveTo(15.7582f, 3.0551f, 15.632f, 3.0018f, 15.5f, 3.0f)
                    horizontalLineTo(3.5f)
                    curveTo(3.3674f, 3.0f, 3.2402f, 3.0527f, 3.1465f, 3.1465f)
                    curveTo(3.0527f, 3.2402f, 3.0f, 3.3674f, 3.0f, 3.5f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(21.0f, 5.051f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.5f)
                    curveTo(23.9976f, 7.6606f, 23.6931f, 6.8502f, 23.1423f, 6.2168f)
                    curveTo(22.5914f, 5.5835f, 21.8309f, 5.1697f, 21.0f, 5.051f)
                    close()
                }
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
