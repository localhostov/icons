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

public val Icons.Filled.LevelUp: ImageVector
    get() {
        if (_levelUp != null) {
            return _levelUp!!
        }
        _levelUp = Builder(name = "LevelUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 6.707f)
                lineTo(13.0f, 2.958f)
                verticalLineTo(21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(2.958f)
                lineTo(7.25f, 6.707f)
                lineTo(5.836f, 5.293f)
                lineTo(10.513f, 0.616f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 2.973f, 0.0f)
                lineToRelative(4.678f, 4.677f)
                close()
            }
        }
        .build()
        return _levelUp!!
    }

private var _levelUp: ImageVector? = null
