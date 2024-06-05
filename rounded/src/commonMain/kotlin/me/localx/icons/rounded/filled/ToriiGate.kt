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

public val Icons.Filled.ToriiGate: ImageVector
    get() {
        if (_toriiGate != null) {
            return _toriiGate!!
        }
        _toriiGate = Builder(name = "ToriiGate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.603f, 0.166f)
                curveToRelative(-0.354f, -0.246f, -0.831f, -0.215f, -1.15f, 0.075f)
                lineToRelative(-0.412f, 0.307f)
                curveToRelative(-1.124f, 0.937f, -2.55f, 1.453f, -4.013f, 1.453f)
                lineTo(5.972f, 2.001f)
                curveToRelative(-1.463f, 0.0f, -2.889f, -0.516f, -4.013f, -1.453f)
                lineToRelative(-0.412f, -0.307f)
                curveTo(1.228f, -0.05f, 0.751f, -0.081f, 0.397f, 0.166f)
                curveTo(-0.012f, 0.45f, -0.122f, 1.006f, 0.147f, 1.425f)
                lineToRelative(0.986f, 1.543f)
                curveToRelative(0.605f, 1.412f, 1.616f, 2.521f, 2.867f, 3.22f)
                verticalLineToRelative(2.812f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.812f)
                curveToRelative(1.251f, -0.699f, 2.262f, -1.808f, 2.867f, -3.22f)
                lineToRelative(0.986f, -1.543f)
                curveToRelative(0.269f, -0.419f, 0.159f, -0.975f, -0.25f, -1.259f)
                close()
                moveTo(6.0f, 6.901f)
                curveToRelative(0.356f, 0.061f, 0.719f, 0.099f, 1.094f, 0.099f)
                horizontalLineToRelative(3.906f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.099f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.906f)
                curveToRelative(0.375f, 0.0f, 0.738f, -0.039f, 1.094f, -0.099f)
                verticalLineToRelative(2.099f)
                close()
            }
        }
        .build()
        return _toriiGate!!
    }

private var _toriiGate: ImageVector? = null
