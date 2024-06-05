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

public val Icons.Filled.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7f, 18.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-1.493f, 0.0f, -3.0f, -1.134f, -3.0f, -3.666f)
                verticalLineTo(9.294f)
                arcTo(9.418f, 9.418f, 0.0f, false, true, 8.349f, 0.023f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.628f, 9.628f)
                arcTo(9.419f, 9.419f, 0.0f, false, true, 8.7f, 18.0f)
                close()
                moveTo(20.0f, 9.08f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(0.0f, 0.237f, 0.0f, 0.474f, -0.012f, 0.712f)
                curveTo(19.59f, 15.2f, 14.647f, 19.778f, 9.084f, 19.981f)
                lineToRelative(0.0f, 0.015f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                verticalLineTo(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 9.08f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
