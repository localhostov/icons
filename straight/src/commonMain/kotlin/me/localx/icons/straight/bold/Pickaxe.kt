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

public val Icons.Bold.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.985f, 18.985f)
                curveToRelative(-0.655f, -3.495f, -2.459f, -6.988f, -4.947f, -9.903f)
                lineTo(2.147f, 23.974f)
                lineTo(0.026f, 21.853f)
                lineTo(14.918f, 6.961f)
                curveToRelative(-2.917f, -2.495f, -6.417f, -4.304f, -9.918f, -4.961f)
                verticalLineTo(0.0f)
                curveTo(10.472f, 0.0f, 14.817f, 1.359f, 17.964f, 3.915f)
                lineToRelative(1.725f, -1.725f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.727f, 1.727f)
                curveToRelative(2.548f, 3.146f, 3.901f, 7.485f, 3.901f, 12.948f)
                horizontalLineToRelative(-1.999f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
