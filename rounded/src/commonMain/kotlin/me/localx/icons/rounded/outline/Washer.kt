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

public val Icons.Outline.Washer: ImageVector
    get() {
        if (_washer != null) {
            return _washer!!
        }
        _washer = Builder(name = "Washer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(6.5f, 6.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.0f, 4.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(2.06f, 0.0f, 3.741f, 1.571f, 3.957f, 3.574f)
                curveToRelative(-0.274f, 0.193f, -0.708f, 0.426f, -1.229f, 0.426f)
                curveToRelative(-0.839f, 0.0f, -1.828f, -0.583f, -2.136f, -0.807f)
                curveToRelative(-0.167f, -0.122f, -1.675f, -1.193f, -3.319f, -1.193f)
                curveToRelative(-0.271f, 0.0f, -0.522f, 0.035f, -0.762f, 0.084f)
                curveToRelative(0.681f, -1.235f, 1.981f, -2.084f, 3.489f, -2.084f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.06f, 0.0f, -3.741f, -1.571f, -3.957f, -3.574f)
                curveToRelative(0.274f, -0.193f, 0.708f, -0.426f, 1.229f, -0.426f)
                curveToRelative(0.839f, 0.0f, 1.828f, 0.583f, 2.136f, 0.807f)
                curveToRelative(0.167f, 0.122f, 1.675f, 1.193f, 3.319f, 1.193f)
                curveToRelative(0.271f, 0.0f, 0.522f, -0.035f, 0.762f, -0.084f)
                curveToRelative(-0.681f, 1.235f, -1.981f, 2.084f, -3.489f, 2.084f)
                close()
            }
        }
        .build()
        return _washer!!
    }

private var _washer: ImageVector? = null
