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

public val Icons.Outline.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 24.0f)
                    horizontalLineTo(12.0179f)
                    curveTo(9.6768f, 23.9989f, 7.3873f, 23.3131f, 5.4312f, 22.027f)
                    curveTo(3.4751f, 20.7409f, 1.9378f, 18.9108f, 1.0089f, 16.762f)
                    curveTo(0.0799f, 14.6132f, -0.2003f, 12.2396f, 0.2028f, 9.9335f)
                    curveTo(0.606f, 7.6275f, 1.6748f, 5.4897f, 3.2777f, 3.7835f)
                    curveTo(4.8806f, 2.0774f, 6.9476f, 0.8773f, 9.224f, 0.3311f)
                    curveTo(11.5004f, -0.215f, 13.8869f, -0.0834f, 16.0894f, 0.7098f)
                    curveTo(18.2919f, 1.503f, 20.2144f, 2.9231f, 21.6199f, 4.7952f)
                    curveTo(23.0255f, 6.6673f, 23.8528f, 8.9096f, 23.9999f, 11.246f)
                    verticalLineTo(11.309f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(12.0179f, 2.0f)
                    curveTo(9.3657f, 2.0f, 6.8222f, 3.0536f, 4.9468f, 4.9289f)
                    curveTo(3.0714f, 6.8043f, 2.0178f, 9.3478f, 2.0178f, 12.0f)
                    curveTo(2.0178f, 14.6522f, 3.0714f, 17.1957f, 4.9468f, 19.0711f)
                    curveTo(6.8222f, 20.9464f, 9.3657f, 22.0f, 12.0179f, 22.0f)
                    horizontalLineTo(21.9999f)
                    verticalLineTo(11.341f)
                    curveTo(21.8284f, 8.8093f, 20.7026f, 6.437f, 18.8498f, 4.7032f)
                    curveTo(16.997f, 2.9694f, 14.5553f, 2.0033f, 12.0179f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0002f, 6.9999f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(8.9999f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(6.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 11.0001f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(13.0001f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(11.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 15.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
