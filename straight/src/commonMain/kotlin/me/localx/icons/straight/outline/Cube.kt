package me.localx.icons.straight.outline

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

public val Icons.Outline.Cube: ImageVector
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
                    moveTo(19.6351f, 6.6f)
                    lineTo(12.0121f, 10.852f)
                    lineTo(4.6731f, 6.56f)
                    lineTo(12.1221f, 2.3f)
                    lineTo(19.6351f, 6.6f)
                    close()
                    moveTo(3.6221f, 8.262f)
                    lineTo(11.0001f, 12.574f)
                    verticalLineTo(21.056f)
                    lineTo(3.6221f, 16.839f)
                    verticalLineTo(8.262f)
                    close()
                    moveTo(13.0001f, 21.194f)
                    verticalLineTo(12.587f)
                    lineTo(20.6221f, 8.336f)
                    verticalLineTo(16.836f)
                    lineTo(13.0001f, 21.194f)
                    close()
                }
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
