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

public val Icons.Filled.Pickaxe: ImageVector
    get() {
        if (_pickaxe != null) {
            return _pickaxe!!
        }
        _pickaxe = Builder(name = "Pickaxe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.984f, 18.985f)
                curveToRelative(0.0f, -5.689f, -1.484f, -10.142f, -4.24f, -13.315f)
                lineToRelative(1.713f, -1.713f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.712f, 1.712f)
                curveTo(15.157f, 1.49f, 10.698f, 0.0f, 5.0f, 0.0f)
                verticalLineToRelative(1.999f)
                curveToRelative(3.654f, 0.685f, 7.297f, 2.634f, 10.287f, 5.299f)
                lineTo(0.075f, 22.511f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(15.211f, -15.211f)
                curveToRelative(2.658f, 2.987f, 4.601f, 6.624f, 5.285f, 10.271f)
                horizontalLineToRelative(1.999f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
