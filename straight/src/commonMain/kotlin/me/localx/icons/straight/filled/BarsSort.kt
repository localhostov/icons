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

public val Icons.Filled.BarsSort: ImageVector
    get() {
        if (_barsSort != null) {
            return _barsSort!!
        }
        _barsSort = Builder(name = "BarsSort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                lineTo(0.0f, 2.0f)
                lineTo(24.0f, 2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 20.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 11.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _barsSort!!
    }

private var _barsSort: ImageVector? = null
