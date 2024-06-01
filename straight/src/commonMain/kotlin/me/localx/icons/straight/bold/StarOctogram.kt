package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 4.243f)
                    lineTo(13.393f, 5.636f)
                    lineTo(14.272f, 6.515f)
                    horizontalLineTo(17.485f)
                    verticalLineTo(9.728f)
                    lineTo(18.364f, 10.607f)
                    lineTo(19.757f, 12.0f)
                    lineTo(18.364f, 13.393f)
                    lineTo(17.485f, 14.272f)
                    verticalLineTo(17.485f)
                    horizontalLineTo(14.272f)
                    lineTo(13.393f, 18.364f)
                    lineTo(12.0f, 19.757f)
                    lineTo(10.607f, 18.364f)
                    lineTo(9.728f, 17.485f)
                    horizontalLineTo(6.515f)
                    verticalLineTo(14.272f)
                    lineTo(5.636f, 13.393f)
                    lineTo(4.243f, 12.0f)
                    lineTo(5.636f, 10.607f)
                    lineTo(6.515f, 9.728f)
                    verticalLineTo(6.515f)
                    horizontalLineTo(9.728f)
                    lineTo(10.607f, 5.636f)
                    lineTo(12.0f, 4.243f)
                    close()
                    moveTo(12.0f, 0.0f)
                    lineTo(8.485f, 3.515f)
                    horizontalLineTo(3.515f)
                    verticalLineTo(8.485f)
                    lineTo(0.0f, 12.0f)
                    lineTo(3.515f, 15.515f)
                    verticalLineTo(20.485f)
                    horizontalLineTo(8.485f)
                    lineTo(12.0f, 24.0f)
                    lineTo(15.515f, 20.485f)
                    horizontalLineTo(20.485f)
                    verticalLineTo(15.515f)
                    lineTo(24.0f, 12.0f)
                    lineTo(20.485f, 8.485f)
                    verticalLineTo(3.515f)
                    horizontalLineTo(15.515f)
                    lineTo(12.0f, 0.0f)
                    close()
                }
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
