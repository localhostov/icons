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

public val Icons.Outline.Pickaxe: ImageVector
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
                curveToRelative(-0.684f, -3.648f, -2.627f, -7.284f, -5.285f, -10.271f)
                lineTo(1.489f, 23.925f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(15.287f, 7.299f)
                curveToRelative(-2.99f, -2.665f, -6.633f, -4.614f, -10.287f, -5.299f)
                verticalLineTo(0.0f)
                curveTo(10.698f, 0.0f, 15.157f, 1.49f, 18.331f, 4.255f)
                lineToRelative(1.712f, -1.712f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.713f, 1.713f)
                curveToRelative(2.756f, 3.173f, 4.24f, 7.626f, 4.24f, 13.315f)
                horizontalLineToRelative(-1.999f)
                close()
            }
        }
        .build()
        return _pickaxe!!
    }

private var _pickaxe: ImageVector? = null
