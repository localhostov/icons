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

public val Icons.Bold.GlassHalf: ImageVector
    get() {
        if (_glassHalf != null) {
            return _glassHalf!!
        }
        _glassHalf = Builder(name = "GlassHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.08f, 1.135f)
                curveToRelative(-0.661f, -0.721f, -1.602f, -1.135f, -2.58f, -1.135f)
                lineTo(4.5f, 0.0f)
                curveToRelative(-0.975f, 0.0f, -1.913f, 0.411f, -2.574f, 1.128f)
                curveToRelative(-0.66f, 0.717f, -0.994f, 1.687f, -0.914f, 2.659f)
                lineToRelative(1.247f, 15.164f)
                curveToRelative(0.233f, 2.832f, 2.641f, 5.049f, 5.481f, 5.049f)
                horizontalLineToRelative(8.434f)
                curveToRelative(2.872f, 0.0f, 5.227f, -2.158f, 5.479f, -5.019f)
                lineToRelative(1.334f, -15.175f)
                curveToRelative(0.086f, -0.975f, -0.244f, -1.949f, -0.906f, -2.671f)
                close()
                moveTo(4.133f, 3.161f)
                curveToRelative(0.055f, -0.06f, 0.177f, -0.161f, 0.367f, -0.161f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.191f, 0.0f, 0.312f, 0.102f, 0.368f, 0.162f)
                curveToRelative(0.056f, 0.061f, 0.146f, 0.191f, 0.13f, 0.382f)
                lineToRelative(-0.568f, 6.456f)
                lineTo(4.533f, 10.0f)
                lineToRelative(-0.531f, -6.458f)
                curveToRelative(-0.016f, -0.19f, 0.075f, -0.32f, 0.131f, -0.38f)
                close()
                moveTo(16.174f, 21.0f)
                lineTo(7.74f, 21.0f)
                curveToRelative(-1.291f, 0.0f, -2.386f, -1.008f, -2.491f, -2.295f)
                lineToRelative(-0.469f, -5.705f)
                horizontalLineToRelative(14.387f)
                lineToRelative(-0.503f, 5.719f)
                curveToRelative(-0.114f, 1.3f, -1.185f, 2.281f, -2.49f, 2.281f)
                close()
            }
        }
        .build()
        return _glassHalf!!
    }

private var _glassHalf: ImageVector? = null
