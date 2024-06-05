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

public val Icons.Filled.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.031f, 12.0f)
                lineTo(10.207f, 24.0f)
                lineTo(6.177f, 24.0f)
                lineTo(14.943f, 8.239f)
                close()
                moveTo(18.168f, 14.046f)
                lineTo(12.508f, 24.0f)
                lineTo(16.7f, 24.0f)
                lineToRelative(3.548f, -6.209f)
                close()
                moveTo(21.385f, 19.837f)
                lineTo(19.006f, 24.0f)
                lineTo(23.7f, 24.0f)
                close()
                moveTo(12.542f, 3.916f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.084f, 0.0f)
                lineTo(0.3f, 24.0f)
                lineTo(3.889f, 24.0f)
                lineTo(13.8f, 6.18f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
