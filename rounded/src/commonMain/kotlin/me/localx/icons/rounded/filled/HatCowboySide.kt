package me.localx.icons.rounded.filled

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
                moveToRelative(12.971f, 10.402f)
                lineToRelative(3.942f, -3.943f)
                lineToRelative(1.869f, 1.168f)
                lineToRelative(-2.136f, 2.135f)
                curveToRelative(-0.722f, 0.72f, -2.103f, 0.784f, -3.675f, 0.639f)
                close()
                moveTo(1.173f, 11.715f)
                curveToRelative(0.107f, -0.128f, 0.208f, -0.259f, 0.324f, -0.381f)
                curveToRelative(2.155f, -2.288f, 5.774f, -1.748f, 8.974f, -1.26f)
                lineToRelative(4.702f, -4.702f)
                lineToRelative(-5.181f, -3.611f)
                curveTo(7.84f, 0.415f, 5.022f, 0.896f, 3.437f, 2.877f)
                lineTo(0.838f, 6.194f)
                curveToRelative(-1.139f, 1.424f, -1.171f, 3.439f, -0.076f, 4.898f)
                lineToRelative(0.411f, 0.623f)
                close()
                moveTo(22.648f, 3.271f)
                lineToRelative(-0.124f, -0.124f)
                curveToRelative(-2.397f, -2.393f, -6.08f, -2.742f, -8.752f, -1.011f)
                lineToRelative(6.763f, 4.236f)
                curveToRelative(0.727f, 0.456f, 0.844f, 1.468f, 0.239f, 2.077f)
                lineToRelative(-2.713f, 2.729f)
                curveToRelative(-1.803f, 1.798f, -4.879f, 1.33f, -7.854f, 0.878f)
                curveToRelative(-2.855f, -0.435f, -5.809f, -0.884f, -7.252f, 0.649f)
                curveToRelative(-2.576f, 2.736f, -2.481f, 7.149f, 0.211f, 9.838f)
                lineToRelative(-0.016f, 0.016f)
                lineToRelative(0.215f, 0.215f)
                curveToRelative(0.818f, 0.818f, 1.894f, 1.227f, 2.97f, 1.227f)
                reflectiveCurveToRelative(2.15f, -0.409f, 2.97f, -1.227f)
                lineToRelative(13.466f, -13.447f)
                curveToRelative(0.921f, -0.921f, 1.363f, -2.194f, 1.196f, -3.515f)
                curveToRelative(-0.122f, -0.969f, -0.626f, -1.851f, -1.317f, -2.54f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
