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

public val Icons.Bold.ManatSign: ImageVector
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
                horizontalLineToRelative(-3.0f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -3.34f, -2.36f, -6.15f, -5.5f, -6.84f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.16f)
                curveToRelative(-3.14f, 0.69f, -5.5f, 3.49f, -5.5f, 6.84f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 8.0f, 5.69f, 3.84f, 10.5f, 3.11f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.11f)
                curveToRelative(4.81f, 0.73f, 8.5f, 4.88f, 8.5f, 9.89f)
                close()
            }
        }
        .build()
        return _manatSign!!
    }

private var _manatSign: ImageVector? = null
