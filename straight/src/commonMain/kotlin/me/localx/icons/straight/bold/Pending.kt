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

public val Icons.Bold.Pending: ImageVector
    get() {
        if (_pending != null) {
            return _pending!!
        }
        _pending = Builder(name = "Pending", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 6.0f)
                verticalLineToRelative(5.055f)
                lineToRelative(3.671f, 2.299f)
                lineToRelative(-1.593f, 2.543f)
                lineToRelative(-5.079f, -3.182f)
                verticalLineToRelative(-6.715f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.175f, 17.433f)
                lineToRelative(2.39f, 1.813f)
                curveToRelative(0.629f, -0.829f, 1.147f, -1.736f, 1.542f, -2.696f)
                lineToRelative(-2.775f, -1.139f)
                curveToRelative(-0.295f, 0.72f, -0.684f, 1.4f, -1.156f, 2.021f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.382f, 0.0f, -0.765f, -0.033f, -1.142f, -0.081f)
                curveToRelative(-4.424f, -0.564f, -7.858f, -4.344f, -7.858f, -8.919f)
                curveTo(3.0f, 7.037f, 7.037f, 3.0f, 12.0f, 3.0f)
                curveToRelative(2.437f, 0.0f, 4.696f, 0.98f, 6.356f, 2.644f)
                lineToRelative(-2.356f, 2.356f)
                horizontalLineToRelative(5.909f)
                curveToRelative(0.602f, 0.0f, 1.091f, -0.488f, 1.091f, -1.091f)
                lineTo(23.0f, 1.0f)
                lineToRelative(-2.515f, 2.515f)
                curveTo(18.272f, 1.296f, 15.25f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.036f, 4.75f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.572f, 0.0f, 1.147f, -0.041f, 1.709f, -0.121f)
                lineToRelative(-0.424f, -2.97f)
                curveToRelative(-0.422f, 0.06f, -0.854f, 0.091f, -1.285f, 0.091f)
                close()
                moveTo(23.9f, 10.445f)
                lineToRelative(-2.976f, 0.384f)
                curveToRelative(0.05f, 0.385f, 0.075f, 0.78f, 0.076f, 1.172f)
                curveToRelative(0.0f, 0.388f, -0.025f, 0.78f, -0.074f, 1.161f)
                lineToRelative(2.976f, 0.384f)
                curveToRelative(0.065f, -0.509f, 0.099f, -1.029f, 0.099f, -1.546f)
                curveToRelative(0.0f, -0.521f, -0.034f, -1.044f, -0.1f, -1.555f)
                close()
                moveTo(15.534f, 20.279f)
                lineToRelative(1.18f, 2.759f)
                curveToRelative(0.954f, -0.408f, 1.853f, -0.94f, 2.673f, -1.582f)
                lineToRelative(-1.849f, -2.362f)
                curveToRelative(-0.615f, 0.481f, -1.289f, 0.879f, -2.004f, 1.185f)
                close()
            }
        }
        .build()
        return _pending!!
    }

private var _pending: ImageVector? = null
