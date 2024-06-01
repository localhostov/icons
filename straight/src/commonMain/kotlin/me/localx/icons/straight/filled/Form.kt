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

public val Icons.Filled.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = Builder(name = "Form", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 14.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(21.0f, 7.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(14.0f, 0.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(17.0f, 18.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(17.0f, 10.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(19.828f, 3.414f)
                    lineTo(17.586f, 1.172f)
                    curveTo(17.1391f, 0.7347f, 16.5959f, 0.4083f, 16.0f, 0.219f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(20.785f)
                    curveTo(20.5956f, 4.4033f, 20.2676f, 3.8598f, 19.828f, 3.414f)
                    close()
                }
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
