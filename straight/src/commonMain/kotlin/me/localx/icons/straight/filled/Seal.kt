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

public val Icons.Filled.Seal: ImageVector
    get() {
        if (_seal != null) {
            return _seal!!
        }
        _seal = Builder(name = "Seal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.021f)
                lineToRelative(-3.521f, -3.521f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-4.979f)
                lineTo(-0.021f, 12.0f)
                lineToRelative(3.521f, -3.521f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(4.979f)
                lineTo(12.0f, -0.021f)
                lineToRelative(3.521f, 3.521f)
                horizontalLineToRelative(4.979f)
                verticalLineToRelative(4.979f)
                lineToRelative(3.521f, 3.521f)
                lineToRelative(-3.521f, 3.521f)
                verticalLineToRelative(4.979f)
                horizontalLineToRelative(-4.979f)
                lineToRelative(-3.521f, 3.521f)
                close()
            }
        }
        .build()
        return _seal!!
    }

private var _seal: ImageVector? = null
