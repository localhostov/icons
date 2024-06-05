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

public val Icons.Outline.BarsFilter: ImageVector
    get() {
        if (_barsFilter != null) {
            return _barsFilter!!
        }
        _barsFilter = Builder(name = "BarsFilter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(24.0f)
                close()
                moveTo(8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _barsFilter!!
    }

private var _barsFilter: ImageVector? = null
