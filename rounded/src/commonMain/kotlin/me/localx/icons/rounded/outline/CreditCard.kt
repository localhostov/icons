package me.localx.icons.rounded.outline

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

public val Icons.Outline.CreditCard: ImageVector
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
                    moveTo(5.5001f, 17.0001f)
                    curveTo(6.3285f, 17.0001f, 7.0001f, 16.3285f, 7.0001f, 15.5001f)
                    curveTo(7.0001f, 14.6717f, 6.3285f, 14.0001f, 5.5001f, 14.0001f)
                    curveTo(4.6716f, 14.0001f, 4.0001f, 14.6717f, 4.0001f, 15.5001f)
                    curveTo(4.0001f, 16.3285f, 4.6716f, 17.0001f, 5.5001f, 17.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 3.0016f, 2.4036f, 3.5289f, 1.4662f, 4.4662f)
                    curveTo(0.5289f, 5.4036f, 0.0016f, 6.6744f, 0.0f, 8.0f)
                    lineTo(0.0f, 16.0f)
                    curveTo(0.0016f, 17.3256f, 0.5289f, 18.5964f, 1.4662f, 19.5338f)
                    curveTo(2.4036f, 20.4711f, 3.6744f, 20.9984f, 5.0f, 21.0f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 20.9984f, 21.5964f, 20.4711f, 22.5338f, 19.5338f)
                    curveTo(23.4711f, 18.5964f, 23.9984f, 17.3256f, 24.0f, 16.0f)
                    verticalLineTo(8.0f)
                    curveTo(23.9984f, 6.6744f, 23.4711f, 5.4036f, 22.5338f, 4.4662f)
                    curveTo(21.5964f, 3.5289f, 20.3256f, 3.0016f, 19.0f, 3.0f)
                    close()
                    moveTo(5.0f, 5.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 5.0f, 20.5587f, 5.3161f, 21.1213f, 5.8787f)
                    curveTo(21.6839f, 6.4413f, 22.0f, 7.2043f, 22.0f, 8.0f)
                    horizontalLineTo(2.0f)
                    curveTo(2.0f, 7.2043f, 2.3161f, 6.4413f, 2.8787f, 5.8787f)
                    curveTo(3.4413f, 5.3161f, 4.2043f, 5.0f, 5.0f, 5.0f)
                    close()
                    moveTo(19.0f, 19.0f)
                    horizontalLineTo(5.0f)
                    curveTo(4.2043f, 19.0f, 3.4413f, 18.6839f, 2.8787f, 18.1213f)
                    curveTo(2.3161f, 17.5587f, 2.0f, 16.7956f, 2.0f, 16.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.0f)
                    curveTo(22.0f, 16.7956f, 21.6839f, 17.5587f, 21.1213f, 18.1213f)
                    curveTo(20.5587f, 18.6839f, 19.7956f, 19.0f, 19.0f, 19.0f)
                    close()
                }
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
