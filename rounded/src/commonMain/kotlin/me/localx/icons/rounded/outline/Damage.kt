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

public val Icons.Outline.Damage: ImageVector
    get() {
        if (_damage != null) {
            return _damage!!
        }
        _damage = Builder(name = "Damage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                horizontalLineTo(5.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-0.719f, 0.0f, -1.371f, -0.265f, -1.888f, -0.688f)
                lineToRelative(8.335f, -4.163f)
                curveToRelative(0.494f, -0.247f, 0.695f, -0.847f, 0.448f, -1.341f)
                curveToRelative(-0.247f, -0.494f, -0.847f, -0.696f, -1.341f, -0.448f)
                lineToRelative(-2.553f, 1.275f)
                verticalLineToRelative(-2.636f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.635f)
                lineToRelative(-3.939f, 1.968f)
                curveToRelative(-0.04f, -0.195f, -0.061f, -0.396f, -0.061f, -0.602f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(2.023f)
                lineToRelative(2.261f, 4.377f)
                curveToRelative(0.518f, 1.001f, 1.539f, 1.623f, 2.666f, 1.623f)
                horizontalLineToRelative(1.471f)
                lineToRelative(1.712f, 2.996f)
                curveToRelative(0.185f, 0.323f, 0.522f, 0.504f, 0.869f, 0.504f)
                curveToRelative(0.168f, 0.0f, 0.339f, -0.042f, 0.495f, -0.132f)
                curveToRelative(0.479f, -0.274f, 0.646f, -0.885f, 0.372f, -1.364f)
                lineToRelative(-1.145f, -2.004f)
                horizontalLineToRelative(2.277f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.051f)
                curveToRelative(-0.375f, 0.0f, -0.716f, -0.208f, -0.888f, -0.541f)
                lineToRelative(-1.786f, -3.459f)
                horizontalLineToRelative(9.725f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.22f, -0.027f, 0.432f, -0.072f, 0.639f)
                lineToRelative(-5.288f, -4.407f)
                curveToRelative(-0.424f, -0.354f, -1.054f, -0.295f, -1.408f, 0.128f)
                curveToRelative(-0.354f, 0.424f, -0.296f, 1.055f, 0.128f, 1.408f)
                lineToRelative(5.49f, 4.575f)
                curveToRelative(-0.511f, 0.405f, -1.149f, 0.657f, -1.85f, 0.657f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _damage!!
    }

private var _damage: ImageVector? = null
