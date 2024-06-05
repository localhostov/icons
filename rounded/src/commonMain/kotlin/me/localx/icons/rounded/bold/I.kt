package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.I: ImageVector
    get() {
        if (_i != null) {
            return _i!!
        }
        _i = Builder(name = "I", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.967f, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _i!!
    }

private var _i: ImageVector? = null
