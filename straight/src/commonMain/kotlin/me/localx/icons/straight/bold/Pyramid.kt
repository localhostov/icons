package me.localx.icons.straight.bold

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

public val Icons.Bold.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 4.3468f)
                    lineTo(19.387f, 21.0008f)
                    horizontalLineTo(4.613f)
                    lineTo(12.0f, 4.3468f)
                    close()
                    moveTo(12.0f, 0.0108f)
                    curveTo(11.5975f, 0.0083f, 11.2031f, 0.1237f, 10.8654f, 0.3429f)
                    curveTo(10.5278f, 0.562f, 10.2617f, 0.8752f, 10.1f, 1.2438f)
                    lineTo(0.0f, 24.0008f)
                    horizontalLineTo(24.0f)
                    lineTo(13.905f, 1.2438f)
                    curveTo(13.743f, 0.8744f, 13.4761f, 0.5606f, 13.1375f, 0.3415f)
                    curveTo(12.7988f, 0.1223f, 12.4034f, 0.0073f, 12.0f, 0.0108f)
                    close()
                }
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
