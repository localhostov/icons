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

public val Icons.Bold.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = Builder(name = "CreditCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.5001f, 15.9999f)
                    curveTo(7.3285f, 15.9999f, 8.0001f, 15.3283f, 8.0001f, 14.4999f)
                    curveTo(8.0001f, 13.6715f, 7.3285f, 12.9999f, 6.5001f, 12.9999f)
                    curveTo(5.6716f, 12.9999f, 5.0001f, 13.6715f, 5.0001f, 14.4999f)
                    curveTo(5.0001f, 15.3283f, 5.6716f, 15.9999f, 6.5001f, 15.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 21.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.2043f, 23.6839f, 4.4413f, 23.1213f, 3.8787f)
                    curveTo(22.5587f, 3.3161f, 21.7956f, 3.0f, 21.0f, 3.0f)
                    close()
                    moveTo(21.0f, 6.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(21.0f)
                    close()
                    moveTo(3.0f, 18.0f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(3.0f)
                    close()
                }
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
