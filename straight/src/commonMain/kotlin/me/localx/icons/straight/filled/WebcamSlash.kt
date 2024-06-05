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

public val Icons.Filled.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) {
            return _webcamSlash!!
        }
        _webcamSlash = Builder(name = "WebcamSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.748f, 17.334f)
                curveToRelative(1.988f, -1.826f, 3.252f, -4.427f, 3.252f, -7.334f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.907f, 0.0f, -5.508f, 1.264f, -7.334f, 3.252f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.209f, -5.209f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.53f, -0.705f, 2.881f, -1.794f, 3.792f)
                lineToRelative(-1.407f, -1.407f)
                curveToRelative(0.725f, -0.548f, 1.201f, -1.409f, 1.201f, -2.385f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-0.977f, 0.0f, -1.837f, 0.476f, -2.385f, 1.201f)
                lineToRelative(-1.407f, -1.407f)
                curveToRelative(0.911f, -1.089f, 2.262f, -1.794f, 3.792f, -1.794f)
                close()
                moveTo(18.861f, 23.083f)
                lineToRelative(0.155f, 0.917f)
                lineTo(4.817f, 24.0f)
                lineToRelative(0.196f, -1.166f)
                curveToRelative(0.151f, -0.897f, 0.475f, -1.737f, 0.935f, -2.489f)
                curveToRelative(1.779f, 1.045f, 3.843f, 1.655f, 6.051f, 1.655f)
                curveToRelative(1.697f, 0.0f, 3.304f, -0.37f, 4.768f, -1.01f)
                lineToRelative(2.093f, 2.093f)
                close()
                moveTo(2.0f, 10.0f)
                curveToRelative(0.0f, -1.132f, 0.198f, -2.217f, 0.546f, -3.232f)
                lineToRelative(4.699f, 4.699f)
                curveToRelative(0.487f, 1.572f, 1.717f, 2.801f, 3.288f, 3.288f)
                lineToRelative(4.699f, 4.699f)
                curveToRelative(-1.015f, 0.348f, -2.1f, 0.546f, -3.232f, 0.546f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
