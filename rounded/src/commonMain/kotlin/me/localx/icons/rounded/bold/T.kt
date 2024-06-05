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

public val Icons.Bold.T: ImageVector
    get() {
        if (_t != null) {
            return _t!!
        }
        _t = Builder(name = "T", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                horizontalLineTo(3.5f)
                curveToRelative(-1.972f, 0.034f, -1.971f, 2.966f, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(22.5f)
                curveToRelative(0.034f, 1.972f, 2.966f, 1.971f, 3.0f, 0.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.972f, -0.034f, 1.971f, -2.966f, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _t!!
    }

private var _t: ImageVector? = null
