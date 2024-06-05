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

public val Icons.Bold.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.791f, 3.836f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -1.582f, 0.0f)
                lineTo(0.0f, 24.015f)
                lineTo(24.0f, 24.015f)
                close()
                moveTo(16.053f, 15.884f)
                lineTo(13.136f, 21.015f)
                lineTo(10.692f, 21.015f)
                lineTo(14.8f, 13.628f)
                close()
                moveTo(12.0f, 8.589f)
                lineToRelative(1.085f, 1.952f)
                lineTo(7.26f, 21.015f)
                lineTo(5.1f, 21.015f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
