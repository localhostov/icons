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

public val Icons.Outline.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.543f, 0.043f)
                lineTo(9.677f, 12.909f)
                arcToRelative(13.547f, 13.547f, 0.0f, false, true, -1.93f, -3.117f)
                lineToRelative(3.4f, -3.4f)
                lineTo(4.887f, 0.122f)
                lineTo(1.716f, 3.292f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 0.0f, 7.5f)
                curveTo(0.0f, 10.741f, 1.791f, 14.5f, 4.825f, 17.761f)
                lineTo(0.043f, 22.543f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(22.5f, -22.5f)
                close()
                moveTo(2.0f, 7.5f)
                arcTo(3.907f, 3.907f, 0.0f, false, true, 3.13f, 4.707f)
                lineTo(4.887f, 2.95f)
                lineTo(8.324f, 6.387f)
                lineTo(5.389f, 9.322f)
                lineToRelative(0.245f, 0.614f)
                arcToRelative(15.743f, 15.743f, 0.0f, false, false, 2.627f, 4.388f)
                lineTo(6.236f, 16.35f)
                curveTo(3.569f, 13.466f, 2.0f, 10.232f, 2.0f, 7.5f)
                close()
                moveTo(17.613f, 12.848f)
                lineTo(23.878f, 19.113f)
                lineTo(20.707f, 22.284f)
                arcTo(5.889f, 5.889f, 0.0f, false, true, 16.5f, 24.0f)
                curveToRelative(-2.665f, 0.0f, -5.8f, -1.306f, -8.717f, -3.544f)
                lineTo(9.209f, 19.03f)
                curveTo(11.7f, 20.89f, 14.356f, 22.0f, 16.5f, 22.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.792f, -1.13f)
                lineToRelative(1.758f, -1.757f)
                lineToRelative(-3.437f, -3.437f)
                lineTo(14.687f, 18.6f)
                lineToRelative(-0.606f, -0.231f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, -2.8f, -1.415f)
                lineTo(12.738f, 15.5f)
                arcToRelative(13.017f, 13.017f, 0.0f, false, false, 1.462f, 0.76f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
