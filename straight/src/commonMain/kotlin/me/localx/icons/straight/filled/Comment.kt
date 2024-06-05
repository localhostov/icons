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

public val Icons.Filled.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.309f)
                lineTo(24.0f, 24.0f)
                lineTo(12.018f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 11.246f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(17.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
