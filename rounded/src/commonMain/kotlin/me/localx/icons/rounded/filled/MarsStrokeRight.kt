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

public val Icons.Filled.MarsStrokeRight: ImageVector
    get() {
        if (_marsStrokeRight != null) {
            return _marsStrokeRight!!
        }
        _marsStrokeRight = Builder(name = "MarsStrokeRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.145f, 9.903f)
                lineToRelative(-2.414f, -2.586f)
                curveToRelative(-0.376f, -0.403f, -1.01f, -0.424f, -1.414f, -0.048f)
                curveToRelative(-0.403f, 0.377f, -0.425f, 1.01f, -0.048f, 1.414f)
                lineToRelative(2.164f, 2.317f)
                horizontalLineToRelative(-4.433f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.08f)
                curveToRelative(-0.488f, -3.387f, -3.401f, -6.0f, -6.92f, -6.0f)
                curveTo(3.14f, 5.0f, 0.0f, 8.14f, 0.0f, 12.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(3.519f, 0.0f, 6.432f, -2.613f, 6.92f, -6.0f)
                horizontalLineToRelative(1.08f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.432f)
                lineToRelative(-2.163f, 2.317f)
                curveToRelative(-0.377f, 0.404f, -0.355f, 1.037f, 0.048f, 1.414f)
                curveToRelative(0.193f, 0.18f, 0.438f, 0.269f, 0.683f, 0.269f)
                curveToRelative(0.267f, 0.0f, 0.534f, -0.106f, 0.731f, -0.317f)
                lineToRelative(2.39f, -2.561f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.312f, -1.555f, -0.855f, -2.097f)
                close()
            }
        }
        .build()
        return _marsStrokeRight!!
    }

private var _marsStrokeRight: ImageVector? = null
