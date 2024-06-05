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

public val Icons.Outline.Effect: ImageVector
    get() {
        if (_effect != null) {
            return _effect!!
        }
        _effect = Builder(name = "Effect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 16.0f)
                curveToRelative(-0.016f, 0.0f, -0.031f, 0.005f, -0.047f, 0.005f)
                lineTo(15.697f, 2.0f)
                horizontalLineToRelative(7.303f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 0.0f)
                curveTo(0.448f, 0.0f, 0.0f, 0.447f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 1.999f, -3.0f, 3.858f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(1.2f, 0.0f, 2.266f, -0.542f, 3.0f, -1.382f)
                curveToRelative(0.734f, 0.84f, 1.8f, 1.382f, 3.0f, 1.382f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.859f, -1.28f, -3.411f, -3.0f, -3.858f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.607f)
                lineToRelative(4.419f, 14.542f)
                curveToRelative(-1.204f, 0.69f, -2.026f, 1.973f, -2.026f, 3.458f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(4.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(9.0f, 16.142f)
                curveToRelative(-0.79f, 0.205f, -1.479f, 0.643f, -2.0f, 1.24f)
                curveToRelative(-0.521f, -0.597f, -1.21f, -1.035f, -2.0f, -1.24f)
                lineTo(5.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(14.142f)
                close()
                moveTo(20.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _effect!!
    }

private var _effect: ImageVector? = null
