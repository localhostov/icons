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

public val Icons.Outline.Shirt: ImageVector
    get() {
        if (_shirt != null) {
            return _shirt!!
        }
        _shirt = Builder(name = "Shirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.637f, 3.223f)
                lineTo(17.406f, -0.008f)
                lineTo(6.571f, 0.0f)
                lineToRelative(-3.209f, 3.223f)
                lineTo(0.0f, 5.465f)
                verticalLineToRelative(18.535f)
                horizontalLineToRelative(9.172f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 6.535f)
                lineToRelative(1.873f, -1.248f)
                lineToRelative(6.075f, 6.075f)
                lineToRelative(-1.918f, 8.582f)
                lineToRelative(3.971f, 3.971f)
                lineToRelative(3.971f, -3.971f)
                lineToRelative(-1.918f, -8.582f)
                lineToRelative(6.075f, -6.075f)
                lineToRelative(1.873f, 1.248f)
                verticalLineToRelative(15.465f)
                horizontalLineToRelative(-5.172f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(9.172f)
                lineTo(24.002f, 5.465f)
                lineToRelative(-3.363f, -2.242f)
                close()
                moveTo(14.582f, 1.994f)
                lineToRelative(-2.583f, 2.591f)
                lineToRelative(-2.594f, -2.587f)
                lineToRelative(5.178f, -0.004f)
                close()
                moveTo(5.413f, 3.999f)
                lineToRelative(1.577f, -1.583f)
                lineToRelative(3.793f, 3.783f)
                lineToRelative(-1.057f, 2.114f)
                lineTo(5.413f, 3.999f)
                close()
                moveTo(12.0f, 21.086f)
                lineToRelative(-1.779f, -1.779f)
                lineToRelative(1.779f, -7.959f)
                lineToRelative(1.779f, 7.959f)
                lineToRelative(-1.779f, 1.779f)
                close()
                moveTo(14.274f, 8.312f)
                lineToRelative(-1.058f, -2.116f)
                lineToRelative(3.777f, -3.789f)
                lineToRelative(1.593f, 1.592f)
                lineToRelative(-4.312f, 4.312f)
                close()
            }
        }
        .build()
        return _shirt!!
    }

private var _shirt: ImageVector? = null
