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

public val Icons.Outline.BlockMicrophone: ImageVector
    get() {
        if (_blockMicrophone != null) {
            return _blockMicrophone!!
        }
        _blockMicrophone = Builder(name = "BlockMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.349f, 17.703f)
                curveToRelative(-1.515f, -1.532f, -2.349f, -3.557f, -2.349f, -5.703f)
                verticalLineToRelative(-4.0f)
                curveTo(4.0f, 3.589f, 7.589f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.917f)
                curveToRelative(-0.478f, -2.834f, -2.949f, -5.0f, -5.917f, -5.0f)
                reflectiveCurveToRelative(-5.431f, 2.167f, -5.91f, 5.0f)
                horizontalLineToRelative(2.91f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.912f)
                curveToRelative(0.204f, 1.238f, 0.78f, 2.384f, 1.683f, 3.297f)
                curveToRelative(0.388f, 0.393f, 0.385f, 1.026f, -0.008f, 1.414f)
                curveToRelative(-0.195f, 0.193f, -0.449f, 0.289f, -0.703f, 0.289f)
                curveToRelative(-0.258f, 0.0f, -0.516f, -0.099f, -0.711f, -0.297f)
                close()
                moveTo(9.199f, 21.82f)
                curveToRelative(-4.171f, -0.847f, -7.199f, -4.556f, -7.199f, -8.82f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 5.211f, 3.701f, 9.745f, 8.801f, 10.78f)
                curveToRelative(0.067f, 0.014f, 0.134f, 0.02f, 0.2f, 0.02f)
                curveToRelative(0.466f, 0.0f, 0.883f, -0.327f, 0.979f, -0.801f)
                curveToRelative(0.11f, -0.541f, -0.24f, -1.069f, -0.781f, -1.179f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.134f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.134f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.134f, 7.0f, 7.0f)
                close()
                moveTo(19.753f, 21.167f)
                lineToRelative(-6.92f, -6.92f)
                curveToRelative(-0.524f, 0.791f, -0.833f, 1.736f, -0.833f, 2.753f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.017f, 0.0f, 1.962f, -0.309f, 2.753f, -0.833f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-1.017f, 0.0f, -1.962f, 0.309f, -2.753f, 0.833f)
                lineToRelative(6.919f, 6.92f)
                curveToRelative(0.524f, -0.791f, 0.833f, -1.736f, 0.833f, -2.753f)
                close()
            }
        }
        .build()
        return _blockMicrophone!!
    }

private var _blockMicrophone: ImageVector? = null
