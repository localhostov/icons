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

public val Icons.Outline.ManatSign: ImageVector
    get() {
        if (_manatSign != null) {
            return _manatSign!!
        }
        _manatSign = Builder(name = "ManatSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -4.07f, -3.06f, -7.44f, -7.0f, -7.93f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.07f)
                curveToRelative(-3.94f, 0.49f, -7.0f, 3.86f, -7.0f, 7.93f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 7.82f, 5.95f, 3.55f, 11.0f, 3.05f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(3.05f)
                curveToRelative(5.05f, 0.5f, 9.0f, 4.77f, 9.0f, 9.95f)
                close()
            }
        }
        .build()
        return _manatSign!!
    }

private var _manatSign: ImageVector? = null
