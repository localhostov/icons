package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.AngleSmallUp: ImageVector
    get() {
        if (_angleSmallUp != null) {
            return _angleSmallUp!!
        }
        _angleSmallUp = Builder(name = "AngleSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.061f, 13.439f)
                lineTo(14.475f, 8.854f)
                curveTo(13.8084f, 8.2172f, 12.9219f, 7.8618f, 12.0f, 7.8618f)
                curveTo(11.0781f, 7.8618f, 10.1916f, 8.2172f, 9.525f, 8.854f)
                lineTo(4.939f, 13.439f)
                curveTo(4.6576f, 13.7204f, 4.4995f, 14.1021f, 4.4995f, 14.5f)
                curveTo(4.4995f, 14.898f, 4.6576f, 15.2796f, 4.939f, 15.561f)
                curveTo(5.2204f, 15.8424f, 5.602f, 16.0005f, 6.0f, 16.0005f)
                curveTo(6.3979f, 16.0005f, 6.7796f, 15.8424f, 7.061f, 15.561f)
                lineTo(11.647f, 10.975f)
                curveTo(11.7408f, 10.8813f, 11.8679f, 10.8286f, 12.0005f, 10.8286f)
                curveTo(12.1331f, 10.8286f, 12.2602f, 10.8813f, 12.354f, 10.975f)
                lineTo(16.939f, 15.561f)
                curveTo(17.2204f, 15.8424f, 17.602f, 16.0005f, 18.0f, 16.0005f)
                curveTo(18.3979f, 16.0005f, 18.7796f, 15.8424f, 19.061f, 15.561f)
                curveTo(19.3424f, 15.2796f, 19.5005f, 14.898f, 19.5005f, 14.5f)
                curveTo(19.5005f, 14.1021f, 19.3424f, 13.7204f, 19.061f, 13.439f)
                close()
            }
        }
        .build()
        return _angleSmallUp!!
    }

private var _angleSmallUp: ImageVector? = null
