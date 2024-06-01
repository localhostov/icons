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

public val Icons.Outline.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(21.0f)
                    curveTo(3.0598f, 19.2706f, 3.4868f, 17.5738f, 4.2526f, 16.0221f)
                    curveTo(5.0185f, 14.4704f, 6.1057f, 13.0993f, 7.442f, 12.0f)
                    curveTo(6.1057f, 10.9007f, 5.0185f, 9.5296f, 4.2526f, 7.9779f)
                    curveTo(3.4868f, 6.4262f, 3.0598f, 4.7294f, 3.0f, 3.0f)
                    curveTo(3.0f, 2.2043f, 3.3161f, 1.4413f, 3.8787f, 0.8787f)
                    curveTo(4.4413f, 0.3161f, 5.2043f, 0.0f, 6.0f, 0.0f)
                    lineTo(18.0f, 0.0f)
                    curveTo(18.7956f, 0.0f, 19.5587f, 0.3161f, 20.1213f, 0.8787f)
                    curveTo(20.6839f, 1.4413f, 21.0f, 2.2043f, 21.0f, 3.0f)
                    curveTo(20.941f, 4.7278f, 20.516f, 6.4234f, 19.7532f, 7.9748f)
                    curveTo(18.9905f, 9.5262f, 17.9072f, 10.8982f, 16.575f, 12.0f)
                    curveTo(17.9072f, 13.1018f, 18.9905f, 14.4738f, 19.7532f, 16.0252f)
                    curveTo(20.516f, 17.5766f, 20.941f, 19.2722f, 21.0f, 21.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(5.0f, 22.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(21.0f)
                    curveTo(19.0f, 17.226f, 16.5f, 14.448f, 14.408f, 12.783f)
                    lineTo(13.424f, 12.0f)
                    lineTo(14.408f, 11.217f)
                    curveTo(16.5f, 9.552f, 19.0f, 6.774f, 19.0f, 3.0f)
                    curveTo(19.0f, 2.7348f, 18.8946f, 2.4804f, 18.7071f, 2.2929f)
                    curveTo(18.5196f, 2.1054f, 18.2652f, 2.0f, 18.0f, 2.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.7348f, 2.0f, 5.4804f, 2.1054f, 5.2929f, 2.2929f)
                    curveTo(5.1054f, 2.4804f, 5.0f, 2.7348f, 5.0f, 3.0f)
                    curveTo(5.0f, 6.774f, 7.508f, 9.551f, 9.612f, 11.216f)
                    lineTo(10.6f, 12.0f)
                    lineTo(9.609f, 12.784f)
                    curveTo(7.508f, 14.449f, 5.0f, 17.226f, 5.0f, 21.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(12.018f, 15.982f)
                    curveTo(12.7566f, 16.5608f, 13.4106f, 17.24f, 13.961f, 18.0f)
                    horizontalLineTo(10.068f)
                    lineTo(12.018f, 15.982f)
                    close()
                    moveTo(12.014f, 13.513f)
                    curveTo(10.377f, 14.586f, 7.585f, 16.843f, 7.08f, 20.0f)
                    horizontalLineTo(16.922f)
                    curveTo(16.422f, 16.816f, 13.634f, 14.57f, 12.014f, 13.513f)
                    close()
                }
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
