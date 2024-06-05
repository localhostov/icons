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

public val Icons.Outline.MaskSnorkel: ImageVector
    get() {
        if (_maskSnorkel != null) {
            return _maskSnorkel!!
        }
        _maskSnorkel = Builder(name = "MaskSnorkel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 9.03f)
                curveToRelative(0.165f, 0.103f, 0.605f, 0.449f, 1.337f, 1.542f)
                curveToRelative(0.6f, 0.894f, 1.596f, 1.428f, 2.663f, 1.428f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(17.309f, 0.0f, 14.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.067f, 0.0f, 2.062f, -0.534f, 2.663f, -1.429f)
                curveToRelative(0.732f, -1.092f, 1.172f, -1.438f, 1.337f, -1.541f)
                close()
                moveTo(7.002f, 9.457f)
                curveToRelative(-0.229f, 0.34f, -0.603f, 0.543f, -1.002f, 0.543f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveTo(3.794f, 2.0f, 6.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-0.399f, 0.0f, -0.774f, -0.203f, -1.002f, -0.542f)
                curveToRelative(-1.124f, -1.677f, -2.077f, -2.458f, -2.998f, -2.458f)
                reflectiveCurveToRelative(-1.875f, 0.781f, -2.998f, 2.457f)
                close()
                moveTo(24.0f, 1.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(22.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _maskSnorkel!!
    }

private var _maskSnorkel: ImageVector? = null
