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

public val Icons.Filled.ArrowUpwardGrowthCrypto: ImageVector
    get() {
        if (_arrowUpwardGrowthCrypto != null) {
            return _arrowUpwardGrowthCrypto!!
        }
        _arrowUpwardGrowthCrypto = Builder(name = "ArrowUpwardGrowthCrypto", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.631f, 18.507f)
                curveToRelative(0.0f, 0.492f, -0.4f, 0.893f, -0.893f, 0.893f)
                horizontalLineToRelative(-1.738f)
                lineToRelative(-0.013f, -1.785f)
                horizontalLineToRelative(1.752f)
                curveToRelative(0.492f, 0.0f, 0.893f, 0.4f, 0.893f, 0.892f)
                close()
                moveTo(13.014f, 15.315f)
                curveToRelative(0.0f, -0.394f, -0.321f, -0.715f, -0.715f, -0.715f)
                horizontalLineToRelative(-1.298f)
                verticalLineToRelative(1.415f)
                horizontalLineToRelative(1.374f)
                curveToRelative(0.357f, -0.04f, 0.639f, -0.332f, 0.639f, -0.7f)
                close()
                moveTo(19.001f, 17.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.134f, -7.0f, -7.0f)
                curveToRelative(0.0f, -3.525f, 2.608f, -6.433f, 5.999f, -6.92f)
                lineToRelative(-0.02f, -7.074f)
                lineToRelative(-3.255f, 3.244f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(10.561f, 0.586f)
                curveToRelative(0.779f, -0.779f, 2.049f, -0.779f, 2.828f, 0.0f)
                lineToRelative(4.286f, 4.2f)
                lineToRelative(-1.4f, 1.428f)
                lineToRelative(-3.295f, -3.229f)
                lineToRelative(0.02f, 7.095f)
                curveToRelative(3.392f, 0.486f, 6.001f, 3.395f, 6.001f, 6.921f)
                close()
                moveTo(15.232f, 18.507f)
                curveToRelative(0.0f, -0.734f, -0.481f, -1.507f, -1.058f, -1.843f)
                curveToRelative(0.275f, -0.381f, 0.441f, -0.844f, 0.441f, -1.349f)
                curveToRelative(0.0f, -1.106f, -0.803f, -2.022f, -1.84f, -2.252f)
                lineToRelative(-0.002f, -1.063f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-0.007f, 1.0f)
                horizontalLineToRelative(-1.665f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.7f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-1.0f)
                lineToRelative(0.231f, -0.029f)
                curveToRelative(1.237f, -0.146f, 2.2f, -1.187f, 2.2f, -2.463f)
                close()
            }
        }
        .build()
        return _arrowUpwardGrowthCrypto!!
    }

private var _arrowUpwardGrowthCrypto: ImageVector? = null
