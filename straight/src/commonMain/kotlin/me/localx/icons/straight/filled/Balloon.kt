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

public val Icons.Filled.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 9.378f)
                curveTo(22.0f, 4.215f, 17.514f, 0.015f, 12.0f, 0.015f)
                reflectiveCurveTo(2.0f, 4.215f, 2.0f, 9.378f)
                curveToRelative(0.0f, 5.558f, 3.715f, 11.725f, 8.853f, 12.54f)
                curveToRelative(-0.514f, 0.553f, -0.853f, 1.397f, -0.853f, 2.082f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, -0.685f, -0.338f, -1.529f, -0.853f, -2.082f)
                curveToRelative(5.138f, -0.815f, 8.853f, -6.982f, 8.853f, -12.54f)
                close()
                moveTo(14.673f, 15.501f)
                lineToRelative(-1.424f, -1.276f)
                curveToRelative(0.794f, -0.897f, 1.627f, -2.446f, 1.751f, -4.225f)
                horizontalLineToRelative(1.968f)
                curveToRelative(-0.161f, 2.324f, -1.259f, 4.346f, -2.295f, 5.501f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
