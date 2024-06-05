package me.localx.icons.rounded.bold

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

public val Icons.Bold.LevelUpAlt: ImageVector
    get() {
        if (_levelUpAlt != null) {
            return _levelUpAlt!!
        }
        _levelUpAlt = Builder(name = "LevelUpAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.087f, 7.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(18.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 8.0f, 24.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.913f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -0.644f, -1.575f)
                lineTo(11.356f, 0.27f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 1.288f, 0.0f)
                lineToRelative(5.087f, 5.155f)
                arcTo(0.924f, 0.924f, 0.0f, false, true, 17.087f, 7.0f)
                close()
            }
        }
        .build()
        return _levelUpAlt!!
    }

private var _levelUpAlt: ImageVector? = null
