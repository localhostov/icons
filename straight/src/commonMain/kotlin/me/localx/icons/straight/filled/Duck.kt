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

public val Icons.Filled.Duck: ImageVector
    get() {
        if (_duck != null) {
            return _duck!!
        }
        _duck = Builder(name = "Duck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-3.855f, 1.446f)
                curveToRelative(-0.976f, 1.535f, -2.691f, 2.555f, -4.645f, 2.555f)
                curveToRelative(-3.038f, 0.0f, -5.5f, -2.462f, -5.5f, -5.5f)
                reflectiveCurveTo(12.462f, 0.0f, 15.5f, 0.0f)
                curveToRelative(2.635f, 0.0f, 4.837f, 1.853f, 5.374f, 4.328f)
                lineToRelative(3.126f, 1.172f)
                close()
                moveTo(13.5f, 17.0f)
                curveToRelative(-1.028f, 0.0f, -2.693f, 0.96f, -3.985f, 1.891f)
                curveToRelative(0.983f, 0.509f, 2.465f, 1.109f, 3.985f, 1.109f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.652f, 10.946f)
                curveToRelative(1.148f, 1.546f, 2.347f, 3.74f, 2.347f, 5.755f)
                curveToRelative(0.0f, 4.741f, -3.815f, 7.3f, -7.406f, 7.3f)
                horizontalLineToRelative(-6.943f)
                curveToRelative(-3.213f, 0.0f, -5.916f, -1.373f, -7.417f, -3.766f)
                curveToRelative(-1.597f, -2.548f, -1.634f, -5.962f, -0.099f, -9.133f)
                lineToRelative(0.71f, -1.465f)
                reflectiveCurveToRelative(1.874f, 3.364f, 3.156f, 3.364f)
                curveToRelative(1.033f, 0.0f, 3.093f, -1.478f, 4.604f, -2.869f)
                curveToRelative(1.374f, 1.746f, 3.506f, 2.869f, 5.896f, 2.869f)
                curveToRelative(1.993f, 0.0f, 3.807f, -0.782f, 5.152f, -2.054f)
                close()
                moveTo(17.0f, 18.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-2.547f, 0.0f, -6.014f, 2.909f, -6.4f, 3.241f)
                lineToRelative(-0.961f, 0.824f)
                lineToRelative(1.023f, 0.744f)
                curveToRelative(0.123f, 0.09f, 3.051f, 2.191f, 6.338f, 2.191f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _duck!!
    }

private var _duck: ImageVector? = null
