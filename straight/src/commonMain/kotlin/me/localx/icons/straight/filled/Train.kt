package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.832f, 18.555f)
                lineTo(21.0f, 18.3f)
                lineTo(21.0f, 8.861f)
                curveTo(18.972f, 12.658f, 15.625f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(5.028f, 12.658f, 3.0f, 8.861f)
                lineTo(3.0f, 18.3f)
                lineToRelative(0.168f, 0.252f)
                arcTo(6.188f, 6.188f, 0.0f, false, false, 4.65f, 19.968f)
                lineTo(3.0f, 24.0f)
                lineTo(5.162f, 24.0f)
                lineToRelative(1.246f, -3.046f)
                arcTo(13.937f, 13.937f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(13.937f, 13.937f, 0.0f, false, false, 5.592f, -1.046f)
                lineTo(18.838f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineToRelative(-1.65f, -4.032f)
                arcTo(6.188f, 6.188f, 0.0f, false, false, 20.832f, 18.555f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(3.779f, 0.0f, 8.081f, -5.95f, 8.863f, -10.593f)
                arcToRelative(2.968f, 2.968f, 0.0f, false, false, -1.745f, -1.882f)
                arcTo(20.154f, 20.154f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(20.149f, 20.149f, 0.0f, false, false, 4.882f, 1.525f)
                arcTo(2.968f, 2.968f, 0.0f, false, false, 3.137f, 3.407f)
                curveTo(3.919f, 8.05f, 8.221f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
