package me.localx.icons.straight.bold

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

public val Icons.Bold.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.628f, 5.458f)
                arcTo(2.822f, 2.822f, 0.0f, false, true, 18.0f, 3.0f)
                lineTo(18.0f, 0.0f)
                arcToRelative(5.438f, 5.438f, 0.0f, false, false, -4.5f, 2.755f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.755f)
                arcTo(5.438f, 5.438f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(6.0f, 3.0f)
                arcTo(2.822f, 2.822f, 0.0f, false, true, 8.372f, 5.458f)
                curveTo(3.7f, 6.8f, 3.0f, 10.866f, 3.0f, 14.5f)
                curveTo(3.0f, 18.923f, 4.023f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(9.0f, -5.077f, 9.0f, -9.5f)
                curveTo(21.0f, 10.866f, 20.3f, 6.8f, 15.628f, 5.458f)
                close()
                moveTo(14.707f, 20.707f)
                lineTo(12.0f, 18.0f)
                lineTo(9.293f, 20.707f)
                curveToRelative(-2.034f, -0.529f, -2.867f, -1.8f, -3.156f, -3.844f)
                lineTo(8.5f, 14.5f)
                lineTo(6.137f, 12.137f)
                curveToRelative(0.289f, -2.049f, 1.122f, -3.315f, 3.156f, -3.844f)
                lineTo(12.0f, 11.0f)
                lineToRelative(2.707f, -2.707f)
                curveToRelative(2.034f, 0.529f, 2.867f, 1.8f, 3.156f, 3.844f)
                lineTo(15.5f, 14.5f)
                lineToRelative(2.363f, 2.363f)
                curveTo(17.574f, 18.912f, 16.741f, 20.178f, 14.707f, 20.707f)
                close()
                moveTo(15.5f, 14.5f)
                lineTo(12.0f, 18.0f)
                lineTo(8.5f, 14.5f)
                lineTo(12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
