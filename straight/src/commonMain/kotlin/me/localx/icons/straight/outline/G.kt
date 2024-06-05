package me.localx.icons.straight.outline

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

public val Icons.Outline.G: ImageVector
    get() {
        if (_g != null) {
            return _g!!
        }
        _g = Builder(name = "G", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-5.503f, 0.0f, -9.98f, -4.486f, -9.98f, -10.0f)
                verticalLineToRelative(-4.0f)
                curveTo(2.02f, 4.486f, 6.506f, 0.0f, 12.02f, 0.0f)
                curveToRelative(3.824f, 0.0f, 7.257f, 2.128f, 8.96f, 5.554f)
                lineToRelative(-1.791f, 0.891f)
                curveToRelative(-1.363f, -2.742f, -4.109f, -4.445f, -7.169f, -4.445f)
                curveToRelative(-4.411f, 0.0f, -8.0f, 3.589f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 4.411f, 3.58f, 8.0f, 7.98f, 8.0f)
                curveToRelative(3.63f, 0.0f, 6.977f, -2.408f, 7.959f, -5.725f)
                curveToRelative(0.088f, -0.298f, 0.031f, -0.614f, -0.158f, -0.867f)
                curveToRelative(-0.194f, -0.259f, -0.489f, -0.408f, -0.811f, -0.408f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.99f)
                curveToRelative(0.958f, 0.0f, 1.838f, 0.441f, 2.413f, 1.211f)
                curveToRelative(0.57f, 0.764f, 0.743f, 1.723f, 0.474f, 2.631f)
                curveToRelative(-1.228f, 4.147f, -5.382f, 7.158f, -9.877f, 7.158f)
                close()
            }
        }
        .build()
        return _g!!
    }

private var _g: ImageVector? = null
