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

public val Icons.Bold.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 17.989f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.957f, 23.545f)
                curveToRelative(2.121f, -0.854f, 9.043f, -4.211f, 9.043f, -11.581f)
                verticalLineToRelative(-6.164f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, -2.321f, -3.21f)
                lineToRelative(-7.679f, -2.545f)
                lineToRelative(-7.679f, 2.545f)
                arcToRelative(3.382f, 3.382f, 0.0f, false, false, -2.321f, 3.21f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.515f, 6.851f, 10.449f, 8.951f, 11.5f)
                lineToRelative(0.985f, 0.494f)
                close()
                moveTo(18.734f, 5.438f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, 0.266f, 0.362f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 5.258f, -5.029f, 7.894f, -6.932f, 8.7f)
                curveToRelative(-1.926f, -1.0f, -7.068f, -4.1f, -7.068f, -8.7f)
                verticalLineToRelative(-6.162f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, true, 0.266f, -0.364f)
                lineToRelative(6.734f, -2.231f)
                close()
                moveTo(13.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
