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
                moveToRelative(8.0f, 11.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(10.757f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveTo(3.0f, 3.243f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(18.772f, 6.0f)
                lineToRelative(0.601f, 5.777f)
                lineToRelative(-2.597f, 1.223f)
                lineTo(5.5f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(4.224f, -1.0f)
                lineToRelative(4.327f, -2.038f)
                lineToRelative(0.677f, -6.962f)
                horizontalLineToRelative(-3.455f)
                close()
                moveTo(23.222f, 3.267f)
                curveToRelative(0.0f, 0.662f, -0.246f, 1.261f, -0.639f, 1.733f)
                horizontalLineToRelative(-4.166f)
                curveToRelative(-0.393f, -0.472f, -0.639f, -1.071f, -0.639f, -1.733f)
                curveToRelative(0.0f, -0.783f, 0.637f, -1.388f, 1.089f, -1.855f)
                curveToRelative(0.0f, 0.0f, -0.141f, 1.588f, 0.441f, 1.588f)
                curveToRelative(1.233f, 0.0f, 0.11f, -1.841f, 1.192f, -3.0f)
                curveToRelative(0.86f, 0.86f, 2.722f, 1.69f, 2.722f, 3.267f)
                close()
            }
        }
        .build()
        return _torchInspirationLeader!!
    }

private var _torchInspirationLeader: ImageVector? = null
