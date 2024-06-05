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

public val Icons.Filled.ShovelSnow: ImageVector
    get() {
        if (_shovelSnow != null) {
            return _shovelSnow!!
        }
        _shovelSnow = Builder(name = "ShovelSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.957f, 0.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-6.758f, 6.758f)
                lineToRelative(-2.069f, -2.069f)
                curveToRelative(-1.25f, -1.251f, -3.285f, -1.251f, -4.535f, 0.0f)
                lineTo(0.086f, 13.827f)
                lineToRelative(10.122f, 10.122f)
                lineToRelative(5.888f, -5.888f)
                curveToRelative(1.25f, -1.25f, 1.25f, -3.285f, 0.0f, -4.535f)
                lineToRelative(-2.104f, -2.104f)
                lineToRelative(6.758f, -6.758f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineTo(18.957f, 0.043f)
                close()
                moveTo(2.836f, 13.75f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(5.836f, 16.75f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(10.25f, 21.164f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(-3.151f, 3.15f)
                close()
            }
        }
        .build()
        return _shovelSnow!!
    }

private var _shovelSnow: ImageVector? = null
