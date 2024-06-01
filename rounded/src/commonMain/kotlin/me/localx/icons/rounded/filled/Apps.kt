package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 0.0f)
                    horizontalLineTo(4.0f)
                    curveTo(1.7909f, 0.0f, 0.0f, 1.7909f, 0.0f, 4.0f)
                    verticalLineTo(7.0f)
                    curveTo(0.0f, 9.2091f, 1.7909f, 11.0f, 4.0f, 11.0f)
                    horizontalLineTo(7.0f)
                    curveTo(9.2091f, 11.0f, 11.0f, 9.2091f, 11.0f, 7.0f)
                    verticalLineTo(4.0f)
                    curveTo(11.0f, 1.7909f, 9.2091f, 0.0f, 7.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 0.0f)
                    horizontalLineTo(16.9999f)
                    curveTo(14.7907f, 0.0f, 12.9999f, 1.7909f, 12.9999f, 4.0f)
                    verticalLineTo(7.0f)
                    curveTo(12.9999f, 9.2092f, 14.7907f, 11.0f, 16.9999f, 11.0f)
                    horizontalLineTo(19.9999f)
                    curveTo(22.209f, 11.0f, 23.9999f, 9.2092f, 23.9999f, 7.0f)
                    verticalLineTo(4.0f)
                    curveTo(23.9999f, 1.7909f, 22.209f, 0.0f, 19.9999f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0f, 13.0f)
                    horizontalLineTo(4.0f)
                    curveTo(1.7909f, 13.0f, 0.0f, 14.7909f, 0.0f, 17.0f)
                    verticalLineTo(20.0f)
                    curveTo(0.0f, 22.2092f, 1.7909f, 24.0f, 4.0f, 24.0f)
                    horizontalLineTo(7.0f)
                    curveTo(9.2091f, 24.0f, 11.0f, 22.2092f, 11.0f, 20.0f)
                    verticalLineTo(17.0f)
                    curveTo(11.0f, 14.7909f, 9.2091f, 13.0f, 7.0f, 13.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9999f, 13.0f)
                    horizontalLineTo(16.9999f)
                    curveTo(14.7907f, 13.0f, 12.9999f, 14.7909f, 12.9999f, 17.0f)
                    verticalLineTo(20.0f)
                    curveTo(12.9999f, 22.2092f, 14.7907f, 24.0f, 16.9999f, 24.0f)
                    horizontalLineTo(19.9999f)
                    curveTo(22.209f, 24.0f, 23.9999f, 22.2092f, 23.9999f, 20.0f)
                    verticalLineTo(17.0f)
                    curveTo(23.9999f, 14.7909f, 22.209f, 13.0f, 19.9999f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null
