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

public val Icons.Filled.CreditCard: ImageVector
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
                    moveTo(21.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 8.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(6.0f)
                    curveTo(24.0f, 5.2043f, 23.6839f, 4.4413f, 23.1213f, 3.8787f)
                    curveTo(22.5587f, 3.3161f, 21.7956f, 3.0f, 21.0f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 20.9999f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9999f)
                    close()
                    moveTo(7.0f, 15.4999f)
                    curveTo(7.0f, 15.7965f, 6.912f, 16.0866f, 6.7472f, 16.3332f)
                    curveTo(6.5824f, 16.5799f, 6.3481f, 16.7722f, 6.074f, 16.8857f)
                    curveTo(5.7999f, 16.9992f, 5.4983f, 17.0289f, 5.2074f, 16.971f)
                    curveTo(4.9164f, 16.9132f, 4.6491f, 16.7703f, 4.4393f, 16.5605f)
                    curveTo(4.2296f, 16.3507f, 4.0867f, 16.0835f, 4.0288f, 15.7925f)
                    curveTo(3.9709f, 15.5015f, 4.0006f, 15.1999f, 4.1142f, 14.9258f)
                    curveTo(4.2277f, 14.6518f, 4.42f, 14.4175f, 4.6666f, 14.2527f)
                    curveTo(4.9133f, 14.0878f, 5.2033f, 13.9999f, 5.5f, 13.9999f)
                    curveTo(5.8978f, 13.9999f, 6.2794f, 14.1579f, 6.5607f, 14.4392f)
                    curveTo(6.842f, 14.7205f, 7.0f, 15.102f, 7.0f, 15.4999f)
                    close()
                }
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
