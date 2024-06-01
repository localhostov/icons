package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.AngleSmallLeft: ImageVector
    get() {
        if (_angleSmallLeft != null) {
            return _angleSmallLeft!!
        }
        _angleSmallLeft = Builder(name = "AngleSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7751f, 18.707f)
                lineTo(8.4821f, 13.414f)
                curveTo(8.1071f, 13.0389f, 7.8965f, 12.5303f, 7.8965f, 12.0f)
                curveTo(7.8965f, 11.4696f, 8.1071f, 10.961f, 8.4821f, 10.586f)
                lineTo(13.7751f, 5.293f)
                lineTo(15.1891f, 6.707f)
                lineTo(9.9001f, 12.0f)
                lineTo(15.1931f, 17.293f)
                lineTo(13.7751f, 18.707f)
                close()
            }
        }
        .build()
        return _angleSmallLeft!!
    }

private var _angleSmallLeft: ImageVector? = null
