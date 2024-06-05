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

public val Icons.Bold.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 0.0f)
                lineTo(11.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 3.0f)
                lineTo(8.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 8.0f)
                lineTo(2.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(5.0f)
                lineTo(22.0f, 3.307f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
