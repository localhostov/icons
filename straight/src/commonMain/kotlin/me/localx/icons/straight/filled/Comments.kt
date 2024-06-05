package me.localx.icons.straight.filled

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
                moveTo(9.0f, 18.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 9.0f, 9.0f)
                close()
                moveTo(20.0f, 9.08f)
                horizontalLineToRelative(0.0f)
                arcTo(11.008f, 11.008f, 0.0f, false, true, 9.08f, 20.0f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 9.08f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
