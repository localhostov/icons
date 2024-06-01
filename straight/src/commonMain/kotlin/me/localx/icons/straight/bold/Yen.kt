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

public val Icons.Bold.Yen: ImageVector
    get() {
        if (_yen != null) {
            return _yen!!
        }
        _yen = Builder(name = "Yen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.189f, 1.9158f)
                    lineTo(20.811f, 0.0858f)
                    lineTo(12.0f, 11.5408f)
                    lineTo(3.189f, 0.0858f)
                    lineTo(0.811f, 1.9158f)
                    lineTo(9.338f, 13.0008f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(16.0008f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(18.0008f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(21.0008f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(24.0008f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(21.0008f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(18.0008f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(16.0008f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(13.0008f)
                    horizontalLineTo(14.662f)
                    lineTo(23.189f, 1.9158f)
                    close()
                }
            }
        }
        .build()
        return _yen!!
    }

private var _yen: ImageVector? = null
