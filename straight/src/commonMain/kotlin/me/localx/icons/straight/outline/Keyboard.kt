package me.localx.icons.straight.outline

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

public val Icons.Outline.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 5.9996f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(1.9996f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(5.9996f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 5.9996f, 1.4413f, 6.3157f, 0.8787f, 6.8783f)
                    curveTo(0.3161f, 7.4409f, 0.0f, 8.204f, 0.0f, 8.9996f)
                    lineTo(0.0f, 19.9996f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(8.9996f)
                    curveTo(24.0f, 8.204f, 23.6839f, 7.4409f, 23.1213f, 6.8783f)
                    curveTo(22.5587f, 6.3157f, 21.7956f, 5.9996f, 21.0f, 5.9996f)
                    close()
                    moveTo(22.0f, 17.9996f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(8.9996f)
                    curveTo(2.0f, 8.7344f, 2.1054f, 8.4801f, 2.2929f, 8.2925f)
                    curveTo(2.4804f, 8.105f, 2.7348f, 7.9996f, 3.0f, 7.9996f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 7.9996f, 21.5196f, 8.105f, 21.7071f, 8.2925f)
                    curveTo(21.8946f, 8.4801f, 22.0f, 8.7344f, 22.0f, 8.9996f)
                    verticalLineTo(17.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0001f, 13.9996f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(15.9996f)
                    horizontalLineTo(16.0001f)
                    verticalLineTo(13.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 9.9993f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(11.9993f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(9.9993f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0001f, 9.9993f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(11.9993f)
                    horizontalLineTo(20.0001f)
                    verticalLineTo(9.9993f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.9999f, 9.9993f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(11.9993f)
                    horizontalLineTo(6.9999f)
                    verticalLineTo(9.9993f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.9999f, 13.9996f)
                    horizontalLineTo(3.9999f)
                    verticalLineTo(15.9996f)
                    horizontalLineTo(5.9999f)
                    verticalLineTo(13.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.0f, 13.9996f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(15.9996f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(13.9996f)
                    close()
                }
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
