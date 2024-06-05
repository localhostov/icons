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

public val Icons.Filled.Webcam: ImageVector
    get() {
        if (_webcam != null) {
            return _webcam!!
        }
        _webcam = Builder(name = "Webcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 10.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 10.0f)
                curveToRelative(0.0f, 5.514f, -4.486f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 15.514f, 2.0f, 10.0f)
                reflectiveCurveTo(6.486f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(18.429f, 20.128f)
                curveToRelative(-1.86f, 1.185f, -4.066f, 1.872f, -6.429f, 1.872f)
                reflectiveCurveToRelative(-4.571f, -0.688f, -6.431f, -1.873f)
                curveToRelative(-0.095f, 0.143f, -0.185f, 0.288f, -0.27f, 0.438f)
                curveToRelative(-0.407f, 0.72f, -0.401f, 1.578f, 0.017f, 2.293f)
                curveToRelative(0.417f, 0.715f, 1.159f, 1.142f, 1.986f, 1.142f)
                horizontalLineToRelative(9.394f)
                curveToRelative(0.826f, 0.0f, 1.569f, -0.427f, 1.988f, -1.142f)
                curveToRelative(0.416f, -0.711f, 0.424f, -1.563f, 0.021f, -2.278f)
                curveToRelative(-0.087f, -0.154f, -0.179f, -0.305f, -0.276f, -0.451f)
                close()
            }
        }
        .build()
        return _webcam!!
    }

private var _webcam: ImageVector? = null
