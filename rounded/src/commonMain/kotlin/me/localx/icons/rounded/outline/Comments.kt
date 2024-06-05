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
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.92f, -4.0f)
                arcToRelative(10.968f, 10.968f, 0.0f, false, false, 2.242f, -0.248f)
                arcTo(5.988f, 5.988f, 0.0f, false, false, 16.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 16.0f)
                arcToRelative(5.988f, 5.988f, 0.0f, false, false, -2.252f, -4.678f)
                arcTo(10.968f, 10.968f, 0.0f, false, false, 20.0f, 9.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(17.977f, 9.651f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 8.349f, 0.023f)
                arcTo(9.418f, 9.418f, 0.0f, false, false, 0.0f, 9.294f)
                verticalLineToRelative(5.04f)
                curveTo(0.0f, 16.866f, 1.507f, 18.0f, 3.0f, 18.0f)
                lineTo(8.7f, 18.0f)
                arcTo(9.419f, 9.419f, 0.0f, false, false, 17.977f, 9.651f)
                close()
                moveTo(13.95f, 4.051f)
                arcToRelative(7.018f, 7.018f, 0.0f, false, true, 2.032f, 5.46f)
                arcTo(7.364f, 7.364f, 0.0f, false, true, 8.7f, 16.0f)
                lineTo(3.0f, 16.0f)
                curveToRelative(-0.928f, 0.0f, -1.0f, -1.275f, -1.0f, -1.666f)
                lineTo(2.0f, 9.294f)
                arcTo(7.362f, 7.362f, 0.0f, false, true, 8.49f, 2.018f)
                quadTo(8.739f, 2.0f, 8.988f, 2.0f)
                arcTo(7.012f, 7.012f, 0.0f, false, true, 13.95f, 4.051f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
