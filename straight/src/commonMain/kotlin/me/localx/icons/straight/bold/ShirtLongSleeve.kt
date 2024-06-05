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

public val Icons.Bold.ShirtLongSleeve: ImageVector
    get() {
        if (_shirtLongSleeve != null) {
            return _shirtLongSleeve!!
        }
        _shirtLongSleeve = Builder(name = "ShirtLongSleeve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.242f, 2.226f)
                curveToRelative(-1.312f, -1.016f, -3.461f, -2.226f, -6.242f, -2.226f)
                horizontalLineToRelative(-8.0f)
                curveTo(5.217f, 0.0f, 3.069f, 1.211f, 1.757f, 2.227f)
                curveToRelative(-1.117f, 0.865f, -1.757f, 2.167f, -1.757f, 3.57f)
                verticalLineToRelative(15.203f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 5.797f)
                curveToRelative(0.0f, -1.403f, -0.641f, -2.704f, -1.758f, -3.571f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(3.0f, 5.797f)
                curveToRelative(0.0f, -0.469f, 0.217f, -0.906f, 0.595f, -1.198f)
                curveToRelative(0.941f, -0.729f, 2.738f, -1.599f, 4.673f, -1.599f)
                curveToRelative(0.805f, 1.205f, 2.173f, 2.0f, 3.732f, 2.0f)
                reflectiveCurveToRelative(2.927f, -0.795f, 3.732f, -2.0f)
                curveToRelative(1.934f, 0.0f, 3.732f, 0.87f, 4.673f, 1.598f)
                curveToRelative(0.378f, 0.293f, 0.595f, 0.73f, 0.595f, 1.199f)
                verticalLineToRelative(12.203f)
                close()
            }
        }
        .build()
        return _shirtLongSleeve!!
    }

private var _shirtLongSleeve: ImageVector? = null
