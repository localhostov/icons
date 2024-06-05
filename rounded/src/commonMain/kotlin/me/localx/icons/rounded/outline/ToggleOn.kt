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

public val Icons.Outline.ToggleOn: ImageVector
    get() {
        if (_toggleOn != null) {
            return _toggleOn!!
        }
        _toggleOn = Builder(name = "ToggleOn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(3.589f, 4.0f, 0.0f, 7.589f, 0.0f, 12.0f)
                reflectiveCurveToRelative(3.589f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _toggleOn!!
    }

private var _toggleOn: ImageVector? = null
