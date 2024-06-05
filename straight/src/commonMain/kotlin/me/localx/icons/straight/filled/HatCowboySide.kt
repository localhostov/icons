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

public val Icons.Filled.HatCowboySide: ImageVector
    get() {
        if (_hatCowboySide != null) {
            return _hatCowboySide!!
        }
        _hatCowboySide = Builder(name = "HatCowboySide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.949f, 10.348f)
                lineToRelative(3.942f, -3.943f)
                lineToRelative(1.869f, 1.168f)
                lineToRelative(-2.136f, 2.135f)
                curveToRelative(-0.722f, 0.72f, -2.103f, 0.784f, -3.675f, 0.639f)
                close()
                moveTo(1.151f, 11.661f)
                curveToRelative(0.107f, -0.128f, 0.208f, -0.259f, 0.324f, -0.381f)
                curveToRelative(2.155f, -2.288f, 5.774f, -1.748f, 8.974f, -1.26f)
                lineToRelative(4.702f, -4.702f)
                lineToRelative(-2.934f, -1.834f)
                reflectiveCurveToRelative(-0.007f, 0.008f, -0.01f, 0.012f)
                lineToRelative(-3.071f, -1.919f)
                curveToRelative(-1.558f, -0.973f, -3.596f, -0.625f, -4.741f, 0.808f)
                lineTo(0.681f, 7.027f)
                curveToRelative(-0.914f, 1.141f, -0.939f, 2.755f, -0.062f, 3.926f)
                lineToRelative(0.531f, 0.708f)
                close()
                moveTo(22.746f, 3.337f)
                lineToRelative(-0.245f, -0.244f)
                curveToRelative(-2.397f, -2.393f, -6.08f, -2.742f, -8.752f, -1.011f)
                lineToRelative(8.069f, 5.043f)
                curveToRelative(-0.109f, 0.27f, -0.271f, 0.519f, -0.484f, 0.732f)
                lineToRelative(-3.295f, 3.266f)
                curveToRelative(-1.803f, 1.798f, -4.879f, 1.33f, -7.854f, 0.878f)
                curveToRelative(-2.855f, -0.435f, -5.809f, -0.884f, -7.252f, 0.649f)
                curveToRelative(-2.576f, 2.736f, -2.481f, 7.149f, 0.211f, 9.838f)
                lineToRelative(-0.016f, 0.016f)
                lineToRelative(0.215f, 0.215f)
                curveToRelative(0.818f, 0.818f, 1.894f, 1.227f, 2.97f, 1.227f)
                reflectiveCurveToRelative(2.15f, -0.409f, 2.97f, -1.227f)
                lineToRelative(13.466f, -13.447f)
                curveToRelative(0.793f, -0.792f, 1.23f, -1.846f, 1.23f, -2.967f)
                reflectiveCurveToRelative(-0.438f, -2.175f, -1.231f, -2.968f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
