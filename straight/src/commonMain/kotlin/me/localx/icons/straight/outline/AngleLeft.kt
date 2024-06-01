package me.localx.icons.straight.outline

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

public val Icons.Outline.AngleLeft: ImageVector
    get() {
        if (_angleLeft != null) {
            return _angleLeft!!
        }
        _angleLeft = Builder(name = "AngleLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.752f, 23.994f)
                lineTo(6.879f, 14.121f)
                curveTo(6.3166f, 13.5584f, 6.0006f, 12.7955f, 6.0006f, 12.0f)
                curveTo(6.0006f, 11.2045f, 6.3166f, 10.4415f, 6.879f, 9.879f)
                lineTo(16.746f, 0.012f)
                lineTo(18.16f, 1.426f)
                lineTo(8.293f, 11.293f)
                curveTo(8.1055f, 11.4805f, 8.0002f, 11.7348f, 8.0002f, 12.0f)
                curveTo(8.0002f, 12.2651f, 8.1055f, 12.5194f, 8.293f, 12.707f)
                lineTo(18.166f, 22.58f)
                lineTo(16.752f, 23.994f)
                close()
            }
        }
        .build()
        return _angleLeft!!
    }

private var _angleLeft: ImageVector? = null
