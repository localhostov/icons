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

public val Icons.Filled.TorchInspirationLeader: ImageVector
    get() {
        if (_torchInspirationLeader != null) {
            return _torchInspirationLeader!!
        }
        _torchInspirationLeader = Builder(name = "TorchInspirationLeader", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.359f, 4.998f)
                curveToRelative(-0.393f, -0.472f, -0.639f, -1.071f, -0.639f, -1.733f)
                curveToRelative(0.0f, -0.703f, 0.434f, -1.296f, 0.763f, -1.675f)
                curveToRelative(0.154f, -0.178f, 0.447f, -0.081f, 0.46f, 0.154f)
                curveToRelative(0.024f, 0.439f, -0.019f, 1.254f, 0.308f, 1.254f)
                curveToRelative(1.051f, 0.0f, 0.428f, -1.583f, 0.881f, -2.7f)
                curveToRelative(0.122f, -0.301f, 0.507f, -0.392f, 0.761f, -0.189f)
                curveToRelative(0.932f, 0.746f, 2.272f, 1.8f, 2.272f, 3.155f)
                curveToRelative(0.0f, 0.662f, -0.246f, 1.261f, -0.639f, 1.733f)
                horizontalLineToRelative(-4.166f)
                close()
                moveTo(22.227f, 6.0f)
                lineToRelative(-0.606f, 6.233f)
                curveToRelative(-0.044f, 0.453f, -0.323f, 0.849f, -0.734f, 1.042f)
                lineToRelative(-3.098f, 1.459f)
                curveToRelative(-0.376f, 0.177f, -0.769f, 0.315f, -1.174f, 0.41f)
                lineToRelative(-3.615f, 0.856f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -3.314f, 2.686f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(8.776f)
                lineToRelative(2.597f, -1.223f)
                lineToRelative(-0.601f, -5.777f)
                horizontalLineToRelative(3.455f)
                close()
                moveTo(7.999f, 11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(10.757f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveTo(3.0f, 3.243f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _torchInspirationLeader!!
    }

private var _torchInspirationLeader: ImageVector? = null
