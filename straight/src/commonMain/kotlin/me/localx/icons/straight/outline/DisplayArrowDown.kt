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

public val Icons.Outline.DisplayArrowDown: ImageVector
    get() {
        if (_displayArrowDown != null) {
            return _displayArrowDown!!
        }
        _displayArrowDown = Builder(name = "DisplayArrowDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.021f, 6.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.021f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.021f, 19.0f)
                lineTo(0.021f, 6.0f)
                curveTo(0.021f, 4.346f, 1.367f, 3.0f, 3.021f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.021f, 5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.021f, 6.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(8.728f, 6.707f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(3.293f, -3.293f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.293f, 2.293f)
                lineTo(13.021f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                lineToRelative(-2.293f, -2.293f)
                close()
            }
        }
        .build()
        return _displayArrowDown!!
    }

private var _displayArrowDown: ImageVector? = null
