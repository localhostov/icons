package me.localx.icons.rounded.outline

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

public val Icons.Outline.WineBottle: ImageVector
    get() {
        if (_wineBottle != null) {
            return _wineBottle!!
        }
        _wineBottle = Builder(name = "WineBottle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.338f, 9.188f)
                lineToRelative(-3.328f, -2.219f)
                lineTo(15.01f, 1.005f)
                curveTo(15.01f, 0.453f, 14.562f, 0.005f, 14.01f, 0.005f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.964f)
                lineToRelative(-3.328f, 2.219f)
                curveToRelative(-1.674f, 1.115f, -2.673f, 2.981f, -2.673f, 4.992f)
                verticalLineToRelative(4.824f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.001f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-4.824f)
                curveToRelative(0.0f, -2.011f, -0.999f, -3.877f, -2.672f, -4.992f)
                close()
                moveTo(19.01f, 19.004f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-8.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.999f)
                horizontalLineToRelative(11.001f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.449f, 1.0f, -1.001f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(5.185f, 13.004f)
                curveToRelative(0.267f, -0.869f, 0.826f, -1.633f, 1.606f, -2.152f)
                lineToRelative(3.773f, -2.516f)
                curveToRelative(0.278f, -0.186f, 0.445f, -0.498f, 0.445f, -0.832f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.334f, 0.167f, 0.646f, 0.445f, 0.832f)
                lineToRelative(3.773f, 2.516f)
                curveToRelative(1.115f, 0.743f, 1.781f, 1.987f, 1.781f, 3.328f)
                verticalLineToRelative(4.824f)
                close()
            }
        }
        .build()
        return _wineBottle!!
    }

private var _wineBottle: ImageVector? = null
