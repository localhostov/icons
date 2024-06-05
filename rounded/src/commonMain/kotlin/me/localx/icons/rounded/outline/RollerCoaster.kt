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

public val Icons.Outline.RollerCoaster: ImageVector
    get() {
        if (_rollerCoaster != null) {
            return _rollerCoaster!!
        }
        _rollerCoaster = Builder(name = "RollerCoaster", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.139f, 0.0f, -2.223f, -0.239f, -3.204f, -0.67f)
                curveToRelative(1.97f, -1.828f, 3.204f, -4.438f, 3.204f, -7.33f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.893f, 1.234f, 5.502f, 3.204f, 7.33f)
                curveToRelative(-0.981f, 0.431f, -2.065f, 0.67f, -3.204f, 0.67f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                lineTo(1.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(3.0f, 10.993f)
                curveToRelative(0.569f, 0.758f, 1.243f, 1.432f, 2.0f, 2.002f)
                verticalLineToRelative(10.005f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(7.0f, 14.164f)
                curveToRelative(0.635f, 0.278f, 1.304f, 0.493f, 2.0f, 0.635f)
                verticalLineToRelative(8.201f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(11.0f, 15.0f)
                curveToRelative(0.685f, 0.0f, 1.354f, -0.069f, 2.0f, -0.201f)
                verticalLineToRelative(8.201f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(15.0f, 14.165f)
                curveToRelative(0.344f, -0.151f, 0.678f, -0.32f, 1.0f, -0.507f)
                curveToRelative(0.322f, 0.187f, 0.656f, 0.356f, 1.0f, 0.507f)
                verticalLineToRelative(8.835f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(19.0f, 14.799f)
                curveToRelative(0.646f, 0.132f, 1.315f, 0.201f, 2.0f, 0.201f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(23.0f, 14.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(16.0f, 11.241f)
                curveToRelative(-1.828f, -1.468f, -3.0f, -3.721f, -3.0f, -6.241f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.521f, -1.172f, 4.773f, -3.0f, 6.241f)
                close()
            }
        }
        .build()
        return _rollerCoaster!!
    }

private var _rollerCoaster: ImageVector? = null
