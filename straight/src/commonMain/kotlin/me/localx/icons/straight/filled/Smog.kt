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

public val Icons.Filled.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(24.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 20.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(14.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(14.0f, 16.0f)
                close()
                moveTo(20.0f, 14.0f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(19.274f, 10.779f)
                curveToRelative(5.61f, 1.616f, 6.579f, -7.089f, 0.752f, -6.747f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -4.532f, -2.007f)
                arcToRelative(6.042f, 6.042f, 0.0f, false, false, -9.129f, 0.163f)
                arcTo(5.026f, 5.026f, 0.0f, false, false, 0.0f, 7.0f)
                arcToRelative(5.033f, 5.033f, 0.0f, false, false, 7.853f, 4.108f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.767f, 0.29f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.654f, -0.619f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
