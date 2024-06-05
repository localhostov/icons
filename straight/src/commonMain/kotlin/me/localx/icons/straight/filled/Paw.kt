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

public val Icons.Filled.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 24.0f)
                arcToRelative(8.81f, 8.81f, 0.0f, false, true, -2.4f, -0.453f)
                arcToRelative(9.614f, 9.614f, 0.0f, false, false, -6.206f, 0.0f)
                curveToRelative(-3.3f, 1.18f, -6.024f, 0.021f, -5.9f, -3.178f)
                curveTo(3.0f, 15.641f, 7.458f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(9.0f, 4.641f, 9.0f, 9.369f)
                curveTo(21.0f, 22.025f, 20.393f, 24.0f, 17.5f, 24.0f)
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
                moveTo(15.844f, 0.014f)
                curveToRelative(-1.364f, -0.163f, -2.6f, 1.128f, -2.814f, 3.46f)
                curveToRelative(-0.433f, 5.508f, 4.307f, 6.225f, 4.941f, 0.589f)
                curveTo(18.184f, 1.732f, 17.208f, 0.177f, 15.844f, 0.014f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
