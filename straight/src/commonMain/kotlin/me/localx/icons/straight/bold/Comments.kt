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

public val Icons.Bold.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 0.0f, 9.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.0f, 18.0f)
                arcTo(9.01f, 9.01f, 0.0f, false, false, 18.0f, 9.0f)
                close()
                moveTo(9.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, 6.0f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineTo(16.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.92f, -4.0f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, false, 3.322f, -0.54f)
                arcTo(4.977f, 4.977f, 0.0f, false, false, 16.0f, 21.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 16.0f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, false, -1.544f, -3.6f)
                arcTo(10.96f, 10.96f, 0.0f, false, false, 20.0f, 9.08f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 16.0f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
