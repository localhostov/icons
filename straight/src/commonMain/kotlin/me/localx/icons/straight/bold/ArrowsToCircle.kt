package me.localx.icons.straight.bold

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

public val Icons.Bold.ArrowsToCircle: ImageVector
    get() {
        if (_arrowsToCircle != null) {
            return _arrowsToCircle!!
        }
        _arrowsToCircle = Builder(name = "ArrowsToCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(15.167f, 10.0f)
                horizontalLineToRelative(5.833f)
                lineToRelative(-2.439f, -2.439f)
                lineToRelative(5.404f, -5.404f)
                lineTo(21.843f, 0.036f)
                lineToRelative(-5.404f, 5.404f)
                lineToRelative(-2.439f, -2.439f)
                verticalLineToRelative(5.833f)
                curveToRelative(0.0f, 0.644f, 0.522f, 1.167f, 1.167f, 1.167f)
                close()
                moveTo(2.157f, 0.036f)
                lineTo(0.036f, 2.157f)
                lineTo(5.439f, 7.561f)
                lineToRelative(-2.439f, 2.439f)
                horizontalLineToRelative(5.833f)
                curveToRelative(0.644f, 0.0f, 1.167f, -0.522f, 1.167f, -1.167f)
                lineTo(10.0f, 3.0f)
                lineToRelative(-2.439f, 2.439f)
                lineTo(2.157f, 0.036f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-5.833f)
                curveToRelative(-0.644f, 0.0f, -1.167f, 0.522f, -1.167f, 1.167f)
                verticalLineToRelative(5.833f)
                lineToRelative(2.439f, -2.439f)
                lineToRelative(5.404f, 5.404f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-5.404f, -5.404f)
                lineToRelative(2.44f, -2.44f)
                close()
                moveTo(8.833f, 14.0f)
                lineTo(3.0f, 14.0f)
                lineToRelative(2.44f, 2.44f)
                lineTo(0.036f, 21.844f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(5.404f, -5.404f)
                lineToRelative(2.439f, 2.439f)
                verticalLineToRelative(-5.833f)
                curveToRelative(0.0f, -0.644f, -0.522f, -1.167f, -1.167f, -1.167f)
                close()
            }
        }
        .build()
        return _arrowsToCircle!!
    }

private var _arrowsToCircle: ImageVector? = null
