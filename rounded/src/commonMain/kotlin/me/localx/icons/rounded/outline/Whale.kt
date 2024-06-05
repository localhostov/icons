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

public val Icons.Outline.Whale: ImageVector
    get() {
        if (_whale != null) {
            return _whale!!
        }
        _whale = Builder(name = "Whale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 17.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 16.501f)
                verticalLineToRelative(1.499f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(-9.273f)
                curveTo(3.915f, 24.0f, 0.0f, 20.085f, 0.0f, 15.273f)
                curveToRelative(0.0f, -3.369f, 0.987f, -6.629f, 2.855f, -9.43f)
                lineToRelative(0.493f, -0.739f)
                curveTo(1.556f, 4.341f, 0.246f, 2.655f, 0.004f, 0.65f)
                curveTo(-0.038f, 0.301f, 0.235f, -0.023f, 0.586f, 0.002f)
                curveToRelative(3.667f, 0.26f, 4.914f, 2.773f, 4.914f, 2.773f)
                curveTo(5.5f, 2.774f, 6.703f, 0.259f, 10.414f, 0.001f)
                curveToRelative(0.351f, -0.024f, 0.624f, 0.299f, 0.582f, 0.649f)
                curveToRelative(-0.275f, 2.287f, -1.942f, 4.159f, -4.128f, 4.72f)
                lineToRelative(-0.463f, 2.748f)
                curveToRelative(-0.2f, 1.185f, -0.327f, 2.389f, -0.378f, 3.593f)
                curveToRelative(2.872f, -2.379f, 5.879f, -3.711f, 8.474f, -3.711f)
                horizontalLineToRelative(1.008f)
                curveToRelative(4.683f, 0.005f, 8.492f, 3.818f, 8.492f, 8.501f)
                close()
                moveTo(22.0f, 16.501f)
                curveToRelative(0.0f, -3.581f, -2.913f, -6.497f, -6.494f, -6.5f)
                horizontalLineToRelative(-1.007f)
                curveToRelative(-2.558f, 0.0f, -5.845f, 1.759f, -8.792f, 4.706f)
                curveToRelative(-0.287f, 0.287f, -0.716f, 0.372f, -1.09f, 0.217f)
                curveToRelative(-0.374f, -0.155f, -0.617f, -0.52f, -0.617f, -0.924f)
                verticalLineToRelative(-1.059f)
                curveToRelative(0.0f, -1.724f, 0.146f, -3.458f, 0.432f, -5.156f)
                lineToRelative(0.158f, -0.938f)
                curveToRelative(-1.648f, 2.471f, -2.59f, 5.454f, -2.59f, 8.426f)
                curveToRelative(0.0f, 3.709f, 3.018f, 6.727f, 6.727f, 6.727f)
                horizontalLineToRelative(9.273f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-1.499f)
                close()
            }
        }
        .build()
        return _whale!!
    }

private var _whale: ImageVector? = null
