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

public val Icons.Outline.BlockQuote: ImageVector
    get() {
        if (_blockQuote != null) {
            return _blockQuote!!
        }
        _blockQuote = Builder(name = "BlockQuote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(0.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _blockQuote!!
    }

private var _blockQuote: ImageVector? = null
