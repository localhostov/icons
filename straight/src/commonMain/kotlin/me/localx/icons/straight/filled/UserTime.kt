package me.localx.icons.straight.filled

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

public val Icons.Filled.UserTime: ImageVector
    get() {
        if (_userTime != null) {
            return _userTime!!
        }
        _userTime = Builder(name = "UserTime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.474f, 11.0f)
                    curveTo(7.3862f, 11.0f, 6.3228f, 10.6774f, 5.4184f, 10.0731f)
                    curveTo(4.5139f, 9.4687f, 3.8089f, 8.6097f, 3.3927f, 7.6048f)
                    curveTo(2.9764f, 6.5998f, 2.8675f, 5.4939f, 3.0797f, 4.427f)
                    curveTo(3.2919f, 3.3601f, 3.8157f, 2.3801f, 4.5849f, 1.6109f)
                    curveTo(5.3541f, 0.8417f, 6.3341f, 0.3179f, 7.401f, 0.1057f)
                    curveTo(8.4679f, -0.1065f, 9.5738f, 0.0024f, 10.5788f, 0.4187f)
                    curveTo(11.5838f, 0.8349f, 12.4427f, 1.5399f, 13.0471f, 2.4444f)
                    curveTo(13.6514f, 3.3488f, 13.974f, 4.4122f, 13.974f, 5.5f)
                    curveTo(13.9724f, 6.9582f, 13.3924f, 8.3562f, 12.3613f, 9.3873f)
                    curveTo(11.3302f, 10.4184f, 9.9322f, 10.9984f, 8.474f, 11.0f)
                    close()
                    moveTo(17.0f, 10.0f)
                    curveTo(15.6155f, 10.0f, 14.2622f, 10.4105f, 13.111f, 11.1797f)
                    curveTo(11.9599f, 11.9489f, 11.0627f, 13.0421f, 10.5328f, 14.3212f)
                    curveTo(10.003f, 15.6003f, 9.8644f, 17.0078f, 10.1345f, 18.3656f)
                    curveTo(10.4046f, 19.7235f, 11.0713f, 20.9708f, 12.0503f, 21.9497f)
                    curveTo(13.0292f, 22.9287f, 14.2765f, 23.5954f, 15.6344f, 23.8655f)
                    curveTo(16.9922f, 24.1356f, 18.3997f, 23.997f, 19.6788f, 23.4672f)
                    curveTo(20.9579f, 22.9373f, 22.0511f, 22.0401f, 22.8203f, 20.889f)
                    curveTo(23.5895f, 19.7379f, 24.0f, 18.3845f, 24.0f, 17.0f)
                    curveTo(23.9979f, 15.1441f, 23.2597f, 13.3649f, 21.9474f, 12.0526f)
                    curveTo(20.6351f, 10.7403f, 18.8559f, 10.0021f, 17.0f, 10.0f)
                    close()
                    moveTo(19.0f, 20.414f)
                    lineTo(16.0f, 17.414f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(16.586f)
                    lineTo(20.414f, 19.0f)
                    lineTo(19.0f, 20.414f)
                    close()
                    moveTo(8.0f, 17.0f)
                    curveTo(8.0006f, 15.6112f, 8.3249f, 14.2417f, 8.947f, 13.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 13.0016f, 2.4036f, 13.5289f, 1.4662f, 14.4662f)
                    curveTo(0.5289f, 15.4036f, 0.0016f, 16.6744f, 0.0f, 18.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(11.349f)
                    curveTo(10.3029f, 23.1579f, 9.459f, 22.0919f, 8.8794f, 20.8804f)
                    curveTo(8.2998f, 19.669f, 7.9993f, 18.343f, 8.0f, 17.0f)
                    close()
                }
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
