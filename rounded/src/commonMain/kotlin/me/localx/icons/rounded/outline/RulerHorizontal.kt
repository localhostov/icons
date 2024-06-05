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

public val Icons.Outline.RulerHorizontal: ImageVector
    get() {
        if (_rulerHorizontal != null) {
            return _rulerHorizontal!!
        }
        _rulerHorizontal = Builder(name = "RulerHorizontal", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.96f)
                lineTo(4.0f, 6.96f)
                curveTo(1.794f, 6.96f, 0.0f, 8.754f, 0.0f, 10.96f)
                verticalLineToRelative(2.04f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                lineTo(20.0f, 17.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.015f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.015f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.015f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.015f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.015f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.015f)
                horizontalLineToRelative(-1.976f)
                verticalLineToRelative(-2.015f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.015f)
                horizontalLineToRelative(-1.024f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                lineTo(20.0f, 8.96f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.04f)
                close()
            }
        }
        .build()
        return _rulerHorizontal!!
    }

private var _rulerHorizontal: ImageVector? = null
