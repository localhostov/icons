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

public val Icons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0002f, 16.0f)
                    curveTo(10.418f, 16.0f, 8.8713f, 15.5308f, 7.5557f, 14.6518f)
                    curveTo(6.2401f, 13.7727f, 5.2147f, 12.5233f, 4.6092f, 11.0615f)
                    curveTo(4.0037f, 9.5997f, 3.8453f, 7.9911f, 4.154f, 6.4393f)
                    curveTo(4.4626f, 4.8874f, 5.2246f, 3.462f, 6.3434f, 2.3431f)
                    curveTo(7.4622f, 1.2243f, 8.8877f, 0.4624f, 10.4395f, 0.1537f)
                    curveTo(11.9914f, -0.155f, 13.5999f, 0.0035f, 15.0617f, 0.609f)
                    curveTo(16.5235f, 1.2145f, 17.773f, 2.2399f, 18.652f, 3.5554f)
                    curveTo(19.5311f, 4.871f, 20.0002f, 6.4177f, 20.0002f, 8.0f)
                    curveTo(19.9979f, 10.121f, 19.1542f, 12.1545f, 17.6545f, 13.6542f)
                    curveTo(16.1547f, 15.154f, 14.1212f, 15.9976f, 12.0002f, 16.0f)
                    close()
                    moveTo(12.0002f, 18.0f)
                    curveTo(9.8343f, 18.0002f, 7.7275f, 17.293f, 6.0002f, 15.986f)
                    verticalLineTo(21.5f)
                    curveTo(6.0002f, 21.971f, 6.1333f, 22.4323f, 6.384f, 22.831f)
                    curveTo(6.6347f, 23.2297f, 6.9929f, 23.5494f, 7.4174f, 23.7534f)
                    curveTo(7.8419f, 23.9574f, 8.3153f, 24.0373f, 8.7833f, 23.984f)
                    curveTo(9.2512f, 23.9307f, 9.6945f, 23.7463f, 10.0622f, 23.452f)
                    lineTo(12.0002f, 21.9f)
                    lineTo(13.9382f, 23.45f)
                    curveTo(14.3058f, 23.7442f, 14.749f, 23.9285f, 15.2167f, 23.9819f)
                    curveTo(15.6845f, 24.0353f, 16.1578f, 23.9555f, 16.5822f, 23.7518f)
                    curveTo(17.0066f, 23.5481f, 17.3648f, 23.2286f, 17.6157f, 22.8303f)
                    curveTo(17.8666f, 22.4319f, 17.9999f, 21.9708f, 18.0002f, 21.5f)
                    verticalLineTo(15.986f)
                    curveTo(16.273f, 17.293f, 14.1662f, 18.0002f, 12.0002f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
