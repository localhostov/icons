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

public val Icons.Outline.HoneyPot: ImageVector
    get() {
        if (_honeyPot != null) {
            return _honeyPot!!
        }
        _honeyPot = Builder(name = "HoneyPot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.634f, 2.0f)
                horizontalLineToRelative(1.366f)
                lineTo(23.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.366f)
                curveTo(0.895f, 4.276f, 0.0f, 7.188f, 0.0f, 9.905f)
                curveToRelative(0.0f, 4.153f, 2.699f, 9.858f, 5.374f, 13.669f)
                lineToRelative(0.298f, 0.426f)
                horizontalLineToRelative(12.655f)
                lineToRelative(0.298f, -0.426f)
                curveToRelative(2.675f, -3.812f, 5.374f, -9.517f, 5.374f, -13.669f)
                curveToRelative(0.0f, -2.717f, -0.895f, -5.629f, -2.366f, -7.905f)
                close()
                moveTo(17.282f, 22.0f)
                lineTo(6.718f, 22.0f)
                curveToRelative(-2.395f, -3.538f, -4.718f, -8.524f, -4.718f, -12.095f)
                curveToRelative(0.0f, -2.772f, 1.133f, -5.889f, 2.85f, -7.905f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 3.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.65f)
                curveToRelative(1.717f, 2.016f, 2.85f, 5.132f, 2.85f, 7.905f)
                curveToRelative(0.0f, 3.571f, -2.323f, 8.557f, -4.718f, 12.095f)
                close()
            }
        }
        .build()
        return _honeyPot!!
    }

private var _honeyPot: ImageVector? = null
