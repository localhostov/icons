package me.localx.icons.straight.outline

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

public val Icons.Outline.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 11.538f)
                curveToRelative(1.719f, -0.584f, 3.0f, -1.737f, 3.0f, -3.538f)
                curveToRelative(0.0f, -2.446f, -2.337f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.102f, 0.0f, -0.203f, 0.003f, -0.303f, 0.009f)
                curveToRelative(-0.935f, -0.325f, -6.06f, -2.009f, -11.697f, -2.009f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.963f, 0.0f, 5.825f, 0.511f, 7.908f, 1.009f)
                curveToRelative(-0.115f, 0.053f, -0.23f, 0.107f, -0.346f, 0.161f)
                curveToRelative(-1.835f, 0.857f, -3.914f, 1.83f, -7.562f, 1.83f)
                verticalLineToRelative(2.0f)
                curveToRelative(3.296f, 0.0f, 5.489f, -0.726f, 7.223f, -1.478f)
                curveToRelative(-0.145f, 0.467f, -0.223f, 0.964f, -0.223f, 1.478f)
                curveToRelative(0.0f, 0.571f, 0.097f, 1.12f, 0.274f, 1.632f)
                curveTo(5.154f, 10.764f, 3.453f, 17.618f, 3.098f, 20.329f)
                curveToRelative(-0.315f, -0.208f, -0.692f, -0.329f, -1.098f, -0.329f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-10.462f)
                close()
                moveTo(22.0f, 8.0f)
                curveToRelative(0.0f, 1.468f, -2.392f, 2.0f, -4.0f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(2.481f, 0.0f, 4.0f, 2.59f, 4.0f, 4.0f)
                close()
                moveTo(14.362f, 10.426f)
                curveToRelative(0.912f, 0.968f, 2.206f, 1.574f, 3.638f, 1.574f)
                curveToRelative(0.334f, 0.0f, 0.669f, -0.016f, 1.0f, -0.047f)
                verticalLineToRelative(10.047f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.002f, 22.0f)
                lineToRelative(0.002f, -0.548f)
                curveToRelative(0.001f, -0.37f, 0.146f, -8.981f, 9.358f, -11.026f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
