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

public val Icons.Outline.RingDiamond: ImageVector
    get() {
        if (_ringDiamond != null) {
            return _ringDiamond!!
        }
        _ringDiamond = Builder(name = "RingDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.902f, 6.48f)
                lineToRelative(2.609f, -3.479f)
                lineToRelative(-3.001f, -3.001f)
                horizontalLineToRelative(-5.019f)
                lineToRelative(-3.001f, 3.001f)
                lineToRelative(2.609f, 3.479f)
                curveToRelative(-3.543f, 1.21f, -6.098f, 4.572f, -6.098f, 8.52f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.948f, -2.555f, -7.31f, -6.098f, -8.52f)
                close()
                moveTo(9.13f, 3.189f)
                lineToRelative(1.189f, -1.189f)
                horizontalLineToRelative(3.362f)
                lineToRelative(1.189f, 1.189f)
                lineToRelative(-2.131f, 2.842f)
                curveToRelative(-0.244f, -0.02f, -0.49f, -0.031f, -0.739f, -0.031f)
                reflectiveCurveToRelative(-0.495f, 0.011f, -0.739f, 0.031f)
                lineToRelative(-2.131f, -2.842f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _ringDiamond!!
    }

private var _ringDiamond: ImageVector? = null
