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

public val Icons.Outline.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(1.9997f, 0.0f)
                    verticalLineTo(21.0f)
                    curveTo(1.9997f, 21.7956f, 2.3158f, 22.5587f, 2.8784f, 23.1213f)
                    curveTo(3.441f, 23.6839f, 4.2041f, 24.0f, 4.9997f, 24.0f)
                    horizontalLineTo(18.9997f)
                    curveTo(19.7953f, 24.0f, 20.5584f, 23.6839f, 21.121f, 23.1213f)
                    curveTo(21.6836f, 22.5587f, 21.9997f, 21.7956f, 21.9997f, 21.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(1.9997f)
                    close()
                    moveTo(19.9997f, 2.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(3.9997f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(19.9997f)
                    close()
                    moveTo(18.9997f, 22.0f)
                    horizontalLineTo(4.9997f)
                    curveTo(4.7345f, 22.0f, 4.4801f, 21.8946f, 4.2926f, 21.7071f)
                    curveTo(4.1051f, 21.5196f, 3.9997f, 21.2652f, 3.9997f, 21.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(10.9997f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(12.9997f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(19.9997f)
                    verticalLineTo(21.0f)
                    curveTo(19.9997f, 21.2652f, 19.8943f, 21.5196f, 19.7068f, 21.7071f)
                    curveTo(19.5193f, 21.8946f, 19.2649f, 22.0f, 18.9997f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
