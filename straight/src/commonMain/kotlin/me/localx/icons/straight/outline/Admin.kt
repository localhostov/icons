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

public val Icons.Outline.Admin: ImageVector
    get() {
        if (_admin != null) {
            return _admin!!
        }
        _admin = Builder(name = "Admin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 11.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 22.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(22.038f, 15.743f)
                lineToRelative(-1.091f, 1.677f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-3.401f, -2.162f, -3.401f, -2.162f)
                curveToRelative(0.909f, -1.18f, 1.455f, -2.653f, 1.455f, -4.257f)
                curveToRelative(0.0f, -3.866f, -3.134f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.134f, -7.0f, 7.0f)
                curveToRelative(0.0f, 1.604f, 0.546f, 3.078f, 1.455f, 4.257f)
                lineToRelative(-3.401f, 2.161f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.091f, -1.676f, -1.091f, -1.676f)
                lineToRelative(1.785f, -1.162f)
                curveToRelative(-0.478f, -1.098f, -0.747f, -2.308f, -0.747f, -3.581f)
                curveToRelative(0.0f, -1.451f, 0.353f, -2.819f, 0.966f, -4.034f)
                lineToRelative(-1.732f, -1.127f)
                lineToRelative(1.092f, -1.677f)
                lineToRelative(1.727f, 1.124f)
                curveToRelative(1.452f, -1.762f, 3.561f, -2.961f, 5.947f, -3.226f)
                lineTo(11.002f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.059f)
                curveToRelative(2.387f, 0.265f, 4.495f, 1.464f, 5.947f, 3.226f)
                lineToRelative(1.727f, -1.124f)
                lineToRelative(1.092f, 1.677f)
                lineToRelative(-1.732f, 1.127f)
                curveToRelative(0.613f, 1.215f, 0.966f, 2.583f, 0.966f, 4.034f)
                curveToRelative(0.0f, 1.273f, -0.269f, 2.482f, -0.747f, 3.581f)
                lineToRelative(1.785f, 1.162f)
                close()
            }
        }
        .build()
        return _admin!!
    }

private var _admin: ImageVector? = null
