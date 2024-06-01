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

public val Icons.Filled.AppsSort: ImageVector
    get() {
        if (_appsSort != null) {
            return _appsSort!!
        }
        _appsSort = Builder(name = "AppsSort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 3.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 21.417f)
                    verticalLineTo(2.586f)
                    lineTo(22.5839f, 5.166f)
                    lineTo(23.9999f, 3.751f)
                    lineTo(21.1209f, 0.876f)
                    curveTo(20.5584f, 0.3145f, 19.7961f, -9.0E-4f, 19.0014f, -9.0E-4f)
                    curveTo(18.2066f, -9.0E-4f, 17.4443f, 0.3145f, 16.8819f, 0.876f)
                    lineTo(14.0069f, 3.746f)
                    lineTo(15.4199f, 5.161f)
                    lineTo(17.9999f, 2.582f)
                    verticalLineTo(21.416f)
                    lineTo(15.4149f, 18.834f)
                    lineTo(14.0019f, 20.249f)
                    lineTo(16.8809f, 23.124f)
                    curveTo(17.4433f, 23.6855f, 18.2056f, 24.0009f, 19.0004f, 24.0009f)
                    curveTo(19.7951f, 24.0009f, 20.5574f, 23.6855f, 21.1199f, 23.124f)
                    lineTo(23.9999f, 20.254f)
                    lineTo(22.5869f, 18.839f)
                    lineTo(19.9999f, 21.417f)
                    close()
                }
            }
        }
        .build()
        return _appsSort!!
    }

private var _appsSort: ImageVector? = null
