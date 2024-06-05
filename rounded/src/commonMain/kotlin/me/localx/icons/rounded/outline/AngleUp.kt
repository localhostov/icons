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

public val Icons.Outline.AngleUp: ImageVector
    get() {
        if (_angleUp != null) {
            return _angleUp!!
        }
        _angleUp = Builder(name = "AngleUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 16.29f)
                lineTo(15.54f, 8.12f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.08f, 0.0f)
                lineTo(0.29f, 16.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.42f)
                lineTo(9.88f, 9.54f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.24f, 0.0f)
                lineToRelative(8.17f, 8.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.71f, 16.29f)
                close()
            }
        }
        .build()
        return _angleUp!!
    }

private var _angleUp: ImageVector? = null
