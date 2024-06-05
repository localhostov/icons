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

public val Icons.Bold.J: ImageVector
    get() {
        if (_j != null) {
            return _j!!
        }
        _j = Builder(name = "J", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 24.0f)
                horizontalLineTo(7.5f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineTo(1.5f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                verticalLineTo(18.5f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _j!!
    }

private var _j: ImageVector? = null
