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

public val Icons.Bold.ThermometerHalf: ImageVector
    get() {
        if (_thermometerHalf != null) {
            return _thermometerHalf!!
        }
        _thermometerHalf = Builder(name = "ThermometerHalf", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.5f, -2.6f)
                lineTo(10.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 16.0f)
                close()
                moveTo(20.0f, 15.963f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-6.772f, 0.089f, -10.563f, -8.26f, -6.0f, -13.271f)
                lineTo(6.0f, 6.0f)
                curveToRelative(0.253f, -7.932f, 11.75f, -7.926f, 12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                arcTo(7.907f, 7.907f, 0.0f, false, true, 20.0f, 15.963f)
                close()
                moveTo(17.0f, 15.963f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, false, -1.541f, -3.589f)
                lineTo(15.0f, 11.932f)
                lineTo(15.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 6.0f)
                verticalLineToRelative(5.932f)
                lineToRelative(-0.459f, 0.442f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 17.0f, 15.963f)
                close()
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
