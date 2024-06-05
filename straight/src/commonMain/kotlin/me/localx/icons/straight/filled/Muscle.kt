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

public val Icons.Filled.Muscle: ImageVector
    get() {
        if (_muscle != null) {
            return _muscle!!
        }
        _muscle = Builder(name = "Muscle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.476f)
                reflectiveCurveToRelative(-1.482f, -0.5f, -3.577f, -0.5f)
                curveToRelative(-1.299f, 0.0f, -2.607f, 0.737f, -3.602f, 1.48f)
                curveToRelative(0.787f, 0.571f, 1.268f, 1.1f, 1.311f, 1.148f)
                lineToRelative(-0.747f, 0.665f)
                lineToRelative(-0.745f, 0.667f)
                curveToRelative(-0.018f, -0.02f, -2.015f, -1.96f, -4.14f, -1.96f)
                curveToRelative(-2.376f, 0.0f, -4.81f, 1.852f, -6.213f, 3.133f)
                curveToRelative(1.393f, -3.503f, 0.345f, -8.359f, 0.901f, -9.93f)
                lineToRelative(2.84f, -0.904f)
                verticalLineToRelative(-0.981f)
                lineToRelative(1.981f, -0.788f)
                curveTo(12.009f, 1.459f, 11.104f, 0.007f, 9.009f, 0.007f)
                curveTo(7.509f, 0.007f, 6.295f, 1.078f, 6.295f, 1.078f)
                curveTo(-0.515f, 6.316f, 0.009f, 15.619f, 0.009f, 18.762f)
                curveToRelative(0.0f, 0.0f, 4.658f, 5.238f, 11.991f, 5.238f)
                reflectiveCurveToRelative(12.0f, -3.143f, 12.0f, -3.143f)
                verticalLineToRelative(-10.381f)
                close()
            }
        }
        .build()
        return _muscle!!
    }

private var _muscle: ImageVector? = null
