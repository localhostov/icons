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

public val Icons.Outline.AngleDown: ImageVector
    get() {
        if (_angleDown != null) {
            return _angleDown!!
        }
        _angleDown = Builder(name = "AngleDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.17f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -3.54f, -1.46f)
                lineTo(0.29f, 7.54f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.71f, 6.12f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.24f, 0.0f)
                lineToRelative(8.17f, -8.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.42f)
                lineToRelative(-8.17f, 8.17f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 17.17f)
                close()
            }
        }
        .build()
        return _angleDown!!
    }

private var _angleDown: ImageVector? = null
