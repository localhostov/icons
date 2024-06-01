package me.localx.icons.rounded.filled

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

public val Icons.Filled.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 8.4804f)
                    verticalLineTo(20.0004f)
                    curveTo(23.9999f, 20.2656f, 23.8946f, 20.52f, 23.7071f, 20.7075f)
                    curveTo(23.5195f, 20.8951f, 23.2652f, 21.0004f, 22.9999f, 21.0004f)
                    curveTo(22.7347f, 21.0004f, 22.4804f, 20.8951f, 22.2928f, 20.7075f)
                    curveTo(22.1053f, 20.52f, 21.9999f, 20.2656f, 21.9999f, 20.0004f)
                    verticalLineTo(11.7524f)
                    lineTo(14.5999f, 15.2884f)
                    curveTo(13.8197f, 15.749f, 12.929f, 15.9888f, 12.0229f, 15.9824f)
                    curveTo(11.0728f, 15.9839f, 10.1399f, 15.7286f, 9.3229f, 15.2434f)
                    lineTo(1.9429f, 11.7304f)
                    curveTo(1.3628f, 11.4185f, 0.8768f, 10.957f, 0.5352f, 10.3938f)
                    curveTo(0.1936f, 9.8306f, 0.0089f, 9.1863f, 3.0E-4f, 8.5277f)
                    curveTo(-0.0082f, 7.869f, 0.1596f, 7.2201f, 0.4864f, 6.6483f)
                    curveTo(0.8132f, 6.0764f, 1.2871f, 5.6024f, 1.8589f, 5.2754f)
                    curveTo(1.8859f, 5.2594f, 1.9149f, 5.2444f, 1.9429f, 5.2304f)
                    lineTo(9.3999f, 1.6724f)
                    curveTo(10.205f, 1.2101f, 11.1187f, 0.9706f, 12.047f, 0.9785f)
                    curveTo(12.9754f, 0.9864f, 13.8849f, 1.2414f, 14.6819f, 1.7174f)
                    lineTo(22.0569f, 5.2304f)
                    curveTo(22.6389f, 5.5524f, 23.1252f, 6.0227f, 23.4665f, 6.5936f)
                    curveTo(23.8077f, 7.1644f, 23.9918f, 7.8154f, 23.9999f, 8.4804f)
                    close()
                    moveTo(12.0219f, 17.9804f)
                    curveTo(10.7425f, 17.9833f, 9.4851f, 17.6479f, 8.3769f, 17.0084f)
                    lineTo(3.9999f, 14.9194f)
                    verticalLineTo(17.6194f)
                    curveTo(4.0005f, 18.6869f, 4.3423f, 19.7263f, 4.9754f, 20.5859f)
                    curveTo(5.6084f, 21.4454f, 6.4997f, 22.0802f, 7.5189f, 22.3974f)
                    curveTo(8.9753f, 22.8156f, 10.4849f, 23.0187f, 11.9999f, 23.0004f)
                    curveTo(13.5152f, 23.0174f, 15.0248f, 22.8129f, 16.4809f, 22.3934f)
                    curveTo(17.5002f, 22.0762f, 18.3915f, 21.4415f, 19.0245f, 20.5819f)
                    curveTo(19.6576f, 19.7223f, 19.9993f, 18.6829f, 19.9999f, 17.6154f)
                    verticalLineTo(14.9244f)
                    lineTo(15.5409f, 17.0544f)
                    curveTo(14.4706f, 17.6694f, 13.2563f, 17.9896f, 12.0219f, 17.9824f)
                    verticalLineTo(17.9804f)
                    close()
                }
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
