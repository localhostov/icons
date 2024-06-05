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

public val Icons.Bold.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.397f, 15.322f)
                lineToRelative(2.549f, 2.549f)
                lineToRelative(-0.678f, 3.393f)
                lineTo(0.013f, 23.988f)
                lineToRelative(2.719f, -12.233f)
                lineToRelative(3.353f, -0.745f)
                lineToRelative(2.514f, 2.514f)
                lineToRelative(-3.354f, 0.745f)
                lineToRelative(-0.885f, 3.985f)
                lineToRelative(2.51f, -2.51f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.466f, 2.466f)
                lineToRelative(3.891f, -0.865f)
                lineToRelative(0.688f, -3.438f)
                close()
                moveTo(23.998f, 21.877f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.002f, 2.123f)
                lineTo(2.123f, 0.002f)
                lineToRelative(8.032f, 8.032f)
                lineToRelative(6.859f, -6.828f)
                curveToRelative(1.59f, -1.59f, 4.183f, -1.591f, 5.776f, 0.002f)
                curveToRelative(1.593f, 1.594f, 1.593f, 4.186f, 0.0f, 5.778f)
                lineToRelative(-6.857f, 6.826f)
                lineToRelative(8.064f, 8.064f)
                close()
                moveTo(12.277f, 10.156f)
                lineToRelative(1.536f, 1.536f)
                lineToRelative(6.859f, -6.828f)
                curveToRelative(0.421f, -0.421f, 0.421f, -1.11f, -0.002f, -1.534f)
                curveToRelative(-0.425f, -0.425f, -1.113f, -0.422f, -1.536f, 0.0f)
                lineToRelative(-6.857f, 6.826f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null
