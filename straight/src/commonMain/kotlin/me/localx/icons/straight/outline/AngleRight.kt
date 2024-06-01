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

public val Icons.Outline.AngleRight: ImageVector
    get() {
        if (_angleRight != null) {
            return _angleRight!!
        }
        _angleRight = Builder(name = "AngleRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.412f, 24.0f)
                lineTo(6.0f, 22.588f)
                lineTo(15.881f, 12.707f)
                curveTo(16.0685f, 12.5194f, 16.1738f, 12.2651f, 16.1738f, 12.0f)
                curveTo(16.1738f, 11.7348f, 16.0685f, 11.4805f, 15.881f, 11.293f)
                lineTo(6.017f, 1.431f)
                lineTo(7.431f, 0.017f)
                lineTo(17.293f, 9.879f)
                curveTo(17.8554f, 10.4416f, 18.1714f, 11.2045f, 18.1714f, 12.0f)
                curveTo(18.1714f, 12.7955f, 17.8554f, 13.5584f, 17.293f, 14.121f)
                lineTo(7.412f, 24.0f)
                close()
            }
        }
        .build()
        return _angleRight!!
    }

private var _angleRight: ImageVector? = null
