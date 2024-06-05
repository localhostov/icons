package me.localx.icons.rounded.filled

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

public val Icons.Filled.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -0.44f)
                lineTo(13.768f, 9.889f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -3.536f, 0.0f)
                lineTo(2.57f, 17.551f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.449f, 15.43f)
                lineTo(8.111f, 7.768f)
                arcToRelative(5.505f, 5.505f, 0.0f, false, true, 7.778f, 0.0f)
                lineToRelative(7.672f, 7.672f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.5f, 18.0f)
                close()
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
