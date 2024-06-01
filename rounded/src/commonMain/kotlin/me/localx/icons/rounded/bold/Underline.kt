package me.localx.icons.rounded.bold

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

public val Icons.Bold.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 18.989f)
                    curveTo(14.3861f, 18.9864f, 16.6738f, 18.0373f, 18.361f, 16.35f)
                    curveTo(20.0483f, 14.6628f, 20.9974f, 12.3751f, 21.0f, 9.989f)
                    verticalLineTo(1.5f)
                    curveTo(21.0f, 1.1022f, 20.842f, 0.7206f, 20.5607f, 0.4393f)
                    curveTo(20.2794f, 0.158f, 19.8978f, 0.0f, 19.5f, 0.0f)
                    curveTo(19.1022f, 0.0f, 18.7206f, 0.158f, 18.4393f, 0.4393f)
                    curveTo(18.158f, 0.7206f, 18.0f, 1.1022f, 18.0f, 1.5f)
                    verticalLineTo(9.989f)
                    curveTo(18.0f, 11.5803f, 17.3679f, 13.1064f, 16.2426f, 14.2316f)
                    curveTo(15.1174f, 15.3569f, 13.5913f, 15.989f, 12.0f, 15.989f)
                    curveTo(10.4087f, 15.989f, 8.8826f, 15.3569f, 7.7574f, 14.2316f)
                    curveTo(6.6321f, 13.1064f, 6.0f, 11.5803f, 6.0f, 9.989f)
                    verticalLineTo(1.5f)
                    curveTo(6.0f, 1.1022f, 5.842f, 0.7206f, 5.5607f, 0.4393f)
                    curveTo(5.2794f, 0.158f, 4.8978f, 0.0f, 4.5f, 0.0f)
                    curveTo(4.1022f, 0.0f, 3.7206f, 0.158f, 3.4393f, 0.4393f)
                    curveTo(3.158f, 0.7206f, 3.0f, 1.1022f, 3.0f, 1.5f)
                    verticalLineTo(9.989f)
                    curveTo(3.0027f, 12.3751f, 3.9517f, 14.6628f, 5.639f, 16.35f)
                    curveTo(7.3262f, 18.0373f, 9.6139f, 18.9864f, 12.0f, 18.989f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.544f, 21.0f)
                    horizontalLineTo(1.5f)
                    curveTo(1.1022f, 21.0f, 0.7206f, 21.158f, 0.4393f, 21.4393f)
                    curveTo(0.158f, 21.7206f, 0.0f, 22.1022f, 0.0f, 22.5f)
                    curveTo(0.0f, 22.8978f, 0.158f, 23.2794f, 0.4393f, 23.5607f)
                    curveTo(0.7206f, 23.842f, 1.1022f, 24.0f, 1.5f, 24.0f)
                    horizontalLineTo(22.544f)
                    curveTo(22.9418f, 24.0f, 23.3234f, 23.842f, 23.6047f, 23.5607f)
                    curveTo(23.886f, 23.2794f, 24.044f, 22.8978f, 24.044f, 22.5f)
                    curveTo(24.044f, 22.1022f, 23.886f, 21.7206f, 23.6047f, 21.4393f)
                    curveTo(23.3234f, 21.158f, 22.9418f, 21.0f, 22.544f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
