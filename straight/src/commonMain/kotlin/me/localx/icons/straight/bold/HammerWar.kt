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

public val Icons.Bold.HammerWar: ImageVector
    get() {
        if (_hammerWar != null) {
            return _hammerWar!!
        }
        _hammerWar = Builder(name = "HammerWar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.963f, 12.527f)
                curveToRelative(-0.128f, -0.914f, -0.664f, -1.695f, -1.471f, -2.145f)
                lineToRelative(-3.565f, -1.981f)
                lineToRelative(-0.329f, -3.001f)
                lineToRelative(-3.001f, -0.329f)
                lineToRelative(-1.98f, -3.565f)
                curveToRelative(-0.448f, -0.807f, -1.23f, -1.344f, -2.145f, -1.472f)
                curveToRelative(-0.916f, -0.13f, -1.813f, 0.174f, -2.465f, 0.826f)
                lineTo(4.845f, 5.023f)
                curveToRelative(-0.652f, 0.653f, -0.953f, 1.552f, -0.825f, 2.466f)
                reflectiveCurveToRelative(0.664f, 1.695f, 1.467f, 2.142f)
                lineToRelative(4.334f, 2.428f)
                lineToRelative(-6.967f, 6.967f)
                curveToRelative(-0.116f, -0.016f, -0.234f, -0.025f, -0.354f, -0.025f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.12f, -0.009f, -0.238f, -0.025f, -0.354f)
                lineToRelative(6.967f, -6.967f)
                lineToRelative(2.425f, 4.329f)
                curveToRelative(0.448f, 0.807f, 1.23f, 1.344f, 2.145f, 1.472f)
                curveToRelative(0.138f, 0.02f, 0.276f, 0.028f, 0.413f, 0.028f)
                curveToRelative(0.768f, 0.0f, 1.499f, -0.301f, 2.052f, -0.854f)
                lineToRelative(4.162f, -4.161f)
                curveToRelative(0.652f, -0.653f, 0.953f, -1.552f, 0.825f, -2.466f)
                close()
                moveTo(11.048f, 3.063f)
                lineToRelative(2.332f, 4.196f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(-4.184f, -2.344f)
                lineTo(11.048f, 3.063f)
                close()
                moveTo(16.934f, 16.954f)
                lineToRelative(-2.344f, -4.184f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(4.197f, 2.331f)
                lineToRelative(-4.003f, 4.003f)
                close()
            }
        }
        .build()
        return _hammerWar!!
    }

private var _hammerWar: ImageVector? = null
