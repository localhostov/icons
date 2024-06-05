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

public val Icons.Bold.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 19.0f)
                curveToRelative(-0.747f, 0.0f, -2.22f, -2.251f, -2.465f, -9.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 7.0f)
                lineTo(16.582f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 7.418f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.965f, 10.0f)
                curveTo(7.72f, 16.749f, 6.247f, 19.0f, 5.5f, 19.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 2.0f, 22.5f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.5f, 19.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(10.967f, 10.0f)
                horizontalLineToRelative(2.066f)
                curveToRelative(0.113f, 3.3f, 0.537f, 6.672f, 1.608f, 9.0f)
                lineTo(9.359f, 19.0f)
                curveTo(10.43f, 16.672f, 10.854f, 13.3f, 10.967f, 10.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null
