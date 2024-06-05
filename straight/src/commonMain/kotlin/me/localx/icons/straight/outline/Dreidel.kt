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

public val Icons.Outline.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.95f, 1.464f)
                lineTo(22.536f, 0.05f)
                lineTo(15.0f, 7.586f)
                lineTo(10.263f, 2.849f)
                lineTo(0.0f, 13.112f)
                lineTo(0.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(6.888f)
                lineTo(21.151f, 13.737f)
                lineTo(16.414f, 9.0f)
                close()
                moveTo(2.0f, 20.0f)
                lineTo(2.0f, 15.851f)
                arcTo(6.445f, 6.445f, 0.0f, false, false, 5.442f, 17.0f)
                arcToRelative(7.98f, 7.98f, 0.0f, false, false, 1.733f, -0.185f)
                arcTo(7.86f, 7.86f, 0.0f, false, false, 7.0f, 18.5f)
                arcTo(6.646f, 6.646f, 0.0f, false, false, 8.168f, 22.0f)
                lineTo(4.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                close()
                moveTo(10.42f, 21.639f)
                arcTo(5.041f, 5.041f, 0.0f, false, true, 9.0f, 18.5f)
                arcToRelative(4.386f, 4.386f, 0.0f, false, true, 1.128f, -3.214f)
                lineToRelative(2.947f, -2.947f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(8.714f, 13.872f)
                arcTo(4.552f, 4.552f, 0.0f, false, true, 5.442f, 15.0f)
                arcToRelative(4.858f, 4.858f, 0.0f, false, true, -3.085f, -1.417f)
                lineToRelative(7.906f, -7.906f)
                lineToRelative(8.06f, 8.06f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
