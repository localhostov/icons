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

public val Icons.Filled.Medicine: ImageVector
    get() {
        if (_medicine != null) {
            return _medicine!!
        }
        _medicine = Builder(name = "Medicine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 5.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(18.0f, 9.0f)
                    horizontalLineTo(15.99f)
                    lineTo(16.0f, 7.0f)
                    horizontalLineTo(8.048f)
                    lineTo(8.0f, 9.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 9.0f, 4.4413f, 9.3161f, 3.8787f, 9.8787f)
                    curveTo(3.3161f, 10.4413f, 3.0f, 11.2044f, 3.0f, 12.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(12.0f)
                    curveTo(21.0f, 11.2044f, 20.6839f, 10.4413f, 20.1213f, 9.8787f)
                    curveTo(19.5587f, 9.3161f, 18.7956f, 9.0f, 18.0f, 9.0f)
                    close()
                    moveTo(16.0f, 17.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(17.0f)
                    close()
                }
            }
        }
        .build()
        return _medicine!!
    }

private var _medicine: ImageVector? = null
