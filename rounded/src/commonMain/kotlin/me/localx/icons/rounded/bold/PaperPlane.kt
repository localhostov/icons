package me.localx.icons.rounded.bold

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

public val Icons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.9994f, 1.0024f)
                    curveTo(22.1725f, 0.164f, 20.9667f, -0.1798f, 19.8219f, 0.0966f)
                    lineTo(4.5361f, 3.3091f)
                    curveTo(1.6333f, 3.7387f, -0.3717f, 6.4401f, 0.0579f, 9.3429f)
                    curveTo(0.2248f, 10.4714f, 0.7507f, 11.5162f, 1.5575f, 12.3228f)
                    lineTo(3.1962f, 13.9626f)
                    curveTo(3.273f, 14.0383f, 3.3159f, 14.1418f, 3.3152f, 14.2495f)
                    verticalLineTo(17.2731f)
                    curveTo(3.3174f, 19.1541f, 4.8417f, 20.6784f, 6.7228f, 20.6806f)
                    horizontalLineTo(9.7463f)
                    curveTo(9.8542f, 20.6806f, 9.9578f, 20.7234f, 10.0343f, 20.7996f)
                    lineTo(11.673f, 22.4384f)
                    curveTo(12.6639f, 23.4358f, 14.0115f, 23.9972f, 15.4175f, 23.9981f)
                    curveTo(15.9978f, 23.9977f, 16.5743f, 23.9028f, 17.1242f, 23.7172f)
                    curveTo(19.022f, 23.0869f, 20.401f, 21.4389f, 20.6867f, 19.4598f)
                    lineTo(23.8993f, 4.222f)
                    curveTo(24.1879f, 3.0652f, 23.846f, 1.8419f, 22.9994f, 1.0024f)
                    close()
                    moveTo(3.1213f, 7.8274f)
                    curveTo(3.393f, 6.9879f, 4.1263f, 6.3816f, 5.002f, 6.2727f)
                    curveTo(5.0374f, 6.268f, 5.0723f, 6.262f, 5.107f, 6.2547f)
                    lineTo(18.4271f, 3.4551f)
                    lineTo(6.3148f, 15.5603f)
                    verticalLineTo(14.2495f)
                    curveTo(6.3171f, 13.3452f, 5.9569f, 12.4777f, 5.315f, 11.8409f)
                    lineTo(3.6782f, 10.2021f)
                    curveTo(3.0478f, 9.5855f, 2.8307f, 8.66f, 3.1213f, 7.8274f)
                    close()
                    moveTo(17.7412f, 18.8939f)
                    curveTo(17.7332f, 18.9289f, 17.7282f, 18.9638f, 17.7232f, 18.9988f)
                    curveTo(17.5495f, 20.2654f, 16.3821f, 21.1513f, 15.1156f, 20.9777f)
                    curveTo(14.6152f, 20.9091f, 14.151f, 20.6787f, 13.7938f, 20.3217f)
                    lineTo(12.156f, 18.6839f)
                    curveTo(11.5188f, 18.0418f, 10.651f, 17.6817f, 9.7464f, 17.6841f)
                    horizontalLineTo(8.4355f)
                    lineTo(20.5448f, 5.5718f)
                    lineTo(17.7412f, 18.8939f)
                    close()
                }
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
