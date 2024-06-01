package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.1739f, 22.4536f)
                    curveTo(10.2778f, 24.5117f, 13.6382f, 24.5202f, 15.7524f, 22.4725f)
                    lineTo(19.7367f, 18.7906f)
                    curveTo(24.0529f, 14.5319f, 24.0995f, 7.5805f, 19.8408f, 3.2643f)
                    curveTo(15.5821f, -1.0519f, 8.6307f, -1.0985f, 4.3145f, 3.1603f)
                    curveTo(4.2796f, 3.1947f, 4.2449f, 3.2294f, 4.2105f, 3.2643f)
                    curveTo(-0.0767f, 7.5522f, -0.0762f, 14.5037f, 4.2117f, 18.7909f)
                    curveTo(4.2207f, 18.7998f, 4.2295f, 18.8087f, 4.2385f, 18.8175f)
                    lineTo(8.1739f, 22.4536f)
                    close()
                    moveTo(5.6218f, 4.6756f)
                    curveTo(9.1221f, 1.1596f, 14.8099f, 1.1469f, 18.3259f, 4.6472f)
                    curveTo(21.8419f, 8.1475f, 21.8547f, 13.8353f, 18.3544f, 17.3513f)
                    lineTo(14.377f, 21.0263f)
                    curveTo(13.0188f, 22.3045f, 10.8979f, 22.2966f, 9.5493f, 21.0083f)
                    lineTo(5.6218f, 17.3792f)
                    curveTo(2.1138f, 13.8713f, 2.1138f, 8.1837f, 5.6217f, 4.6757f)
                    curveTo(5.6217f, 4.6757f, 5.6217f, 4.6757f, 5.6218f, 4.6756f)
                    close()
                    moveTo(6.9832f, 11.0275f)
                    curveTo(6.9832f, 10.4762f, 7.43f, 10.0293f, 7.9813f, 10.0293f)
                    horizontalLineTo(15.966f)
                    curveTo(16.5172f, 10.0293f, 16.9641f, 10.4762f, 16.9641f, 11.0275f)
                    curveTo(16.9641f, 11.5787f, 16.5172f, 12.0256f, 15.966f, 12.0256f)
                    horizontalLineTo(7.9813f)
                    curveTo(7.43f, 12.0255f, 6.9832f, 11.5787f, 6.9832f, 11.0275f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
