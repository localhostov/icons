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

public val Icons.Filled.GunSquirt: ImageVector
    get() {
        if (_gunSquirt != null) {
            return _gunSquirt!!
        }
        _gunSquirt = Builder(name = "GunSquirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.465f, -2.279f, -2.484f, -4.0f, -4.899f, -4.0f)
                lineTo(5.0f, 2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(2.414f, 0.0f, 4.434f, -1.721f, 4.899f, -4.0f)
                horizontalLineToRelative(2.101f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.216f)
                lineToRelative(-1.112f, 3.895f)
                curveToRelative(-0.347f, 1.237f, -1.491f, 2.105f, -2.781f, 2.105f)
                curveToRelative(-0.911f, 0.0f, -1.75f, -0.416f, -2.302f, -1.143f)
                curveToRelative(-0.551f, -0.727f, -0.726f, -1.646f, -0.48f, -2.524f)
                lineToRelative(1.812f, -6.333f)
                horizontalLineToRelative(6.005f)
                lineToRelative(-0.571f, 2.0f)
                horizontalLineToRelative(2.646f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _gunSquirt!!
    }

private var _gunSquirt: ImageVector? = null
