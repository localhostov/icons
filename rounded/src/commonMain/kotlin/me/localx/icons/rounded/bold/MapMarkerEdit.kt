package me.localx.icons.rounded.bold

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

public val Icons.Bold.MapMarkerEdit: ImageVector
    get() {
        if (_mapMarkerEdit != null) {
            return _mapMarkerEdit!!
        }
        _mapMarkerEdit = Builder(name = "MapMarkerEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.506f, 0.0f, -2.928f, -0.583f, -4.004f, -1.64f)
                lineToRelative(-3.734f, -3.466f)
                curveTo(-0.065f, 14.548f, -0.065f, 7.543f, 4.219f, 3.238f)
                curveTo(6.297f, 1.15f, 9.061f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.702f, 1.15f, 7.781f, 3.238f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.284f, 4.305f, 4.284f, 11.31f, 0.0f, 15.615f)
                lineToRelative(-3.809f, 3.537f)
                curveToRelative(-1.045f, 1.028f, -2.467f, 1.61f, -3.973f, 1.61f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(-2.136f, 0.0f, -4.144f, 0.836f, -5.654f, 2.354f)
                curveToRelative(-3.124f, 3.138f, -3.124f, 8.245f, 0.0f, 11.383f)
                lineToRelative(3.723f, 3.455f)
                curveToRelative(1.084f, 1.063f, 2.811f, 1.034f, 3.832f, 0.029f)
                lineToRelative(3.797f, -3.525f)
                curveToRelative(3.081f, -3.097f, 3.081f, -8.204f, -0.043f, -11.342f)
                curveToRelative(-1.511f, -1.518f, -3.52f, -2.354f, -5.654f, -2.354f)
                close()
                moveTo(12.0f, 13.828f)
                lineToRelative(3.414f, -3.414f)
                curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0.0f, -2.828f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.781f, -0.781f, -2.047f, -0.781f, -2.828f, 0.0f)
                lineToRelative(-3.414f, 3.414f)
                curveToRelative(-0.75f, 0.75f, -1.172f, 1.768f, -1.172f, 2.828f)
                verticalLineToRelative(1.172f)
                horizontalLineToRelative(1.172f)
                curveToRelative(1.061f, 0.0f, 2.078f, -0.421f, 2.828f, -1.172f)
                close()
            }
        }
        .build()
        return _mapMarkerEdit!!
    }

private var _mapMarkerEdit: ImageVector? = null
