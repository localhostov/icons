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

public val Icons.Outline.FlagAlt: ImageVector
    get() {
        if (_flagAlt != null) {
            return _flagAlt!!
        }
        _flagAlt = Builder(name = "FlagAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.903f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 15.0f)
                lineTo(23.903f, 15.0f)
                lineToRelative(-5.651f, -7.5f)
                lineTo(23.903f, 0.0f)
                close()
                moveTo(19.892f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(19.892f, 2.0f)
                lineToRelative(-4.144f, 5.5f)
                lineToRelative(4.144f, 5.5f)
                close()
            }
        }
        .build()
        return _flagAlt!!
    }

private var _flagAlt: ImageVector? = null
