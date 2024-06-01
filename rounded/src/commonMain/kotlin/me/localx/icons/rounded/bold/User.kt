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

public val Icons.Bold.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.4524f, 14.0188f)
                    curveTo(7.1906f, 14.404f, 3.9438f, 18.0051f, 4.0004f, 22.2838f)
                    verticalLineTo(22.5008f)
                    curveTo(4.0004f, 23.3292f, 4.6719f, 24.0008f, 5.5004f, 24.0008f)
                    curveTo(6.3288f, 24.0008f, 7.0004f, 23.3292f, 7.0004f, 22.5008f)
                    verticalLineTo(22.2238f)
                    curveTo(6.9553f, 19.5967f, 8.894f, 17.3564f, 11.5004f, 17.0238f)
                    curveTo(14.2516f, 16.751f, 16.7031f, 18.7601f, 16.9759f, 21.5114f)
                    curveTo(16.9921f, 21.674f, 17.0002f, 21.8373f, 17.0003f, 22.0008f)
                    verticalLineTo(22.5008f)
                    curveTo(17.0003f, 23.3292f, 17.6719f, 24.0008f, 18.5003f, 24.0008f)
                    curveTo(19.3288f, 24.0008f, 20.0003f, 23.3292f, 20.0003f, 22.5008f)
                    verticalLineTo(22.0008f)
                    curveTo(19.9955f, 17.5775f, 16.4057f, 13.9957f, 11.9825f, 14.0006f)
                    curveTo(11.8057f, 14.0008f, 11.6288f, 14.0069f, 11.4524f, 14.0188f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0004f, 12.0f)
                    curveTo(15.3141f, 12.0f, 18.0004f, 9.3137f, 18.0004f, 6.0f)
                    curveTo(18.0004f, 2.6863f, 15.3141f, 0.0f, 12.0004f, 0.0f)
                    curveTo(8.6867f, 0.0f, 6.0004f, 2.6863f, 6.0004f, 6.0f)
                    curveTo(6.0037f, 9.3123f, 8.688f, 11.9967f, 12.0004f, 12.0f)
                    close()
                    moveTo(12.0004f, 3.0f)
                    curveTo(13.6572f, 3.0f, 15.0004f, 4.3432f, 15.0004f, 6.0f)
                    curveTo(15.0004f, 7.6568f, 13.6572f, 9.0f, 12.0004f, 9.0f)
                    curveTo(10.3435f, 9.0f, 9.0004f, 7.6568f, 9.0004f, 6.0f)
                    curveTo(9.0004f, 4.3432f, 10.3435f, 3.0f, 12.0004f, 3.0f)
                    close()
                }
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
