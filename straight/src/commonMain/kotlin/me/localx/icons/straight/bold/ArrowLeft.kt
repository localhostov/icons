package me.localx.icons.straight.bold

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

public val Icons.Bold.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0649f, 7.7271f)
                lineTo(4.2849f, 10.5071f)
                lineTo(23.9998f, 10.5321f)
                verticalLineTo(13.5321f)
                lineTo(4.2999f, 13.5071f)
                lineTo(7.0649f, 16.2711f)
                lineTo(4.9439f, 18.3911f)
                lineTo(1.0249f, 14.4741f)
                curveTo(0.3687f, 13.8177f, 1.0E-4f, 12.9276f, 1.0E-4f, 11.9996f)
                curveTo(1.0E-4f, 11.0715f, 0.3687f, 10.1814f, 1.0249f, 9.5251f)
                lineTo(4.9439f, 5.6071f)
                lineTo(7.0649f, 7.7271f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
