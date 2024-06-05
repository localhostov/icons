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
                moveTo(15.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(10.5f, 8.037f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(5.416f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 15.0f, 16.037f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-6.773f, 0.089f, -10.563f, -8.262f, -6.0f, -13.271f)
                lineTo(6.0f, 6.037f)
                curveToRelative(0.253f, -7.931f, 11.75f, -7.926f, 12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 20.0f, 16.0f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.541f, -3.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 11.33f)
                lineTo(15.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(9.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.459f, 1.08f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
