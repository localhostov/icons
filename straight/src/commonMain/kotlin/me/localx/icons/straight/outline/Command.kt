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

public val Icons.Outline.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = Builder(name = "Command", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 15.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveTo(21.981f, 0.0f, 19.5f, 0.0f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.5f)
                curveTo(9.0f, 2.019f, 6.981f, 0.0f, 4.5f, 0.0f)
                reflectiveCurveTo(0.0f, 2.019f, 0.0f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17.0f, 4.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(4.5f, 7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(7.0f, 19.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(9.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(19.5f, 22.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _command!!
    }

private var _command: ImageVector? = null
