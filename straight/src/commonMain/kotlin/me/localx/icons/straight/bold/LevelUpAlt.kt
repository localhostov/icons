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
                moveTo(14.0f, 6.0f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 10.5f, 24.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.421f)
                lineTo(11.5f, 0.445f)
                arcToRelative(1.338f, 1.338f, 0.0f, false, true, 1.992f, 0.0f)
                lineTo(18.579f, 6.0f)
                close()
            }
        }
        .build()
        return _levelUpAlt!!
    }

private var _levelUpAlt: ImageVector? = null
