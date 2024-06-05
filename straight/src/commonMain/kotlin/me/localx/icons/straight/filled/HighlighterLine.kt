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

public val Icons.Filled.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.01f, 11.34f)
                verticalLineToRelative(7.23f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(7.23f)
                lineTo(2.01f, 11.34f)
                close()
                moveTo(21.24f, 7.65f)
                lineToRelative(-9.23f, 10.86f)
                lineTo(3.5f, 10.01f)
                lineTo(14.35f, 0.76f)
                curveToRelative(1.19f, -1.06f, 2.99f, -1.0f, 4.12f, 0.12f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(1.12f, 1.12f, 1.18f, 2.93f, 0.12f, 4.12f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
