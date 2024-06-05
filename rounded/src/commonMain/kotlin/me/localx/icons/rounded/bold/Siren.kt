package me.localx.icons.rounded.bold

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

public val Icons.Bold.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.76f, 19.026f)
                lineToRelative(-1.407f, -14.074f)
                curveToRelative(-0.283f, -2.823f, -2.635f, -4.953f, -5.473f, -4.953f)
                horizontalLineToRelative(-5.76f)
                curveTo(6.282f, 0.0f, 3.93f, 2.129f, 3.647f, 4.953f)
                lineToRelative(-1.407f, 14.074f)
                curveToRelative(-1.255f, 0.132f, -2.24f, 1.184f, -2.24f, 2.474f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.289f, -0.985f, -2.341f, -2.24f, -2.474f)
                close()
                moveTo(6.632f, 5.251f)
                curveToRelative(0.128f, -1.284f, 1.198f, -2.251f, 2.488f, -2.251f)
                horizontalLineToRelative(5.76f)
                curveToRelative(1.29f, 0.0f, 2.359f, 0.968f, 2.488f, 2.251f)
                lineToRelative(1.375f, 13.749f)
                lineTo(5.258f, 19.0f)
                lineToRelative(1.375f, -13.749f)
                close()
                moveTo(8.224f, 8.35f)
                lineToRelative(0.2f, -2.0f)
                curveToRelative(0.077f, -0.767f, 0.722f, -1.351f, 1.493f, -1.351f)
                horizontalLineToRelative(1.583f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.226f)
                lineToRelative(-0.065f, 0.649f)
                curveToRelative(-0.078f, 0.773f, -0.729f, 1.351f, -1.491f, 1.351f)
                curveToRelative(-0.05f, 0.0f, -0.101f, -0.002f, -0.151f, -0.007f)
                curveToRelative(-0.824f, -0.083f, -1.426f, -0.818f, -1.343f, -1.642f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
