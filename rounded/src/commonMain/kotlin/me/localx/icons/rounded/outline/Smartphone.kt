package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.0001f, 0.0f)
                    horizontalLineTo(9.0001f)
                    curveTo(7.6745f, 0.0016f, 6.4037f, 0.5289f, 5.4663f, 1.4662f)
                    curveTo(4.529f, 2.4036f, 4.0017f, 3.6744f, 4.0001f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(4.0017f, 20.3256f, 4.529f, 21.5964f, 5.4663f, 22.5338f)
                    curveTo(6.4037f, 23.4711f, 7.6745f, 23.9984f, 9.0001f, 24.0f)
                    horizontalLineTo(15.0001f)
                    curveTo(16.3257f, 23.9984f, 17.5966f, 23.4711f, 18.5339f, 22.5338f)
                    curveTo(19.4712f, 21.5964f, 19.9985f, 20.3256f, 20.0001f, 19.0f)
                    verticalLineTo(5.0f)
                    curveTo(19.9985f, 3.6744f, 19.4712f, 2.4036f, 18.5339f, 1.4662f)
                    curveTo(17.5966f, 0.5289f, 16.3257f, 0.0016f, 15.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(9.0001f, 2.0f)
                    horizontalLineTo(15.0001f)
                    curveTo(15.7958f, 2.0f, 16.5588f, 2.3161f, 17.1214f, 2.8787f)
                    curveTo(17.6841f, 3.4413f, 18.0001f, 4.2043f, 18.0001f, 5.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(6.0001f)
                    verticalLineTo(5.0f)
                    curveTo(6.0001f, 4.2043f, 6.3162f, 3.4413f, 6.8788f, 2.8787f)
                    curveTo(7.4414f, 2.3161f, 8.2045f, 2.0f, 9.0001f, 2.0f)
                    close()
                    moveTo(15.0001f, 22.0f)
                    horizontalLineTo(9.0001f)
                    curveTo(8.2045f, 22.0f, 7.4414f, 21.6839f, 6.8788f, 21.1213f)
                    curveTo(6.3162f, 20.5587f, 6.0001f, 19.7956f, 6.0001f, 19.0f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(19.0f)
                    curveTo(18.0001f, 19.7956f, 17.6841f, 20.5587f, 17.1214f, 21.1213f)
                    curveTo(16.5588f, 21.6839f, 15.7958f, 22.0f, 15.0001f, 22.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 20.9994f)
                    curveTo(12.5524f, 20.9994f, 13.0001f, 20.5517f, 13.0001f, 19.9994f)
                    curveTo(13.0001f, 19.4471f, 12.5524f, 18.9994f, 12.0001f, 18.9994f)
                    curveTo(11.4478f, 18.9994f, 11.0001f, 19.4471f, 11.0001f, 19.9994f)
                    curveTo(11.0001f, 20.5517f, 11.4478f, 20.9994f, 12.0001f, 20.9994f)
                    close()
                }
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
