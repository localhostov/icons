package me.localx.icons.straight.filled

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

public val Icons.Filled.TrashClock: ImageVector
    get() {
        if (_trashClock != null) {
            return _trashClock!!
        }
        _trashClock = Builder(name = "TrashClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.308f, 0.0f, -6.0f, 2.692f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.692f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.692f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.692f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.293f, 20.707f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(10.0f, 18.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.598f, 0.0f, 1.18f, 0.066f, 1.741f, 0.19f)
                lineToRelative(0.558f, -4.19f)
                horizontalLineToRelative(1.701f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.643f)
                lineToRelative(1.704f, 15.331f)
                curveToRelative(0.169f, 1.521f, 1.45f, 2.669f, 2.981f, 2.669f)
                horizontalLineToRelative(6.381f)
                curveToRelative(-1.661f, -1.466f, -2.709f, -3.61f, -2.709f, -6.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _trashClock!!
    }

private var _trashClock: ImageVector? = null
