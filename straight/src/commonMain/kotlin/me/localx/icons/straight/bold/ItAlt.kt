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

public val Icons.Bold.ItAlt: ImageVector
    get() {
        if (_itAlt != null) {
            return _itAlt!!
        }
        _itAlt = Builder(name = "ItAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 19.271f)
                verticalLineToRelative(4.729f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.729f)
                curveToRelative(-2.029f, -0.637f, -3.5f, -2.532f, -3.5f, -4.771f)
                curveToRelative(0.0f, -2.049f, 1.236f, -3.806f, 3.0f, -4.578f)
                verticalLineToRelative(3.078f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-3.078f)
                curveToRelative(1.764f, 0.772f, 3.0f, 2.529f, 3.0f, 4.578f)
                curveToRelative(0.0f, 2.239f, -1.471f, 4.134f, -3.5f, 4.771f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.663f)
                curveToRelative(0.587f, -0.371f, 1.117f, -0.822f, 1.579f, -1.337f)
                horizontalLineToRelative(3.421f)
                lineTo(21.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.421f)
                curveToRelative(0.462f, 0.515f, 0.992f, 0.965f, 1.579f, 1.337f)
                verticalLineToRelative(1.663f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _itAlt!!
    }

private var _itAlt: ImageVector? = null
