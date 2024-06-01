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

public val Icons.Bold.Tennis: ImageVector
    get() {
        if (_tennis != null) {
            return _tennis!!
        }
        _tennis = Builder(name = "Tennis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4909f, 3.5099f)
                    curveTo(18.813f, 1.8334f, 16.6756f, 0.692f, 14.3491f, 0.2301f)
                    curveTo(12.0226f, -0.2319f, 9.6114f, 0.0063f, 7.4202f, 0.9145f)
                    curveTo(5.229f, 1.8226f, 3.3563f, 3.3601f, 2.0387f, 5.3324f)
                    curveTo(0.7212f, 7.3047f, 0.0179f, 9.6234f, 0.0179f, 11.9954f)
                    curveTo(0.0179f, 14.3673f, 0.7212f, 16.686f, 2.0387f, 18.6583f)
                    curveTo(3.3563f, 20.6307f, 5.229f, 22.1681f, 7.4202f, 23.0763f)
                    curveTo(9.6114f, 23.9845f, 12.0226f, 24.2226f, 14.3491f, 23.7607f)
                    curveTo(16.6756f, 23.2987f, 18.813f, 22.1573f, 20.4909f, 20.4809f)
                    curveTo(22.7381f, 18.2286f, 24.0001f, 15.1769f, 24.0001f, 11.9954f)
                    curveTo(24.0001f, 8.8138f, 22.7381f, 5.7621f, 20.4909f, 3.5099f)
                    close()
                    moveTo(20.7659f, 9.9859f)
                    curveTo(19.0014f, 9.9045f, 17.3309f, 9.167f, 16.0818f, 7.918f)
                    curveTo(14.8328f, 6.6689f, 14.0953f, 4.9984f, 14.0139f, 3.2339f)
                    curveTo(15.6635f, 3.6038f, 17.1741f, 4.4349f, 18.3695f, 5.6303f)
                    curveTo(19.5649f, 6.8257f, 20.396f, 8.3363f, 20.7659f, 9.9859f)
                    close()
                    moveTo(3.2449f, 14.0009f)
                    curveTo(5.0103f, 14.082f, 6.6817f, 14.8198f, 7.9314f, 16.0694f)
                    curveTo(9.181f, 17.3191f, 9.9188f, 18.9905f, 9.9999f, 20.7559f)
                    curveTo(8.3492f, 20.3866f, 6.8376f, 19.5554f, 5.6415f, 18.3593f)
                    curveTo(4.4454f, 17.1632f, 3.6142f, 15.6516f, 3.2449f, 14.0009f)
                    close()
                    moveTo(18.3699f, 18.3599f)
                    curveTo(16.9231f, 19.8068f, 15.0245f, 20.7148f, 12.9899f, 20.9329f)
                    curveTo(12.9593f, 18.3109f, 11.9041f, 15.805f, 10.05f, 13.9508f)
                    curveTo(8.1958f, 12.0967f, 5.6899f, 11.0415f, 3.0679f, 11.0109f)
                    curveTo(3.286f, 8.9763f, 4.194f, 7.0778f, 5.6409f, 5.6309f)
                    curveTo(7.0878f, 4.184f, 8.9864f, 3.276f, 11.0209f, 3.0579f)
                    curveTo(11.0538f, 5.6798f, 12.1093f, 8.1852f, 13.9625f, 10.0403f)
                    curveTo(15.8157f, 11.8954f, 18.32f, 12.9534f, 20.9419f, 12.9889f)
                    curveTo(20.7223f, 15.0202f, 19.8148f, 16.9153f, 18.3699f, 18.3599f)
                    close()
                }
            }
        }
        .build()
        return _tennis!!
    }

private var _tennis: ImageVector? = null
