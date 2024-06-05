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

public val Icons.Bold.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineToRelative(-1.333f, -2.667f)
                lineTo(0.0f, 4.0f)
                lineToRelative(2.667f, -1.333f)
                lineTo(4.0f, 0.0f)
                lineToRelative(1.333f, 2.667f)
                lineToRelative(2.667f, 1.333f)
                lineToRelative(-2.667f, 1.333f)
                lineToRelative(-1.333f, 2.667f)
                close()
                moveTo(21.898f, 1.678f)
                curveTo(20.781f, 0.56f, 19.241f, -0.062f, 17.675f, 0.003f)
                curveToRelative(-4.955f, 0.168f, -8.652f, 0.938f, -8.808f, 0.971f)
                lineToRelative(0.619f, 2.936f)
                curveToRelative(0.035f, -0.007f, 3.594f, -0.749f, 8.29f, -0.908f)
                curveToRelative(0.75f, -0.03f, 1.468f, 0.266f, 2.0f, 0.798f)
                curveToRelative(0.297f, 0.297f, 0.297f, 0.78f, 0.0f, 1.078f)
                lineToRelative(-0.312f, 0.312f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(0.312f, -0.312f)
                curveToRelative(1.467f, -1.467f, 1.467f, -3.853f, 0.0f, -5.32f)
                close()
                moveTo(21.598f, 9.532f)
                lineToRelative(-1.512f, 1.513f)
                curveToRelative(0.6f, 1.225f, 0.914f, 2.571f, 0.914f, 3.955f)
                curveToRelative(0.0f, 4.962f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.962f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                curveToRelative(1.38f, 0.0f, 2.724f, 0.312f, 3.945f, 0.909f)
                lineToRelative(1.515f, -1.515f)
                lineToRelative(4.139f, 4.139f)
                close()
                moveTo(17.999f, 14.999f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
