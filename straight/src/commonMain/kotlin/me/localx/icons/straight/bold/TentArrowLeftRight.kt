package me.localx.icons.straight.bold

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.TentArrowLeftRight: ImageVector
    get() {
        if (_tentArrowLeftRight != null) {
            return _tentArrowLeftRight!!
        }
        _tentArrowLeftRight = Builder(name = "TentArrowLeftRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.049f, 6.0f)
                lineTo(2.477f, 19.573f)
                curveToRelative(-0.555f, 0.908f, -0.574f, 2.004f, -0.054f, 2.931f)
                curveToRelative(0.524f, 0.935f, 1.523f, 1.515f, 2.606f, 1.515f)
                horizontalLineToRelative(14.039f)
                curveToRelative(1.083f, 0.0f, 2.081f, -0.58f, 2.605f, -1.514f)
                curveToRelative(0.521f, -0.926f, 0.501f, -2.021f, -0.081f, -2.978f)
                lineTo(12.049f, 6.0f)
                close()
                moveTo(15.311f, 21.024f)
                lineToRelative(-3.262f, -4.524f)
                lineToRelative(-3.268f, 4.534f)
                lineToRelative(-3.679f, 0.006f)
                lineToRelative(6.947f, -9.597f)
                lineToRelative(6.935f, 9.576f)
                lineToRelative(-3.673f, 0.006f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.696f, 3.775f)
                lineTo(19.989f, -0.018f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.049f)
                verticalLineTo(-0.018f)
                lineTo(0.342f, 3.775f)
                curveToRelative(-0.391f, 0.39f, -0.391f, 1.024f, 0.0f, 1.414f)
                lineToRelative(3.707f, 3.793f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(15.94f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.707f, -3.793f)
                curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _tentArrowLeftRight!!
    }

private var _tentArrowLeftRight: ImageVector? = null
