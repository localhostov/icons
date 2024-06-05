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

public val Icons.Bold.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, -3.0f, 0.211f)
                verticalLineToRelative(-3.189f)
                lineToRelative(5.0f, -2.522f)
                lineToRelative(-6.0f, -4.366f)
                arcToRelative(1.383f, 1.383f, 0.0f, false, false, -2.0f, 1.393f)
                verticalLineToRelative(9.357f)
                curveToRelative(-3.639f, 1.175f, -6.0f, 3.416f, -6.0f, 6.116f)
                curveToRelative(0.0f, 3.991f, 5.159f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.009f, 12.0f, -7.0f)
                reflectiveCurveToRelative(-5.159f, -7.0f, -12.0f, -7.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-5.151f, 0.0f, -9.0f, -2.112f, -9.0f, -4.0f)
                curveToRelative(0.0f, -1.025f, 1.14f, -2.113f, 3.0f, -2.9f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.746f)
                arcToRelative(17.713f, 17.713f, 0.0f, false, true, 3.0f, -0.254f)
                curveToRelative(5.151f, 0.0f, 9.0f, 2.112f, 9.0f, 4.0f)
                reflectiveCurveToRelative(-3.849f, 4.0f, -9.0f, 4.0f)
                close()
                moveTo(17.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
