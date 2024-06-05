package me.localx.icons.straight.outline

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
                moveToRelative(10.0f, 9.025f)
                curveToRelative(0.417f, 0.234f, 1.287f, 1.353f, 1.904f, 2.461f)
                lineToRelative(0.286f, 0.514f)
                horizontalLineToRelative(1.81f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(17.309f, 0.0f, 14.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(1.81f)
                lineToRelative(0.286f, -0.514f)
                curveToRelative(0.617f, -1.108f, 1.487f, -2.227f, 1.904f, -2.461f)
                close()
                moveTo(6.646f, 10.0f)
                horizontalLineToRelative(-0.646f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveTo(3.794f, 2.0f, 6.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-0.646f)
                curveToRelative(-0.784f, -1.303f, -2.056f, -3.0f, -3.354f, -3.0f)
                reflectiveCurveToRelative(-2.57f, 1.697f, -3.354f, 3.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _maskSnorkel!!
    }

private var _maskSnorkel: ImageVector? = null
