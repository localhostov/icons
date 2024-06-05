package me.localx.icons.rounded.outline

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

public val Icons.Outline.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.224f, 17.192f)
                lineToRelative(-1.289f, -12.889f)
                curveToRelative(-0.245f, -2.453f, -2.289f, -4.302f, -4.754f, -4.302f)
                horizontalLineToRelative(-6.361f)
                curveToRelative(-2.465f, 0.0f, -4.509f, 1.85f, -4.754f, 4.302f)
                lineToRelative(-1.289f, 12.889f)
                curveToRelative(-1.609f, 0.518f, -2.776f, 2.029f, -2.776f, 3.808f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.779f, -1.167f, -3.29f, -2.776f, -3.808f)
                close()
                moveTo(6.056f, 4.501f)
                curveToRelative(0.143f, -1.426f, 1.331f, -2.501f, 2.764f, -2.501f)
                horizontalLineToRelative(6.361f)
                curveToRelative(1.433f, 0.0f, 2.621f, 1.075f, 2.764f, 2.501f)
                lineToRelative(1.25f, 12.499f)
                lineTo(4.806f, 17.0f)
                lineToRelative(1.25f, -12.499f)
                close()
                moveTo(21.0f, 22.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(7.825f, 6.9f)
                lineToRelative(0.2f, -2.0f)
                curveToRelative(0.051f, -0.511f, 0.481f, -0.9f, 0.995f, -0.9f)
                horizontalLineToRelative(1.979f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.075f)
                lineToRelative(-0.11f, 1.1f)
                curveToRelative(-0.052f, 0.516f, -0.486f, 0.9f, -0.994f, 0.9f)
                curveToRelative(-0.033f, 0.0f, -0.067f, -0.001f, -0.101f, -0.005f)
                curveToRelative(-0.549f, -0.055f, -0.95f, -0.545f, -0.896f, -1.095f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
