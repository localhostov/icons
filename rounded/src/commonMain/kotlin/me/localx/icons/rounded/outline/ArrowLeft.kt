package me.localx.icons.rounded.outline

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
import me.localx.icons.rounded.Icons

public val Icons.Outline.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.8802f, 14.09f)
                    lineTo(4.7502f, 18.0f)
                    curveTo(4.8431f, 18.0938f, 4.9537f, 18.1681f, 5.0756f, 18.2189f)
                    curveTo(5.1975f, 18.2697f, 5.3282f, 18.2958f, 5.4602f, 18.2958f)
                    curveTo(5.5922f, 18.2958f, 5.7229f, 18.2697f, 5.8447f, 18.2189f)
                    curveTo(5.9666f, 18.1681f, 6.0772f, 18.0938f, 6.1702f, 18.0f)
                    curveTo(6.2639f, 17.9071f, 6.3383f, 17.7965f, 6.3891f, 17.6746f)
                    curveTo(6.4398f, 17.5527f, 6.466f, 17.422f, 6.466f, 17.29f)
                    curveTo(6.466f, 17.158f, 6.4398f, 17.0273f, 6.3891f, 16.9054f)
                    curveTo(6.3383f, 16.7836f, 6.2639f, 16.673f, 6.1702f, 16.58f)
                    lineTo(2.6102f, 13.0f)
                    horizontalLineTo(23.0002f)
                    curveTo(23.2654f, 13.0f, 23.5197f, 12.8947f, 23.7073f, 12.7071f)
                    curveTo(23.8948f, 12.5196f, 24.0002f, 12.2652f, 24.0002f, 12.0f)
                    curveTo(24.0002f, 11.7348f, 23.8948f, 11.4805f, 23.7073f, 11.2929f)
                    curveTo(23.5197f, 11.1054f, 23.2654f, 11.0f, 23.0002f, 11.0f)
                    horizontalLineTo(2.5502f)
                    lineTo(6.1702f, 7.38f)
                    curveTo(6.3475f, 7.194f, 6.4464f, 6.947f, 6.4464f, 6.69f)
                    curveTo(6.4464f, 6.4331f, 6.3475f, 6.186f, 6.1702f, 6.0f)
                    curveTo(6.0772f, 5.9063f, 5.9666f, 5.8319f, 5.8447f, 5.7811f)
                    curveTo(5.7229f, 5.7304f, 5.5922f, 5.7042f, 5.4602f, 5.7042f)
                    curveTo(5.3282f, 5.7042f, 5.1975f, 5.7304f, 5.0756f, 5.7811f)
                    curveTo(4.9537f, 5.8319f, 4.8431f, 5.9063f, 4.7502f, 6.0f)
                    lineTo(0.8802f, 9.85f)
                    curveTo(0.3184f, 10.4125f, 0.0028f, 11.175f, 0.0028f, 11.97f)
                    curveTo(0.0028f, 12.765f, 0.3184f, 13.5275f, 0.8802f, 14.09f)
                    close()
                }
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
