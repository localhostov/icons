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

public val Icons.Bold.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 8.0f)
                horizontalLineToRelative(-1.202f)
                curveToRelative(-0.656f, -3.216f, -2.862f, -5.871f, -5.798f, -7.159f)
                verticalLineToRelative(-0.841f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(0.841f)
                curveToRelative(-2.937f, 1.288f, -5.143f, 3.943f, -5.798f, 7.159f)
                horizontalLineToRelative(-1.202f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.307f)
                lineToRelative(3.0f, 13.0f)
                horizontalLineToRelative(13.387f)
                lineToRelative(3.0f, -13.0f)
                horizontalLineToRelative(1.307f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(8.0f, 4.264f)
                verticalLineToRelative(0.736f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.736f)
                curveToRelative(1.28f, 0.896f, 2.248f, 2.206f, 2.705f, 3.736f)
                lineTo(5.295f, 8.0f)
                curveToRelative(0.458f, -1.53f, 1.425f, -2.841f, 2.705f, -3.736f)
                close()
                moveTo(16.307f, 21.0f)
                lineTo(7.693f, 21.0f)
                lineToRelative(-1.154f, -5.0f)
                horizontalLineToRelative(8.869f)
                lineToRelative(0.692f, -3.0f)
                lineTo(5.847f, 13.0f)
                lineToRelative(-0.461f, -2.0f)
                horizontalLineToRelative(13.228f)
                lineToRelative(-2.308f, 10.0f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null
