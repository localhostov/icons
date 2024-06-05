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

public val Icons.Bold.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(6.486f, 0.0f, 2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 7.338f, 8.805f, 13.178f, 9.179f, 13.422f)
                lineToRelative(0.821f, 0.537f)
                lineToRelative(0.821f, -0.537f)
                curveToRelative(0.375f, -0.245f, 9.179f, -6.084f, 9.179f, -13.422f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 20.322f)
                curveToRelative(-2.008f, -1.513f, -7.0f, -5.736f, -7.0f, -10.322f)
                curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 4.586f, -4.992f, 8.809f, -7.0f, 10.322f)
                close()
                moveTo(14.012f, 9.012f)
                curveToRelative(1.24f, -1.24f, 3.968f, -0.992f, 3.968f, -0.992f)
                curveToRelative(0.0f, 0.0f, 0.248f, 2.728f, -0.992f, 3.968f)
                reflectiveCurveToRelative(-3.968f, 0.992f, -3.968f, 0.992f)
                curveToRelative(0.0f, 0.0f, -0.248f, -2.728f, 0.992f, -3.968f)
                close()
                moveTo(9.988f, 9.012f)
                curveToRelative(1.24f, 1.24f, 0.992f, 3.968f, 0.992f, 3.968f)
                curveToRelative(0.0f, 0.0f, -2.728f, 0.248f, -3.968f, -0.992f)
                reflectiveCurveToRelative(-0.992f, -3.968f, -0.992f, -3.968f)
                curveToRelative(0.0f, 0.0f, 2.728f, -0.248f, 3.968f, 0.992f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
