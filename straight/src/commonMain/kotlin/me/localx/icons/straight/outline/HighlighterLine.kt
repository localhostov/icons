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

public val Icons.Outline.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.45f, 20.0f)
                lineTo(21.24f, 7.66f)
                curveToRelative(1.06f, -1.19f, 1.01f, -3.0f, -0.12f, -4.12f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.12f, -1.12f, -2.93f, -1.18f, -4.11f, -0.12f)
                lineTo(2.0f, 11.55f)
                verticalLineToRelative(7.04f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineToRelative(7.04f)
                close()
                moveTo(4.0f, 13.35f)
                lineToRelative(4.65f, 4.65f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-4.65f)
                close()
                moveTo(15.67f, 2.26f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.4f, -0.36f, 1.0f, -0.34f, 1.37f, 0.03f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.38f, 0.38f, 0.39f, 0.98f, 0.03f, 1.38f)
                lineToRelative(-9.29f, 10.64f)
                lineToRelative(-5.42f, -5.42f)
                lineTo(15.67f, 2.26f)
                close()
                moveTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
