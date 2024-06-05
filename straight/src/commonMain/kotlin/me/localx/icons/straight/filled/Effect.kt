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

public val Icons.Filled.Effect: ImageVector
    get() {
        if (_effect != null) {
            return _effect!!
        }
        _effect = Builder(name = "Effect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(15.163f)
                curveToRelative(-1.441f, 0.433f, -2.5f, 1.756f, -2.5f, 3.337f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.58f, -1.059f, -2.903f, -2.5f, -3.337f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.163f)
                curveToRelative(-1.441f, 0.433f, -2.5f, 1.756f, -2.5f, 3.337f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.58f, -1.059f, -2.903f, -2.5f, -3.337f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.109f)
                lineToRelative(4.928f, 15.605f)
                curveToRelative(-0.927f, 0.63f, -1.537f, 1.692f, -1.537f, 2.895f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.019f, 0.0f, -0.036f, 0.005f, -0.055f, 0.006f)
                lineTo(15.706f, 2.0f)
                horizontalLineToRelative(8.294f)
                close()
            }
        }
        .build()
        return _effect!!
    }

private var _effect: ImageVector? = null
