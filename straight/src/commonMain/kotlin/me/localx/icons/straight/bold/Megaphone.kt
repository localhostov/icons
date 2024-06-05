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

public val Icons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 4.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.6f, 2.93f)
                lineToRelative(4.25f, 9.57f)
                horizontalLineToRelative(1.4f)
                arcToRelative(2.752f, 2.752f, 0.0f, false, false, 2.514f, -3.868f)
                lineToRelative(-2.283f, -5.132f)
                horizontalLineToRelative(3.019f)
                curveToRelative(2.649f, 0.0f, 4.5f, 1.645f, 4.5f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 2.355f, -1.851f, 4.0f, -4.5f, 4.0f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(7.954f, 7.954f, 0.0f, false, false, 4.5f, -1.334f)
                verticalLineToRelative(7.668f)
                arcToRelative(7.954f, 7.954f, 0.0f, false, false, -4.5f, -1.334f)
                close()
                moveTo(21.061f, 12.185f)
                lineTo(23.349f, 14.473f)
                lineTo(21.228f, 16.594f)
                lineTo(18.939f, 14.306f)
                close()
                moveTo(21.1f, 6.844f)
                lineTo(18.978f, 4.723f)
                lineTo(21.228f, 2.473f)
                lineTo(23.349f, 4.594f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
