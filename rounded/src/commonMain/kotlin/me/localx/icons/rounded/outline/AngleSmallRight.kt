package me.localx.icons.rounded.outline

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

public val Icons.Outline.AngleSmallRight: ImageVector
    get() {
        if (_angleSmallRight != null) {
            return _angleSmallRight!!
        }
        _angleSmallRight = Builder(name = "AngleSmallRight", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4f, 9.88f)
                lineTo(10.81f, 5.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineTo(14.0f, 11.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.42f)
                lineTo(9.4f, 17.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.42f)
                lineToRelative(4.59f, -4.59f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.4f, 9.88f)
                close()
            }
        }
        .build()
        return _angleSmallRight!!
    }

private var _angleSmallRight: ImageVector? = null
