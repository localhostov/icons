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

public val Icons.Outline.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 24.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 4.442f, -9.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -4.442f, -9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, -4.425f, 9.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, 4.425f, 9.0f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.774f, -2.5f, -6.552f, -4.592f, -8.217f)
                lineToRelative(-0.984f, -0.783f)
                lineToRelative(0.984f, -0.783f)
                curveToRelative(2.092f, -1.665f, 4.592f, -4.443f, 4.592f, -8.217f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                curveToRelative(0.0f, 3.774f, 2.508f, 6.551f, 4.612f, 8.216f)
                lineToRelative(0.988f, 0.784f)
                lineToRelative(-0.991f, 0.784f)
                curveToRelative(-2.101f, 1.665f, -4.609f, 4.442f, -4.609f, 8.216f)
                close()
                moveTo(12.018f, 15.982f)
                arcToRelative(10.065f, 10.065f, 0.0f, false, true, 1.943f, 2.018f)
                horizontalLineToRelative(-3.893f)
                moveToRelative(1.946f, -4.487f)
                curveToRelative(-1.637f, 1.073f, -4.429f, 3.33f, -4.934f, 6.487f)
                horizontalLineToRelative(9.842f)
                curveToRelative(-0.5f, -3.184f, -3.288f, -5.43f, -4.908f, -6.487f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
