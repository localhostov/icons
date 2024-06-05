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

public val Icons.Filled.H2: ImageVector
    get() {
        if (_h2 != null) {
            return _h2!!
        }
        _h2 = Builder(name = "H2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(23.0f, 18.0f)
                horizontalLineToRelative(-6.882f)
                curveToRelative(-0.03f, 0.0f, -0.074f, 0.0f, -0.104f, -0.063f)
                curveToRelative(-0.038f, -0.081f, 0.01f, -0.138f, 0.025f, -0.155f)
                curveToRelative(0.553f, -0.652f, 1.562f, -1.288f, 2.631f, -1.961f)
                curveToRelative(2.441f, -1.536f, 5.479f, -3.449f, 5.324f, -7.095f)
                curveToRelative(-0.112f, -2.65f, -2.306f, -4.726f, -4.994f, -4.726f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(1.586f, 0.0f, 2.93f, 1.261f, 2.996f, 2.81f)
                curveToRelative(0.105f, 2.487f, -2.181f, 3.927f, -4.392f, 5.318f)
                curveToRelative(-1.203f, 0.758f, -2.339f, 1.473f, -3.092f, 2.36f)
                curveToRelative(-0.548f, 0.647f, -0.668f, 1.524f, -0.313f, 2.29f)
                curveToRelative(0.349f, 0.754f, 1.084f, 1.222f, 1.918f, 1.222f)
                horizontalLineToRelative(6.882f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _h2!!
    }

private var _h2: ImageVector? = null
