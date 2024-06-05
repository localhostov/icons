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

public val Icons.Filled.ShirtLongSleeve: ImageVector
    get() {
        if (_shirtLongSleeve != null) {
            return _shirtLongSleeve!!
        }
        _shirtLongSleeve = Builder(name = "ShirtLongSleeve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(20.815f, 1.195f)
                curveToRelative(-1.226f, -0.659f, -2.509f, -1.031f, -3.82f, -1.144f)
                curveToRelative(-0.028f, 2.733f, -2.255f, 4.949f, -4.995f, 4.949f)
                reflectiveCurveTo(7.033f, 2.784f, 7.005f, 0.051f)
                curveToRelative(-1.311f, 0.113f, -2.594f, 0.486f, -3.82f, 1.144f)
                curveTo(1.221f, 2.25f, 0.0f, 4.335f, 0.0f, 6.636f)
                verticalLineToRelative(14.388f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-13.024f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 6.636f)
                curveToRelative(0.0f, -2.301f, -1.221f, -4.386f, -3.185f, -5.44f)
                close()
            }
        }
        .build()
        return _shirtLongSleeve!!
    }

private var _shirtLongSleeve: ImageVector? = null
