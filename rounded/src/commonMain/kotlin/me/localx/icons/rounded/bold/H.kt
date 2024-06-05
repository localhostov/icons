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

public val Icons.Bold.H: ImageVector
    get() {
        if (_h != null) {
            return _h!!
        }
        _h = Builder(name = "H", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.5f)
                curveToRelative(-0.033f, -1.972f, -2.967f, -1.971f, -3.0f, 0.0f)
                verticalLineTo(22.5f)
                curveToRelative(0.033f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _h!!
    }

private var _h: ImageVector? = null
