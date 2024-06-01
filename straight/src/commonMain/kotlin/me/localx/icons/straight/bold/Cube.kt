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

public val Icons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.1221f, 0.0f)
                    lineTo(1.6221f, 6.0f)
                    verticalLineTo(18.0f)
                    lineTo(12.1221f, 24.0f)
                    lineTo(22.6221f, 18.0f)
                    verticalLineTo(6.0f)
                    lineTo(12.1221f, 0.0f)
                    close()
                    moveTo(18.1081f, 6.876f)
                    lineTo(12.0181f, 10.276f)
                    lineTo(6.1711f, 6.856f)
                    lineTo(12.1221f, 3.456f)
                    lineTo(18.1081f, 6.876f)
                    close()
                    moveTo(4.6221f, 9.425f)
                    lineTo(10.5001f, 12.861f)
                    verticalLineTo(19.618f)
                    lineTo(4.6221f, 16.259f)
                    verticalLineTo(9.425f)
                    close()
                    moveTo(13.5001f, 19.757f)
                    verticalLineTo(12.881f)
                    lineTo(19.6221f, 9.466f)
                    verticalLineTo(16.259f)
                    lineTo(13.5001f, 19.757f)
                    close()
                }
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
