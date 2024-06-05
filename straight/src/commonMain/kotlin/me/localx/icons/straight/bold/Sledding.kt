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

public val Icons.Bold.Sledding: ImageVector
    get() {
        if (_sledding != null) {
            return _sledding!!
        }
        _sledding = Builder(name = "Sledding", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.917f, 21.446f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -6.0f, 2.111f)
                lineTo(0.01f, 14.849f)
                lineToRelative(1.313f, -2.7f)
                lineToRelative(17.9f, 8.7f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.994f, -0.707f)
                close()
                moveTo(18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(8.833f, 9.238f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 15.0f)
                horizontalLineTo(16.29f)
                lineToRelative(0.449f, 2.076f)
                lineToRelative(3.42f, 1.623f)
                lineTo(18.71f, 12.0f)
                horizontalLineTo(14.3f)
                lineToRelative(1.833f, -2.063f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.173f, -4.885f)
                lineTo(14.394f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.812f)
                close()
            }
        }
        .build()
        return _sledding!!
    }

private var _sledding: ImageVector? = null
