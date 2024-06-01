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

public val Icons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4368f, 4.0799f)
                    lineTo(14.6648f, 0.7479f)
                    curveTo(13.8541f, 0.2816f, 12.9351f, 0.0361f, 11.9998f, 0.0361f)
                    curveTo(11.0645f, 0.0361f, 10.1456f, 0.2816f, 9.3348f, 0.7479f)
                    lineTo(3.5628f, 4.0799f)
                    curveTo(2.7533f, 4.5494f, 2.0812f, 5.2232f, 1.6139f, 6.034f)
                    curveTo(1.1465f, 6.8448f, 0.9003f, 7.7641f, 0.8998f, 8.6999f)
                    verticalLineTo(15.3639f)
                    curveTo(0.9014f, 16.2992f, 1.1484f, 17.2177f, 1.616f, 18.0277f)
                    curveTo(2.0837f, 18.8377f, 2.7556f, 19.5109f, 3.5648f, 19.9799f)
                    lineTo(9.3368f, 23.3119f)
                    curveTo(10.1475f, 23.7783f, 11.0665f, 24.0238f, 12.0018f, 24.0238f)
                    curveTo(12.9371f, 24.0238f, 13.8561f, 23.7783f, 14.6668f, 23.3119f)
                    lineTo(20.4388f, 19.9799f)
                    curveTo(21.248f, 19.5099f, 21.9196f, 18.8358f, 22.3866f, 18.0249f)
                    curveTo(22.8536f, 17.2139f, 23.0995f, 16.2947f, 23.0998f, 15.3589f)
                    verticalLineTo(8.6999f)
                    curveTo(23.0993f, 7.7641f, 22.8531f, 6.8448f, 22.3857f, 6.034f)
                    curveTo(21.9184f, 5.2232f, 21.2463f, 4.5494f, 20.4368f, 4.0799f)
                    close()
                    moveTo(10.8368f, 3.3459f)
                    curveTo(11.1913f, 3.1422f, 11.593f, 3.035f, 12.0018f, 3.035f)
                    curveTo(12.4107f, 3.035f, 12.8123f, 3.1422f, 13.1668f, 3.3459f)
                    lineTo(18.5998f, 6.4839f)
                    lineTo(13.4168f, 9.4779f)
                    curveTo(12.9855f, 9.7251f, 12.497f, 9.8551f, 11.9998f, 9.8551f)
                    curveTo(11.5027f, 9.8551f, 11.0142f, 9.7251f, 10.5828f, 9.4779f)
                    lineTo(5.3998f, 6.4839f)
                    lineTo(10.8368f, 3.3459f)
                    close()
                    moveTo(5.0628f, 17.3769f)
                    curveTo(4.7095f, 17.1715f, 4.4162f, 16.8771f, 4.2121f, 16.523f)
                    curveTo(4.0081f, 16.169f, 3.9004f, 15.7676f, 3.8998f, 15.3589f)
                    verticalLineTo(9.0819f)
                    lineTo(9.0848f, 12.0749f)
                    curveTo(9.529f, 12.3319f, 10.0055f, 12.5283f, 10.5018f, 12.6589f)
                    verticalLineTo(20.5159f)
                    lineTo(5.0628f, 17.3769f)
                    close()
                    moveTo(18.9368f, 17.3769f)
                    lineTo(13.4998f, 20.5159f)
                    verticalLineTo(12.6589f)
                    curveTo(13.9961f, 12.5283f, 14.4726f, 12.3319f, 14.9168f, 12.0749f)
                    lineTo(20.0998f, 9.0819f)
                    verticalLineTo(15.3589f)
                    curveTo(20.0992f, 15.7676f, 19.9916f, 16.169f, 19.7875f, 16.523f)
                    curveTo(19.5834f, 16.8771f, 19.2901f, 17.1715f, 18.9368f, 17.3769f)
                    close()
                }
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
