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

public val Icons.Bold.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.154f, 3.0f)
                horizontalLineToRelative(0.846f)
                lineTo(23.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.846f)
                curveTo(0.687f, 5.112f, 0.0f, 7.632f, 0.0f, 10.0f)
                curveToRelative(0.0f, 4.363f, 2.817f, 9.925f, 5.229f, 13.361f)
                lineToRelative(0.448f, 0.639f)
                horizontalLineToRelative(12.647f)
                lineToRelative(0.448f, -0.639f)
                curveToRelative(2.412f, -3.437f, 5.228f, -8.998f, 5.228f, -13.361f)
                curveToRelative(0.0f, -2.368f, -0.687f, -4.889f, -1.846f, -7.0f)
                close()
                moveTo(16.751f, 21.0f)
                lineTo(7.25f, 21.0f)
                curveToRelative(-2.123f, -3.211f, -4.25f, -7.808f, -4.25f, -11.0f)
                curveToRelative(0.0f, -2.439f, 0.961f, -5.168f, 2.432f, -7.0f)
                horizontalLineToRelative(0.568f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.569f)
                curveToRelative(1.471f, 1.833f, 2.431f, 4.561f, 2.431f, 7.0f)
                curveToRelative(0.0f, 3.192f, -2.127f, 7.788f, -4.25f, 11.0f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
