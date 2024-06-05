package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.726f, 3.043f)
                lineToRelative(0.619f, -1.0f)
                arcToRelative(4.329f, 4.329f, 0.0f, false, true, 7.311f, 0.0f)
                lineToRelative(2.131f, 3.388f)
                lineToRelative(1.358f, -0.927f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.32f, 1.515f)
                lineToRelative(-0.736f, 3.943f)
                arcTo(2.005f, 2.005f, 0.0f, false, true, 18.767f, 11.6f)
                curveToRelative(-0.13f, 0.0f, -4.3f, -0.808f, -4.3f, -0.808f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.556f, -2.71f)
                lineToRelative(1.395f, -0.953f)
                lineToRelative(-2.2f, -3.493f)
                arcTo(1.3f, 1.3f, 0.0f, false, false, 10.9f, 3.625f)
                lineToRelative(-0.621f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.726f, 3.043f)
                close()
                moveTo(23.353f, 14.462f)
                lineToRelative(-0.578f, -0.931f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.55f, 1.58f)
                lineToRelative(0.578f, 0.932f)
                arcTo(1.292f, 1.292f, 0.0f, false, true, 19.7f, 18.012f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.522f, -1.1f)
                lineTo(9.7f, 17.992f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.039f, 2.992f)
                lineTo(12.479f, 23.6f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 22.5f)
                verticalLineTo(21.012f)
                horizontalLineToRelative(4.7f)
                arcToRelative(4.292f, 4.292f, 0.0f, false, false, 3.657f, -6.55f)
                close()
                moveTo(8.1f, 8.381f)
                arcTo(2.008f, 2.008f, 0.0f, false, false, 5.744f, 6.79f)
                lineToRelative(-3.906f, 0.769f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.556f, 2.711f)
                lineToRelative(1.38f, 0.942f)
                lineTo(0.648f, 14.462f)
                arcToRelative(4.231f, 4.231f, 0.0f, false, false, -0.1f, 4.342f)
                arcToRelative(4.253f, 4.253f, 0.0f, false, false, 3.773f, 2.208f)
                lineTo(5.515f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.03f, -3.0f)
                lineTo(4.3f, 18.012f)
                arcTo(1.292f, 1.292f, 0.0f, false, true, 3.2f, 16.042f)
                lineToRelative(1.944f, -3.136f)
                lineToRelative(1.372f, 0.937f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.32f, -1.514f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
