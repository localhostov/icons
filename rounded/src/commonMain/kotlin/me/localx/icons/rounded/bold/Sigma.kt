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

public val Icons.Bold.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 24.0f)
                horizontalLineTo(5.287f)
                curveToRelative(-1.317f, 0.0f, -2.468f, -0.748f, -3.002f, -1.952f)
                curveToRelative(-0.534f, -1.204f, -0.316f, -2.558f, 0.567f, -3.534f)
                curveToRelative(0.041f, -0.045f, 7.38f, -6.39f, 7.38f, -6.39f)
                lineTo(2.556f, 5.735f)
                curveToRelative(-0.168f, -0.14f, -0.304f, -0.315f, -0.396f, -0.513f)
                curveToRelative(-0.532f, -1.129f, -0.43f, -2.514f, 0.268f, -3.613f)
                curveToRelative(0.648f, -1.022f, 1.69f, -1.608f, 2.86f, -1.608f)
                horizontalLineToRelative(12.213f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(5.287f)
                curveToRelative(-0.052f, 0.0f, -0.19f, 0.0f, -0.326f, 0.215f)
                curveToRelative(-0.095f, 0.148f, -0.143f, 0.338f, -0.138f, 0.504f)
                lineToRelative(8.688f, 7.23f)
                curveToRelative(0.338f, 0.282f, 0.536f, 0.698f, 0.54f, 1.139f)
                curveToRelative(0.004f, 0.44f, -0.186f, 0.861f, -0.52f, 1.149f)
                lineToRelative(-8.492f, 7.336f)
                curveToRelative(-0.033f, 0.052f, -0.065f, 0.139f, -0.013f, 0.258f)
                curveToRelative(0.075f, 0.168f, 0.214f, 0.168f, 0.26f, 0.168f)
                horizontalLineToRelative(12.213f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
