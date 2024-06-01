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
                    moveTo(19.0f, 3.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 3.0016f, 2.4036f, 3.5289f, 1.4662f, 4.4662f)
                    curveTo(0.5289f, 5.4036f, 0.0016f, 6.6744f, 0.0f, 8.0f)
                    horizontalLineTo(24.0f)
                    curveTo(23.9984f, 6.6744f, 23.4711f, 5.4036f, 22.5338f, 4.4662f)
                    curveTo(21.5964f, 3.5289f, 20.3256f, 3.0016f, 19.0f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 15.9999f)
                    curveTo(0.0016f, 17.3255f, 0.5289f, 18.5963f, 1.4662f, 19.5336f)
                    curveTo(2.4036f, 20.471f, 3.6744f, 20.9983f, 5.0f, 20.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 20.9983f, 21.5964f, 20.471f, 22.5338f, 19.5336f)
                    curveTo(23.4711f, 18.5963f, 23.9984f, 17.3255f, 24.0f, 15.9999f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.9999f)
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
