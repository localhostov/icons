package me.localx.icons.rounded.outline

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

public val Icons.Outline.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.555f, 13.662f)
                lineToRelative(-1.9f, -6.836f)
                arcTo(9.321f, 9.321f, 0.0f, false, false, 2.576f, 7.3f)
                lineTo(1.105f, 13.915f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.986f, 20.0f)
                lineTo(7.1f, 20.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 9.8f, 0.0f)
                horizontalLineToRelative(0.838f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.818f, -6.338f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.816f, -2.0f)
                horizontalLineToRelative(5.632f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(20.126f, 16.815f)
                arcTo(2.977f, 2.977f, 0.0f, false, true, 17.737f, 18.0f)
                lineTo(5.986f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.928f, -3.651f)
                lineToRelative(1.47f, -6.616f)
                arcToRelative(7.321f, 7.321f, 0.0f, false, true, 14.2f, -0.372f)
                lineToRelative(1.9f, 6.836f)
                arcTo(2.977f, 2.977f, 0.0f, false, true, 20.126f, 16.815f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
