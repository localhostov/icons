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

public val Icons.Bold.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.7498f, 7.0009f)
                    curveTo(11.4463f, 7.0656f, 10.4404f, 8.1721f, 10.4998f, 9.4759f)
                    curveTo(10.5593f, 8.1721f, 9.5534f, 7.0656f, 8.2498f, 7.0009f)
                    curveTo(6.9463f, 7.0656f, 5.9404f, 8.1721f, 5.9998f, 9.4759f)
                    curveTo(5.9998f, 11.4229f, 8.5378f, 13.7409f, 9.7998f, 14.7559f)
                    curveTo(10.2085f, 15.085f, 10.7912f, 15.085f, 11.1999f, 14.7559f)
                    curveTo(12.4638f, 13.7409f, 14.9998f, 11.4229f, 14.9998f, 9.4759f)
                    curveTo(15.0593f, 8.1721f, 14.0534f, 7.0656f, 12.7498f, 7.0009f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.5621f, 21.4385f)
                    lineTo(18.9193f, 16.7947f)
                    curveTo(22.3932f, 12.1529f, 21.4464f, 5.5739f, 16.8046f, 2.1f)
                    curveTo(12.1629f, -1.3739f, 5.5838f, -0.4271f, 2.11f, 4.2147f)
                    curveTo(-1.3639f, 8.8565f, -0.4172f, 15.4355f, 4.2246f, 18.9094f)
                    curveTo(7.9536f, 21.7001f, 13.0756f, 21.7001f, 16.8046f, 18.9094f)
                    lineTo(21.4484f, 23.5541f)
                    curveTo(22.0321f, 24.1378f, 22.9784f, 24.1378f, 23.5621f, 23.5541f)
                    curveTo(24.1458f, 22.9704f, 24.1458f, 22.0241f, 23.5621f, 21.4404f)
                    verticalLineTo(21.4385f)
                    close()
                    moveTo(3.0815f, 10.5423f)
                    curveTo(3.0815f, 6.4163f, 6.4263f, 3.0716f, 10.5522f, 3.0716f)
                    curveTo(14.6781f, 3.0716f, 18.0229f, 6.4163f, 18.0229f, 10.5423f)
                    curveTo(18.0229f, 14.6682f, 14.6781f, 18.0129f, 10.5522f, 18.0129f)
                    curveTo(6.4281f, 18.0085f, 3.0859f, 14.6663f, 3.0815f, 10.5423f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
