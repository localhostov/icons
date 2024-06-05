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

public val Icons.Bold.Passport: ImageVector
    get() {
        if (_passport != null) {
            return _passport!!
        }
        _passport = Builder(name = "Passport", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(23.0f, 3.5f)
                lineTo(23.0f, 24.0f)
                lineTo(1.0f, 24.0f)
                lineTo(1.0f, 3.5f)
                curveTo(1.0f, 1.57f, 2.57f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                lineTo(4.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 3.5f)
                close()
                moveTo(14.785f, 4.763f)
                curveToRelative(0.336f, 0.958f, 0.551f, 2.082f, 0.65f, 3.237f)
                horizontalLineToRelative(-2.007f)
                curveToRelative(-0.246f, -2.505f, -1.063f, -3.944f, -1.43f, -4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.364f, 0.056f, -1.18f, 1.495f, -1.426f, 4.0f)
                horizontalLineToRelative(-2.007f)
                curveToRelative(0.099f, -1.155f, 0.314f, -2.279f, 0.65f, -3.237f)
                curveToRelative(-1.623f, 0.956f, -2.715f, 2.717f, -2.715f, 4.737f)
                reflectiveCurveToRelative(1.092f, 3.78f, 2.715f, 4.737f)
                curveToRelative(-0.336f, -0.958f, -0.551f, -2.082f, -0.65f, -3.237f)
                horizontalLineToRelative(2.007f)
                curveToRelative(0.246f, 2.505f, 1.063f, 3.944f, 1.43f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.364f, -0.056f, 1.18f, -1.495f, 1.426f, -4.0f)
                horizontalLineToRelative(2.007f)
                curveToRelative(-0.099f, 1.155f, -0.314f, 2.279f, -0.65f, 3.237f)
                curveToRelative(1.623f, -0.956f, 2.715f, -2.717f, 2.715f, -4.737f)
                reflectiveCurveToRelative(-1.092f, -3.78f, -2.715f, -4.737f)
                close()
            }
        }
        .build()
        return _passport!!
    }

private var _passport: ImageVector? = null
