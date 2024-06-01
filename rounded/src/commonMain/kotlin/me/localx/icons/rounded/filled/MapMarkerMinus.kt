package me.localx.icons.rounded.filled

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

public val Icons.Filled.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.788f, 3.2808f)
                curveTo(15.5416f, -1.0386f, 8.5977f, -1.0979f, 4.2783f, 3.1485f)
                curveTo(-0.0411f, 7.3948f, -0.1003f, 14.3388f, 4.146f, 18.6582f)
                curveTo(4.1988f, 18.7118f, 4.2522f, 18.765f, 4.306f, 18.8176f)
                lineTo(8.2373f, 22.4498f)
                curveTo(10.3391f, 24.5058f, 13.6958f, 24.5142f, 15.8078f, 22.4687f)
                lineTo(19.788f, 18.7907f)
                curveTo(24.0708f, 14.5077f, 24.0708f, 7.5638f, 19.788f, 3.2808f)
                close()
                moveTo(16.0212f, 12.0328f)
                horizontalLineTo(8.0449f)
                curveTo(7.4943f, 12.0328f, 7.0479f, 11.5864f, 7.0479f, 11.0357f)
                curveTo(7.0479f, 10.4851f, 7.4943f, 10.0387f, 8.0449f, 10.0387f)
                horizontalLineTo(16.0212f)
                curveTo(16.5718f, 10.0387f, 17.0182f, 10.4851f, 17.0182f, 11.0357f)
                curveTo(17.0182f, 11.5864f, 16.5718f, 12.0328f, 16.0212f, 12.0328f)
                close()
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
