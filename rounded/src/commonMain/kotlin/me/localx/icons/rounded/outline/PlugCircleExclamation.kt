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

public val Icons.Outline.PlugCircleExclamation: ImageVector
    get() {
        if (_plugCircleExclamation != null) {
            return _plugCircleExclamation!!
        }
        _plugCircleExclamation = Builder(name = "PlugCircleExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.922f)
                verticalLineToRelative(4.078f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.078f)
                curveToRelative(-3.417f, -0.479f, -6.0f, -3.458f, -6.0f, -6.922f)
                verticalLineToRelative(-4.0f)
                curveTo(0.448f, 8.0f, 0.0f, 7.553f, 0.0f, 7.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.475f, 1.844f, 4.603f, 4.289f, 4.95f)
                curveToRelative(0.975f, 0.139f, 1.711f, 0.986f, 1.711f, 1.972f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(17.0f, 17.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _plugCircleExclamation!!
    }

private var _plugCircleExclamation: ImageVector? = null
