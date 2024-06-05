package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

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
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.143f)
                arcTo(1.859f, 1.859f, 0.0f, false, false, 22.0f, 5.143f)
                verticalLineTo(0.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.078f)
                arcTo(11.982f, 11.982f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                arcTo(9.986f, 9.986f, 0.0f, false, true, 4.878f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.857f)
                arcTo(1.859f, 1.859f, 0.0f, false, false, 2.0f, 18.857f)
                verticalLineTo(24.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.922f)
                arcTo(11.982f, 11.982f, 0.0f, false, false, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
