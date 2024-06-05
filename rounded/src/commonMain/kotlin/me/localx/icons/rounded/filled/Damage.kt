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

public val Icons.Filled.Damage: ImageVector
    get() {
        if (_damage != null) {
            return _damage!!
        }
        _damage = Builder(name = "Damage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.36f, 16.768f)
                curveToRelative(-0.424f, -0.354f, -0.481f, -0.984f, -0.128f, -1.408f)
                curveToRelative(0.354f, -0.423f, 0.984f, -0.482f, 1.408f, -0.128f)
                lineToRelative(6.932f, 5.776f)
                curveToRelative(0.272f, -0.616f, 0.428f, -1.293f, 0.428f, -2.008f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-10.707f)
                lineToRelative(2.771f, 5.466f)
                curveToRelative(0.169f, 0.327f, 0.509f, 0.534f, 0.885f, 0.534f)
                horizontalLineToRelative(6.051f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.277f)
                lineToRelative(1.145f, 2.004f)
                curveToRelative(0.274f, 0.479f, 0.107f, 1.09f, -0.372f, 1.364f)
                curveToRelative(-0.156f, 0.089f, -0.327f, 0.132f, -0.495f, 0.132f)
                curveToRelative(-0.347f, 0.0f, -0.685f, -0.181f, -0.869f, -0.504f)
                lineToRelative(-1.712f, -2.996f)
                horizontalLineToRelative(-1.471f)
                curveToRelative(-1.127f, 0.0f, -2.148f, -0.622f, -2.666f, -1.623f)
                lineTo(6.051f, 0.0f)
                horizontalLineToRelative(-1.051f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.527f, 0.104f, 1.026f, 0.256f, 1.503f)
                lineToRelative(5.744f, -2.869f)
                verticalLineToRelative(-3.635f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.636f)
                lineToRelative(2.553f, -1.275f)
                curveToRelative(0.495f, -0.248f, 1.095f, -0.046f, 1.341f, 0.448f)
                curveToRelative(0.247f, 0.494f, 0.046f, 1.095f, -0.448f, 1.341f)
                lineTo(1.233f, 22.251f)
                curveToRelative(0.918f, 1.062f, 2.257f, 1.749f, 3.767f, 1.749f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.319f, 0.0f, 2.511f, -0.523f, 3.406f, -1.361f)
                lineToRelative(-7.046f, -5.871f)
                close()
            }
        }
        .build()
        return _damage!!
    }

private var _damage: ImageVector? = null
