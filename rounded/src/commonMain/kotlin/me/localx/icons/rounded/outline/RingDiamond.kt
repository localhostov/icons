package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(14.932f, 6.5f)
                lineToRelative(1.668f, -2.11f)
                curveToRelative(0.594f, -0.791f, 0.514f, -1.915f, -0.216f, -2.644f)
                lineToRelative(-1.612f, -1.482f)
                curveToRelative(-0.185f, -0.169f, -0.426f, -0.264f, -0.677f, -0.264f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(-0.25f, 0.0f, -0.492f, 0.094f, -0.677f, 0.264f)
                lineToRelative(-1.642f, 1.511f)
                curveToRelative(-0.7f, 0.7f, -0.779f, 1.824f, -0.17f, 2.634f)
                lineToRelative(1.653f, 2.091f)
                curveToRelative(-3.526f, 1.22f, -6.068f, 4.565f, -6.068f, 8.5f)
                curveToRelative(0.0f, 4.962f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                curveToRelative(0.0f, -3.935f, -2.543f, -7.28f, -6.068f, -8.5f)
                close()
                moveTo(8.97f, 3.218f)
                lineToRelative(1.325f, -1.218f)
                horizontalLineToRelative(3.418f)
                lineToRelative(1.303f, 1.169f)
                lineToRelative(-2.268f, 2.869f)
                curveToRelative(-0.247f, -0.02f, -0.495f, -0.038f, -0.747f, -0.038f)
                curveToRelative(-0.254f, 0.0f, -0.504f, 0.017f, -0.753f, 0.038f)
                lineToRelative(-2.277f, -2.82f)
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
