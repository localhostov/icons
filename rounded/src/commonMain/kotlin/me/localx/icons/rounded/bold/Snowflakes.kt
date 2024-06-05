package me.localx.icons.rounded.bold

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

public val Icons.Bold.Snowflakes: ImageVector
    get() {
        if (_snowflakes != null) {
            return _snowflakes!!
        }
        _snowflakes = Builder(name = "Snowflakes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.5f, 7.0f)
                horizontalLineTo(21.089f)
                lineToRelative(0.7f, 1.224f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.6f, 1.492f)
                lineToRelative(-0.688f, -1.2f)
                lineToRelative(-0.688f, 1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.6f, -1.492f)
                lineTo(15.911f, 7.0f)
                horizontalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(1.411f)
                lineToRelative(-0.7f, -1.224f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.6f, -1.492f)
                lineToRelative(0.688f, 1.2f)
                lineToRelative(0.688f, -1.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.6f, 1.492f)
                lineTo(21.089f, 4.0f)
                horizontalLineTo(22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 5.5f)
                close()
                moveTo(15.5f, 15.0f)
                horizontalLineTo(11.105f)
                lineToRelative(2.174f, -3.747f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.6f, -1.506f)
                lineTo(8.5f, 13.511f)
                lineTo(6.316f, 9.747f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.595f, 1.506f)
                lineTo(5.9f, 15.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(5.9f)
                lineTo(3.721f, 21.747f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.6f, 1.506f)
                lineTo(8.5f, 19.489f)
                lineToRelative(2.184f, 3.764f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.6f, -1.506f)
                lineTo(11.105f, 18.0f)
                horizontalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 15.0f)
                close()
            }
        }
        .build()
        return _snowflakes!!
    }

private var _snowflakes: ImageVector? = null
