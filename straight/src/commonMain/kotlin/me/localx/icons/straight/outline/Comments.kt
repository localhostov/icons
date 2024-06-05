package me.localx.icons.straight.outline

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

public val Icons.Outline.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.92f, -4.0f)
                arcToRelative(10.968f, 10.968f, 0.0f, false, false, 2.242f, -0.248f)
                arcTo(5.988f, 5.988f, 0.0f, false, false, 16.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(16.0f)
                arcToRelative(5.988f, 5.988f, 0.0f, false, false, -2.252f, -4.678f)
                arcTo(10.968f, 10.968f, 0.0f, false, false, 20.0f, 9.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(18.0f, 9.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(9.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 18.0f, 9.0f)
                close()
                moveTo(2.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, 7.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
