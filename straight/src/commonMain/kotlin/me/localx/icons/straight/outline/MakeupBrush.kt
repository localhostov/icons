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

public val Icons.Outline.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.475f)
                lineToRelative(-3.475f, -3.475f)
                lineToRelative(-15.091f, 13.167f)
                lineToRelative(-5.434f, 2.801f)
                verticalLineToRelative(1.632f)
                arcToRelative(6.407f, 6.407f, 0.0f, false, false, 6.4f, 6.4f)
                horizontalLineToRelative(1.646f)
                lineToRelative(2.788f, -5.436f)
                close()
                moveTo(9.95f, 16.536f)
                lineTo(7.464f, 14.05f)
                lineTo(9.264f, 12.476f)
                lineTo(11.52f, 14.732f)
                close()
                moveTo(21.265f, 3.568f)
                lineTo(12.842f, 13.222f)
                lineTo(10.778f, 11.158f)
                lineTo(20.432f, 2.735f)
                close()
                moveTo(6.824f, 22.0f)
                horizontalLineToRelative(-0.424f)
                arcToRelative(4.405f, 4.405f, 0.0f, false, true, -4.4f, -4.4f)
                verticalLineToRelative(-0.413f)
                lineToRelative(3.809f, -1.963f)
                lineToRelative(2.969f, 2.967f)
                close()
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
