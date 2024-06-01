package me.localx.icons.straight.outline

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

public val Icons.Outline.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.4672f, 23.3152f)
                    lineTo(12.0002f, 17.8272f)
                    lineTo(4.5332f, 23.3152f)
                    lineTo(7.4002f, 14.4522f)
                    lineTo(-0.0628f, 8.9992f)
                    horizontalLineTo(9.1512f)
                    lineTo(12.0002f, 0.1212f)
                    lineTo(14.8492f, 8.9992f)
                    horizontalLineTo(24.0622f)
                    lineTo(16.6002f, 14.4522f)
                    lineTo(19.4672f, 23.3152f)
                    close()
                    moveTo(12.0002f, 15.3452f)
                    lineTo(15.6582f, 18.0342f)
                    lineTo(14.2582f, 13.6902f)
                    lineTo(17.9372f, 10.9992f)
                    horizontalLineTo(13.3902f)
                    lineTo(12.0002f, 6.6681f)
                    lineTo(10.6102f, 10.9992f)
                    horizontalLineTo(6.0622f)
                    lineTo(9.7452f, 13.6902f)
                    lineTo(8.3452f, 18.0342f)
                    lineTo(12.0002f, 15.3452f)
                    close()
                }
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
