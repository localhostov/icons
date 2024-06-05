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

public val Icons.Bold.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.243f)
                lineToRelative(1.393f, 1.393f)
                lineToRelative(0.879f, 0.879f)
                horizontalLineToRelative(3.213f)
                verticalLineTo(9.728f)
                lineToRelative(0.879f, 0.879f)
                lineTo(19.757f, 12.0f)
                lineToRelative(-1.393f, 1.393f)
                lineToRelative(-0.879f, 0.879f)
                verticalLineToRelative(3.213f)
                horizontalLineTo(14.272f)
                lineToRelative(-0.879f, 0.879f)
                lineTo(12.0f, 19.757f)
                lineToRelative(-1.393f, -1.393f)
                lineToRelative(-0.879f, -0.879f)
                horizontalLineTo(6.515f)
                verticalLineTo(14.272f)
                lineToRelative(-0.879f, -0.879f)
                lineTo(4.243f, 12.0f)
                lineToRelative(1.393f, -1.393f)
                lineToRelative(0.879f, -0.879f)
                verticalLineTo(6.515f)
                horizontalLineTo(9.728f)
                lineToRelative(0.879f, -0.879f)
                lineTo(12.0f, 4.243f)
                moveTo(12.0f, 0.0f)
                lineTo(8.485f, 3.515f)
                horizontalLineTo(3.515f)
                verticalLineToRelative(4.97f)
                lineTo(0.0f, 12.0f)
                lineToRelative(3.515f, 3.515f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(4.97f)
                lineTo(12.0f, 24.0f)
                lineToRelative(3.515f, -3.515f)
                horizontalLineToRelative(4.97f)
                verticalLineToRelative(-4.97f)
                lineTo(24.0f, 12.0f)
                lineTo(20.485f, 8.485f)
                verticalLineTo(3.515f)
                horizontalLineToRelative(-4.97f)
                lineTo(12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
