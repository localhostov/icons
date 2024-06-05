package me.localx.icons.straight.bold

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

public val Icons.Bold.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.84f, 19.0f)
                lineToRelative(9.3f, -10.81f)
                curveToRelative(1.2f, -1.34f, 1.14f, -3.39f, -0.13f, -4.67f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-1.27f, -1.27f, -3.31f, -1.33f, -4.66f, -0.14f)
                lineTo(3.0f, 10.16f)
                verticalLineToRelative(6.72f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.06f, -2.06f)
                horizontalLineToRelative(6.72f)
                close()
                moveTo(15.79f, 3.12f)
                lineToRelative(0.02f, -0.02f)
                curveToRelative(0.16f, -0.14f, 0.4f, -0.14f, 0.55f, 0.02f)
                lineToRelative(2.53f, 2.53f)
                curveToRelative(0.15f, 0.15f, 0.16f, 0.39f, 0.0f, 0.57f)
                lineTo(10.77f, 15.65f)
                lineToRelative(-4.41f, -4.41f)
                lineTo(15.79f, 3.12f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
