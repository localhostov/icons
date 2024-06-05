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

public val Icons.Bold.HexagonDivide: ImageVector
    get() {
        if (_hexagonDivide != null) {
            return _hexagonDivide!!
        }
        _hexagonDivide = Builder(name = "HexagonDivide", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.588f, 10.361f)
                lineToRelative(-4.06f, -7.565f)
                curveToRelative(-0.594f, -1.107f, -1.745f, -1.795f, -3.005f, -1.795f)
                lineTo(7.496f, 1.001f)
                curveToRelative(-1.256f, 0.0f, -2.406f, 0.686f, -3.003f, 1.791f)
                lineTo(0.415f, 10.359f)
                curveToRelative(-0.556f, 1.03f, -0.555f, 2.26f, 0.0f, 3.291f)
                lineToRelative(4.077f, 7.562f)
                curveToRelative(0.597f, 1.103f, 1.747f, 1.789f, 3.003f, 1.789f)
                horizontalLineToRelative(9.027f)
                curveToRelative(1.26f, 0.0f, 2.411f, -0.688f, 3.005f, -1.795f)
                lineToRelative(4.059f, -7.564f)
                curveToRelative(0.552f, -1.027f, 0.552f, -2.253f, 0.0f, -3.28f)
                close()
                moveTo(20.943f, 12.221f)
                lineToRelative(-4.058f, 7.564f)
                curveToRelative(-0.071f, 0.132f, -0.21f, 0.214f, -0.362f, 0.214f)
                lineTo(7.496f, 19.999f)
                curveToRelative(-0.152f, 0.0f, -0.291f, -0.082f, -0.362f, -0.213f)
                lineToRelative(-4.077f, -7.561f)
                curveToRelative(-0.075f, -0.14f, -0.075f, -0.305f, 0.0f, -0.444f)
                lineToRelative(4.078f, -7.567f)
                curveToRelative(0.071f, -0.133f, 0.21f, -0.215f, 0.362f, -0.215f)
                horizontalLineToRelative(9.027f)
                curveToRelative(0.152f, 0.0f, 0.291f, 0.082f, 0.361f, 0.214f)
                lineToRelative(4.06f, 7.566f)
                curveToRelative(0.074f, 0.138f, 0.074f, 0.302f, 0.0f, 0.441f)
                close()
                moveTo(7.0f, 10.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 7.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hexagonDivide!!
    }

private var _hexagonDivide: ImageVector? = null
