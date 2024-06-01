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

public val Icons.Outline.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 16.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(16.0f)
                    curveTo(14.5971f, 23.9986f, 13.2192f, 23.6282f, 12.0047f, 22.9262f)
                    curveTo(10.7901f, 22.2241f, 9.7815f, 21.215f, 9.08f, 20.0f)
                    curveTo(9.8339f, 19.9946f, 10.5852f, 19.9115f, 11.322f, 19.752f)
                    curveTo(11.8832f, 20.4536f, 12.595f, 21.02f, 13.4048f, 21.4092f)
                    curveTo(14.2146f, 21.7983f, 15.1016f, 22.0002f, 16.0f, 22.0f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(16.0f)
                    curveTo(21.9998f, 15.1012f, 21.7972f, 14.2141f, 21.4074f, 13.4042f)
                    curveTo(21.0175f, 12.5944f, 20.4504f, 11.8828f, 19.748f, 11.322f)
                    curveTo(19.9088f, 10.5853f, 19.9933f, 9.834f, 20.0f, 9.08f)
                    curveTo(21.215f, 9.7815f, 22.2241f, 10.7901f, 22.9262f, 12.0047f)
                    curveTo(23.6282f, 13.2192f, 23.9986f, 14.5971f, 24.0f, 16.0f)
                    close()
                    moveTo(18.0f, 9.0f)
                    curveTo(18.0f, 6.613f, 17.0518f, 4.3239f, 15.364f, 2.636f)
                    curveTo(13.6761f, 0.9482f, 11.3869f, 0.0f, 9.0f, 0.0f)
                    curveTo(6.613f, 0.0f, 4.3239f, 0.9482f, 2.636f, 2.636f)
                    curveTo(0.9482f, 4.3239f, 0.0f, 6.613f, 0.0f, 9.0f)
                    lineTo(0.0f, 18.0f)
                    horizontalLineTo(9.0f)
                    curveTo(11.3861f, 17.9974f, 13.6738f, 17.0483f, 15.361f, 15.361f)
                    curveTo(17.0483f, 13.6738f, 17.9974f, 11.3861f, 18.0f, 9.0f)
                    close()
                    moveTo(2.0f, 9.0f)
                    curveTo(2.0f, 7.6155f, 2.4105f, 6.2621f, 3.1797f, 5.111f)
                    curveTo(3.9489f, 3.9599f, 5.0421f, 3.0627f, 6.3212f, 2.5328f)
                    curveTo(7.6003f, 2.003f, 9.0078f, 1.8644f, 10.3656f, 2.1345f)
                    curveTo(11.7235f, 2.4046f, 12.9708f, 3.0713f, 13.9497f, 4.0503f)
                    curveTo(14.9287f, 5.0292f, 15.5954f, 6.2765f, 15.8655f, 7.6344f)
                    curveTo(16.1356f, 8.9922f, 15.997f, 10.3997f, 15.4672f, 11.6788f)
                    curveTo(14.9373f, 12.9579f, 14.0401f, 14.0511f, 12.889f, 14.8203f)
                    curveTo(11.7378f, 15.5895f, 10.3845f, 16.0f, 9.0f, 16.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
