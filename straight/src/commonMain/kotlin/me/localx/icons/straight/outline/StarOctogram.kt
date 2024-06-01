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

public val Icons.Outline.StarOctogram: ImageVector
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
                    moveTo(24.0f, 12.0f)
                    lineTo(20.4848f, 15.5152f)
                    verticalLineTo(20.4848f)
                    horizontalLineTo(15.5152f)
                    lineTo(12.0f, 24.0f)
                    lineTo(8.4848f, 20.4848f)
                    horizontalLineTo(3.5152f)
                    verticalLineTo(15.5152f)
                    lineTo(0.0f, 12.0f)
                    lineTo(3.5152f, 8.4848f)
                    verticalLineTo(3.5152f)
                    horizontalLineTo(8.4848f)
                    lineTo(12.0f, 0.0f)
                    lineTo(15.5152f, 3.5152f)
                    horizontalLineTo(20.4848f)
                    verticalLineTo(8.4848f)
                    lineTo(24.0f, 12.0f)
                    close()
                    moveTo(19.0711f, 14.0991f)
                    lineTo(21.1711f, 11.9991f)
                    lineTo(19.0711f, 9.8991f)
                    lineTo(18.4852f, 9.3141f)
                    verticalLineTo(5.5139f)
                    horizontalLineTo(14.685f)
                    lineTo(14.1f, 4.928f)
                    lineTo(12.0f, 2.828f)
                    verticalLineTo(2.8289f)
                    lineTo(9.3141f, 5.5148f)
                    horizontalLineTo(5.5139f)
                    verticalLineTo(9.315f)
                    lineTo(4.928f, 9.9f)
                    lineTo(2.828f, 12.0f)
                    lineTo(4.9289f, 14.1f)
                    lineTo(5.5148f, 14.6841f)
                    verticalLineTo(18.4842f)
                    horizontalLineTo(9.315f)
                    lineTo(9.9f, 19.0702f)
                    lineTo(12.0f, 21.1702f)
                    lineTo(14.1f, 19.0702f)
                    lineTo(14.685f, 18.4842f)
                    horizontalLineTo(18.4852f)
                    verticalLineTo(14.6841f)
                    lineTo(19.0711f, 14.0991f)
                    close()
                }
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
