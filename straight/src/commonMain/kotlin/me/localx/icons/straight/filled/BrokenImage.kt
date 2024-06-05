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

public val Icons.Filled.BrokenImage: ImageVector
    get() {
        if (_brokenImage != null) {
            return _brokenImage!!
        }
        _brokenImage = Builder(name = "BrokenImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(17.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(7.52f, 11.08f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(5.48f, 5.48f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(13.6f)
                lineToRelative(5.52f, -5.52f)
                close()
                moveTo(16.52f, 13.91f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-5.52f, 5.52f)
                verticalLineToRelative(4.57f)
                lineTo(22.0f, 24.0f)
                verticalLineToRelative(-4.61f)
                lineToRelative(-5.48f, -5.48f)
                close()
            }
        }
        .build()
        return _brokenImage!!
    }

private var _brokenImage: ImageVector? = null
