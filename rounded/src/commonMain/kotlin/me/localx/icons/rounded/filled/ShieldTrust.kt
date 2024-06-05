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

public val Icons.Filled.ShieldTrust: ImageVector
    get() {
        if (_shieldTrust != null) {
            return _shieldTrust!!
        }
        _shieldTrust = Builder(name = "ShieldTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.126f, 9.868f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-2.151f, -2.154f)
                verticalLineToRelative(-1.718f)
                curveToRelative(0.0f, -1.651f, -1.342f, -2.995f, -2.991f, -2.995f)
                horizontalLineToRelative(-1.716f)
                lineToRelative(-2.151f, -2.153f)
                curveToRelative(-1.131f, -1.131f, -3.101f, -1.131f, -4.231f, 0.0f)
                lineToRelative(-2.151f, 2.153f)
                horizontalLineToRelative(-1.716f)
                curveToRelative(-1.65f, 0.0f, -2.991f, 1.343f, -2.991f, 2.995f)
                verticalLineToRelative(1.718f)
                lineToRelative(-2.152f, 2.154f)
                curveToRelative(-1.165f, 1.168f, -1.165f, 3.067f, 0.0f, 4.235f)
                lineToRelative(2.151f, 2.154f)
                verticalLineToRelative(1.718f)
                curveToRelative(0.0f, 1.651f, 1.342f, 2.995f, 2.991f, 2.995f)
                horizontalLineToRelative(1.716f)
                lineToRelative(2.151f, 2.153f)
                curveToRelative(0.565f, 0.565f, 1.317f, 0.877f, 2.116f, 0.877f)
                reflectiveCurveToRelative(1.55f, -0.312f, 2.115f, -0.877f)
                lineToRelative(2.151f, -2.153f)
                horizontalLineToRelative(1.716f)
                curveToRelative(1.65f, 0.0f, 2.991f, -1.343f, 2.991f, -2.995f)
                verticalLineToRelative(-1.718f)
                lineToRelative(2.152f, -2.154f)
                curveToRelative(1.165f, -1.168f, 1.165f, -3.067f, 0.0f, -4.235f)
                close()
                moveTo(18.204f, 10.211f)
                lineToRelative(-5.054f, 4.995f)
                curveToRelative(-0.614f, 0.61f, -1.423f, 0.916f, -2.231f, 0.916f)
                reflectiveCurveToRelative(-1.613f, -0.305f, -2.229f, -0.913f)
                lineToRelative(-2.599f, -2.499f)
                curveToRelative(-0.392f, -0.389f, -0.396f, -1.021f, -0.007f, -1.414f)
                curveToRelative(0.39f, -0.391f, 1.021f, -0.396f, 1.415f, -0.007f)
                lineToRelative(2.598f, 2.498f)
                curveToRelative(0.453f, 0.449f, 1.19f, 0.45f, 1.644f, 0.0f)
                lineToRelative(5.055f, -4.996f)
                curveToRelative(0.394f, -0.39f, 1.026f, -0.386f, 1.415f, 0.007f)
                reflectiveCurveToRelative(0.385f, 1.025f, -0.007f, 1.414f)
                close()
            }
        }
        .build()
        return _shieldTrust!!
    }

private var _shieldTrust: ImageVector? = null
