package me.localx.icons.straight.bold

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

public val Icons.Bold.TorchInspirationLeader: ImageVector
    get() {
        if (_torchInspirationLeader != null) {
            return _torchInspirationLeader!!
        }
        _torchInspirationLeader = Builder(name = "TorchInspirationLeader", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 6.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                close()
                moveTo(18.264f, 10.728f)
                lineToRelative(-2.61f, 1.272f)
                lineTo(6.0f, 12.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.346f)
                lineToRelative(4.104f, -2.0f)
                horizontalLineToRelative(0.051f)
                lineToRelative(0.728f, -7.0f)
                horizontalLineToRelative(-3.455f)
                lineToRelative(0.491f, 4.728f)
                close()
                moveTo(19.5f, 0.0f)
                curveToRelative(-1.082f, 1.159f, 0.041f, 3.0f, -1.192f, 3.0f)
                curveToRelative(-0.582f, 0.0f, -0.441f, -1.588f, -0.441f, -1.588f)
                curveToRelative(-0.452f, 0.466f, -1.089f, 1.071f, -1.089f, 1.855f)
                curveToRelative(0.0f, 0.662f, 0.246f, 1.261f, 0.639f, 1.733f)
                horizontalLineToRelative(4.166f)
                curveToRelative(0.393f, -0.472f, 0.639f, -1.071f, 0.639f, -1.733f)
                curveToRelative(0.0f, -1.576f, -1.863f, -2.407f, -2.722f, -3.267f)
                close()
            }
        }
        .build()
        return _torchInspirationLeader!!
    }

private var _torchInspirationLeader: ImageVector? = null
