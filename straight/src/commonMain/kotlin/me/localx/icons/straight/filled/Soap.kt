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

public val Icons.Filled.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0f, 2.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(3.0f)
                    curveTo(9.0f, 2.2043f, 9.3161f, 1.4413f, 9.8787f, 0.8787f)
                    curveTo(10.4413f, 0.3161f, 11.2044f, 0.0f, 12.0f, 0.0f)
                    lineTo(20.0f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0f)
                    close()
                    moveTo(16.0f, 16.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(22.0f, 17.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(17.0f)
                    curveTo(1.9983f, 15.3406f, 2.4583f, 13.7134f, 3.3286f, 12.3006f)
                    curveTo(4.1989f, 10.8877f, 5.4452f, 9.7449f, 6.928f, 9.0f)
                    horizontalLineTo(17.072f)
                    curveTo(18.5549f, 9.7449f, 19.8012f, 10.8877f, 20.6715f, 12.3006f)
                    curveTo(21.5418f, 13.7134f, 22.0018f, 15.3406f, 22.0f, 17.0f)
                    close()
                    moveTo(18.0f, 14.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(14.0f)
                    close()
                }
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
