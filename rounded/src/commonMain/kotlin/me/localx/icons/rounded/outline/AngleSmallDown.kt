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

public val Icons.Outline.AngleSmallDown: ImageVector
    get() {
        if (_angleSmallDown != null) {
            return _angleSmallDown!!
        }
        _angleSmallDown = Builder(name = "AngleSmallDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.71f, 8.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                lineToRelative(-4.58f, 4.58f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 0.0f)
                lineTo(6.71f, 8.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(4.59f, -4.59f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.71f, 8.21f)
                close()
            }
        }
        .build()
        return _angleSmallDown!!
    }

private var _angleSmallDown: ImageVector? = null
