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

public val Icons.Outline.Rugby: ImageVector
    get() {
        if (_rugby != null) {
            return _rugby!!
        }
        _rugby = Builder(name = "Rugby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0998f, 1.9005f)
                    curveTo(18.6638f, -1.5305f, 9.3718f, -0.0665f, 4.6518f, 4.6525f)
                    curveTo(-0.0682f, 9.3715f, -1.5312f, 18.6645f, 1.8998f, 22.1005f)
                    curveTo(3.5064f, 23.4499f, 5.5736f, 24.1238f, 7.6668f, 23.9805f)
                    curveTo(12.0009f, 23.9422f, 16.1653f, 22.2908f, 19.3478f, 19.3485f)
                    curveTo(24.0658f, 14.6295f, 25.5308f, 5.3365f, 22.0998f, 1.9005f)
                    close()
                    moveTo(16.3328f, 2.0005f)
                    curveTo(17.8969f, 1.8752f, 19.4506f, 2.3444f, 20.6838f, 3.3145f)
                    curveTo(21.6998f, 4.3315f, 22.1108f, 6.3005f, 21.9588f, 8.5455f)
                    lineTo(15.4588f, 2.0455f)
                    curveTo(15.7538f, 2.0265f, 16.0498f, 2.0005f, 16.3328f, 2.0005f)
                    close()
                    moveTo(3.3158f, 20.6845f)
                    curveTo(2.2998f, 19.6695f, 1.8888f, 17.7005f, 2.0408f, 15.4555f)
                    lineTo(8.5408f, 21.9555f)
                    curveTo(6.2998f, 22.1105f, 4.3308f, 21.7005f, 3.3158f, 20.6845f)
                    close()
                    moveTo(17.9338f, 17.9345f)
                    curveTo(15.998f, 19.7585f, 13.6031f, 21.0225f, 11.0048f, 21.5915f)
                    lineTo(2.4048f, 12.9915f)
                    curveTo(2.9751f, 10.3941f, 4.2406f, 8.0005f, 6.0658f, 6.0665f)
                    curveTo(8.0049f, 4.2431f, 10.4042f, 2.9826f, 13.0058f, 2.4205f)
                    lineTo(21.5918f, 11.0065f)
                    curveTo(21.0229f, 13.6047f, 19.7585f, 15.9994f, 17.9338f, 17.9345f)
                    close()
                    moveTo(13.7068f, 6.2935f)
                    lineTo(17.7068f, 10.2935f)
                    lineTo(16.2928f, 11.7075f)
                    lineTo(14.9998f, 10.4145f)
                    lineTo(13.4138f, 12.0005f)
                    lineTo(14.7068f, 13.2935f)
                    lineTo(13.2928f, 14.7075f)
                    lineTo(11.9998f, 13.4145f)
                    lineTo(10.4138f, 15.0005f)
                    lineTo(11.7068f, 16.2935f)
                    lineTo(10.2928f, 17.7075f)
                    lineTo(6.2928f, 13.7075f)
                    lineTo(7.7068f, 12.2935f)
                    lineTo(8.9998f, 13.5865f)
                    lineTo(10.5858f, 12.0005f)
                    lineTo(9.2928f, 10.7075f)
                    lineTo(10.7068f, 9.2935f)
                    lineTo(11.9998f, 10.5865f)
                    lineTo(13.5858f, 9.0005f)
                    lineTo(12.2928f, 7.7075f)
                    lineTo(13.7068f, 6.2935f)
                    close()
                }
            }
        }
        .build()
        return _rugby!!
    }

private var _rugby: ImageVector? = null
