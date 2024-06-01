package me.localx.icons.rounded.filled

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

public val Icons.Filled.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 12.0f)
                    curveTo(12.3137f, 12.0f, 15.0f, 9.3137f, 15.0f, 6.0f)
                    curveTo(15.0f, 2.6863f, 12.3137f, 0.0f, 9.0f, 0.0f)
                    curveTo(5.6863f, 0.0f, 3.0f, 2.6863f, 3.0f, 6.0f)
                    curveTo(3.0f, 9.3137f, 5.6863f, 12.0f, 9.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 13.9996f)
                    curveTo(6.6139f, 14.0025f, 4.3264f, 14.9517f, 2.6393f, 16.6389f)
                    curveTo(0.9521f, 18.3261f, 0.0029f, 20.6136f, 0.0f, 22.9996f)
                    curveTo(0.0f, 23.2648f, 0.1054f, 23.5192f, 0.2929f, 23.7067f)
                    curveTo(0.4804f, 23.8942f, 0.7348f, 23.9996f, 1.0f, 23.9996f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 23.9996f, 17.5196f, 23.8942f, 17.7071f, 23.7067f)
                    curveTo(17.8946f, 23.5192f, 18.0f, 23.2648f, 18.0f, 22.9996f)
                    curveTo(17.9971f, 20.6136f, 17.0479f, 18.3261f, 15.3607f, 16.6389f)
                    curveTo(13.6735f, 14.9517f, 11.3861f, 14.0025f, 9.0f, 13.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9998f, 7.875f)
                    curveTo(21.4433f, 7.9027f, 20.9204f, 8.1498f, 20.5456f, 8.5621f)
                    curveTo(20.1708f, 8.9744f, 19.9746f, 9.5184f, 19.9998f, 10.075f)
                    curveTo(20.0251f, 9.5184f, 19.8289f, 8.9744f, 19.4541f, 8.5621f)
                    curveTo(19.0792f, 8.1498f, 18.5564f, 7.9027f, 17.9998f, 7.875f)
                    curveTo(17.4433f, 7.9027f, 16.9204f, 8.1498f, 16.5456f, 8.5621f)
                    curveTo(16.1708f, 8.9744f, 15.9746f, 9.5184f, 15.9999f, 10.075f)
                    curveTo(15.9999f, 11.805f, 18.2558f, 13.832f, 19.3798f, 14.734f)
                    curveTo(19.5558f, 14.8749f, 19.7745f, 14.9516f, 19.9998f, 14.9516f)
                    curveTo(20.2252f, 14.9516f, 20.4439f, 14.8749f, 20.6198f, 14.734f)
                    curveTo(21.7438f, 13.834f, 23.9998f, 11.805f, 23.9998f, 10.075f)
                    curveTo(24.0251f, 9.5184f, 23.8289f, 8.9744f, 23.4541f, 8.5621f)
                    curveTo(23.0792f, 8.1498f, 22.5564f, 7.9027f, 21.9998f, 7.875f)
                    close()
                }
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null
