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

public val Icons.Filled.StarExclamation: ImageVector
    get() {
        if (_starExclamation != null) {
            return _starExclamation!!
        }
        _starExclamation = Builder(name = "StarExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.836f, 8.603f)
                curveToRelative(-0.441f, -1.352f, -1.646f, -2.226f, -3.068f, -2.226f)
                horizontalLineToRelative(-4.369f)
                lineToRelative(-1.327f, -4.137f)
                curveToRelative(-0.437f, -1.361f, -1.643f, -2.24f, -3.073f, -2.24f)
                reflectiveCurveToRelative(-2.636f, 0.879f, -3.073f, 2.24f)
                lineToRelative(-1.327f, 4.137f)
                lineTo(3.231f, 6.377f)
                curveToRelative(-1.422f, 0.0f, -2.626f, 0.874f, -3.068f, 2.226f)
                reflectiveCurveToRelative(0.016f, 2.768f, 1.163f, 3.606f)
                lineToRelative(3.561f, 2.603f)
                lineToRelative(-1.352f, 4.184f)
                curveToRelative(-0.439f, 1.358f, 0.026f, 2.775f, 1.184f, 3.61f)
                curveToRelative(0.575f, 0.414f, 1.231f, 0.621f, 1.888f, 0.621f)
                curveToRelative(0.666f, 0.0f, 1.332f, -0.214f, 1.911f, -0.64f)
                lineToRelative(3.482f, -2.56f)
                lineToRelative(3.482f, 2.56f)
                curveToRelative(1.15f, 0.846f, 2.641f, 0.853f, 3.799f, 0.019f)
                curveToRelative(1.158f, -0.835f, 1.623f, -2.252f, 1.184f, -3.61f)
                lineToRelative(-1.352f, -4.184f)
                lineToRelative(3.56f, -2.603f)
                curveToRelative(1.148f, -0.839f, 1.605f, -2.255f, 1.164f, -3.606f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _starExclamation!!
    }

private var _starExclamation: ImageVector? = null
