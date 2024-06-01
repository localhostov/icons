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

public val Icons.Filled.AlignCenter: ImageVector
    get() {
        if (_alignCenter != null) {
            return _alignCenter!!
        }
        _alignCenter = Builder(name = "AlignCenter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(4.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9998f, 9.0f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(19.9998f)
                    verticalLineTo(9.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.9998f, 19.0f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.9998f)
                    verticalLineTo(19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 14.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _alignCenter!!
    }

private var _alignCenter: ImageVector? = null
