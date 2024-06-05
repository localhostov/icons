package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.032f, 10.032f, 0.0f, false, true, 7.122f, 3.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.143f)
                arcTo(1.858f, 1.858f, 0.0f, false, false, 22.0f, 5.143f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(3.078f)
                arcTo(11.981f, 11.981f, 0.0f, false, false, 0.05f, 10.9f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, 1.0f, 1.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, false, 0.989f, -0.878f)
                arcTo(10.014f, 10.014f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.951f, 12.0f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, false, -0.989f, 0.878f)
                arcTo(9.986f, 9.986f, 0.0f, false, true, 4.878f, 19.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(3.857f)
                arcTo(1.856f, 1.856f, 0.0f, false, false, 2.0f, 18.857f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(20.922f)
                arcTo(11.981f, 11.981f, 0.0f, false, false, 23.95f, 13.1f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, false, -1.0f, -1.1f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
