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

public val Icons.Outline.NoteMedical: ImageVector
    get() {
        if (_noteMedical != null) {
            return _noteMedical!!
        }
        _noteMedical = Builder(name = "NoteMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 13.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.039f, 5.0f)
                verticalLineToRelative(9.929f)
                curveToRelative(0.0f, 1.602f, -0.624f, 3.108f, -1.757f, 4.243f)
                lineToRelative(-3.072f, 3.07f)
                curveToRelative(-1.132f, 1.134f, -2.639f, 1.758f, -4.243f, 1.758f)
                lineTo(5.039f, 24.0f)
                curveTo(2.282f, 24.0f, 0.039f, 21.757f, 0.039f, 19.0f)
                lineTo(0.039f, 5.0f)
                curveTo(0.039f, 2.243f, 2.282f, 0.0f, 5.039f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(15.039f, 21.999f)
                verticalLineToRelative(-3.999f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.999f)
                curveToRelative(0.0f, -0.024f, 0.0f, -10.0f, 0.0f, -10.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.039f, 2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.0f, 9.976f, 0.0f, 10.0f, 0.0f)
                close()
                moveTo(20.868f, 17.758f)
                curveToRelative(0.231f, -0.231f, 0.43f, -0.486f, 0.595f, -0.758f)
                horizontalLineToRelative(-3.424f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.424f)
                curveToRelative(0.272f, -0.165f, 0.526f, -0.364f, 0.757f, -0.595f)
                lineToRelative(3.072f, -3.07f)
                close()
            }
        }
        .build()
        return _noteMedical!!
    }

private var _noteMedical: ImageVector? = null
