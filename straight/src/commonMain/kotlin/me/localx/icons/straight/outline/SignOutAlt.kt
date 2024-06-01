package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.SignOutAlt: ImageVector
    get() {
        if (_signOutAlt != null) {
            return _signOutAlt!!
        }
        _signOutAlt = Builder(name = "SignOutAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.7631f, 10.2311f)
                    lineTo(17.8131f, 5.2811f)
                    lineTo(16.4001f, 6.6991f)
                    lineTo(20.7001f, 10.9991f)
                    horizontalLineTo(6.6171f)
                    verticalLineTo(12.9991f)
                    horizontalLineTo(20.7001f)
                    lineTo(16.4001f, 17.2991f)
                    lineTo(17.8141f, 18.7131f)
                    lineTo(22.7641f, 13.7631f)
                    curveTo(22.9963f, 13.531f, 23.1805f, 13.2553f, 23.3062f, 12.952f)
                    curveTo(23.4318f, 12.6486f, 23.4965f, 12.3235f, 23.4965f, 11.9951f)
                    curveTo(23.4965f, 11.6668f, 23.4318f, 11.3416f, 23.3062f, 11.0383f)
                    curveTo(23.1805f, 10.7349f, 22.9963f, 10.4593f, 22.7641f, 10.2271f)
                    lineTo(22.7631f, 10.2311f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.476f, 21.0f)
                    curveTo(10.476f, 21.2652f, 10.3706f, 21.5196f, 10.1831f, 21.7071f)
                    curveTo(9.9956f, 21.8946f, 9.7412f, 22.0f, 9.476f, 22.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 22.0f, 2.4804f, 21.8946f, 2.2929f, 21.7071f)
                    curveTo(2.1054f, 21.5196f, 2.0f, 21.2652f, 2.0f, 21.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(9.476f)
                    curveTo(9.7412f, 2.0f, 9.9956f, 2.1054f, 10.1831f, 2.2929f)
                    curveTo(10.3706f, 2.4804f, 10.476f, 2.7348f, 10.476f, 3.0f)
                    verticalLineTo(8.333f)
                    horizontalLineTo(12.476f)
                    verticalLineTo(3.0f)
                    curveTo(12.476f, 2.2043f, 12.1599f, 1.4413f, 11.5973f, 0.8787f)
                    curveTo(11.0347f, 0.3161f, 10.2716f, 0.0f, 9.476f, 0.0f)
                    lineTo(3.0f, 0.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(9.476f)
                    curveTo(10.2716f, 24.0f, 11.0347f, 23.6839f, 11.5973f, 23.1213f)
                    curveTo(12.1599f, 22.5587f, 12.476f, 21.7956f, 12.476f, 21.0f)
                    verticalLineTo(15.667f)
                    horizontalLineTo(10.476f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _signOutAlt!!
    }

private var _signOutAlt: ImageVector? = null
