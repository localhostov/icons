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

public val Icons.Outline.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineTo(17.9f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 13.0f, 0.0f)
                horizontalLineTo(11.0f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 6.1f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(9.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 4.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.816f, 2.0f)
                horizontalLineTo(8.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 2.0f)
                close()
                moveTo(5.0f, 6.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 6.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
