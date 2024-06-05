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

public val Icons.Bold.ReflectHorizontalAlt: ImageVector
    get() {
        if (_reflectHorizontalAlt != null) {
            return _reflectHorizontalAlt!!
        }
        _reflectHorizontalAlt = Builder(name = "ReflectHorizontalAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.864f, 10.056f)
                curveToRelative(-0.549f, 0.493f, -0.864f, 1.202f, -0.864f, 1.943f)
                reflectiveCurveToRelative(0.316f, 1.445f, 0.854f, 1.926f)
                lineToRelative(8.146f, 7.455f)
                lineTo(24.0f, 2.61f)
                lineToRelative(-8.136f, 7.445f)
                close()
                moveTo(21.0f, 14.568f)
                lineToRelative(-2.811f, -2.572f)
                lineToRelative(2.811f, -2.572f)
                verticalLineToRelative(5.145f)
                close()
                moveTo(0.0f, 2.61f)
                lineTo(0.0f, 21.38f)
                lineToRelative(8.132f, -7.443f)
                curveToRelative(0.551f, -0.492f, 0.868f, -1.198f, 0.868f, -1.938f)
                reflectiveCurveToRelative(-0.315f, -1.45f, -0.854f, -1.935f)
                lineTo(0.0f, 2.61f)
                close()
                moveTo(3.0f, 14.567f)
                verticalLineToRelative(-5.146f)
                lineToRelative(2.811f, 2.572f)
                lineToRelative(-2.811f, 2.573f)
                close()
                moveTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 24.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 0.0f)
                close()
            }
        }
        .build()
        return _reflectHorizontalAlt!!
    }

private var _reflectHorizontalAlt: ImageVector? = null
