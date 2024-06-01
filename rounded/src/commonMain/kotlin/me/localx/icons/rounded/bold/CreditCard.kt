package me.localx.icons.rounded.bold

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
                    moveTo(18.5f, 3.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 3.0016f, 2.6438f, 3.5816f, 1.6127f, 4.6127f)
                    curveTo(0.5816f, 5.6438f, 0.0016f, 7.0418f, 0.0f, 8.5f)
                    lineTo(0.0f, 15.5f)
                    curveTo(0.0016f, 16.9582f, 0.5816f, 18.3562f, 1.6127f, 19.3873f)
                    curveTo(2.6438f, 20.4184f, 4.0418f, 20.9984f, 5.5f, 21.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9582f, 20.9984f, 21.3562f, 20.4184f, 22.3873f, 19.3873f)
                    curveTo(23.4184f, 18.3562f, 23.9984f, 16.9582f, 24.0f, 15.5f)
                    verticalLineTo(8.5f)
                    curveTo(23.9984f, 7.0418f, 23.4184f, 5.6438f, 22.3873f, 4.6127f)
                    curveTo(21.3562f, 3.5816f, 19.9582f, 3.0016f, 18.5f, 3.0f)
                    close()
                    moveTo(5.5f, 6.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.0762f, 6.0001f, 19.6346f, 6.1992f, 20.0808f, 6.5637f)
                    curveTo(20.5271f, 6.9281f, 20.8338f, 7.4355f, 20.949f, 8.0f)
                    horizontalLineTo(3.051f)
                    curveTo(3.1662f, 7.4355f, 3.4729f, 6.9281f, 3.9192f, 6.5637f)
                    curveTo(4.3654f, 6.1992f, 4.9239f, 6.0001f, 5.5f, 6.0f)
                    close()
                    moveTo(18.5f, 18.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 18.0f, 4.2011f, 17.7366f, 3.7322f, 17.2678f)
                    curveTo(3.2634f, 16.7989f, 3.0f, 16.163f, 3.0f, 15.5f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(15.5f)
                    curveTo(21.0f, 16.163f, 20.7366f, 16.7989f, 20.2678f, 17.2678f)
                    curveTo(19.7989f, 17.7366f, 19.163f, 18.0f, 18.5f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
