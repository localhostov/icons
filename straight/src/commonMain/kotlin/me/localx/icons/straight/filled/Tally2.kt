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

public val Icons.Filled.Tally2: ImageVector
    get() {
        if (_tally2 != null) {
            return _tally2!!
        }
        _tally2 = Builder(name = "Tally2", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _tally2!!
    }

private var _tally2: ImageVector? = null
