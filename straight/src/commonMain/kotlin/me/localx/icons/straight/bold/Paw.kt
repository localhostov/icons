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

public val Icons.Bold.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 24.0f)
                curveToRelative(-1.844f, -0.023f, -3.1f, -1.013f, -5.0f, -1.0f)
                curveToRelative(-1.9f, -0.013f, -3.157f, 0.977f, -5.0f, 1.0f)
                arcToRelative(3.675f, 3.675f, 0.0f, false, true, -4.0f, -4.0f)
                arcToRelative(9.356f, 9.356f, 0.0f, false, true, 9.0f, -9.0f)
                arcToRelative(9.356f, 9.356f, 0.0f, false, true, 9.0f, 9.0f)
                arcTo(3.675f, 3.675f, 0.0f, false, true, 17.0f, 24.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(11.023f, 11.023f, 0.0f, false, true, 3.529f, 0.656f)
                curveToRelative(1.046f, 0.313f, 2.606f, 0.873f, 2.471f, -0.656f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, false, -6.0f, -6.0f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, false, -6.0f, 6.0f)
                curveToRelative(-0.138f, 1.53f, 1.428f, 0.968f, 2.471f, 0.656f)
                arcTo(11.023f, 11.023f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(21.844f, 5.014f)
                curveToRelative(-1.364f, -0.163f, -2.6f, 1.128f, -2.814f, 3.46f)
                curveToRelative(-0.433f, 5.508f, 4.307f, 6.225f, 4.941f, 0.589f)
                curveTo(24.184f, 6.732f, 23.208f, 5.177f, 21.844f, 5.014f)
                close()
                moveTo(0.029f, 9.063f)
                curveTo(0.664f, 14.7f, 5.4f, 13.978f, 4.97f, 8.474f)
                curveToRelative(-0.214f, -2.332f, -1.45f, -3.623f, -2.814f, -3.46f)
                reflectiveCurveTo(-0.184f, 6.732f, 0.029f, 9.063f)
                close()
                moveTo(5.977f, 4.063f)
                curveToRelative(0.635f, 5.639f, 5.374f, 4.915f, 4.94f, -0.589f)
                curveTo(10.7f, 1.142f, 9.468f, -0.149f, 8.1f, 0.014f)
                reflectiveCurveTo(5.763f, 1.732f, 5.977f, 4.063f)
                close()
                moveTo(15.877f, 0.014f)
                curveToRelative(-1.364f, -0.163f, -2.6f, 1.128f, -2.813f, 3.46f)
                curveToRelative(-0.433f, 5.508f, 4.307f, 6.225f, 4.94f, 0.589f)
                curveTo(18.222f, 1.732f, 17.247f, 0.177f, 15.882f, 0.014f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
