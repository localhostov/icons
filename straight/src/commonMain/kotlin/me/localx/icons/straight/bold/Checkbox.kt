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

public val Icons.Bold.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.6668f, 17.7869f)
                    curveTo(9.979f, 17.7871f, 10.2882f, 17.7253f, 10.5764f, 17.6051f)
                    curveTo(10.8646f, 17.485f, 11.1261f, 17.3088f, 11.3458f, 17.0869f)
                    lineTo(20.0608f, 8.3719f)
                    lineTo(17.9388f, 6.2559f)
                    lineTo(9.6668f, 14.5279f)
                    lineTo(6.0608f, 10.9229f)
                    lineTo(3.9388f, 13.0439f)
                    lineTo(7.9868f, 17.0919f)
                    curveTo(8.207f, 17.3129f, 8.4689f, 17.4882f, 8.7572f, 17.6075f)
                    curveTo(9.0456f, 17.7268f, 9.3547f, 17.7877f, 9.6668f, 17.7869f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
