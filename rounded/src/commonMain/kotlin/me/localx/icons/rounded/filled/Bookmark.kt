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

public val Icons.Filled.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.849f, 23.55f)
                arcToRelative(2.954f, 2.954f, 0.0f, false, false, 3.266f, -0.644f)
                lineTo(12.0f, 17.053f)
                lineToRelative(5.885f, 5.853f)
                arcToRelative(2.956f, 2.956f, 0.0f, false, false, 2.1f, 0.881f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, false, 1.17f, -0.237f)
                arcTo(2.953f, 2.953f, 0.0f, false, false, 23.0f, 20.779f)
                verticalLineTo(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineTo(6.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 1.0f, 5.0f)
                verticalLineTo(20.779f)
                arcTo(2.953f, 2.953f, 0.0f, false, false, 2.849f, 23.55f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
