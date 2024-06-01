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

public val Icons.Bold.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9999f, 24.024f)
                    lineTo(7.9999f, 19.224f)
                    verticalLineTo(14.538f)
                    lineTo(0.9999f, 6.038f)
                    verticalLineTo(3.5f)
                    curveTo(0.9999f, 2.5717f, 1.3687f, 1.6815f, 2.0251f, 1.0251f)
                    curveTo(2.6814f, 0.3687f, 3.5717f, 0.0f, 4.4999f, 0.0f)
                    lineTo(19.4999f, 0.0f)
                    curveTo(20.4282f, 0.0f, 21.3184f, 0.3687f, 21.9748f, 1.0251f)
                    curveTo(22.6312f, 1.6815f, 22.9999f, 2.5717f, 22.9999f, 3.5f)
                    verticalLineTo(6.038f)
                    lineTo(15.9999f, 14.538f)
                    verticalLineTo(24.024f)
                    close()
                    moveTo(10.9999f, 17.524f)
                    lineTo(12.9999f, 18.724f)
                    verticalLineTo(13.462f)
                    lineTo(19.9999f, 4.962f)
                    verticalLineTo(3.5f)
                    curveTo(19.9999f, 3.3674f, 19.9473f, 3.2402f, 19.8535f, 3.1465f)
                    curveTo(19.7597f, 3.0527f, 19.6325f, 3.0f, 19.4999f, 3.0f)
                    horizontalLineTo(4.4999f)
                    curveTo(4.3673f, 3.0f, 4.2401f, 3.0527f, 4.1464f, 3.1465f)
                    curveTo(4.0526f, 3.2402f, 3.9999f, 3.3674f, 3.9999f, 3.5f)
                    verticalLineTo(4.962f)
                    lineTo(10.9999f, 13.462f)
                    verticalLineTo(17.524f)
                    close()
                }
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
